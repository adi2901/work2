package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.json.Advertisement;

public interface AdvertisementService {
	
	public Advertisement save(Advertisement user);
	
	public Advertisement update(Advertisement user, String id);
	
	public List<Advertisement> getUserById();
	
	Advertisement registerAdvertisement(Advertisement advertisement);

	
	
	List<String> getAllCategory();
	
	List<Advertisement> getAllAdvertisement();
	
	List<Advertisement> getAllAdvertisementSortByDescCategory();
	
	List<Advertisement> getAllAdvertiseSortByPostId();
	
	List<Advertisement> getAllAdvertisementSortByDescPostId();
	
	List<Advertisement> getAllAdvertisementSortByPostedBy();
	
	List<Advertisement> getAllAdvertisementSortByDescPostedBy();
	
	List<Advertisement> getAdvertisementsByCategory(String category);
	
	public boolean delete(String id);
	
	List<Advertisement> getAllAdvertisementSortByCategory();

	List<Advertisement> getAdvertiseByUserName(String userName);

	List<Advertisement> getAdvertisementByUserName(String name);

	
	
	
	
	

	
	
	
	
	
	

	
}
