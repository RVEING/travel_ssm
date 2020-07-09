package com.rveing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rveing.pojo.Scenic_spot;
import com.rveing.service.ScenicSpotService;
import com.rveing.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
    public class ScenicSpotController {
    @Autowired
    ScenicSpotService scenicSpotService;

    @RequestMapping("admin_spot_list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Scenic_spot> ss= scenicSpotService.list();
        int total = (int) new PageInfo<>(ss).getTotal();
        page.setTotal(total);
        model.addAttribute("ss", ss);
        model.addAttribute("page", page);
        return "admin/listSpot";
    }
    @RequestMapping("admin_spot_add")
    public String add(Model model, Scenic_spot spot) {
        scenicSpotService.add(spot);
        return "redirect:admin_spot_list?id="+spot.getId();
    }
    @RequestMapping("admin_spot_delete")
    public String delete(int id) {
        scenicSpotService.delete(id);
        return "redirect:/admin_spot_list";
    }

    @RequestMapping("admin_spot_edit")
    public String edit(int id,Model model) throws IOException {
        Scenic_spot s=scenicSpotService.get(id);
        model.addAttribute("s", s);
        return "admin/editScenicSpot";
    }

    @RequestMapping("admin_spotProperty_edit")
    public String edit1(int id,Model model) throws IOException {
        Scenic_spot s=scenicSpotService.get(id);
        model.addAttribute("s", s);
        return "admin/editSpotProperty";
    }

    @RequestMapping("admin_spot_update")
    public String update(Scenic_spot spot) {
        scenicSpotService.update(spot);
        return "redirect:admin_spot_list?cid="+spot.getId();
    }
}
