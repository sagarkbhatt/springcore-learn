package com.sagar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml" );
        Employee emp = (Employee)ctx.getBean( "emp" );

        System.out.println( "Emp ID: " + emp.getId() );
        System.out.println( "Emp Name: " + emp.getName() );
    }
}
