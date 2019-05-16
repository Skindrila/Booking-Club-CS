package com.skindrila.spring.library.service;

import com.skindrila.spring.library.entity.User;

public interface EmailService {
	
	void sendUserRegistrationConfirmEmail(User user);
	
	void sendForgotPasswordEmail(User user, String path, String token);

}
