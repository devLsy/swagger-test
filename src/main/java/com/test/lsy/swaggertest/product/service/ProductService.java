package com.test.lsy.swaggertest.product.service;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.product.model.Product;

public interface ProductService {
    ApiResponse<Product> getList(int page, int size);
}
