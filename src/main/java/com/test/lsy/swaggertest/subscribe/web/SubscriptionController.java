package com.test.lsy.swaggertest.subscribe.web;

import com.test.lsy.swaggertest.model.ApiResponse3;
import com.test.lsy.swaggertest.subscribe.service.SubscriptionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/subscribe")
public class SubscriptionController {

    private final SubscriptionService service;

    public SubscriptionController(@Qualifier("subscribeService3") SubscriptionService service) {
        this.service = service;
    }

    @GetMapping("")
    @Operation(summary = "구독이력 조회", description = "구독 이력을 조회한다.")
    @ApiResponses(value = {
    })
    public ApiResponse3 getList(
            @Parameter(description = "조회할 페이지 번호", required = true, example = "1")
            @RequestParam(name = "page") int page,

            @Parameter(description = "한 페이지에 표시할 항목 수", required = true, example = "10")
            @RequestParam(name = "size") int size) {

        return service.getList(page, size);
    }
}
