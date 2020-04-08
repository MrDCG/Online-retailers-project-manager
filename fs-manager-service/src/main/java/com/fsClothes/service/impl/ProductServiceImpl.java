package com.fsClothes.service.impl;



import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.mapper.ProductMapper;
import com.fsClothes.pojo.Category;
import com.fsClothes.pojo.Page;
import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductConditionVO;
import com.fsClothes.service.ProductService;






/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:49
 *
 */

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;
	@Autowired
    private HttpSolrClient httpSolrClient;

	@Override
	public void insert(Product product) {
		productMapper.insert(product);
	}

	@Override
	public Page<Product> findAllByPage(Page<Product> page) {
			page.setTotalRecord(productMapper.findAllCount());
			page.setList(productMapper.findAll(page.getStartIndex(), page.getPageSize()));
			
			return page;
	}

	@Override
	public void update(Product product) {
		productMapper.update(product);
	}
	@Override
	public void delete(int id) {
		productMapper.delete(id);
	}
	@Override
	public void batchDelete(String checkedId) {
		productMapper.batchDelete(checkedId.split(","));
	}

	/**
	 * 将solr的时间转化为timestamp类型
	 * @param time solr查询的时间
	 * @return string
	 */
    public String time(String time) {
    	   SimpleDateFormat sdfCst = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy", Locale.US);
    	   Date date = null;
		try {
			date = sdfCst.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   SimpleDateFormat sdfLocal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	   sdfLocal.setTimeZone(TimeZone.getDefault());
    	   return sdfLocal.format(date);
    }
//    @Override
//	public Page<Product> getProduct(Page<Product> page,ProductConditionVO productConditionVO) {
//		
////		List<Map<String, Object>> products = new ArrayList<Map<String,Object>>();
//		SolrQuery query = new SolrQuery();
//		//设置关键字
//    	StringBuffer str = new StringBuffer();
//    	if(productConditionVO.getCategoryId() == null || productConditionVO.getCategoryId() == -1) {
//    		str.append("*:*");
//    	} else {
//    		str.append("categoryId:" + productConditionVO.getCategoryId());
//    	}
//    	if(productConditionVO.getKeywords() != null && !"".equals(productConditionVO.getKeywords())) {
//    		str.append(" AND keywords:" + productConditionVO.getKeywords());
//    		
//    	}
//    	if(productConditionVO.getLowprice() != null && productConditionVO.getHighprice() != null) {
//    		str.append(" AND normalprice:[" + productConditionVO.getLowprice() + " TO " + productConditionVO.getHighprice() + "]");
//    	} else if(productConditionVO.getLowprice() != null) {
//    		str.append(" AND normalprice:[" + productConditionVO.getLowprice() + " TO " + "*" + "]");
//    	} else if(productConditionVO.getHighprice() != null) {
//    		str.append(" AND normalprice:[" + "*" + " TO " + productConditionVO.getHighprice() + "]");
//    	}
//    	if(!"".equals(productConditionVO.getStartDate())  && !"".equals(productConditionVO.getEndDate())) {
//    		String startDate = productConditionVO.getStartDate().replace(' ', 'T')+"Z";
//    		String endDate = productConditionVO.getEndDate().replace(' ', 'T')+"Z";
//    		str.append(" AND productDate:[" + startDate + " TO " + endDate + "]");
//    	} else if(!"".equals(productConditionVO.getStartDate())) {
//    		String startDate = productConditionVO.getStartDate().replace(' ', 'T')+"Z";
//    		str.append(" AND productDate:[" + startDate + " TO " + "NOW" + "]");
//    	} else if(!"".equals(productConditionVO.getEndDate())) {
//    		String endDate = productConditionVO.getEndDate().replace(' ', 'T')+"Z";
//    		str.append(" AND productDate:[" + "*" + " TO " + endDate + "]");
//    	}
//    	
//		//q为参数，设置查询条件
//		//query.set("q", keywords);
//    	query.setQuery(str+"");
//		//df为参数，设置查询域，从哪个字段查询
////		query.set("df", "keywords");
//		//参数fq, 给query增加过滤查询条件 
//	    //query.addFacetQuery("id:[0 TO 9]");
//		//参数sort,设置返回结果的排序规则
//		query.addSort("id",SolrQuery.ORDER.desc);
//		//设置分页参数
//	    query.setStart(page.getStartIndex());
//	    query.setRows(page.getPageSize());
//	    
//		//设置高亮显示以及结果的样式
//	    query.setHighlight(true);
//	    query.addHighlightField("productName");  
//	    query.addHighlightField("productDescription");  
//	    query.setHighlightSimplePre("<font color='red'>");  
//	    query.setHighlightSimplePost("</font>"); 
//	    QueryResponse response = null;
//	    try {
//	    	//执行查询
//			response = httpSolrClient.query(query);
//		} catch (SolrServerException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    page.setTotalRecord((int)response.getResults().getNumFound());
//	    
////	    response.getResults().
//	    List<Product> products = new ArrayList<Product>();
//	    if(response.getResults().getNumFound()>0&&response != null) {
//	    	SolrDocumentList solrDocumentList = response.getResults();
//	    	System.out.println(solrDocumentList.size());
//	    	for (SolrDocument solrDocument : solrDocumentList) {
//	    		Product product = new Product();
//	    		
//	    		product.setId(Integer.parseInt(solrDocument.get("id").toString()));
//	    		product.setProductName(solrDocument.get("productName").toString());
//	    		product.setProductDescription(solrDocument.get("productDescription").toString());
//	    		product.setNormalprice(BigDecimal.valueOf(Double.valueOf(solrDocument.get("normalprice").toString())));
//	    		product.setMemberprice(BigDecimal.valueOf(Double.valueOf(solrDocument.get("memberprice").toString())));
//	    		product.setStock(Integer.parseInt(solrDocument.get("stock").toString()));
//	    		product.setShelf(Integer.parseInt(solrDocument.get("shelf").toString()));
//	    		product.setProductDate(Timestamp.valueOf(time(solrDocument.get("productDate").toString())));
//	    		product.setCategoryId(Integer.parseInt(solrDocument.get("categoryId").toString()));
//	    		
//	    		product.setProductImgpath(solrDocument.get("productImgpath").toString());
//	    		product.setCategory(new Category(Integer.parseInt(solrDocument.get("categoryId").toString()),solrDocument.get("cname").toString()));
//	    		products.add(product);
//			}
//	    	
//	    }
//	    page.setList(products);
//		return page;
//	}
    @Override
    public Page<Product> getProduct(Page<Product> page,ProductConditionVO productConditionVO) {
    	if("".equals(productConditionVO.getKeywords())) {
    		productConditionVO.setKeywords(null);
    	}
    	
    	page.setTotalRecord(productMapper.findConditionCount(productConditionVO));
    	System.out.println(page.getTotalRecord());
		page.setList(productMapper.findCondition(page.getStartIndex(), page.getPageSize(),productConditionVO));
		
		return page;
    }
	@Override
	public int findAllCount() {
		return productMapper.findAllCount();
	}
	@Override
	public int findAllSum() {
		return productMapper.findAllSum();
	}

	@Override
	public int findShelf() {
		return productMapper.findShelf();
	}
	@Override
	public int findLShelf() {
		return productMapper.findLShelf();
	}
}
