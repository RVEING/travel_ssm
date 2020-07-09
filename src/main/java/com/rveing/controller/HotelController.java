package com.rveing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rveing.pojo.Hotel;
import com.rveing.service.HotelService;
import com.rveing.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @RequestMapping("admin_hotel_list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Hotel> hs= hotelService.list();
        int total = (int) new PageInfo<>(hs).getTotal();
        page.setTotal(total);
        model.addAttribute("hs", hs);
        model.addAttribute("page", page);
        return "admin/listHotel";
    }

    @RequestMapping("admin_hotel_add")
    public String add(Model model, Hotel hotel) {
        hotelService.add(hotel);
        return "redirect:admin_hotel_list?id="+hotel.getId();
    }

    @RequestMapping("admin_hotel_delete")
    public String delete(int id) {
        hotelService.delete(id);
        return "redirect:/admin_hotel_list";
    }

    @RequestMapping("admin_hotelProperty_edit")
    public String edit1(int id,Model model) throws IOException {
        Hotel h=hotelService.get(id);
        model.addAttribute("h", h);
        return "admin/editHotelProperty";
    }

    @RequestMapping("admin_hotel_update")
    public String update(Hotel hotel) {
        hotelService.update(hotel);
        return "redirect:admin_hotel_list?id="+hotel.getId();
    }
}
