package org.lanqiao.service;

import java.util.Date;
import java.util.List;

import org.lanqiao.entity.User;

public interface UserService {
	public int insertUser(User user);

	public int getAge(String userName);
	
	public List<User> getAllInfo();
	
	public int insertPart(User user);
	
	public int updateAge(int age,String userName);
	
	public int checkusername(String username);
}
