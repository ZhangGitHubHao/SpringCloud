package com.forecp.servicefeign.controller;

import com.forecp.servicefeign.services.IWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * WEB 控制器
 *
 * @author 860120014
 * @date 2021-07-02
 */
@RestController
public class WebController {

    @Autowired
    IWebService webService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return webService.sayHiFromClientOne(name);
    }
}
