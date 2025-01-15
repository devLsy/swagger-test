package com.test.lsy.swaggertest.product.web;

import com.test.lsy.swaggertest.model.ApiResponse1;
import com.test.lsy.swaggertest.product.model.Product;
import com.test.lsy.swaggertest.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    public ProductController(@Qualifier("productService1") ProductService service) {
        this.service = service;
    }

    @GetMapping("")
    @Operation(summary = "상품정보 목록 조회", description = "상품정보 목록을 조회한다.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "상품 정보 조회 성공"),
        @ApiResponse(responseCode = "400", description = "잘못된 요청, 페이지 번호나 사이즈 파라미터 오류"),
        @ApiResponse(responseCode = "500", description = "서버 오류, 처리 중 문제가 발생한 경우")
    })
    public ApiResponse1 getList(
            @Parameter(description = "조회할 페이지 번호", required = true, example = "1")
            @RequestParam(name = "page") int page,

            @Parameter(description = "한 페이지에 표시할 항목 수", required = true, example = "10")
            @RequestParam(name = "size") int size) {

        return service.getList(page, size);
    }

    @GetMapping("/{productSeq}")
    @Operation(summary = "상품정보 상세", description = "상품정보 상세를 조회한다.")
    @ApiResponses(value = {
    })
    public Product getDetail(
            @Parameter(description = "상품 번호", required = true, example = "1")
            @PathVariable(name = "productSeq") String productSeq) {

        return service.getDetail(productSeq);
    }

    @DeleteMapping("/{productSeq}")
    @Operation(summary = "상품정보 단건 삭제", description = "상품정보 단건을 삭제한다.")
    public String delete(
            @Parameter(description = "상품 번호", required = true, example = "1")
            @PathVariable(name = "productSeq") String productSeq) {

        return service.delete(productSeq);
    }

    @PutMapping("")
    @Operation(summary = "상품정보 단건 수정", description = "상품정보 단건을 수정한다.")
    public Product update(@RequestBody Product product) {
        return service.update(product);
    }

    @PostMapping("")
    @Operation(summary = "상품정보 단건 추가", description = "상품정보를 단건 추가한다.")
    public Product add(@RequestBody Product product) {
        return service.add(product);
    }

}
