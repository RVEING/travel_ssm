package com.rveing.controller;

        import com.rveing.pojo.Image;
        import com.rveing.pojo.Scenic_spot;
        import com.rveing.service.ImageService;
        import com.rveing.service.ScenicSpotService;
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
public class ImageController {
    @Autowired
    ScenicSpotService scenicSpotService;

    @Autowired
    ImageService imageService;

    @RequestMapping("admin_spotImage_add")
    public String add(Image  i, HttpSession session, UploadedImageFile uploadedImageFile) {
        imageService.add(i);
        String fileName = i.getId()+ ".jpg";
        String imageFolder;
        String imageFolder_small=null;
        String imageFolder_middle=null;
        if(true){
            imageFolder= session.getServletContext().getRealPath("img/scenicSpot");
            imageFolder_small= session.getServletContext().getRealPath("img/scenicSpot_small");
            imageFolder_middle= session.getServletContext().getRealPath("img/scenicSpot_middle");
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
        return "redirect:admin_spotImage_list?sid="+i.getScenic_spot_id();
    }

    @RequestMapping("admin_spotImage_delete")
    public String delete(int id,HttpSession session) {
        Image i = imageService.get(id);

        String fileName = i.getId()+ ".jpg";
        String imageFolder;
        String imageFolder_small=null;
        String imageFolder_middle=null;

        if(true){
            imageFolder= session.getServletContext().getRealPath("img/scenicSpot");
            imageFolder_small= session.getServletContext().getRealPath("img/scenicSpot_small");
            imageFolder_middle= session.getServletContext().getRealPath("img/scenicSpot_middle");
            File imageFile = new File(imageFolder,fileName);
            File f_small = new File(imageFolder_small,fileName);
            File f_middle = new File(imageFolder_middle,fileName);
            imageFile.delete();
            f_small.delete();
            f_middle.delete();

        }

        imageService.delete(id);

        return "redirect:admin_spotImage_list?sid="+i.getScenic_spot_id();
    }

    @RequestMapping("admin_spotImage_list")
    public String list(int sid, Model model) {
        Scenic_spot s = scenicSpotService.get(sid);
        List<Image> spotSingle = imageService.list(sid);

        model.addAttribute("s", s);
        model.addAttribute("spotSingle", spotSingle);
        return "admin/listSpotImage";
    }
}
