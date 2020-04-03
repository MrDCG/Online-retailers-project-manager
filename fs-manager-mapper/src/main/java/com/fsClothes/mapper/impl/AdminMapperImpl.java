package com.fsClothes.mapper.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsClothes.mapper.AdminMapper;
import com.fsClothes.pojo.Admin;


/** 
* @author MrDCG 
* @version 创建时间：2020年2月4日 下午1:57:38 
*
*/
@Repository
public class AdminMapperImpl extends SqlSessionDaoSupport implements AdminMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public List<Admin> findAll() {
		return getSqlSession().getMapper(AdminMapper.class).findAll();
	}

	@Override
	public void insert(Admin admin) {
		getSqlSession().getMapper(AdminMapper.class).insert(admin);
		
	}

	@Override
	public Admin findById(int id) {
		return getSqlSession().getMapper(AdminMapper.class).findById(id);
	}

	@Override
	public void update(Admin admin) {
		getSqlSession().getMapper(AdminMapper.class).update(admin);
	}

	@Override
	public void delete(int id) {
		getSqlSession().getMapper(AdminMapper.class).delete(id);
	}

	@Override
	public Admin findByAname(String adminName) {
		return getSqlSession().getMapper(AdminMapper.class).findByAname(adminName);
	}

	@Override
	public void resetPassword(int id) {
		getSqlSession().getMapper(AdminMapper.class).resetPassword(id);
	}
	@Override
	public Admin findByInvitationCode(String invitationCode) {
		return getSqlSession().getMapper(AdminMapper.class).findByInvitationCode(invitationCode);
	}
	@Override
	public List<Admin> findByPageNum(@Param("startIndex")int startIndex,@Param("pageSize")int pageSize) {
		return getSqlSession().getMapper(AdminMapper.class).findByPageNum(startIndex, pageSize);
	}
	@Override
	public int findCount() {
		return getSqlSession().getMapper(AdminMapper.class).findCount();
	}
	
}
