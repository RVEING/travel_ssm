package com.rveing.pojo;

import java.util.Date;

public class Travels {
    private Integer id;

    private Integer uid;

    private String title;

    private String summary;

    private Date ptime;

    private String describle1;

    private String pic1;

    private String describle2;

    private String pic2;

    private String describle3;

    private String pic3;

    private Integer readnum;

    private Integer stage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getDescrible1() {
        return describle1;
    }

    public void setDescrible1(String describle1) {
        this.describle1 = describle1 == null ? null : describle1.trim();
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1 == null ? null : pic1.trim();
    }

    public String getDescrible2() {
        return describle2;
    }

    public void setDescrible2(String describle2) {
        this.describle2 = describle2 == null ? null : describle2.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public String getDescrible3() {
        return describle3;
    }

    public void setDescrible3(String describle3) {
        this.describle3 = describle3 == null ? null : describle3.trim();
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3 == null ? null : pic3.trim();
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }
}