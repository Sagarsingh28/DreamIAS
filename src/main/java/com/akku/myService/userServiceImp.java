package com.akku.myService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akku.myDao.userDao;
import com.akku.myModels.LoginData;

@Service
public class userServiceImp implements userService {
	
	@Autowired
	userDao repo;
	
	@Override
	public boolean registerUser(LoginData data) {
		return repo.registerUser(data)> 0 ? true : false;
	}

}
