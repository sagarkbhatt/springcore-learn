package com.sagar.spring.assignment.setterInjection;

public class Cart {

    Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + item +
                '}';
    }
}
