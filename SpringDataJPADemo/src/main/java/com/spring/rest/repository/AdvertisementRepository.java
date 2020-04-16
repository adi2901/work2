package com.spring.rest.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.AdvertisementEntity;


@Component
public interface AdvertisementRepository extends JpaRepository<AdvertisementEntity, Long> {
	List<AdvertisementEntity> findByUserName(String userName);
	List<AdvertisementEntity> findByCategory(String category);
	List<AdvertisementEntity> findByAdvertisementDate(Date advertisementDate);
	List<AdvertisementEntity> findByPostId(String postId);
	

	

	
	
	List<AdvertisementEntity> findByOrderByCategoryDesc();
	List<AdvertisementEntity> findByOrderByPostIdAsc();
	List<AdvertisementEntity> findByOrderByUserNameAsc();
	
	
	
	

}
