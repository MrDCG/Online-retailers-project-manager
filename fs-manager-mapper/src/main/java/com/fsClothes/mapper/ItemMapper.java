package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductImgPath;

/** 
* @author MrDCG 
* @version 创建时间：2020年4月10日 下午12:33:56 
*
*/
public interface ItemMapper {

	Product findProduct(int productId);

	List<ProductImgPath> findImgPaths(@Param("productId")int productId,@Param("isShow")int isShow);


}
