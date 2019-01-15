package org.fasttrackit;

import java.time.LocalDateTime;
import java.util.Date;

public class Food {
    String name;
    double price;
    double quantity;
    double expirationDate;
    boolean availableInStock;

    public Food(String name, boolean availableInStock) {
        this.name = name;
        this.availableInStock = availableInStock;
    }

    public Food() {

    }
}
