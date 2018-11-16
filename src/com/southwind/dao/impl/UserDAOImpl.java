package com.southwind.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.southwind.dao.UserDAO;
import com.southwind.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	private static Map<Integer,User> users;
	
	static{
		users = new HashMap<Integer,User>();
		users.put(1, new User(1, "张三"));
		users.put(2, new User(2, "李四"));
		users.put(3, new User(3, "王五"));
	}
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return users.get(id);
	}
	
}
