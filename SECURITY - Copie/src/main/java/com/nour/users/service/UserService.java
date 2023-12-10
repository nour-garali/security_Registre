package com.nour.users.service;

import java.util.List;

import com.nour.users.entities.Role;
import com.nour.users.entities.User;
import com.nour.users.service.register.RegistrationRequest;
public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
	User registerUser(RegistrationRequest request);
	
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);
}