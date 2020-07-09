package com.rveing.service;

import com.rveing.pojo.Admin;

import java.util.List;

public interface AdminService {
    void add(Admin a);
    void delete(int id);
    void update(Admin a);
    Admin get(int id);
    List list();

    boolean isExist(String name);
    Admin get(String name, String password);

}
