package com.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.AdvertisementEntity;
import com.spring.entity.UserEntity;
import com.spring.json.Advertisement;
import com.spring.json.User;
import com.spring.rest.repository.AdvertisementRepository;
import com.spring.rest.repository.UserRepository;
import com.spring.utils.AdvertisementUtils;
import com.spring.utils.UserUtils;
import com.spring.entity.UserEntity;



@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	@Autowired
	private AdvertisementRepository advertisementRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Advertisement registerAdvertisement(Advertisement advertisement) {
		AdvertisementEntity advertisementEntity = 
				AdvertisementUtils.convertAdvertisementToAdvertisementEntity(advertisement);
		advertisementEntity = userRepository.save(advertisementEntity);
		Advertisement advertiseJson = AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity);
		return advertiseJson;
	}
	
	
	@Override
	public List<Advertisement> getAdvertiseByUserName(String userName) {
		// TODO Auto-generated method stub
		List<AdvertisementEntity> advertisementEntityList = advertisementRepository.findByUserName(userName);
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(advertisementEntityList);
		
	}
	
	@Override
	public List<String> getAllCategory() {
		
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
				advertisementRepository.findAll()).stream().
				map(Advertisement :: getCategory).distinct().collect(Collectors.toList());
		
	}
	
	@Override
	public List<Advertisement> getAllAdvertisement() {
		
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
				advertisementRepository.findAll());
	}
	
	@Override
	public List<Advertisement> getAllAdvertiseSortByPostId() {
		 
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
				advertisementRepository.findByOrderByPostIdAsc());
	}
	
	@Override
	public List<Advertisement> getAllAdvertisementSortByPostedBy() {
		 
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
				advertisementRepository.findByOrderByUserNameAsc());
	}
	
	@Override
	public List<Advertisement> getAdvertisementsByCategory(String category) {
		List<AdvertisementEntity> advertisementEntityList = advertisementRepository.findByCategory(category);
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(advertisementEntityList);
	}


	@Override
	public List<Advertisement> getAdvertisementByUserName(String name) {
		return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
				advertisementRepository.findByUserName(name));
	}

	@Override
	public List<Advertisement> getAllAdvertisementSortByCategory() {
		 
		return AdvertisementUtils.convertAdvertiseEntityListToAdvertiseList(
				advertisementRepository.findByOrderByCategoryDesc());
	}
	
	@Override
	public Advertisement update(Advertisement advertisement, String id) {
		AdvertisementEntity advertisementEntity = advertisementRepository.findById(Long.valueOf(id)).get();
		if(advertisementEntity != null) {
			
			advertisementEntity.setUserName(advertisement.getUserName());
			advertisementEntity.setPassword(advertisement.getPassword());
			advertisementEntity.setCategory(advertisement.getCategory());
			advertisementEntity.setDescription(advertisement.getDescription());
			advertisementEntity.setPostId(advertisement.getPostId());
			
			advertisementEntity = advertisementRepository.save(advertisementEntity);
			return AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity);
		}
		return null;
	}
	
	public Advertisement save(Advertisement advertisement) {
		AdvertisementEntity advertisementEntity = 
				advertisementRepository.save(AdvertisementUtils.convertAdvertisementToAdvertisementEntity(advertisement));
		return AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity);
	}
	

	@Override
	public boolean delete(String id) {
		if(advertisementRepository.existsById(Long.valueOf(id))) {
			advertisementRepository.deleteById(Long.valueOf(id));
			return true;
		}
		return false;
	}

	/*
	 * @Override public List<Advertisement> getAdvertiseByPostId(String authToken,
	 * String postId) { String userName=((AdvertisementEntity)
	 * userRepository.findBySessionId(authToken)).getUserName(); List<Advertisement>
	 * userAdvertise=AdvertisementUtils.convertAdvertisementEntityToAdvertisement(
	 * advertisementRepository.findByUserName(userName));
	 * List<Advertisement>requiredAdvertise=userAdvertise.stream().filter(advertise
	 * -> postId.equals(advertise.getPostId())).collect(Collectors.toList()); return
	 * requiredAdvertise; }
	 */

	
	
	 
	



	/*
	 * @Override public Advertisement getAdvertiseByPostId(String postId) {
	 * 
	 * return AdvertisementUtils.convertAdvertisementEntityToAdvertisement(
	 * advertisementRepository.findByPostId(postId)); }
	 */

	

	


	



	
	/*
	 * @Override public List<Advertisement> getAllAdvertisementSortByDescPostId() {
	 * 
	 * return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
	 * advertisementRepository.findByOrderByPostIdDesc()); }
	 */

	/*
	 * @Override public List<Advertisement> getAllAdvertisementSortByDescPostedBy()
	 * {
	 * 
	 * return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(
	 * advertisementRepository.findByOrderByUserNameDesc()); }
	 */
	
	
	
	

	
	
	 



	@Override
	public List<Advertisement> getAllAdvertisementSortByDescCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> getAllAdvertisementSortByDescPostId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> getAllAdvertisementSortByDescPostedBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> getUserById() {
		// TODO Auto-generated method stub
		return null;
	}


	

	

	
	 

	

	




	/*
	 * @Override public List<Advertisement> getAdvertisementsByOrderByUserNameAsc()
	 * { List<AdvertisementEntity> advertisementEntityList =
	 * userRepository.findByOrderByFirstNameAsc(); return
	 * UserUtils.convertUserEntityListToUserList(userEntityList); }
	 * 
	 * @Override public List<User> getUsersByOrderByFirstNameDesc() {
	 * List<UserEntity> userEntityList =
	 * userRepository.findByOrderByFirstNameDesc(); return
	 * UserUtils.convertUserEntityListToUserList(userEntityList); }
	 * 
	 * 
	 * 
	 * }
	 */

}
