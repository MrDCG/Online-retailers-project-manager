package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
}
