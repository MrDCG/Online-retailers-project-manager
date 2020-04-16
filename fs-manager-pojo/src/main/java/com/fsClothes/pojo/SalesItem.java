package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年4月16日 上午9:48:58 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesItem implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -2475172524826146796L;
	private Integer id;
	private Integer productId;
	//单价
	private BigDecimal unitPrice;
	//数量
	private Integer pCount;
	private String orderNo;
	
}
