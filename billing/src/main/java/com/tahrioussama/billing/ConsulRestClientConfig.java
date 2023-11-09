package com.tahrioussama.billing;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RefreshScope
public class ConsulRestClientConfig {
    private ConculConfig conculConfig;
    private VaultConfig vaultConfig;

    @GetMapping("/config")
    public Map<String,Object> myconfig() {

        return Map.of("Concul",conculConfig,"vault",vaultConfig);
    }
}
