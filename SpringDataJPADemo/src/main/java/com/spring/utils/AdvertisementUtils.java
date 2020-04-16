package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.AdvertisementEntity;

import com.spring.json.Advertisement;


public class AdvertisementUtils {

	public static List<Advertisement> convertAdvertiseEntityListToAdvertiseList(List<AdvertisementEntity> advertisementEntityList) {
		List<Advertisement> advertiseList = new ArrayList<Advertisement>();
		Consumer<AdvertisementEntity> consumer = (AdvertisementEntity advertisementEntity)->advertiseList.add(convertAdvertisementEntityToAdvertisement(advertisementEntity));
		advertisementEntityList.stream().forEach(consumer);
		return advertiseList;
	}
	
	
	public static Advertisement convertAdvertisementEntityToAdvertisement(AdvertisementEntity advertisementEntity) {
		// TODO Auto-generated method stub
		return new Advertisement(advertisementEntity.getId(), advertisementEntity.getUserName(), 
				 advertisementEntity.getPassword(), advertisementEntity.getCategory(),advertisementEntity.getDescription()
				 ,advertisementEntity.getPostId(), advertisementEntity.getAdvertisementDate());
	}


	public static AdvertisementEntity convertAdvertisementToAdvertisementEntity(Advertisement advertisement) {
		return new AdvertisementEntity(advertisement.getId(), advertisement.getUserName(), 
				 advertisement.getPassword(), advertisement.getCategory(),advertisement.getDescription()
				 ,advertisement.getPostId(), advertisement.getAdvertismentDate());
	}


	public static List<Advertisement> convertAdvertisementEntityListToAdvertisementList(
			List<AdvertisementEntity> findByUserName) {
		// TODO Auto-generated method stub
		return null;
	}

}
