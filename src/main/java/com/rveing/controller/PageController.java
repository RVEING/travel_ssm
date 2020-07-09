package com.rveing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PageController {
    @RequestMapping("registerPage")
    public String registerPage() {
        return "fore/registerPage";
    }
    @RequestMapping("registerSuccessPage")
    public String registerSuccessPage() {
        return "fore/registerSuccessPage";
    }
    @RequestMapping("loginPage")
    public String loginPage() {
        return "fore/loginPage";
    }
    @RequestMapping("adminLoginPage")
    public String adminLoginPage() {
        return "fore/adminLogin";
    }
    @RequestMapping("forealipay")
    public String alipay(){
        return "fore/alipayPage";
    }
    @RequestMapping("fore1")
    public String fore1(){
        return "fore/111";
    }
    @RequestMapping("fore2")
    public String fore2(){
        return "fore/write_note";
    }
    @RequestMapping("fore3")
    public String fore3(){
        return "fore/note1";
    }
    @RequestMapping("fore4")
    public String fore4(){
        return "fore/note2";
    }
    @RequestMapping("fore6")
    public String fore6(){
        return "index1";
    }


}