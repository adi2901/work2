package com.spring.json;

import java.sql.Date;

public class Advertisement {
	private long id;
	private String userName;
	private String password;
	private String category;
	private String description;
	private String postId;
	private Date advertismentDate;
	
	
	
	
	public Advertisement() {
		super();
	}

	public Advertisement(long id, String userName, String password, String category, String description, String postId,
			Date advertismentDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.advertismentDate = advertismentDate;
	}

	public Advertisement(long id, String userName, String password, String category) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.category = category;
		this.description = description;
		this.postId = postId;
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
	

	public Date getAdvertismentDate() {
		return advertismentDate;
	}

	public void setAdvertismentDate(Date advertismentDate) {
		this.advertismentDate = advertismentDate;
	}

	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", userName=" + userName + ", password=" + password + ", category="
				+ category + ", description=" + description + ", postId=" + postId + "]";
	}
	
	

}
