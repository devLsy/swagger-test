package com.test.lsy.swaggertest.subscribe.service;

import com.test.lsy.swaggertest.model.ApiResponse3;

public interface SubscriptionService {
    ApiResponse3 getList(int page, int size);
}
