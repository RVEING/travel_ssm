package com.rveing.service.impl;

import com.rveing.mapper.UserMapper;
import com.rveing.pojo.User;
import com.rveing.pojo.UserExample;
import com.rveing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User u) {
        userMapper.insert(u);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User u) {
        userMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<User> list(){
        UserExample example =new UserExample();
        example.setOrderByClause("id asc");
        return userMapper.selectByExample(example);
    }


    @Override
    public boolean isExist(String name) {
        UserExample example =new UserExample();
        example.createCriteria().andUnameEqualTo(name);
        List<User> result= userMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;

    }
    @Override
    public User get(String name, String password) {
        UserExample example =new UserExample();
        example.createCriteria().andUnameEqualTo(name).andPasswordEqualTo(password);
        List<User> result= userMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }
}