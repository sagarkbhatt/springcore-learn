package com.sagar.spring.assignment.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("assignment.setterInjection.xml" );

        Cart cart = (Cart) ctx.getBean("cart" );

        System.out.println( cart );
    }
}
