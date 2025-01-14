package com.test.lsy.swaggertest.model;

import lombok.Data;



@Data
public class RegDate  extends BaseObj{
    private int dayOfYear;
    private int year;
    private String month;
    private int monthValue;
    private int dayOfMonth;
    private int hour;
    private int minute;
    private int second;
}
