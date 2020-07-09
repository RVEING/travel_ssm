package com.rveing.pojo;

import java.util.List;

public class Scenic_spot {
    private Integer id;

    private String sname;

    private String summary;

    private String address;

    private String businessDate;

    private Double price;

    private Integer number;

    private Integer phone_number;

    private String traffic;

    private Double w;       //相似度

    private Integer cnt;    //喜欢景点人数

    /*非数据库字段*/
    private List<Image> singleImages;

    private Image firstScenicSpotImage;

    public Image getFirstScenicSpotImage() {
        return firstScenicSpotImage;
    }

    public void setFirstScenicSpotImage(Image firstScenicSpotImage) {
        this.firstScenicSpotImage = firstScenicSpotImage;
    }

    public List<Image> getSingleImages() {
        return singleImages;
    }

    public void setSingleImages(List<Image> singleImages) {
        this.singleImages = singleImages;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
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

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate == null ? null : businessDate.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
}