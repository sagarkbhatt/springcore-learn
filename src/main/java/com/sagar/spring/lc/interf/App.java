package com.sagar.spring.lc.interf;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext( "lc.interface.xml" );

        Patient patient = (Patient) context.getBean("patient" );

        System.out.println( patient );

        context.registerShutdownHook();
    }
}
