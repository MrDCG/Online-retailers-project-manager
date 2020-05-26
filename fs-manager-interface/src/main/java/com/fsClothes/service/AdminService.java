package com.fsClothes.service;

import java.math.BigDecimal;
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
	/**
	 * 登录查询
	 * @param adminName 管理员名字
	 * @param adminPassword 管理员密码
	 * @return 管理员
	 */
	Admin findLogin(String adminName, String adminPassword);
	/**
	 * 修改权限
	 * @param id adminId
	 * @param authorization 权限
	 */
	void modifyAuth(Integer id, Integer authorization);
	/**
	 * 月季度查询营收额
	 * @param startMonth 开始时间
	 * @param endMonth 结束时加
	 * @return 金额
	 */
	BigDecimal findByOrderDate(String startMonth, String endMonth);
	
	
}
