package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -382509290178746427L;
	private Integer id;
	private String productName;
	private String productDescription;
	private BigDecimal normalprice;
	private BigDecimal memberprice;
	private Integer stock;
	private Integer shelf;
	private Timestamp productDate;
	private Category category;
	private String productImgpath;
	private Integer categoryId;
	public Product(String productName, String productDescription, BigDecimal normalprice,BigDecimal memberprice,Integer stock,Integer shelf, Integer categoryId,
			String productImgpath) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.normalprice = normalprice;
		this.memberprice = memberprice;
		this.stock = stock;
		this.shelf = shelf;
		this.categoryId = categoryId;
		this.productImgpath = productImgpath;
	}
	
}
