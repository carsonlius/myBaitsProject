package com.carsonlius.entries;

public class SystemLogDetails {
    private Integer rec_id;
    private String remark;
    private String data;
    private String created_at;
    private String updated_at;

    @Override
    public String toString() {
        return "SystemLogDetails{" +
                "rec_id=" + rec_id +
                ", remark='" + remark + '\'' +
                ", data='" + data + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
