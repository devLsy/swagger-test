package com.test.lsy.swaggertest.api_template.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Info {

    private String seed;
    private String results;
    private String page;
    private String version;
}
