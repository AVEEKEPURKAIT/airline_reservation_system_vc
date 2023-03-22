package com.ars_vc.daoImpl;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ars_vc.config.HibernateUtil;
import com.ars_vc.dao.AdminDao;
import com.ars_vc.entity.Admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminDaoImpl implements AdminDao{

	public void registerAdmin(Admin admin) {
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		session.close();
		
	}

	public boolean loginAdmin(String userName, String password) {
		Session session=HibernateUtil.getSession();
		Admin admin=(Admin)session.get(Admin.class,(JOptionPane.showInputDialog("enter id","type here")));
		if(admin.getUserName().equals(userName)&& admin.getPassword().equals(password))
							return true;
							else
return false;
	}

	@Override
	public Admin getAdmin(int id) {
		try(Session sesssion=HibernateUtil.getSession())
		{
			Admin admin=sesssion.get(Admin.class, id);
			return admin;
		}catch (HibernateException e) {
		System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Admin updateAdmin(int id, Admin admin) {
		try(Session session=HibernateUtil.getSession())
		{
			Admin adm=(Admin)session.load(Admin.class, id);
			adm.setaName(admin.getaName());
			adm.setEmail(admin.getEmail());
			adm.setUserName(admin.getUserName());
			adm.setPassword(admin.getPassword());
			
			session.beginTransaction();
			session.saveOrUpdate(adm);
			session.getTransaction().commit();
			return adm;
						
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	@Override
	public void deleteAdmin(int id) throws PersistenceException {
		try(Session session=HibernateUtil.getSession()){
			Admin admn=(Admin)session.load(Admin.class, id);
			session.beginTransaction();
			session.delete(admn);
			session.getTransaction().commit();
			
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
