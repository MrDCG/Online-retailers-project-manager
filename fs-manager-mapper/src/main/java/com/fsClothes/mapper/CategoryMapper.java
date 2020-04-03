package com.fsClothes.mapper;

import java.util.List;

import com.fsClothes.pojo.Category;
import com.fsClothes.pojo.CategoryRootBean;



/** 
* @author MrDCG 
* @version 创建时间：2019年9月28日 下午1:57:56 
*
*/
public interface CategoryMapper {
	/**
	 * 添加根节点
	 */
	void insertRoot(CategoryRootBean crb);
	/**
	 * 添加孩子结点
	 */
	void insertChild(Category cate);
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
	/**
	 * 查找父节点
	 */
	int findByPid(int categoryParentId);
	/**
	 * 更新父节点的叶子为0
	 */
	void updateParent(int pid);
	/**
	 * 查找结点
	 * @param id 结点id
	 * @return 查找到的结点信息
	 */
	Category findById(int id);
	/**
	 * 更新父节点的叶子为1
	 */
	void updateParIsLeaf(int pid);
	
	void deleteData(int id);
	//查找叶子结点
	List<Category> findByLeaf();
}
