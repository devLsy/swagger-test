package com.test.lsy.swaggertest.service;

import com.test.lsy.swaggertest.model.ApiResponse;

public interface UserService {
    ApiResponse getList(int page, int size);
}
