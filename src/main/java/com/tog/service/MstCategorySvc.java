package com.tog.service;

import java.util.List;

import com.tog.entity.MstCategory;

public interface MstCategorySvc {

	public List<MstCategory> findAll();

	public List<MstCategory> findByNameCategoryAndCategory(String namecategory,
			String category);

	// ------
	//
	public void save(MstCategory mstCategory);
	// public void delete(MstUser mstUser);

}
