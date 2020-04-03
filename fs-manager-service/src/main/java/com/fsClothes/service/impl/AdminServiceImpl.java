package com.fsClothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.mapper.AdminMapper;
import com.fsClothes.mapper.util.ServletUtil;
import com.fsClothes.pojo.Admin;
import com.fsClothes.pojo.Page;
import com.fsClothes.service.AdminService;





/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:49
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public List<Admin> findAll() {
		return adminMapper.findAll();
	}

	@Override
	public void insert(Admin admin) {
		adminMapper.insert(admin);
	}

	@Override
	public Admin findById(int id) {
		return adminMapper.findById(id);
	}

	@Override
	public void update(Admin admin) {
		adminMapper.update(admin);
	}

	@Override
	public void delete(int id) {
		adminMapper.delete(id);
	}

	@Override
	public Admin login(String aname, String apwd) {
		Admin admin = adminMapper.findByAname(aname);
		if(admin != null) {
			if(admin.getAdminPassword().equals(ServletUtil.md5(apwd))) {
				return admin;
			}
			return null;
		}
		
		return null;
	}

	@Override
	public Admin findByAname(String adminName) {
		return adminMapper.findByAname(adminName);
	}

	@Override
	public void resetPassword(int id) {
		adminMapper.resetPassword(id);
	}

	@Override
	public Admin findByInvitationCode(String invitationCode) {
		return adminMapper.findByInvitationCode(invitationCode);
	}

	@Override
	public Page<Admin> findByPageSize(Page<Admin> page) {
		page.setTotalRecord(adminMapper.findCount());
		page.setList(adminMapper.findByPageNum(page.getStartIndex(), page.getPageSize()));
		
		return page;
	}

	@Override
	public int findAllCount() {
		return adminMapper.findCount();
	}

}
