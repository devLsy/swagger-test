package com.test.lsy.swaggertest.subscribe.service;

import com.test.lsy.swaggertest.model.ApiResponse;

public interface SubscriptionService {
    ApiResponse getList(int page, int size);
}
