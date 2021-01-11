package com.nacos.nacosdemo.controller;

import com.nacos.nacosdemo.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jianmin.li
 * @Description: TODO
 * @Date: 2020/12/24 22:26
 * @Version: 1.0
 */
@RestController
@RequestMapping("/nacos")
@CrossOrigin
public class NacosController {
    @Autowired
    private NacosConfig nacosConfig;

    @GetMapping("/demo")
    public String demo() {
        return nacosConfig.getName();
    }
}
