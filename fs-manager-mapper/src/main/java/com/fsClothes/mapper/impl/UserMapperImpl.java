package com.fsClothes.mapper.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.UserMapper;
import com.fsClothes.pojo.Comment;
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
	public List<User> delFindByPageNum(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize) {
		return getSqlSession().getMapper(UserMapper.class).delFindByPageNum(startIndex, pageSize);
	}
	@Override
	public void batchDelete(String[] checkedId) {
		getSqlSession().getMapper(UserMapper.class).batchDelete(checkedId);
	}
	@Override
	public int findByRegisterDate(@Param("startMonth")String startMonth,@Param("endMonth")String endMonth) {
		return getSqlSession().getMapper(UserMapper.class).findByRegisterDate(startMonth, endMonth);
	}
	@Override
	public User findByLoginUser(@Param("phone")String phone,@Param("password")String password) {
		return getSqlSession().getMapper(UserMapper.class).findByLoginUser(phone,password);
	}
	@Override
	public void editAddresseeInfo(@Param("id")Integer id,@Param("address")String address,@Param("phone")String phone) {
		getSqlSession().getMapper(UserMapper.class).editAddresseeInfo(id,address,phone);
	}
	@Override
	public void updateTotal(@Param("id")Integer id, @Param("add")BigDecimal add) {
		getSqlSession().getMapper(UserMapper.class).updateTotal(id,add);		
	}
	@Override
	public User findByPhone(String phone) {
		return getSqlSession().getMapper(UserMapper.class).findByPhone(phone);
	}
	@Override
	public void editPassword(@Param("phone")String phone,@Param("pwd") String pwd) {
		getSqlSession().getMapper(UserMapper.class).editPassword(phone, pwd);
	}
	@Override
	public User checkPwd(@Param("id")Integer id, @Param("pwd")String pwd) {
		return getSqlSession().getMapper(UserMapper.class).checkPwd(id, pwd);
	}
	@Override
	public void resetPwdById(@Param("id")Integer id, @Param("pwd")String pwd) {
		getSqlSession().getMapper(UserMapper.class).resetPwdById(id, pwd);		
	}
	@Override
	public void addComment(Comment comment) {
		getSqlSession().getMapper(UserMapper.class).addComment(comment);
		
	}
}
