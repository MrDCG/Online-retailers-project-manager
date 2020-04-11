package com.fsClothes.mapper.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.ProductMapper;
import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductConditionVO;
import com.fsClothes.pojo.ProductImgPath;


/** 
* @author MrDCG 
* @version 创建时间：2020年3月9日 上午11:16:35 
*
*/
//持久层注解
@Repository
public class ProductMapperImpl extends SqlSessionDaoSupport implements ProductMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public List<Product> findAll(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize) {
		return getSqlSession().getMapper(ProductMapper.class).findAll(startIndex,pageSize);
	}
	@Override
	public int insert(Product product) {
		return getSqlSession().getMapper(ProductMapper.class).insert(product);
	}
	@Override
	public int findAllCount() {
		return getSqlSession().getMapper(ProductMapper.class).findAllCount();
	}
	@Override
	public void update(Product product) {
		getSqlSession().getMapper(ProductMapper.class).update(product);		
	}
	@Override
	public void delete(int id) {
		getSqlSession().getMapper(ProductMapper.class).delete(id);
	}
	@Override
	public void batchDelete(String[] checkId) {
		getSqlSession().getMapper(ProductMapper.class).batchDelete(checkId);
	}
	@Override
	public int findAllSum() {
		return getSqlSession().getMapper(ProductMapper.class).findAllSum();
	}
	@Override
	public int findShelf() {
		return getSqlSession().getMapper(ProductMapper.class).findShelf();
	}
	@Override
	public int findLShelf() {
		return getSqlSession().getMapper(ProductMapper.class).findLShelf();
	}
	@Override
	public int findConditionCount(ProductConditionVO productConditionVO) {
		return getSqlSession().getMapper(ProductMapper.class).findConditionCount(productConditionVO);
	}
	@Override
	public List<Product> findCondition(int startIndex, int pageSize,ProductConditionVO productConditionVO) {
		return getSqlSession().getMapper(ProductMapper.class).findCondition(startIndex, pageSize,productConditionVO);
	}
	@Override
	public void insertPaths(List<ProductImgPath> proImgPaths) {
		getSqlSession().getMapper(ProductMapper.class).insertPaths(proImgPaths);
	}

}
