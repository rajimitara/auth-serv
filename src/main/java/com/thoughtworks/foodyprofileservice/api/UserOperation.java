package com.thoughtworks.foodyprofileservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserOperation {

	@PostMapping("/v1/user/{userId}/signUp")
	public ResponseEntity<String> registerUser(@RequestParam String userId){
		
		return null;
	}
	
	@PostMapping("/v1/user/{userId}/login")
	public ResponseEntity<String> login(@RequestParam String userId){
		//respond back with token
		return null;
	}
	
	//fetch Menu from restuarant
	@GetMapping("/v1/resturant/{restuarantId}/menu")
	public ResponseEntity<String> fetchMenu(@RequestParam String restuarantId){
		
		return null;
	}
	
	//add Items to cart
	
	@PostMapping("/v1/resturant/{restuarantId}/menu/{menuItem}")
	public ResponseEntity<String> addToCart(@RequestParam String restuarantId){
		
		//fetch restuarantId from cart if any. Basic validation to check if restuarantId matches
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}
