package com.test.lsy.swaggertest.product.service.impl;

import com.test.lsy.swaggertest.model.ApiResponse;
import com.test.lsy.swaggertest.product.model.Product;
import com.test.lsy.swaggertest.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("productService1")
@Slf4j
public class ProductServiceImpl1 implements ProductService {

    @Override
    public ApiResponse getList(int page, int size) {
        // db에서 가져온 값이라고 가정
        List<Product> databaseResult = List.of(
                new Product("1", "마스터 상품입니다.", "마스터", 29000),
                new Product("2", "골드 상품입니다.", "골드", 19000),
                new Product("3", "실버 상품입니다.", "골드", 9900)
                );

        List<Product> products = databaseResult.stream()
                .map(data -> Product.builder()
                        .productSeq(data.getProductSeq())
                        .description(data.getDescription())
                        .productName(data.getProductName())
                        .build()
                )
                .collect(Collectors.toList());

        ApiResponse<Product> response = new ApiResponse<>();
        response.setData(products);
        response.setPage(page);
        response.setSize(size);
        response.setTotalCount(56);
        response.setHasNext(page * size < 56);

//        log.info("list => [{}]", ToStringBuilder.reflectionToString(response, ToStringStyle.JSON_STYLE));
        log.info("list => [{}]", response);

        return response;
    }
}
