package com.carsonlius.entries;

import javafx.scene.input.DataFormat;

public class SystemLogDetails {
    private Integer rec_id;
    private String remark;
    private String data;
    private String created_at;
    private String updated_at;

    public String getRequest_id() {
        return request_id;
    }

    @Override
    public String toString() {
        return "SystemLogDetails{" +
                "rec_id=" + rec_id +
                ", remark='" + remark + '\'' +
                ", data='" + data + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", request_id='" + request_id + '\'' +
                '}';
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    private String request_id;

    public Integer getRec_id() {
        return rec_id;
    }

    public void setRec_id(Integer rec_id) {
        this.rec_id = rec_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

}
