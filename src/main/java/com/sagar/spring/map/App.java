package com.sagar.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("mapconfig.xml");

        Customer customer = (Customer) ctx.getBean( "customer" );

        System.out.println( customer.getName() );
        System.out.println( customer.getProducts().toString() );
    }
}
