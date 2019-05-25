package com.tog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tog.entity.MstCategory;

public interface MstCategoryDao extends JpaRepository<MstCategory, Integer>  {

	@Query(value="SELECT p FROM MstCategory p WHERE p.namecategory = :namecategory "
			+ "and p.category = :category")
	public List<MstCategory> findByNameCategoryAndCategory(
			@Param("namecategory") String namecategory,
			@Param("category") String category);
}