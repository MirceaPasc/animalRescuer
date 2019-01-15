package org.fasttrackit;

public class Adopter {

    private String name;
    private int money;

    public Adopter() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Adopter(String name) {
        this.name = name;
    }
}
