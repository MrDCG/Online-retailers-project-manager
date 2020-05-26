package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年4月16日 上午9:45:16 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3852237311916835150L;
	private Integer id;
	private String orderNo;
	private BigDecimal orderPrice;
	private Timestamp orderDate;
	private Integer status;
	//收件人
	private String addressee;
	private String phone;
	private String addr;
}
