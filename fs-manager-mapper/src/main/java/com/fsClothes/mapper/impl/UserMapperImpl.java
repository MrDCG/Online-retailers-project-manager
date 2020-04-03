package com.fsClothes.mapper.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.UserMapper;
import com.fsClothes.pojo.User;



/** 
* @author MrDCG 
* @version 创建时间：2019年10月26日 下午2:43:12 
*
*/
// 持久层注解
@Repository
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public List<User> findAll() {

		return getSqlSession().getMapper(UserMapper.class).findAll();
	}
	@Override
	public void insert(User user) {
		getSqlSession().getMapper(UserMapper.class).insert(user);
	}
	@Override
	public User findById(int id) {
		return getSqlSession().getMapper(UserMapper.class).findById(id);
	}
	@Override
	public void update(User user) {
		getSqlSession().getMapper(UserMapper.class).update(user);
		
	}
	@Override
	public void delete(int id) {
		getSqlSession().getMapper(UserMapper.class).delete(id);;
	}
	@Override
	public User findByName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void resetPassword(int id) {
		getSqlSession().getMapper(UserMapper.class).resetPassword(id);
		
	}
	@Override
	public List<User> delFind() {
		return getSqlSession().getMapper(UserMapper.class).delFind();
	}
	@Override
	public void updateStatus(@Param("id")int id,@Param("status")int status) {
		getSqlSession().getMapper(UserMapper.class).updateStatus(id,status);
	}
	@Override
	public List<User> findByPageNum(@Param("startIndex")int startIndex,@Param("pageSize")int pageSize) {
		return getSqlSession().getMapper(UserMapper.class).findByPageNum(startIndex, pageSize);
	}
	@Override
	public int findCount() {
		return getSqlSession().getMapper(UserMapper.class).findCount();
	}
	@Override
	public int delFindCount() {
		return getSqlSession().getMapper(UserMapper.class).delFindCount();
	}
	@Override
	public List<User> delFindByPageNum(int startIndex, int pageSize) {
		return getSqlSession().getMapper(UserMapper.class).delFindByPageNum(startIndex, pageSize);
	}
	@Override
	public void batchDelete(String[] checkedId) {
		getSqlSession().getMapper(UserMapper.class).batchDelete(checkedId);
	}
	@Override
	public int findByRegisterDate(String startMonth, String endMonth) {
		return getSqlSession().getMapper(UserMapper.class).findByRegisterDate(startMonth, endMonth);
	}
}
