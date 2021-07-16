package com.gs.environment.Entity;



public class Link {
    String name;

    public Link(String name) {
        this.name = name;
    }

    public Link() {
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
