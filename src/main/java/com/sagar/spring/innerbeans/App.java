package com.sagar.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "innerbeans.xml" );

        Emp emp = (Emp) context.getBean( "emp" );
        System.out.println( emp );
        System.out.println( emp.hashCode() );

        Emp emp2 = (Emp) context.getBean( "emp" );
        System.out.println( emp2 );
        System.out.println( emp2.hashCode() );
    }
}
