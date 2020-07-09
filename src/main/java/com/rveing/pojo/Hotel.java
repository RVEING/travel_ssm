package com.rveing.pojo;

import java.util.Date;
import java.util.List;

public class Hotel {
    private Integer id;

    private String hname;

    private String summary;

    private String address;

    private String mobile;

    private Date startBusinessDate;


    /*非数据库字段*/
    private List<HotelImage> singleImages;

    private HotelImage firstHotelImage;

    private float minPrice;

    private float num;

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public List<HotelImage> getSingleImages() {
        return singleImages;
    }

    public void setSingleImages(List<HotelImage> singleImages) {
        this.singleImages = singleImages;
    }

    public HotelImage getFirstHotelImage() {
        return firstHotelImage;
    }

    public void setFirstHotelImage(HotelImage firstHotelImage) {
        this.firstHotelImage = firstHotelImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getStartBusinessDate() {
        return startBusinessDate;
    }

    public void setStartBusinessDate(Date startBusinessDate) {
        this.startBusinessDate = startBusinessDate;
    }
}