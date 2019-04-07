package com.sagar.spring.lc.xmlconf;

public class Patient {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void hi() {
        System.out.println( "Hi!" );
    }

    public void bye() {
        System.out.println( "Bye" );
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
