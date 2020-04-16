package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.json.Advertisement;

import com.spring.service.AdvertisementService;
import com.spring.service.UserService;
import com.spring.service.AdvertisementService;


@RestController
@RequestMapping("/advertisementapp")

public class AdvertisementController {
	@Autowired
	private AdvertisementService registrationService;
	
	@Autowired
	private UserService userService;

	  @PostMapping(value="/postAdvertisement", produces=MediaType.APPLICATION_JSON_VALUE,
			  consumes=MediaType.APPLICATION_JSON_VALUE) 
			  public @ResponseBody Advertisement
			  registerAdvertisement(@RequestBody Advertisement advertisement,
					  @RequestHeader(value="auth-token") String authToken) {
				  if(userService.isValidToken(authToken)) {
				  return registrationService.registerAdvertisement(advertisement);
			  }
				  else {
					  return null;
				  }
				  }
	
	  
	
	  
//	  @PutMapping(value="/advertisement/{postId}", produces=MediaType.APPLICATION_JSON_VALUE,
//	  consumes=MediaType.APPLICATION_JSON_VALUE) public @ResponseBody Advertisement
//	  updateAdvertisement(@RequestBody Advertisement advertisement, @PathVariable(value="postId") String postId) {
//	  return registrationService.update(advertisement, postId); }
	
	  
	  @GetMapping("/advertise/postedBy/{name}")
			public List<Advertisement> getAdvertisementByUserName(@PathVariable(value="name") String name)
			{
				return registrationService.getAdvertiseByUserName(name);
			}
	  
	  @GetMapping("/advertisement/category")
			public List<String> getAllCategory()
			{
				return registrationService.getAllCategory();
			}
	@GetMapping("/advertisementList")
			public List<Advertisement> getAllAdvertise()
			{
				return registrationService.getAllAdvertisement();
			}
	

	@GetMapping("/advertise/sortByDscCategory")
	public List<Advertisement> getAdvertisementSortByDescCategory()
	{
		return registrationService.getAllAdvertisementSortByDescCategory();
	}
	
	@GetMapping("/advertisement/sortByPostId")
	public List<Advertisement> getAdvertiseSortByPostId()
	{
		return registrationService.getAllAdvertiseSortByPostId();
	}
	
	@GetMapping("/advertise/sortByDscPostId")
	public List<Advertisement> getAdvertisementSortByDescPostId()
	{
		return registrationService.getAllAdvertisementSortByDescPostId();
	}
	@GetMapping("/advertise/sortByPostedBy")
	public List<Advertisement> getAdvertisementSortByPostedBy()
	{
		return registrationService.getAllAdvertisementSortByPostedBy();
	}
	
	@GetMapping("/advertise/sortByDscPostedBy")
	public List<Advertisement> getAdvertisementSortByDscPostedBy()
	{
		return registrationService.getAllAdvertisementSortByDescPostedBy();
	}
  
  
  @GetMapping("/advertisement/category/{category}") public List<Advertisement>
  getAdvertisementsByCategory(@PathVariable(value="category") String category) {
  return registrationService.getAdvertisementsByCategory(category); }
  
  public List<Advertisement> getAllAdvertiseSortByCategory()
	{
		return registrationService.getAllAdvertisementSortByCategory();
	}
		  
	  
		/*
		 * @GetMapping("/advertise/user/{postId}") public List<Advertisement>
		 * getAdvertiseByPostId(@RequestHeader(name="auth-token") String
		 * authToken,@PathVariable(value="postId") String postId) { return
		 * registrationService.getAdvertisementByPostId(authToken,postId); }
		 * 
		 * @DeleteMapping("/advertise/user/{postId}") public boolean
		 * deleteAdvertisementByPostId(@RequestHeader(name="auth-token") String
		 * authToken,@PathVariable(value="postId") String postId) { return
		 * registrationService.deleteAdvertisementByPostId(authToken,postId); }
		 */
	  
	
	  
	
	
		
	
	  
		/*
		 * @GetMapping("/user/firstname/sort/asc") public List<User>
		 * getUsersByOrderByFirstNameAsc() { return
		 * registrationService.getUsersByOrderByFirstNameAsc(); }
		 * 
		 * @GetMapping("/user/firstname/sort/desc") public List<User>
		 * getUsersByOrderByFirstNameDesc() { return
		 * registrationService.getUsersByOrderByFirstNameDesc(); } }
		 */
	 

}
