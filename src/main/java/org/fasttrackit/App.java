package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        Animal dog = new Animal();
        dog.name = "Grigore"
        dog.age = 3;
        dog.health ;

        Food food = new Food();
        food.availableInStock = true;
        food.expirationDate = 22.03.2019;
        food.name = "carne";
        food.price = 10;
        food.quantity = 4;

        Adopter man = new Adopter();
        man.money = 1000;
        man.name = "Mirea";

        RecreationalActivities sport = new RecreationalActivities();
        sport.name = "aport";

        Vet doctor = new Vet();
        doctor.name = "Andrei";
        doctor.veterinarySpecialization = "dogs";


    }
}
