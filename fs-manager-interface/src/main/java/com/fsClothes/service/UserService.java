package com.fsClothes.service;

import java.math.BigDecimal;
import java.util.List;

import com.fsClothes.pojo.Comment;
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


	User findByLoginUser(String phone, String password);
	/**
	 * 修改用户地址和手机号
	 * @param addresseeinfo 收件人信息
	 */
	void editAddresseeInfo(Integer id,String address,String phone);
	/**
	 * 更新用户总消费
	 * @param id 用户id
	 * @param add 总消费
	 */
	void updateTotal(Integer id, BigDecimal add);
	/**
	 * 查找用户
	 * @param 手机号
	 * @return 用户
	 */
	User findByPhone(String phone);
	/**
	 * 修改密码
	 * @param phone 手机号
	 * @param pwd 新密码
	 */
	void editPassword(String phone, String pwd);
	/**
	 * 验证用户密码
	 * @param id 用户id
	 * @param pwd 原密码
	 * @return 用户
	 */
	User checkPwd(Integer id, String pwd);
	/**
	 * 修改密码
	 * @param id 用户id
	 * @param pwd 密码
	 */
	void resetPwdById(Integer id, String password);
	/**
	 * 添加评论
	 * @param comment 评论
	 */
	void addComment(Comment comment);
	
}
