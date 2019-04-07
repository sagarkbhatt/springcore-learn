package com.sagar.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hospital = (Hospital)ctx.getBean( "hospital" );

        System.out.println( "Hospital Name: " + hospital.getName() );
        System.out.println( "Hosptial Depts: " + hospital.getDepts().toString() );
    }
}
