package com.test.lsy.swaggertest.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
@Schema(description = "상품정보")
public class Product {

    @Schema(description = "상품번호")
    private String productSeq;

    @Schema(description = "상품설명")
    private String description;

    @Schema(description = "상품명")
    private String productName;
    
    @Schema(description = "가격")
    private int price;
}
