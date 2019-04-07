package com.sagar.spring.lc.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    @PostConstruct
    public void hi() {
        System.out.println( "Hi!" );
    }

    @PreDestroy
    public void bye() {
        System.out.println( "Bye" );
    }
}
