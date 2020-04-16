package com.fsClothes.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年4月16日 上午9:51:47 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesOrder implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1983852591740016891L;
	
	private Integer id;
	private Integer userId;
	private String addr;
	private String orderNo;
	private Integer status;
}
