package com.fsClothes.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
* @author MrDCG 
* @version 创建时间：2019年9月28日 下午1:54:01 
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4074774399243485575L;
	
	private Integer id;
	private String categoryName;
	private String categoryDescription;
	private Integer categoryParentId;
	private Boolean leaf;
	private Integer grade;
	
	private List<Category> children;

	public Category(String categoryName, String categoryDescription, Integer categoryParentId, Integer grade) {
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryParentId = categoryParentId;
		this.grade = grade;
	}
	public Category(Integer id,String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
}
