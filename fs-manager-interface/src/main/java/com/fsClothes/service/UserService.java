package com.fsClothes.service;

import java.util.List;

import com.fsClothes.pojo.Page;
import com.fsClothes.pojo.User;


/** 
* @author MrDCG 
* @version 创建时间：2019年10月26日 下午3:30:53 
*
*/
public interface UserService {
	int findAll();

	// 获取分页信息
	Page<User> findByPageSize(Page<User> page);
	
	// 获取待删除用户分页信息
	Page<User> delFindByPageSize(Page<User> page);
	
	void insert(User user);

	User findById(int id);

	void update(User user);

	void delete(int id);
	
	User findByName(String userName);
	
	void resetPassword(int id);
	
	void updateStatus(int id,int status);
	
	List<User> delFind();

	void batchDelete(String checkedId);
	// 查找当年每月注册人数
	int findByRegisterDate(String startMonth, String endMonth);
	
}
