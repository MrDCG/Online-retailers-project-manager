package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年3月18日 上午11:30:32 
*	用于复杂查询
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderConditionVO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7363981007315930764L;
	private String orderNo;
	private String userName;
	private BigDecimal lowprice;
	private BigDecimal highprice;
	private Object startDate;
	private Object endDate;
	private Integer status;
	
}
