package com.spring.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Advertisement")

public class AdvertisementEntity {
	@GeneratedValue
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "Categories")
	private String category;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name ="PostId")
	private String postId;
	
	@Column(name="Date")
	private Date advertisementDate;
	
	
	
	public Date getAdvertisementDate() {
		return advertisementDate;
	}

	public void setAdvertisementDate(Date advertisementDate) {
		this.advertisementDate = advertisementDate;
	}

	public AdvertisementEntity() {
		super();
	}

	public AdvertisementEntity(String userName, String password, String category) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.category = category;
		this.description = description;
		this.postId = postId;
	}
	

	public AdvertisementEntity(long id, String userName, String password, String category, String description,
			String postId, Date advertisementDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.advertisementDate = advertisementDate;
	}

	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AdvertisementEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", category="
				+ category + ", description=" + description + ", postId=" + postId + "]";
	}
	
	
}

	


