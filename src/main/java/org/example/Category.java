package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Category  {

    String name ;

    ArrayList<Product>  gds ;

    public Category(String name, ArrayList<Product> gds) {
        this.name = name;
        this.gds = gds;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product>getGds() {
        return gds;
    }

    public void setGds(ArrayList<Product> gds) {
        this.gds = gds;
    }

    @Override
    public String toString() {
        return String.format("Категория : %s  товар : %s",name , gds );
    }

}
