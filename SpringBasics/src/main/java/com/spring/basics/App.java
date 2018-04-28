package com.spring.basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.messaging.service.MessagingService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.register(AppConfig.class);
       context.refresh();
       
       MessagingService haiService = context.getBean("haiService",MessagingService.class);
       MessagingService helloService = context.getBean("helloService",MessagingService.class);
       System.out.println(haiService);
       System.out.println(helloService);
       context.close();
    }
}
