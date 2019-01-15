package org.fasttrackit;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health='" + health + '\'' +
                "} " + "the cat is purring";
    }
}


