package com.rveing.service.impl;

import com.rveing.mapper.AdminMapper;
import com.rveing.pojo.Admin;
import com.rveing.pojo.AdminExample;
import com.rveing.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public void add(Admin a) {
        adminMapper.insert(a);
    }

    @Override
    public void delete(int id) {
        adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Admin a) {
        adminMapper.updateByPrimaryKeySelective(a);
    }

    @Override
    public Admin get(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Admin> list() {
        AdminExample example =new AdminExample();
        example.setOrderByClause("id asc");
        return adminMapper.selectByExample(example);
    }

    @Override
    public boolean isExist(String name) {
        AdminExample example =new AdminExample();
        example.createCriteria().andNameEqualTo(name);
        List<Admin> result= adminMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;
    }

    @Override
    public Admin get(String name, String password) {
        AdminExample example =new AdminExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        List<Admin> result= adminMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }
}
