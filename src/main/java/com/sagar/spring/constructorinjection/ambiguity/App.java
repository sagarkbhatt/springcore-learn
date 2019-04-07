package com.sagar.spring.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "constructorinjection.ambiguity.xml" );

        Addition addition = (Addition) context.getBean( "addition" );
    }
}
