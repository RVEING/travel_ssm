package com.rveing.controller;


import com.rveing.pojo.Travels;
import com.rveing.pojo.User;
import com.rveing.service.TravelsService;
import com.rveing.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller

public class DiaryController {
    @Autowired
    private UploadFileService uploadService;
    @Autowired
    private TravelsService travelsService;

    @RequestMapping("/uploadTravel")
    public String uploadTravel(Travels travel, HttpSession session, Model model) throws Exception {

        travel.setPtime(new Date());
        User user = (User)session.getAttribute("user");
        if(user!=null){
            travel.setUid(user.getId());
        }
        travel.setReadnum(0);
        travelsService.saveTravel(travel);
        model.addAttribute("travel", travel);
        return "write_note";// 跳转的页面
    }
}
