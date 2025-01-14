package com.test.lsy.swaggertest.model;

import lombok.Data;

import java.util.List;

@Data
public class ApiResponse extends BaseObj{
    private List<Subscrption> data;
    private int page;
    private int size;
    private int totalCount;
    private boolean hasNext;
}
