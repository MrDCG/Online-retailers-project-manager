package com.fsClothes.mapper.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.ItemMapper;
import com.fsClothes.pojo.Comment;
import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductImgPath;
import com.fsClothes.pojo.SalesItem;

/** 
* @author MrDCG 
* @version 创建时间：2020年4月10日 下午12:34:33 
*
*/
//持久层
@Repository
public class ItemMapperImpl extends SqlSessionDaoSupport implements ItemMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public List<ProductImgPath> findImgPaths(@Param("productId")int productId,@Param("isShow")int isShow) {
		return getSqlSession().getMapper(ItemMapper.class).findImgPaths(productId,isShow);
	}

	@Override
	public Product findItemInfo(int productId) {
		return getSqlSession().getMapper(ItemMapper.class).findItemInfo(productId);
	}

	@Override
	public List<Product> findHotProducts(Integer i) {
		return getSqlSession().getMapper(ItemMapper.class).findHotProducts(i);
	}

	@Override
	public List<Product> findCategoryProducts(int i) {
		return getSqlSession().getMapper(ItemMapper.class).findCategoryProducts(i);
	}

	@Override
	public Integer findAllCommenCount(int productId) {
		return getSqlSession().getMapper(ItemMapper.class).findAllCommenCount(productId);
	}

	@Override
	public List<Comment> findAllComment(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize, @Param("productId")int productId) {
		return getSqlSession().getMapper(ItemMapper.class).findAllComment(startIndex, pageSize, productId);
	}

	@Override
	public Integer searchItemCount(@Param("keywords")String keywords,@Param("categoryId")Integer categoryId) {
		return getSqlSession().getMapper(ItemMapper.class).searchItemCount(keywords,categoryId);
	}

	@Override
	public List<Product> searchItems(@Param("startIndex") int startIndex, @Param("pageSize") Integer pageSize,@Param("keywords") String keywords,@Param("categoryId") Integer categoryId) {
		return getSqlSession().getMapper(ItemMapper.class).searchItems(startIndex, pageSize, keywords,categoryId);
	}


}
