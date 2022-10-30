package com.besant.shopping.service;

import com.besant.shopping.pojo.Userprofile;
import com.besant.shopping.repo.SignUpRepository;

public class SignUpService {

	public boolean signUp(Userprofile user) {
		SignUpRepository signupRepo= new SignUpRepository();
		return signupRepo.signup(user);
		
	}
}
