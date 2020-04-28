package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.CartItem;

/**
 * @author MrDCG
 * @version 创建时间：2019年10月8日 下午4:56:59
 *
 */
public interface CartMapper {
	/**
	 * 根据userId和productId查找该用户是否已经将商品添加入购物车
	 * @param userId 用户id
	 * @param productId 商品id
	 * @return 购物车商品
	 */
	CartItem findByUserId(@Param("userId")Integer userId, @Param("productId")Integer productId);
	/**
	 * 更新购物车商品的数量
	 * @param pCount 需要添加的商品的数量
	 */
	void updateCartItemPCount(Integer pCount);
	/**
	 * 添加购物车商品
	 * @param ci 待添加的购物车商品
	 */
	void insertCart(CartItem ci);
	/**
	 * 查找用户的购物车列表
	 * @param userId 用户id
	 * @return 购物车商品列表
	 */
	List<CartItem> findCartItems(int userId);
	/**
	 * 删除购物车商品
	 * @param id 商品id
	 */
	void deleteCartItem(int id);
	/**
	 * 批量删除
	 * @param id 待删除的购物车商品id
	 */
	void batchDelCartItems(String[] id);

}
