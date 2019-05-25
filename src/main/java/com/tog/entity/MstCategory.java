package com.tog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.tog.entity.MstUser;
import com.tog.component.BaseEntity;

@Entity
@Table(name="mst_category")
public class MstCategory extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcategory")
	private Integer idcategory;
	
	@Column(name="namecategory")
	@NonNull
	private String namecategory;
	
	@NonNull
	@Column(name="category")
	private String category;
	
    @ManyToOne
    @JoinColumn(name="iduser")
    private MstUser username;
	
	@Override
	public void setId(Integer idcategory) {
		this.idcategory = idcategory;
	}

	@Override
	public Integer getId() {
		return this.idcategory;
	}

	public String getNameCategory() {
		return namecategory;
	}

	public void setNameCategory(String namecategory) {
		this.namecategory = namecategory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public void setUser(MstUser username) {
		this.username = username;
	}
	
	public MstUser getUser() {
		return username;
	}

	@Override
	public String toString() {
		return "MstCategory [namecategory=" + namecategory + ", category=" + category+ "]";
	}

}

