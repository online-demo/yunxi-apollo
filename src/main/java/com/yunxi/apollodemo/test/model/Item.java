package com.yunxi.apollodemo.test.model;

import java.util.Date;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-04
 * @Description:
 */
public class Item {
    private int id;
    private int value;
    private Date addDate;
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
