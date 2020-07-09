package com.rveing.service;

import com.rveing.pojo.Order_;
import com.rveing.pojo.Orderitem;

import java.util.List;

public interface OrderItemService {
    void add(Orderitem c);

    void delete(int id);
    void update(Orderitem c);
    Orderitem get(int id);
    List list();

    void fill(List<Order_> os);

    void fill(Order_ o);

    List<Orderitem> listByUser(int uid);
    List<Orderitem> listByUser2(int uid);
}
