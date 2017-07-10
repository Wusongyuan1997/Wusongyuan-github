package com.cqut.dao;

import org.springframework.stereotype.Service;

import com.cqut.model.User;
@Service
public interface IUserDao {

	User selectByPrimaryKey(int userId);

}
