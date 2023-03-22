package com.ars_vc.dao;

import javax.persistence.PersistenceException;

import com.ars_vc.entity.Admin;

public interface AdminDao {
void registerAdmin(Admin  admin);
boolean loginAdmin(String userName,String  password);
Admin getAdmin(int id);
Admin updateAdmin(int id, Admin admin);
void deleteAdmin(int id)throws PersistenceException;

}
