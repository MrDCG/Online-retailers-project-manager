package com.fsClothes.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2019年9月28日 下午2:11:24 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRootBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5765567799057676966L;
	private String categoryName;
	private String categoryDescription;
}
