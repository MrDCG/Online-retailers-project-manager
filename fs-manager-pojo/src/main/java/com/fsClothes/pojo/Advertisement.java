package com.fsClothes.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2020年3月30日 下午12:50:47 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advertisement implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -6912801932115025870L;
	private Integer id;
	private Integer productId;
	private String adImgPath;
	private Timestamp productDate;
	private String categoryName;
	private String productName;
}
