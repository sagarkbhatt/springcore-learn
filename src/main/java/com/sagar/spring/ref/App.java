package com.sagar.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext( "ref.xml" );

        Student student = (Student) ctx.getBean("student" );

        System.out.println( student );
    }
}
