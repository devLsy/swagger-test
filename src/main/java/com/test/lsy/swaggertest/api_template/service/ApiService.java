package com.test.lsy.swaggertest.api_template.service;

import com.test.lsy.swaggertest.api_template.model.RandomUserResponse;

public interface ApiService<T> {
    RandomUserResponse<T> getRandomUser();
}
