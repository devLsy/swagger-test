package com.test.lsy.swaggertest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ApiResponse<T> extends BaseObj{
    private List<T> data;
    private int page;
    private int size;
    private int totalCount;
    private boolean hasNext;
}
