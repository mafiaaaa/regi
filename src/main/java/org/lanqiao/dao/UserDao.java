package org.lanqiao.dao;

import java.util.Date;
import java.util.List;

import org.lanqiao.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int getAge(String userName);
    
    int insertPart(User user);
    
    List<User> getAllInfo();
    
    int updateAge(int age,String userName);
    
    int checkusername(String username);
}