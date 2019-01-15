package com.huawei.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huawei.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paul
 * @version 0.1
 * @date 2019/1/13
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        System.out.println(demoService);
        return demoService.sayHello(name);
    }

}
