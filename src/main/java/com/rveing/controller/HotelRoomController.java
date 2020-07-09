package com.rveing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rveing.pojo.Hotel;
import com.rveing.pojo.HotelRoom;
import com.rveing.service.HotelRoomService;
import com.rveing.service.HotelService;
import com.rveing.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class HotelRoomController {
    @Autowired
    HotelService hotelService;
    @Autowired
    HotelRoomService hotelRoomService;

    @RequestMapping("admin_hotelRoom_list")
    public String list(int hid, Model model, Page page) {

        Hotel h = hotelService.get(hid);

        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<HotelRoom> rs = hotelRoomService.list(hid);

        int total = (int) new PageInfo<>(rs).getTotal();
        page.setTotal(total);
        page.setParam("&hid="+h.getId());

        model.addAttribute("rs", rs);
        model.addAttribute("h", h);
        model.addAttribute("page", page);

        return "admin/listHotelRoom";
    }
    @RequestMapping("admin_hotelRoom_add")
    public String add(Model model, HotelRoom r) {

        hotelRoomService.add(r);
        return "redirect:admin_hotelRoom_list?hid="+r.getHid();
    }
    @RequestMapping("admin_hotelRoom_edit")
    public String edit(Model model, int id) {
        HotelRoom r = hotelRoomService.get(id);
        Hotel h = hotelService.get(r.getHid());
        r.setHotel(h);
        model.addAttribute("r", r);
        return "admin/editHotelRoom";
    }
    @RequestMapping("admin_hotelRoom_update")
    public String update( HotelRoom r) {
        hotelRoomService.update(r);
        return "redirect:admin_hotelRoom_list?hid="+r.getHid();
    }
    @RequestMapping("admin_hotelRoom_delete")
    public String delete(int id) {
        HotelRoom r = hotelRoomService.get(id);
        hotelRoomService.delete(id);
        return "redirect:admin_hotelRoom_list?hid="+r.getHid();
    }
}
