package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Product product1 = new Product("Мыло",100,5);
        Product product2 = new Product("Порошок",200,4);
        ArrayList<Product> data = new ArrayList<>();
        data.add(product1);
        data.add(product2);



        Product product3 = new Product("Водка",300,5);
        Product product4 = new Product("Пиво",50,1);
        ArrayList<Product> data2 = new ArrayList<>();
        data2.add(product3);
        data2.add(product4);

        Category category1 = new Category("Хозтовары",data);
        Category category2 = new Category("Напитки",data2);


        System.out.println("product3.getNameProd() = " + product3.getNameProd());





//        User User1 = new User("Alex" , 1111);
//        User User2 = new User("Dinas",2222);
//
//        System.out.println(User1);
//        System.out.println(User2);

    }







}