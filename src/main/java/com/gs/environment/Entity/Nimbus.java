package com.gs.environment.Entity;



public class Nimbus {

    String name;

    public Nimbus(String name) {
        this.name = name;
    }

    public Nimbus() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nimbus{" +
                "name='" + name + '\'' +
                '}';
    }
}
