package com.rveing.controller;

import com.rveing.pojo.Hotel;
import com.rveing.pojo.HotelImage;
import com.rveing.service.HotelImageService;
import com.rveing.service.HotelService;
import com.rveing.util.ImageUtil;
import com.rveing.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("")
public class HotelImageController {
    @Autowired
    HotelService hotelService;

    @Autowired
    HotelImageService hotelImageService;

    @RequestMapping("admin_hotelImage_add")
    public String add(HotelImage i, HttpSession session, UploadedImageFile uploadedImageFile) {
        hotelImageService.add(i);
        String fileName = i.getId()+ ".jpg";
        String imageFolder;
        String imageFolder_small=null;
        String imageFolder_middle=null;
        if(true){
            imageFolder= session.getServletContext().getRealPath("img/Hotel");
            imageFolder_small= session.getServletContext().getRealPath("img/Hotel_small");
            imageFolder_middle= session.getServletContext().getRealPath("img/Hotel_middle");
        }

        File f = new File(imageFolder, fileName);
        f.getParentFile().mkdirs();
        try {
            uploadedImageFile.getImage().transferTo(f);
            BufferedImage img = ImageUtil.change2jpg(f);
            ImageIO.write(img, "jpg", f);

            if(true) {
                File f_small = new File(imageFolder_small, fileName);
                File f_middle = new File(imageFolder_middle, fileName);

                ImageUtil.resizeImage(f, 56, 56, f_small);
                ImageUtil.resizeImage(f, 217, 190, f_middle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:admin_hotelImage_list?hid="+i.getHotel_id();
    }

    @RequestMapping("admin_hotelImage_delete")
    public String delete(int id,HttpSession session) {
        HotelImage i = hotelImageService.get(id);

        String fileName = i.getId()+ ".jpg";
        String imageFolder;
        String imageFolder_small=null;
        String imageFolder_middle=null;

        if(true){
            imageFolder= session.getServletContext().getRealPath("img/Hotel");
            imageFolder_small= session.getServletContext().getRealPath("img/Hotel_small");
            imageFolder_middle= session.getServletContext().getRealPath("img/Hotel_middle");
            File imageFile = new File(imageFolder,fileName);
            File f_small = new File(imageFolder_small,fileName);
            File f_middle = new File(imageFolder_middle,fileName);
            imageFile.delete();
            f_small.delete();
            f_middle.delete();

        }

        hotelImageService.delete(id);

        return "redirect:admin_hotelImage_list?hid="+i.getHotel_id();
    }

    @RequestMapping("admin_hotelImage_list")
    public String list(int hid, Model model) {
        Hotel h = hotelService.get(hid);
        List<HotelImage> hotelSingle = hotelImageService.list(hid);

        model.addAttribute("h", h);
        model.addAttribute("hotelSingle", hotelSingle);
        return "admin/listHotelImage";
    }
}