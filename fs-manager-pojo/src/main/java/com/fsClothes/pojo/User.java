package com.fsClothes.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2019年10月26日 上午9:33:28 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7955886007393224152L;
	private Integer id;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String userAddress;
	private Integer level;
	private BigDecimal totalConsumption;
	private Integer status;
	private Timestamp userRegisterDate;
}
