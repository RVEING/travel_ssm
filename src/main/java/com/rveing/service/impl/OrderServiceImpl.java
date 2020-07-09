package com.rveing.service.impl;

import com.rveing.mapper.Order_Mapper;
import com.rveing.pojo.Order_;
import com.rveing.pojo.Order_Example;
import com.rveing.pojo.Orderitem;
import com.rveing.pojo.User;
import com.rveing.service.OrderItemService;
import com.rveing.service.OrderService;
import com.rveing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    Order_Mapper orderMapper;
    @Autowired
    OrderItemService orderItemService;
    @Autowired
    UserService userService;

    @Override
    public void add(Order_ c) {
        orderMapper.insert(c);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    public float add(Order_ o, List<Orderitem> ois) {
        float total = 0;
        add(o);

        if(false)
            throw new RuntimeException();

        for (Orderitem oi: ois) {
            oi.setOid(o.getId());
            orderItemService.update(oi);
            total+=oi.getScenic_spot().getPrice()*oi.getNumber();
        }
        return total;
    }

    @Override
    public void delete(int id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Order_ c) {
        orderMapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public Order_ get(int id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    public List<Order_> list(){
        Order_Example example =new Order_Example();
        example.setOrderByClause("id desc");
        List<Order_> result =orderMapper.selectByExample(example);
        setUser(result);
        return result;
    }

    @Override
    public List list(int uid, String excludedStatus) {
        Order_Example example =new Order_Example();
        example.createCriteria().andUidEqualTo(uid).andStatusNotEqualTo(excludedStatus);
        example.setOrderByClause("id desc");
        return orderMapper.selectByExample(example);
    }

    public void setUser(List<Order_> os){
        for (Order_ o : os)
            setUser(o);
    }
    public void setUser(Order_ o){
        int uid = o.getUid();
        User u = userService.get(uid);
        o.setUser(u);
    }
}
