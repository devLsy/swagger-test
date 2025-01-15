package com.test.lsy.swaggertest.product.service;

import com.test.lsy.swaggertest.model.ApiResponse1;
import com.test.lsy.swaggertest.product.model.Product;

public interface ProductService {

    ApiResponse1 getList(int page, int size);
    Product getDetail(String productSeq);
    String delete(String productSeq);
    Product update(Product product);
    Product add(Product product);
}
