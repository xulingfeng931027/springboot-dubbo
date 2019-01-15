package com.huawei.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huawei.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author Paul
 * @version 0.1
 * @date 2019/1/13
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}")
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
