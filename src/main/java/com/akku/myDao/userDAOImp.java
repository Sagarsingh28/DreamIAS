package com.akku.myDao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.akku.myModels.LoginData;

@Repository
public class userDAOImp implements userDao {
	
//	@Autowired
//	JdbcTemplate jdbc;
	
	@Override
	public int registerUser(LoginData data) {
		
		SessionFactory sf = new Configuration().configure("hiberConfig.xml").addAnnotatedClass(LoginData.class).buildSessionFactory();
		Session session = sf.openSession();
		
		try {
			session.beginTransaction();
			System.out.println("1 working");
			session.save(new LoginData());
			System.out.println("2 working");
			session.getTransaction().commit();
			System.out.println("3 working");
		}catch(Exception e) {
			System.out.println("Operation Failed!!!");
			return 0;
		}finally {
			session.close();
		}
		return 1;
		
		
//		String query = "insert into register_user(email,name,password,phone_number,state) values(?,?,?,?,?)";
//		try {
//			return jdbc.update(query, data.getUserEmail(),data.getUserName(),data.getUserPass(),data.getUserPhoneNumber(),data.getUserState());
//		}catch(Exception e) {
//			System.out.println(e);
//			return 0;
//		}
		
	}

}
