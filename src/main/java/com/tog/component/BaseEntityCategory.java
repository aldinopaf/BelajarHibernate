package com.tog.component;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.lang.NonNull;

@MappedSuperclass
public abstract class BaseEntityCategory {

		
		@NonNull
		@Column(name="created_date")
		private LocalDateTime createdDate = LocalDateTime.now();
		@Column(name="created_category")
		private String createdCategory;
		@Column(name="updated_date")
		private LocalDateTime updatedDate;
		@Column(name="updated_category")
		private String updatedCategory;
		@Column(name="deleted")
		@NonNull
		private Boolean deleted = false;
		
		public abstract void setId(Integer id);
		public abstract Integer getId();
		
		public LocalDateTime getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(LocalDateTime createdDate) {
			this.createdDate = createdDate;
		}
		public String getCreatedCategory() {
			return getCreatedCategory();
		}
		public void setCreatedCategory(String createdCategory) {
			this.createdCategory = createdCategory;
		}
		public LocalDateTime getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(LocalDateTime updatedDate) {
			this.updatedDate = updatedDate;
		}
		public String getUpdatedCategory() {
			return updatedCategory;
		}
		public void setUpdatedCategory(String updatedCategory) {
			this.updatedCategory = updatedCategory;
		}
		public Boolean getDeleted() {
			return deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

	}
