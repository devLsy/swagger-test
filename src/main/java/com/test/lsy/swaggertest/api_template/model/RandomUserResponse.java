package com.test.lsy.swaggertest.api_template.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class RandomUserResponse<T> {

    private List<T> results;
    private Info info;
}
