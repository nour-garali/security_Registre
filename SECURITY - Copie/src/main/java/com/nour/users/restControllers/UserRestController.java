package com.nour.users.restControllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nour.users.entities.User;
import com.nour.users.repos.UserRepository;
import com.nour.users.service.UserService;
import com.nour.users.service.register.RegistrationRequest;


@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
	
	@Autowired
	UserRepository userRep;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userRep.findAll();
	 }
	
	
	@PostMapping("/register")
	public User register(@RequestBody RegistrationRequest request) {
		System.out.print("=====================================================");
		return userService.registerUser(request);
		
	}
	
	
	@GetMapping("/verifyEmail/{token}")
	 public User verifyEmail(@PathVariable("token") String token){
			return userService.validateToken(token);
	 }
	
	
}