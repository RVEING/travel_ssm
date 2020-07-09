package com.rveing.service.impl;

import com.rveing.mapper.OrderitemMapper;
import com.rveing.pojo.*;
import com.rveing.service.HotelService;
import com.rveing.service.OrderItemService;
import com.rveing.service.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderitemMapper orderItemMapper;
    @Autowired
    ScenicSpotService scenicSpotService;
    @Autowired
    HotelService hotelService;

    @Override
    public void add(Orderitem c) {
        orderItemMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Orderitem c) {
        orderItemMapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public Orderitem get(int id) {
        Orderitem result = orderItemMapper.selectByPrimaryKey(id);
        setScenicSpot(result);
        return result;
    }

    public List<Orderitem> list(){
        OrderitemExample example =new OrderitemExample();
        example.setOrderByClause("id desc");
        return orderItemMapper.selectByExample(example);

    }

    @Override
    public void fill(List<Order_> os) {
        for (Order_ o : os) {
            fill(o);
        }
    }

    public void fill(Order_ o) {
        OrderitemExample example =new OrderitemExample();
        example.createCriteria().andOidEqualTo(o.getId());
        example.setOrderByClause("id desc");
        List<Orderitem> ois =orderItemMapper.selectByExample(example);
        setScenicSpot(ois);

        float total = 0;
        int totalNumber = 0;
        for (Orderitem oi : ois) {
            total+=oi.getNumber()*oi.getScenic_spot().getPrice();
            totalNumber+=oi.getNumber();
        }
        o.setTotal(total);
        o.setTotalNumber(totalNumber);
        o.setOrderitems(ois);

    }

    @Override
    public List<Orderitem> listByUser(int uid) {
        OrderitemExample example =new OrderitemExample();
        example.createCriteria().andUidEqualTo(uid).andOidIsNull();
        List<Orderitem> result =orderItemMapper.selectByExample(example);
        setScenicSpot(result);
        return result;
    }
    @Override
    public List<Orderitem> listByUser2(int uid) {
        OrderitemExample example =new OrderitemExample();
        example.createCriteria().andUidEqualTo(uid).andOidIsNull();
        List<Orderitem> result =orderItemMapper.selectByExample(example);
        setHotel(result);
        return result;
    }

    public void setScenicSpot(List<Orderitem> ois){
        for (Orderitem oi: ois) {
            setScenicSpot(oi);
        }
    }

    private void setScenicSpot(Orderitem oi){
        Scenic_spot s=scenicSpotService.get(oi.getSid());
        oi.setScenic_spot(s);
    }

    public void setHotel(List<Orderitem> ois){
        for (Orderitem oi: ois) {
            setHotel(oi);
        }
    }

    private void setHotel(Orderitem oi){
        Hotel h=hotelService.get(oi.getSid());
        oi.setHotel(h);
    }


}
