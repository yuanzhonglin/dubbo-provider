package com.test.dubbo.service.impl;

import com.test.dubbo.service.IDemoService;

public class DemoServiceImpl implements IDemoService {
	  public String sayHello(String name) {
	        return "Hello Dubbo,Hello " + name;
	    }
}
