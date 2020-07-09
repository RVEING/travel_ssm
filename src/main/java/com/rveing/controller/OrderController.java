package com.rveing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rveing.pojo.Order_;
import com.rveing.service.OrderItemService;
import com.rveing.service.OrderService;
import com.rveing.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemService orderItemService;

    @RequestMapping("admin_order_list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());

        List<Order_> os= orderService.list();

        int total = (int) new PageInfo<>(os).getTotal();
        page.setTotal(total);

        orderItemService.fill(os);

        model.addAttribute("os", os);
        model.addAttribute("page", page);

        return "admin/listOrder";
    }
}
