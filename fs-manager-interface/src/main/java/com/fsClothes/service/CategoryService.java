package com.fsClothes.service;

import java.util.List;

import com.fsClothes.pojo.Category;



/** 
* @author MrDCG 
* @version 创建时间：2019年9月28日 下午2:34:11 
*
*/
public interface CategoryService {
	/**
	 * 添加根节点
	 */
	void insertRoot(String categoryName,String categoryDescription);
	/**
	 * 添加孩子结点
	 */
	void insertChild(String name,String descr,int pid);
	/**
	 * 按照数据表的顺序遍历所有数据
	 */
	List<Category> findAll();
	/**
	 * 显示为树状列表
	 */
	List<Category> findToTree(int categoryParentId);
	/**
	 * 使用递归完成删除
	 */
	void delete(int id,int categoryParentId);
	
	Category findById(int id);
	
	void updateParIsLeaf(int pid);
	
	void deleteDate(int id);
	
	List<Category> findByLeaf();
}
