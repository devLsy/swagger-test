package com.test.lsy.swaggertest.product.service.impl;

import com.test.lsy.swaggertest.model.ApiResponse1;
import com.test.lsy.swaggertest.product.model.Product;
import com.test.lsy.swaggertest.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("productService2")
@Slf4j
public class ProductServiceImpl2 implements ProductService {

    @Override
    public ApiResponse1 getList(int page, int size) {
        // 테이블에 있는 데이터라고 가정
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



//        log.info("list => [{}]", ToStringBuilder.reflectionToString(response, ToStringStyle.JSON_STYLE));
        log.info("list => [{}]", response);

        return response;
    }

    @Override
    public Product getDetail(String productSeq) {
        // 테이블에 있는 데이터라고 가정
        List<Product> databaseResult = List.of(
                new Product("1", "마스터 상품입니다.", "마스터", 29000),
                new Product("2", "골드 상품입니다.", "골드", 19000),
                new Product("3", "실버 상품입니다.", "골드", 9900)
        );

        Product findProduct = databaseResult.stream()
                .filter(data -> productSeq.equals(data.getProductSeq()))
                .findFirst()
                .orElse(null);

        log.info("findProduct => [{}]", findProduct);

        return findProduct;
    }

    @Override
    public String delete(String productSeq) {
        // 테이블에 있는 데이터라고 가정
        List<Product> databaseResult = List.of(
                new Product("1", "마스터 상품입니다.", "마스터", 29000),
                new Product("2", "골드 상품입니다.", "골드", 19000),
                new Product("3", "실버 상품입니다.", "골드", 9900)
        );
        // delete 로직 수행
        log.info("상품번호 " + productSeq + "가 삭제되었습니다.");
//        databaseResult.remove(databaseResult.indexOf(productSeq));
        log.info("list => [{}]", databaseResult);
        return productSeq;
    }

    @Override
    public Product update(Product product) {
        // 테이블에 있는 데이터라고 가정
        List<Product> databaseResult = List.of(
                new Product("1", "마스터 상품입니다.", "마스터", 29000),
                new Product("2", "골드 상품입니다.", "골드", 19000),
                new Product("3", "실버 상품입니다.", "골드", 9900)
        );

        log.info("org list => [{}]", databaseResult);

        Optional<Product> findProduct = databaseResult.stream()
                .filter(data -> data.getProductSeq().equals(product.getProductSeq()))
                .findFirst();

        if(findProduct.isPresent()) {
            Product updateProduct = findProduct.get();
            updateProduct.setDescription(product.getDescription());
            updateProduct.setProductName(product.getProductName());
            updateProduct.setPrice(product.getPrice());
            log.info("modify list => [{}]", databaseResult);
            return updateProduct;
        } else {
            return null;
        }
    }

    @Override
    public Product add(Product product) {
        // 테이블에 있는 데이터라고 가정
        List<Product> databaseResult = new ArrayList<>(List.of(
                new Product("1", "마스터 상품입니다.", "마스터", 29000),
                new Product("2", "골드 상품입니다.", "골드", 19000),
                new Product("3", "실버 상품입니다.", "골드", 9900)
        ));

        log.info("org list => [{}]", databaseResult);

        databaseResult.add(product);

        log.info("modify list => [{}]", databaseResult);

        return product;
    }
}
