package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2019年9月16日 下午3:58:09 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5724020892055733466L;
	private Integer id;
	private Integer productId;
	private Integer userId;
	private String productName;
	private String productImgpath;
	
	/**
	 * 商品单价
	 */
	private BigDecimal unitPrice;
	/**
	 * 商品数量
	 */
	private Integer pCount;
	private Timestamp itemDate;
}
