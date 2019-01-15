package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        Dog dog = new Dog("Grigore");
        dog.age = 3;
        dog.health = "good" ;

        Cat cat = new Cat("Suzzy");
        cat.age = 1;
        cat.health = "sick";

        Food food = new Food();
        food.availableInStock = true;
        food.expirationDate = 22/3/2019 ;
        food.name = "carne";
        food.price = 10;
        food.quantity = 4;

        Adopter man = new Adopter();
        man.setMoney(1000);
        man.setName("Mircea");

        RecreationalActivities sport = new RecreationalActivities();
        sport.name = "aport";


        Vet doctor = new Vet();
        doctor.name = "Andrei";
        doctor.veterinarySpecialization = "dogs";



        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }


}
