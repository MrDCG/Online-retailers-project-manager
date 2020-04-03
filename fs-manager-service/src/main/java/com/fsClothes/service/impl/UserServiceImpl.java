package com.fsClothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.mapper.UserMapper;
import com.fsClothes.pojo.Page;
import com.fsClothes.pojo.User;
import com.fsClothes.service.UserService;

/** 
* @author MrDCG 
* @version 创建时间：2019年10月26日 下午3:32:07 
*
*/
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int findAll() {
		return userMapper.findCount();
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public User findById(int id) {
		return userMapper.findById(id);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);
	}
	
	@Override
	public User findByName(String userName) {
		return userMapper.findByName(userName);
	}

	@Override
	public void resetPassword(int id) {
		userMapper.resetPassword(id);
		
	}

	@Override
	public List<User> delFind() {
		return userMapper.delFind();
	}

	@Override
	public void updateStatus(int id, int status) {
		userMapper.updateStatus(id, status);
	}
	
	@Override
	public Page<User> findByPageSize(Page<User> page) {
		page.setTotalRecord(userMapper.findCount());
		page.setList(userMapper.findByPageNum(page.getStartIndex(), page.getPageSize()));
		
		return page;
	}

	@Override
	public Page<User> delFindByPageSize(Page<User> page) {
		page.setTotalRecord(userMapper.delFindCount());
		page.setList(userMapper.delFindByPageNum(page.getStartIndex(), page.getPageSize()));
		
		return page;
	}

	@Override
	public void batchDelete(String checkedId) {

		userMapper.batchDelete(checkedId.split(","));
	}

	@Override
	public int findByRegisterDate(String startMonth, String endMonth) {
		return userMapper.findByRegisterDate(startMonth,endMonth);
	}


}
