package com.ars_vc.service;

import javax.persistence.PersistenceException;

import com.ars_vc.entity.Admin;
import com.ars_vc.exception.GlobalException;
import com.ars_vc.model.AdminDto;

public interface AdminService {
	void registerAdmin(Admin admin);
	boolean loginAdmin(String userName,String password);
	AdminDto getAdminById(int id)throws GlobalException;
	AdminDto updateAdmin(int id, Admin admin)throws GlobalException;
	void deleteAdmin(int id)throws PersistenceException;	
}
