package com.sagar.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "property.placeholder.xml" );

        MyDao myDao = (MyDao) context.getBean( "mydao" );

        System.out.println( myDao );
    }
}
