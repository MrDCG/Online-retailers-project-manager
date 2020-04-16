package com.fsClothes.mapper.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.CategoryMapper;
import com.fsClothes.pojo.Category;
import com.fsClothes.pojo.CategoryRootBean;


/** 
* @author MrDCG 
* @version 创建时间：2020年3月9日 上午11:17:02 
*
*/
//持久层
@Repository
public class CategoryMapperImpl extends SqlSessionDaoSupport implements CategoryMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public void insertRoot(CategoryRootBean crb) {
		getSqlSession().getMapper(CategoryMapper.class).insertRoot(crb);
	}

	@Override
	public void insertChild(Category cate) {
		getSqlSession().getMapper(CategoryMapper.class).insertChild(cate);
	}

	@Override
	public List<Category> findAll() {
		return getSqlSession().getMapper(CategoryMapper.class).findAll();
	}

	@Override
	public List<Category> findToTree(int categoryParentId) {
		return getSqlSession().getMapper(CategoryMapper.class).findToTree(categoryParentId);
	}

	@Override
	public void delete(int id, int categoryParentId) {
		getSqlSession().getMapper(CategoryMapper.class).delete(id, categoryParentId);
	}

	@Override
	public int findByPid(int categoryParentId) {

		return getSqlSession().getMapper(CategoryMapper.class).findByPid(categoryParentId);
	}

	@Override
	public void updateParent(int pid) {
		getSqlSession().getMapper(CategoryMapper.class).updateParent(pid);
	}
	@Override
	public Category findById(int id) {
		return getSqlSession().getMapper(CategoryMapper.class).findById(id);
	}
	@Override
	public void updateParIsLeaf(int pid) {
		getSqlSession().getMapper(CategoryMapper.class).updateParIsLeaf(pid);		
	}
	@Override
	public void deleteData(int id) {
		getSqlSession().getMapper(CategoryMapper.class).deleteData(id);		
	}
	@Override
	public List<Category> findByLeaf() {
		return getSqlSession().getMapper(CategoryMapper.class).findByLeaf();
	}
	@Override
	public List<Category> findRootCategory() {
		return getSqlSession().getMapper(CategoryMapper.class).findRootCategory();
	}
	@Override
	public List<Category> findParentCategory(int id) {
		return getSqlSession().getMapper(CategoryMapper.class).findParentCategory(id);
	}

}
