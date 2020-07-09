package com.rveing.controller;

import com.github.pagehelper.PageHelper;
import com.rveing.pojo.*;
import com.rveing.service.*;

import com.rveing.util.ItemSimilarity;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("")
public class ForeController {
    @Autowired
    ScenicSpotService scenicSpotService;

    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;
    @Autowired
    ImageService imageService;
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemService orderItemService;
    @Autowired
    HotelService hotelService;
    @Autowired
    HotelImageService hotelImageService;
    @Autowired
    HotelRoomService hotelRoomService;
    @Autowired
    HotelRoomImageService hotelRoomImageService;

    @RequestMapping("forehome")
    public String home(Model model, HttpServletRequest request) {

        User user =(User)request.getSession().getAttribute("user");
        //生成推荐

        List<Scenic_spot> recomends = new ArrayList<>();
//        if(user!=null)
//            recomends = ItemSimilarity.recommend(user.getId());
//        else
 //           recomends = scenicSpotService.findTopNSpots(recomends);
//        for(Scenic_spot s:recomends){
//            System.out.println("测试2"+s.getSname());
//        }
//        int num=1516110;
        if(user!=null)
            recomends = scenicSpotService.findTopNSpots(recomends);
        else if(user==null)
            recomends = scenicSpotService.findTopNSpots1(recomends);

        for(Scenic_spot s:recomends){
            List<Image> singleImages = imageService.list(s.getId());
            s.setSingleImages(singleImages);
            s.setFirstScenicSpotImage(singleImages.get(0));
        }

        model.addAttribute("recomends",recomends);
        return "index2";
    }

    @RequestMapping("foreregister")
    public String register(Model model, User user) {
        String uname =  user.getUname();
        uname = HtmlUtils.htmlEscape(uname);
        user.setUname(uname);
        boolean exist = userService.isExist(uname);
        if(exist){
            String m ="用户名已经被使用,不能使用";
            model.addAttribute("msg", m);
            return "fore/registerPage";
        }
        userService.add(user);
        return "redirect:registerSuccessPage";
    }
    @RequestMapping("forelogin")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
        name = HtmlUtils.htmlEscape(name);

        User user = userService.get(name,password);

        if(null==user){
            model.addAttribute("msg", "账号密码错误");
            return "fore/loginPage";
        }
        session.setAttribute("user", user);
        return "redirect:forehome";
    }
    @RequestMapping("foreAdminlogin")
    public String adminLogin(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
        name = HtmlUtils.htmlEscape(name);

        Admin admin = adminService.get(name,password);

        if(null==admin){
            model.addAttribute("msg", "账号密码错误");
            return "fore/adminLogin";
        }
        session.setAttribute("admin", admin);
        return "redirect:admin_spot_list";
    }

    @RequestMapping("forelogout")
    public String logout( HttpSession session) {

        session.removeAttribute("user");
        return "redirect:forehome";
    }
    @RequestMapping("foreScenicSpot")
    public String scenicSpot(int sid, Model model) {
        Scenic_spot s = scenicSpotService.get(sid);

        List<Image> singleImages = imageService.list(s.getId());

        s.setSingleImages(singleImages);

        s.setFirstScenicSpotImage(singleImages.get(0));
        model.addAttribute("s", s);
        return "fore/scenicSpotPage";
    }
    @RequestMapping("foreHotel")
    public String hotel(int hid, Model model) {
        Hotel h = hotelService.get(hid);
        List<HotelImage> singleImages = hotelImageService.list(h.getId());
        h.setSingleImages(singleImages);


        List<HotelRoom> rs = hotelRoomService.list(hid);
        //HotelRoom r=hotelRoomService.get();

        model.addAttribute("h", h);
        model.addAttribute("rs", rs);
        return "fore/hotelPage111";
    }
    @RequestMapping("forecheckLogin")
    @ResponseBody
    public String checkLogin( HttpSession session) {
        User user =(User)session.getAttribute("user");
        System.out.println("123");
        if(null!=user)
            return "success";
        return "fail";
    }
    @RequestMapping("foreloginAjax")
    @ResponseBody
    public String loginAjax(@RequestParam("name") String name, @RequestParam("password") String password,HttpSession session) {
        name = HtmlUtils.htmlEscape(name);
        User user = userService.get(name,password);

        if(null==user){
            return "fail";
        }
        session.setAttribute("user", user);
        return "success";
    }
    @RequestMapping("foresearch")
    public String search( String keyword,Model model){

        PageHelper.offsetPage(0,20);
        List<Scenic_spot> ss=scenicSpotService.search(keyword);

//        List<Product> ps= productService.search(keyword);
//        productService.setSaleAndReviewNumber(ps);
        model.addAttribute("ss",ss);
        return "fore/222";
    }
    @RequestMapping("foresearchAll")
    public String searchAll( String keyword,int choose,Model model){
        PageHelper.offsetPage(0,20);
        List<Scenic_spot> ss=scenicSpotService.search(keyword);
        List<Hotel> hs=hotelService.search(keyword);

        for(Scenic_spot s:ss){
            List<Image> singleImages = imageService.list(s.getId());

            s.setSingleImages(singleImages);

            s.setFirstScenicSpotImage(singleImages.get(0));
        }


      //  HotelRoom room=hotelRoomService.searchMin();
//        List<Scenic_spot> ds=scenicSpotService.search(keyword);
//        List<Product> ps= productService.search(keyword);
//        productService.setSaleAndReviewNumber(ps);
        if(choose==1){
            model.addAttribute("ss",ss);
            model.addAttribute("hs",hs);
            //model.addAttribute("ds",ss);
            return "fore/searchResultAll";
        }
        else if(choose==2){
            model.addAttribute("ss",ss);

            return "fore/searchBySpot";
        }
        else if(choose==3){
            model.addAttribute("hs",hs);
            return "fore/searchByHotel";
        }
        else{
            //model.addAttribute("ds",ss);
            return "fore/searchResultDiary";
        }
    }

    @RequestMapping("foreNavSpot")
    public String navSpot(Model model){
        List<Scenic_spot> ss=scenicSpotService.list();

        for(Scenic_spot s:ss){
            List<Image> singleImages = imageService.list(s.getId());
            s.setSingleImages(singleImages);
            s.setFirstScenicSpotImage(singleImages.get(0));
        }
        model.addAttribute("ss",ss);
        return "fore/navSpot";
    }
    @RequestMapping("foreNavHotel")
    public String navHotel(Model model){
        List<Hotel> hs=hotelService.navList();

//        for(Hotel h:hs){
//            List<HotelImage> singleImages = hotelImageService.list(h.getId());
//
//            h.setFirstHotelImage(singleImages.get(0));
//        }
        model.addAttribute("hs",hs);
        return "fore/navHotel";
    }

    @RequestMapping("forebuyone")
    public String buyone(int sid, int num, HttpSession session) {
        Scenic_spot s = scenicSpotService.get(sid);
        int oiid = 0;

        User user =(User)  session.getAttribute("user");
        boolean found = false;

        List<Orderitem> ois = orderItemService.listByUser(user.getId());
        for (Orderitem oi : ois) {

            if(oi.getScenic_spot().getId().intValue()==s.getId().intValue()){
                oi.setNumber(oi.getNumber()+num);
                orderItemService.update(oi);
                found = true;
                oiid = oi.getId();
                break;
            }
        }

        if(!found){
            Orderitem oi = new Orderitem();
            oi.setUid(user.getId());
            oi.setNumber(num);
            oi.setSid(sid);
            orderItemService.add(oi);
            oiid = oi.getId();
        }
        return "redirect:forebuy?oiid="+oiid;
    }
    @RequestMapping("forebuy")
    public String buy( Model model,String[] oiid,HttpSession session){
        List<Orderitem> ois = new ArrayList<>();
        float total = 0;

        for (String strid : oiid) {
            int id = Integer.parseInt(strid);
            Orderitem oi= orderItemService.get(id);
            total +=oi.getScenic_spot().getPrice()*oi.getNumber();
            ois.add(oi);
        }

        session.setAttribute("ois", ois);
        model.addAttribute("ois",ois);
        model.addAttribute("total", total);
        return "fore/buyPage";
    }
    @RequestMapping("forecreateOrder")
    public String createOrder(Model model, Order_ order, HttpSession session,int num,float spotPrice,String iinDate){
        User user =(User)  session.getAttribute("user");
        System.out.println(iinDate);

        String string = iinDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(string);
            System.out.println(date);//切割掉不要的时分秒数据
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String orderCode = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + RandomUtils.nextInt(10000);
        order.setOrderCode(orderCode);
        order.setCreateDate(new Date());
        order.setUid(user.getId());
        order.setStatus(OrderService.waitPay);
        order.setInDate(date);
        order.setOutDate(date);
        List<Orderitem> ois= (List<Orderitem>)  session.getAttribute("ois");
        float total =orderService.add(order,ois);
        float total1=num*spotPrice;

        return "redirect:forealipay?oid="+order.getId() +"&total="+total1;
    }
    @RequestMapping("forebuyone2")
    public String buyone2(int rid, int num, HttpSession session) {
        HotelRoom r=hotelRoomService.get(rid);
        Hotel h=hotelService.get(r.getHid());
        h.setNum(r.getPrice());
        h.setNumber(r.getNumber());
        int oiid = 0;

        User user =(User)  session.getAttribute("user");
        boolean found = false;

        List<Orderitem> ois = orderItemService.listByUser2(user.getId());
        for (Orderitem oi : ois) {

            if(oi.getHotel().getId().intValue()==h.getId().intValue()){
                oi.setNumber(oi.getNumber()+num);
                orderItemService.update(oi);
                found = true;
                oiid = oi.getId();
                break;
            }
        }

        if(!found){
            Orderitem oi = new Orderitem();
            oi.setUid(user.getId());
            oi.setNumber(num);
            oi.setHid(h.getId());
            orderItemService.add(oi);
            oiid = oi.getId();
        }
        return "redirect:forebuy2?oiid="+oiid;
    }
    @RequestMapping("forebuy2")
    public String buy2( Model model,String[] oiid,HttpSession session){
        List<Orderitem> ois = new ArrayList<>();
        float total = 0;

        for (String strid : oiid) {
            int id = Integer.parseInt(strid);
            Orderitem oi= orderItemService.get(id);
            total +=oi.getHotel().getNum()*oi.getNumber();
            ois.add(oi);
        }

        session.setAttribute("ois", ois);
        model.addAttribute("ois",ois);
        model.addAttribute("total", total);
        return "fore/buyHotel";
    }
    @RequestMapping("forecreateOrder2")
    public String createOrder2(Model model, Order_ order, HttpSession session,int num,float spotPrice,String iinDate,String ooutDate){
        User user =(User)  session.getAttribute("user");
        System.out.println(iinDate);

        String string1 = iinDate;
        String string2 = ooutDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = dateFormat.parse(string1);

            System.out.println(date1);//切割掉不要的时分秒数据
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long firstDateMilliSeconds = date1.getTime();
        long secondDateMilliSeconds = date2.getTime();
        long subDateMilliSeconds = secondDateMilliSeconds - firstDateMilliSeconds;
        int totalSeconds = (int) (subDateMilliSeconds/1000);
        int days = totalSeconds % (3600*24);

        String orderCode = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + RandomUtils.nextInt(10000);
        order.setOrderCode(orderCode);
        order.setCreateDate(new Date());
        order.setUid(user.getId());
        order.setStatus(OrderService.waitPay);
        order.setInDate(date1);
        order.setOutDate(date2);
        List<Orderitem> ois= (List<Orderitem>)  session.getAttribute("ois");
        float total =orderService.add(order,ois);
        float total1=num*spotPrice;

        return "redirect:forealipay?oid="+order.getId() +"&total="+total1;
    }
    @RequestMapping("forepayed")
    public String payed(int oid, float total, Model model) {
        Order_ order = orderService.get(oid);
        order.setStatus(OrderService.waitFinish);
        order.setPayDate(new Date());
        orderService.update(order);
        model.addAttribute("o", order);
        return "fore/payedPage";
    }

    @RequestMapping("forechangeOrderItem")
    @ResponseBody
    public String changeOrderItem( Model model,HttpSession session, int sid, int number) {
        User user =(User)  session.getAttribute("user");
        if(null==user)
            return "fail";

        List<Orderitem> ois = orderItemService.listByUser(user.getId());
        for (Orderitem oi : ois) {
            if(oi.getScenic_spot().getId().intValue()==sid){
                oi.setNumber(number);
                orderItemService.update(oi);
                break;
            }

        }
        return "success";
    }

    @RequestMapping("forebought")
    public String bought( Model model,HttpSession session) {
        User user =(User)  session.getAttribute("user");
        List<Order_> os= orderService.list(user.getId(),OrderService.delete);

        orderItemService.fill(os);

        model.addAttribute("os", os);

        return "fore/boughtPage";
    }

    @RequestMapping("foreMyInfo")
    public String myInfo( Model model,HttpSession session) {
        User user =(User)  session.getAttribute("user");
        User u=userService.get(user.getId());

        model.addAttribute("u", u);
        return "fore/myInfoPage";
    }

    @RequestMapping("foreUpdateInfo")
    public String updateMyInfo( Model model,User user) {
        userService.update(user);

        return "redirect:foreMyInfo";
    }


}
