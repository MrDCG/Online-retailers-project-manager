package com.fsClothes.service;

import java.util.List;

import com.fsClothes.pojo.Admin;
import com.fsClothes.pojo.Page;



/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:14
 *
 */
public interface AdminService {
	List<Admin> findAll();
	
	// 获取分页信息
	Page<Admin> findByPageSize(Page<Admin> page);
	
	void insert(Admin admin);
	
	Admin findById(int id);
	
	void update(Admin admin);
	
	void delete(int id);
	
	/**
	 * 登录
	 */
	Admin login (String aname,String apwd);
	Admin findByAname(String adminName);
	
	Admin findByInvitationCode(String invitationCode);
	void resetPassword(int id);

	int findAllCount();
	
	
}
