package com.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.messaging.service.HaiServiceImpl;
import com.messaging.service.HelloServiceImpl;
import com.messaging.service.MessagingService;

@Configuration
@ComponentScan(basePackages="com.*")
public class AppConfig {

//	public MessagingService contructHelloService() {
//		MessagingService helloService = new HelloServiceImpl();
//		return helloService;
//	}
//	
//	public MessagingService contructHaiService() {
//		MessagingService haiService = new HaiServiceImpl();
//		return haiService;
//	}
	
	@Bean("helloService")
	public MessagingService getHelloService() {
		MessagingService helloService = new HelloServiceImpl();
		return helloService;
	}
	
	@Bean("haiService")
	public MessagingService getHaiService() {
		MessagingService haiService = new HaiServiceImpl();
		return haiService;
	}
}
