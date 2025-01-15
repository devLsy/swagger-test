package com.test.lsy.swaggertest.product.web;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.product.service.ProductService;
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
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    public ProductController(@Qualifier("productService1") ProductService service) {
        this.service = service;
    }

    @GetMapping("")
    @Operation(summary = "상품정보 조회", description = "상품정보를 조회한다.")
    @ApiResponses(value = {
    })
    public ApiResponse getList(
            @Parameter(description = "조회할 페이지 번호", required = true, example = "1")
            @RequestParam(name = "page") int page,

            @Parameter(description = "한 페이지에 표시할 항목 수", required = true, example = "10")
            @RequestParam(name = "size") int size) {

        return service.getList(page, size);
    }
}
