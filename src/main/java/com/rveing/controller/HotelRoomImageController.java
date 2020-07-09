package com.rveing.controller;

import com.rveing.pojo.HotelImage;
import com.rveing.pojo.HotelRoom;
import com.rveing.pojo.HotelRoomImage;
import com.rveing.service.HotelRoomImageService;
import com.rveing.service.HotelRoomService;
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
public class HotelRoomImageController {
    @Autowired
    HotelRoomService hotelRoomService;

    @Autowired
    HotelRoomImageService hotelRoomImageService;

    @RequestMapping("admin_hotelRoomImage_add")
    public String add(HotelRoomImage i, HttpSession session, UploadedImageFile uploadedImageFile) {
        hotelRoomImageService.add(i);
        String fileName = i.getId()+ ".jpg";
        String imageFolder;
        String imageFolder_small=null;
        String imageFolder_middle=null;
        if(true){
            imageFolder= session.getServletContext().getRealPath("img/HotelRoom");
            imageFolder_small= session.getServletContext().getRealPath("img/HotelRoom_small");
            imageFolder_middle= session.getServletContext().getRealPath("img/HotelRoom_middle");
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
        return "redirect:admin_hotelRoomImage_list?rid="+i.getHotelRoom_id();
    }

    @RequestMapping("admin_hotelRoomImage_delete")
    public String delete(int id,HttpSession session) {
        HotelRoomImage i = hotelRoomImageService.get(id);

        String fileName = i.getId()+ ".jpg";
        String imageFolder;
        String imageFolder_small=null;
        String imageFolder_middle=null;

        if(true){
            imageFolder= session.getServletContext().getRealPath("img/HotelRoom");
            imageFolder_small= session.getServletContext().getRealPath("img/HotelRoom_small");
            imageFolder_middle= session.getServletContext().getRealPath("img/HotelRoom_middle");
            File imageFile = new File(imageFolder,fileName);
            File f_small = new File(imageFolder_small,fileName);
            File f_middle = new File(imageFolder_middle,fileName);
            imageFile.delete();
            f_small.delete();
            f_middle.delete();

        }

        hotelRoomImageService.delete(id);

        return "redirect:admin_hotelRoomImage_list?rid="+i.getHotelRoom_id();
    }

    @RequestMapping("admin_hotelRoomImage_list")
    public String list(int rid, Model model) {
        HotelRoom r = hotelRoomService.get(rid);
        List<HotelRoomImage> hotelRoomSingle = hotelRoomImageService.list(rid);

        model.addAttribute("r", r);
        model.addAttribute("hotelRoomSingle", hotelRoomSingle);
        return "admin/listHotelRoomImage";
    }
}
