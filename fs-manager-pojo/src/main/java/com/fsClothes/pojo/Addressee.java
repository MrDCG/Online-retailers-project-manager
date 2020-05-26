package com.fsClothes.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年5月1日 下午4:58:19 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Addressee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1811287650238050673L;
	private String address;
	private String name;
	private String phone;
}
