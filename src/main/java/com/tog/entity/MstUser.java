package com.tog.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.tog.entity.MstCategory;
import com.tog.component.BaseEntity;


@Entity
@Table(name="mst_user")
public class MstUser extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iduser")
	private Integer iduser;
	
	@Column(name="username")
	@NonNull
	private String username;
	
	@NonNull
	@Column(name="password")
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="username",fetch=FetchType.EAGER)
	private List<MstCategory> categoryList = new ArrayList<>();
	
	
	@Override
	public void setId(Integer iduser) {
		this.iduser = iduser;
	}

	@Override
	public Integer getId() {
		return this.iduser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setCategoryList(List<MstCategory> categoryList) {
		this.categoryList = categoryList;
	}
	public List<MstCategory> getCategoryList() {
		return categoryList;
	}
	@Override
	public String toString() {
		return "MstUser [iduser=" + iduser + ", username=" + username + ", password=" + password + "]";
	}

}

