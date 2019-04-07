package com.sagar.spring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "setconfig.xml" );

        CarDealer cardealer = (CarDealer) context.getBean( "carDealer" );

        System.out.println( cardealer.getName() );
        System.out.println( cardealer.getModels() );
    }
}
