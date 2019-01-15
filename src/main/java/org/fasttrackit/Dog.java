package org.fasttrackit;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health='" + health + '\'' +
                "} " + "the dog is wagging";
    }
}
