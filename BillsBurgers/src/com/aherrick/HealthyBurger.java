package com.aherrick;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "BrownRye");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double extraTotalPrice = super.itemizedHamburger();
        if(healthyExtra1Price != 0.0d) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            extraTotalPrice += healthyExtra1Price;
        }
        if(healthyExtra2Price != 0.0d) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            extraTotalPrice += healthyExtra2Price;
        }

        return extraTotalPrice;
    }


}
