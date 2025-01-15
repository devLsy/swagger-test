package com.test.lsy.swaggertest.product.service.impl;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.product.model.Product;
import com.test.lsy.swaggertest.product.service.ProductService;
import org.springframework.stereotype.Service;

@Service("service1")
public class ProductServiceImpl1 implements ProductService {

    @Override
    public ApiResponse<Product> getList(int page, int size) {
        return null;
    }
}
