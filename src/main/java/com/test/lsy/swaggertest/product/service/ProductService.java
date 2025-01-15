package com.test.lsy.swaggertest.product.service;

import com.test.lsy.swaggertest.model.ApiResponse;

public interface ProductService {
    ApiResponse getList(int page, int size);
}
