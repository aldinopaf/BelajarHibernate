package com.tog.test;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tog.config.AppConfig;
import com.tog.entity.MstCategory;
import com.tog.service.MstCategorySvc;

public class TestMstCategory {
	
	public static void main(String[]args){
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

	MstCategorySvc mstCategorySvc = context.getBean(MstCategorySvc.class);
	
	MstCategory mstCategory = new MstCategory();
	mstCategory.setCategory("Yogi");
	mstCategory.setNameCategory("Trinning");
	mstCategory.setCreatedDate(LocalDateTime.now());
	mstCategory.setCreatedUser("ADMIN");
	mstCategory.setDeleted(false);
	
mstCategorySvc.save(mstCategory);
	//mstCategorySvc.delete(mstCategory);
	List<MstCategory> list2 = mstCategorySvc.findByNameCategoryAndCategory("Yogi", "Trinning");
	
	if(!list2.isEmpty() || list2 != null || list2.size() > 0){
		for(MstCategory category : list2){
			System.out.println("NameCategory: " + category.getNameCategory() 
								+"Category: " + category.getCategory());
		}
	}
	else{
		System.out.println("No data");
	}

	}
}
