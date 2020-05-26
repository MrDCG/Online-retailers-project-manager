package com.fsClothes.mapper;

import java.math.BigDecimal;
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
	/**
	 * 登录查询
	 * @param adminName 管理员名字
	 * @param adminPassword 管理员密码
	 * @return 管理员
	 */
	Admin findLogin(@Param("adminName")String adminName, @Param("adminPassword")String adminPassword);
	/**
	 * 修改权限
	 * @param id adminId
	 * @param authorization 权限
	 */
	void modifyAuth(@Param("id")Integer id, @Param("authorization")Integer authorization);
	/**
	 * 月季度查询营收额
	 * @param startMonth 开始时间
	 * @param endMonth 结束时加
	 * @return 金额
	 */
	BigDecimal findByOrderDate(@Param("startMonth")String startMonth, @Param("endMonth")String endMonth);
}
