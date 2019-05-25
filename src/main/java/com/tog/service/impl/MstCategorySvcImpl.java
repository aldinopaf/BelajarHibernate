package com.tog.service.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tog.dao.MstCategoryDao;
import com.tog.entity.MstCategory;
import com.tog.service.MstCategorySvc;

@Service
@Transactional
public class MstCategorySvcImpl implements MstCategorySvc{

	@Autowired
	private MstCategoryDao mstCategoryDao;
	
	@Override
	public List<MstCategory> findAll() {
		try {
			return mstCategoryDao.findAll();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new HibernateException(exception);
		}
	}

	public List<MstCategory> findByNameCategoryAndCategory(String namecategory,
			String category) {
		try {
			return mstCategoryDao.findByNameCategoryAndCategory(namecategory, category);
		} catch (Exception e) {
			throw new HibernateException(e);
		}
	}

	@Override
	public void save(MstCategory mstCategory) {
		try {
			mstCategoryDao.save(mstCategory);
		} catch (Exception e) {
			throw new HibernateException(e);
		}
		
	}

}
