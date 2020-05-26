package com.fsClothes.pojo;

import java.io.Serializable;
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
public class Comment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7914733273544536879L;
	
	private Integer id;
	private Integer productId;
	private Integer userId;
	private String comment;
	private String userName;
	private Integer level;
	private Timestamp date;
}
