package com.cqut.service.implement;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqut.dao.IUserDao;
import com.cqut.model.User;
import com.cqut.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource  
    private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
