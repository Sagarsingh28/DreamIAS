package com.akku.myDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.akku.myModels.LoginData;

@Repository
public class userDAOImp implements userDao {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int registerUser(LoginData data) {
		String query = "insert into register_user(email,name,password,phone_number,state) values(?,?,?,?,?)";
		try {
			return jdbc.update(query, data.getUserEmail(),data.getUserName(),data.getUserPass(),data.getUserPhoneNumber(),data.getUserState());
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		
	}

}
