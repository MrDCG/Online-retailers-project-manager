package com.fsClothes.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.Comment;
import com.fsClothes.pojo.User;


/** 
* @author MrDCG 
* @version 创建时间：2019年10月26日 下午2:46:34 
*
*/
public interface UserMapper {
	List<User> findAll();

	// 查询总条数
	int findCount();

	// 根据下标和每页显示条数查询
	List<User> findByPageNum(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
	
	// 查询总待删除的条数
	int delFindCount();
	
	// 查询待删除的用户，分页
	List<User> delFindByPageNum(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
	
	void insert(User user);

	User findById(int id);

	void update(User user);
	
	void delete(int id);
	
	User findByName(String username);
	
	void resetPassword(int id);
	
	void updateStatus(@Param("id")int id,@Param("status")int status);
	
	List<User> delFind();

	void batchDelete(String[] checkedId);
	// 查找当年每月注册人数
	int findByRegisterDate(@Param("startMonth")String startMonth,@Param("endMonth")String endMonth);

	User findByLoginUser(@Param("phone")String phone,@Param("password")String password);
	/**
	 * 修改用户地址和手机号
	 * @param addresseeinfo 收件人信息
	 */
	void editAddresseeInfo(@Param("id")Integer id,@Param("address")String address,@Param("phone")String phone);
	/**
	 * 更新用户总消费
	 * @param id 
	 * @param add 总消费
	 */
	void updateTotal(@Param("id")Integer id, @Param("add")BigDecimal add);
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
	void editPassword(@Param("phone")String phone,@Param("pwd") String pwd);
	/**
	 * 验证用户密码
	 * @param id 用户id
	 * @param pwd 原密码
	 * @return 用户
	 */
	User checkPwd(@Param("id")Integer id, @Param("pwd")String pwd);
	/**
	 * 修改密码
	 * @param id 用户id
	 * @param pwd 密码
	 */
	void resetPwdById(@Param("id")Integer id, @Param("pwd")String pwd);
	/**
	 * 添加评论
	 * @param comment 评论
	 */
	void addComment(Comment comment);
}
