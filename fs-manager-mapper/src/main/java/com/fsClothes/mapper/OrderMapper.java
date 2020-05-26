package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.Addressee;
import com.fsClothes.pojo.CartItemVO;
import com.fsClothes.pojo.Order;
import com.fsClothes.pojo.OrderConditionVO;
import com.fsClothes.pojo.OrderItemOV;
import com.fsClothes.pojo.OrderVO;

/**
 * @author MrDCG
 * @version 创建时间：2019年10月8日 下午4:56:59
 *
 */
public interface OrderMapper {
	/**
	 * 添加订单
	 * @param order 订单信息
	 */
	void insertOrder(Order order);
	/**
	 * 添加销售商品
	 * @param ciVOs 销售商品vo
	 * @param orderNo 订单号
	 */
	void insertSalesItems(@Param("list")List<CartItemVO> ciVOs, @Param("orderNo")String orderNo);
	/**
	 * 添加销售商品订单详情
	 * @param userId 用户id
	 * @param addresseeinfo 收件人信息
	 * @param orderNo 订单号
	 * @param status 订单状态
	 * 
	 */
	void insertSalesOrder(@Param("userId")Integer userId, @Param("addresseeinfo")Addressee addresseeinfo, @Param("orderNo")String orderNo, @Param("status")int status);
	/**
	 * 查找订单商品
	 * @param limit 限制查找条数
	 * @param userId 用户id
	 * @return 订单商品信息
	 */
	List<OrderItemOV> findOrderItems(@Param("limit")Integer limit, @Param("userId")Integer userId,@Param("status")Integer status);
	/**
	 * 修改订单状态
	 * @param status 订单状态
	 * @param orderNo 订单号
	 */
	void updateOrderStatus(@Param("status")int status,@Param("orderNo")String orderNo);
	/**
	 * 查找订单条数
	 * @return 订单数
	 */
	Integer findOrdersCount();
	/**
	 *    分页查找订单
	 * @param startIndex 起始位置
	 * @param pageSize 每页条数
	 * @return 订单集合
	 */
	List<OrderVO> findOrdersByPage(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize);
	/**
	 * 删除订单只能删除用户已签收的 
	 * @param checkedId 订单id
	 */
	void orderDelete(String[] checkedId);
	/**
	 * 查找符合条件的订单信息数 
	 * @param orderConditionVO 查询条件
	 * @return 订单信息数
	 */
	Integer findConditionCount(OrderConditionVO orderConditionVO);
	/**
	 * 查找符合条件的订单信息
	 * @param startIndex 起始位置
	 * @param pageSize 每页条数
	 * @param orderConditionVO 查询条件
	 * @return 订单信息
	 */
	List<OrderVO> findCondition(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize, @Param("orderConditionVO")OrderConditionVO orderConditionVO);

}
