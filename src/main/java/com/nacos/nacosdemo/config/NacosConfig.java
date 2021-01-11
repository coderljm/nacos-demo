package com.nacos.nacosdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jianmin.li
 * @Description: TODO
 * @Date: 2020/12/24 22:24
 * @Version: 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "girl")
@Data
public class NacosConfig {
    private String name;
}
