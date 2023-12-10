package com.nour.users.service.register;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nour.users.entities.Role;
import com.nour.users.entities.User;
import com.nour.users.repos.RoleRepository;
import com.nour.users.repos.UserRepository;

public class RegistrationRequest {
	private String username;
	private String password;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RegistrationRequest(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

}