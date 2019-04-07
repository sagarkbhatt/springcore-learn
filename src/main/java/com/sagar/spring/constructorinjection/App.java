package com.sagar.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "constructorinjection.xml" );

        Emp emp = (Emp) context.getBean( "emp" );

        System.out.println( emp );
    }
}
