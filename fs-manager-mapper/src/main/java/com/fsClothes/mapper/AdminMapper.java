package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.Admin;




/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:00:58
 *
 */
public interface AdminMapper {
	List<Admin> findAll();
	
	//查询总条数
	int findCount();
	// 根据下标和每页显示条数查询
	List<Admin> findByPageNum(@Param("startIndex")int startIndex,@Param("pageSize")int pageSize);

	void insert(Admin admin);

	Admin findById(int id);
	
	void update(Admin admin);
	
	void delete(int id);
	
	Admin findByAname(String adminName);
	//查找邀请码
	Admin findByInvitationCode(String invitationCode);
	
	void resetPassword(int id);
}
