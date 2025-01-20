package com.test.lsy.swaggertest.user.service;

import com.test.lsy.swaggertest.model.ApiResponse4;

public interface UserService<T> {
    ApiResponse4<T> getList(int page, int size);
}
