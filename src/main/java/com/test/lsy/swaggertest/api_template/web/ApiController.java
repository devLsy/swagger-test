package com.test.lsy.swaggertest.api_template.web;

import com.test.lsy.swaggertest.api_template.model.RandomUserResponse;
import com.test.lsy.swaggertest.api_template.service.ApiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/random-user")
public class ApiController {

    private final ApiService service;

    public ApiController(@Qualifier("apiService1") ApiService service) {
        this.service = service;
    }

    @GetMapping("")
    @Operation(summary = "랜덤 사용자 목록 조회", description = "사용자 목록을 조회한다.")
    @ApiResponses(value = {
    })
    public RandomUserResponse getList(){
        return service.getRandomUser();
    }
}
