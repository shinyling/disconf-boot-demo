package com.shiny.disconf.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.stereotype.Service;

@Service
@DisconfFile(filename = "demo.properties")
public class DemoBean {

    private String name;

    @DisconfFileItem(name="name",associateField = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
