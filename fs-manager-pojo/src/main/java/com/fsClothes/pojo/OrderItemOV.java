package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年5月3日 下午9:24:51 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemOV implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6187720289791355835L;
	private String orderNo;
	private Integer productId;
	private String productName;
	private String productImgpath;
	private BigDecimal unitPrice;
	private Integer pCount;
	private BigDecimal orderPrice;
	private Timestamp orderDate;
	private Integer status;
	
}
