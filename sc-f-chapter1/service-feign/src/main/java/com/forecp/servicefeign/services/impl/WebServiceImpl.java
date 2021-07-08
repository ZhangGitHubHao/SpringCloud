package com.forecp.servicefeign.services.impl;

import com.forecp.servicefeign.services.IWebService;
import org.springframework.stereotype.Component;

/**
 * WebService实现类
 *
 * @author 860120014
 * @date 2021-07-05
 */
@Component
public class WebServiceImpl implements IWebService {

    @Override
    public String sayHiFromClientOne(String name){
        return "sorry "+name;
    }
}
