package com.rveing.pojo;

public class Orderitem {
    private Integer id;

    private Integer sid;

    private Integer hid;

    private Integer lid;

    private Integer oid;

    private Integer uid;

    private Integer number;

    private Float allMoney;

    /*非数据库字段*/
    private Scenic_spot scenic_spot;
    private  Hotel hotel;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Scenic_spot getScenic_spot() {
        return scenic_spot;
    }

    public void setScenic_spot(Scenic_spot scenic_spot) {
        this.scenic_spot = scenic_spot;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Float allMoney) {
        this.allMoney = allMoney;
    }
}