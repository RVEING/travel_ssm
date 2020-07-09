package com.rveing.service;

import com.rveing.pojo.Order_;
import com.rveing.pojo.Orderitem;

import java.util.List;

public interface OrderService {

    String waitPay = "waitPay";
    String waitFinish = "waitFinish";
    String finish = "finish";
    String delete = "delete";

    void add(Order_ c);

    float add(Order_ o,List<Orderitem> ois);
    void delete(int id);
    void update(Order_ c);
    Order_ get(int id);
    List list();
    List list(int uid, String excludedStatus);
}
