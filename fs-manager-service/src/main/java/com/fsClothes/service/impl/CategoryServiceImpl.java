package com.fsClothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.mapper.CategoryMapper;
import com.fsClothes.pojo.Category;
import com.fsClothes.pojo.CategoryRootBean;
import com.fsClothes.service.CategoryService;




/** 
* @author MrDCG 
* @version 创建时间：2019年9月28日 下午2:35:55 
*
*/
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public void insertRoot(String categoryName, String categoryDescription) {
		categoryMapper.insertRoot(new CategoryRootBean(categoryName,categoryDescription));
	}

	@Override
	public void insertChild(String name,String descr,int pid) {
		int grade = categoryMapper.findByPid(pid);
		categoryMapper.insertChild(new Category(name,descr,pid,grade+1));
		
		categoryMapper.updateParent(pid);
	}

	@Override
	public List<Category> findAll() {
		return categoryMapper.findAll();
	}

	@Override
	public List<Category> findToTree(int categoryParentId) {
		return categoryMapper.findToTree(categoryParentId);
	}

	@Override
	public void delete(int id, int pid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category findById(int id) {
		return categoryMapper.findById(id);
	}

	@Override
	public void updateParIsLeaf(int pid) {
		categoryMapper.updateParIsLeaf(pid);
	}

	@Override
	public void deleteDate(int id) {
		categoryMapper.deleteData(id);
	}

	@Override
	public List<Category> findByLeaf() {
		return categoryMapper.findByLeaf();
	}
	

}
