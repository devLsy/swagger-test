package com.test.lsy.swaggertest.web;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExamController {

    private final UserService service;

    public ExamController(@Qualifier("service2") UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    @Operation(summary = "구독이력 조회", description = "구독 이력을 조회한다.")
    @ApiResponses(value = {
    })
    public ApiResponse getList() {
        return service.getList(1, 10);
    }
}
