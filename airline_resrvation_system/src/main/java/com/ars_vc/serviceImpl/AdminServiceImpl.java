package com.ars_vc.serviceImpl;

import javax.persistence.PersistenceException;

import org.modelmapper.ModelMapper;

import com.ars_vc.dao.AdminDao;
import com.ars_vc.daoImpl.AdminDaoImpl;
import com.ars_vc.entity.Admin;
import com.ars_vc.exception.GlobalException;
import com.ars_vc.model.AdminDto;
import com.ars_vc.service.AdminService;

public class AdminServiceImpl implements AdminService{
	AdminDao aDao=new AdminDaoImpl();

	@Override
	public void registerAdmin(Admin admin) {
		aDao.registerAdmin(admin);

		
	}

	@Override
	public boolean loginAdmin(String userName, String password) {
		return aDao.loginAdmin(userName, password);
	}

	@Override
	public AdminDto getAdminById(int id) throws GlobalException {
		Admin admin=aDao.getAdmin(id);
		return new ModelMapper().map(admin, AdminDto.class);
	}

	@Override
	public AdminDto updateAdmin(int id, Admin admin) throws GlobalException {
		Admin admin2=aDao.updateAdmin(id, admin);
		return new ModelMapper().map(admin2, AdminDto.class);
	}

	@Override
	public AdminDto deleteAdmin(int id) throws PersistenceException {
		aDao.deleteAdmin(id);
		
	}

		
	}


