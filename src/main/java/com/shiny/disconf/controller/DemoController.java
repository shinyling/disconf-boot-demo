package com.shiny.disconf.controller;

import com.shiny.disconf.config.DemoBean;
import com.shiny.disconf.config.JedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private JedisConfig jedisConfig;

    @Autowired
    private DemoBean demoBean;

    @RequestMapping("/")
    public String demo(){
        return demoBean.getName();
    }


    @RequestMapping("getName")
    public String getName(){
        return jedisConfig.getHost();
    }
}
