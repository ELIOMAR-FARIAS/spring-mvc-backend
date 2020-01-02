package com.edigital.springmvcbackend.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.edigital.springmvcbackend.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
