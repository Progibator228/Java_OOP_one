package org.example;

import java.util.ArrayList;

public class Product  {
    String name;
    Integer price;
    Integer rating;

    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }




    @Override
    public String toString() {
        return String.format("Название %s  : цена  %d : рейтинг %d ", name,price,rating);
    }

    public String getName() {
        return name;
    }

    public String getNameProd() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
