package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.Comment;
import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductImgPath;
import com.fsClothes.pojo.SalesItem;

/** 
* @author MrDCG 
* @version 创建时间：2020年4月10日 下午12:33:56 
*
*/
public interface ItemMapper {

	List<ProductImgPath> findImgPaths(@Param("productId")int productId,@Param("isShow")int isShow);

	Product findItemInfo(int productId);

	List<Product> findHotProducts(Integer i);

	List<Product> findCategoryProducts(int i);
	/**
	 * 查找评论条数
	 * @param productId 商品id
	 * @return 评论数
	 */
	Integer findAllCommenCount(int productId);
	/**
	 * 查找评论
	 * @param startIndex 起始页
	 * @param pageSize 每页大小
	 * @param productId 商品id
	 * @return 评论
	 */
	List<Comment> findAllComment(@Param("startIndex")Integer startIndex, @Param("pageSize")Integer pageSize, @Param("productId")int productId);
	/**
	 * 查询待查商品数量商品
	 * @param keywords 关键字
	 * @return 商品数量
	 */
	Integer searchItemCount(@Param("keywords")String keywords,@Param("categoryId")Integer categoryId);
	/**
	 * 查询商品
	 * @param startIndex 起始位置
	 * @param pageSize 每页数量
	 * @param keywords 关键字
	 * @return 商品
	 */
	List<Product> searchItems(@Param("startIndex") int startIndex, @Param("pageSize") Integer pageSize,@Param("keywords") String keywords,@Param("categoryId") Integer categoryId);



}
