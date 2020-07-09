package com.rveing.pojo;

public class LineImage {
    private Integer id;

    private Integer line_id;

    private Integer record_id;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLine_id() {
        return line_id;
    }

    public void setLine_id(Integer line_id) {
        this.line_id = line_id;
    }

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}