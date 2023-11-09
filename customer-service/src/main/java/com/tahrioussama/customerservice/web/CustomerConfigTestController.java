package com.tahrioussama.customerservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class CustomerConfigTestController {
    @Value("${customer.msg}")
    private String p1;
    @Value("${customer.build-version}")
    private String p2;
    @Value("${customer.mailDetails.subject}")
    private String p3;

    @GetMapping("/params")
    public Map<String , String> params() {
        return Map.of("p1",p1,"p2",p2,"p3",p3);
    }
}
