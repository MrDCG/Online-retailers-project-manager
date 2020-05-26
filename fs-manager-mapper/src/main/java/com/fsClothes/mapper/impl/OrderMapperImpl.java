package com.fsClothes.mapper.impl;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.OrderMapper;
import com.fsClothes.pojo.Addressee;
import com.fsClothes.pojo.CartItemVO;
import com.fsClothes.pojo.Order;
import com.fsClothes.pojo.OrderConditionVO;
import com.fsClothes.pojo.OrderItemOV;
import com.fsClothes.pojo.OrderVO;


/** 
* @author MrDCG 
* @version 创建时间：2020年3月9日 上午11:16:35 
*
*/
//持久层注解
@Repository
public class OrderMapperImpl extends SqlSessionDaoSupport implements OrderMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public void insertOrder(Order order) {
		getSqlSession().getMapper(OrderMapper.class).insertOrder(order);
	}

	@Override
	public void insertSalesItems(@Param("list")List<CartItemVO> ciVOs, @Param("orderNo")String orderNo) {
		getSqlSession().getMapper(OrderMapper.class).insertSalesItems(ciVOs, orderNo);
		
	}

	@Override
	public void insertSalesOrder(@Param("userId")Integer userId, @Param("addresseeinfo")Addressee addresseeinfo, @Param("orderNo")String orderNo, @Param("status")int status) {
		getSqlSession().getMapper(OrderMapper.class).insertSalesOrder(userId, addresseeinfo, orderNo, status);
		
	}

	@Override
	public List<OrderItemOV> findOrderItems(@Param("limit")Integer limit, @Param("userId")Integer userId, @Param("status")Integer status) {
		return getSqlSession().getMapper(OrderMapper.class).findOrderItems(limit,userId,status);
	}

	@Override
	public void updateOrderStatus(@Param("status")int status,@Param("orderNo")String orderNo) {
		getSqlSession().getMapper(OrderMapper.class).updateOrderStatus(status,orderNo);		
	}

	@Override
	public Integer findOrdersCount() {
		return getSqlSession().getMapper(OrderMapper.class).findOrdersCount();
	}

	@Override
	public List<OrderVO> findOrdersByPage(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize) {
		return getSqlSession().getMapper(OrderMapper.class).findOrdersByPage(startIndex, pageSize);
	}

	@Override
	public void orderDelete(String[] checkedId) {
		getSqlSession().getMapper(OrderMapper.class).orderDelete(checkedId);
	}

	@Override
	public Integer findConditionCount(OrderConditionVO orderConditionVO) {
		return getSqlSession().getMapper(OrderMapper.class).findConditionCount(orderConditionVO);
	}

	@Override
	public List<OrderVO> findCondition(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize, @Param("orderConditionVO")OrderConditionVO orderConditionVO) {
		return getSqlSession().getMapper(OrderMapper.class).findCondition(startIndex, pageSize, orderConditionVO);
	}


}
