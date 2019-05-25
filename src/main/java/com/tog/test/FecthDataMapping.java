package com.tog.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import com.tog.entity.MstCategory;
import com.tog.entity.MstUser;
import com.tog.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.boot.spi.AdditionalJaxbMappingProducer;


public class FecthDataMapping {
	public static void main(String[] args) {
		
		getNameCategoryAndMstCategoryByid();
	    
	  }
	private static void getNameCategoryAndMstCategoryByid() {
		

	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	MstCategory category = session.get(MstCategory.class, 1);
	    	System.out.println(category);
	    	if(category != null){
	    		System.out.println(category.getNameCategory());
	    	}
	    	System.out.println();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	
	}
	private static void getEmployeeAndAdressByEmployeeId() {
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	MstUser user = session.get(MstUser.class , 1);
	    	System.out.println(user);
	    	if(user != null){
	    		user.getCategoryList();
	    	}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
