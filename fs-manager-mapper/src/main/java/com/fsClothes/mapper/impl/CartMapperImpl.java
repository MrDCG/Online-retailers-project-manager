package com.fsClothes.mapper.impl;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.CartMapper;
import com.fsClothes.pojo.CartItem;


/** 
* @author MrDCG 
* @version 创建时间：2020年3月9日 上午11:16:35 
*
*/
//持久层注解
@Repository
public class CartMapperImpl extends SqlSessionDaoSupport implements CartMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public CartItem findByUserId(@Param("userId")Integer userId, @Param("productId")Integer productId) {
		return getSqlSession().getMapper(CartMapper.class).findByUserId(userId, productId);
	}

	@Override
	public void updateCartItemPCount(Integer pCount) {
		getSqlSession().getMapper(CartMapper.class).updateCartItemPCount(pCount);
	}

	@Override
	public void insertCart(CartItem ci) {
		getSqlSession().getMapper(CartMapper.class).insertCart(ci);
	}

	@Override
	public List<CartItem> findCartItems(int userId) {
		return getSqlSession().getMapper(CartMapper.class).findCartItems(userId);
	}

	@Override
	public void deleteCartItem(int id) {
		getSqlSession().getMapper(CartMapper.class).deleteCartItem(id);
	}

	@Override
	public void batchDelCartItems(String[] id) {
		getSqlSession().getMapper(CartMapper.class).batchDelCartItems(id);
	}

}
