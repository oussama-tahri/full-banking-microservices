package com.tahrioussama.billing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "token")
@Data
public class ConculConfig {
    private String defaultMsg;
    private String defaultMailDetails_subject;
}
