package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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



}
