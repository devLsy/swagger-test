package com.test.lsy.swaggertest.web;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    private final UserService service;

    public UserController(@Qualifier("service2") UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ApiResponse getList() {
        return service.getList(1, 10);
    }
}
