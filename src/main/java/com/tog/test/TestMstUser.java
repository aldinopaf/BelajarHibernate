package com.tog.test;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tog.config.AppConfig;
import com.tog.entity.MstCategory;
import com.tog.entity.MstUser;
import com.tog.service.MstCategorySvc;
import com.tog.service.MstUserSvc;

public class TestMstUser {
	
	public static void main(String[]args){
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		MstUserSvc mstUserSvc = context.getBean(MstUserSvc.class);
		
		MstUser mstUser = new MstUser();
		mstUser.setPassword("Haqi");
		mstUser.setUsername("Haqi");
		mstUser.setCreatedDate(LocalDateTime.now());
		mstUser.setCreatedUser("ADMIN");
		mstUser.setDeleted(false);
		
		mstUserSvc.save(mstUser);
	//	mstUserSvc.delete(mstUser);
		List<MstUser> list = mstUserSvc.findByUsernameAndPassword("Haqi", "Haqi");
		
		if(!list.isEmpty() || list != null || list.size() > 0){
			for(MstUser user : list){
				System.out.println("Username: " + user.getUsername() 
									+"Password: " + user.getPassword());
			}
		}
		else{
			System.out.println("No data");
		}
//		AnnotationConfigApplicationContext context2 = 
//				new AnnotationConfigApplicationContext(AppConfig.class);
//		MstCategorySvc mstCategorySvc = context2.getBean(MstCategorySvc.class);
//		
//		MstCategory mstCategory = new MstCategory();
//		mstCategory.setNameCategory("Yogi");
//		mstCategory.setCategory("Trinning");
//		mstCategory.setCreatedDate(LocalDateTime.now());
//		mstCategory.setCreatedUser("ADMIN");
//		mstCategory.setDeleted(false);
//		
//		mstCategorySvc.save(mstCategory);
//		//mstCategorySvc.delete(mstCategory);
//		List<MstCategory> list2 = mstCategorySvc.findByNameCategoryAndCategory("Yogi", "Trinning");
//		
//		if(!list2.isEmpty() || list2 != null || list2.size() > 0){
//			for(MstCategory category : list2){
//				System.out.println("NameCategory: " + category.getNameCategory() 
//									+"Category: " + category.getCategory());
//			}
//		}
//		else{
//			System.out.println("No data");
//		}
//	
	}

}
