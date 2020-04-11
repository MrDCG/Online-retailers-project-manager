package com.fsClothes.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2019年10月8日 下午4:47:26 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -382509290178746427L;
	private Product product;
	private List<ProductImgPath> productImgPaths;
	
}
