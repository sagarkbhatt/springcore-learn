package com.sagar.spring.lc.annot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext( "lc.annot.xml" );

        Patient patient = (Patient) context.getBean("patient" );

        System.out.println( patient.toString() );

        context.registerShutdownHook();
    }
}
