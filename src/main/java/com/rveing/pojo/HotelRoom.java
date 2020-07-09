package com.rveing.pojo;

import java.util.List;

public class HotelRoom {
    private Integer id;

    private String rname;

    private Integer area;

    private Integer peopleNum;

    private Float price;

    private String bedType;

    private String breakfast;

    private String window;

    private String broadband;

    private String policy;

    private Integer number;

    private Integer hid;

    /*非数据库字段*/
    private  Hotel hotel;

    private List<HotelImage> singleImages;

    private HotelRoomImage firstHotelRoomImage;

    public List<HotelImage> getSingleImages() {
        return singleImages;
    }

    public void setSingleImages(List<HotelImage> singleImages) {
        this.singleImages = singleImages;
    }

    public HotelRoomImage getFirstHotelRoomImage() {
        return firstHotelRoomImage;
    }

    public void setFirstHotelRoomImage(HotelRoomImage firstHotelRoomImage) {
        this.firstHotelRoomImage = firstHotelRoomImage;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType == null ? null : bedType.trim();
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast == null ? null : breakfast.trim();
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window == null ? null : window.trim();
    }

    public String getBroadband() {
        return broadband;
    }

    public void setBroadband(String broadband) {
        this.broadband = broadband == null ? null : broadband.trim();
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }
}