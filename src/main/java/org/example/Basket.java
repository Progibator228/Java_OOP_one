package org.example;

public class Basket  {

    String [] purchasedHds;


    public Basket(String[] purchasedHds) {
        this.purchasedHds = purchasedHds;
    }



    public String[] getPurchasedHds() {
        return purchasedHds;
    }

    public void setPurchasedHds(String[] purchasedHds) {
        this.purchasedHds = purchasedHds;
    }
}
