package com.sagar.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext( "properties.xml" );

        CountryNLangs countryNLangs = (CountryNLangs) ctx.getBean( "countryNLangs" );

        System.out.println( countryNLangs );
        System.out.println( countryNLangs.getClass() );
    }
}
