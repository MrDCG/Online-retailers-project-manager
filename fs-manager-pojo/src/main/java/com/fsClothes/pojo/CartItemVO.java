package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class CartItemVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5724020892055733466L;
	private Integer id;
	private BigDecimal unitPrice;
	private Integer pCount;
}
