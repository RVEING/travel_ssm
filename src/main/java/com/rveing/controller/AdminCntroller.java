package com.rveing.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rveing.pojo.Admin;
import com.rveing.service.AdminService;
import com.rveing.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
public class AdminCntroller {
    @Autowired
    AdminService adminService;

    @RequestMapping("admin_admin_list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Admin> as= adminService.list();

        int total= (int) new PageInfo<>(as).getTotal();
        page.setTotal(total);

        model.addAttribute("as", as);
        model.addAttribute("page", page);

        return "admin/listAdmin";
    }
    @RequestMapping("admin_admin_add")
    public String add(Model model, Admin admin) {
        adminService.add(admin);
        return "redirect:admin_admin_list?id="+admin.getId();
    }
    @RequestMapping("admin_admin_delete")
    public String delete(int id) {
        adminService.delete(id);
        return "redirect:/admin_admin_list";
    }



    @RequestMapping("admin_adminProperty_edit")
    public String edit1(int id,Model model) throws IOException {
        Admin a=adminService.get(id);
        model.addAttribute("a", a);
        return "admin/editAdmin";
    }

    @RequestMapping("admin_admin_update")
    public String update(Admin admin) {
        adminService.update(admin);
        return "redirect:admin_admin_list?cid="+admin.getId();
    }
}
