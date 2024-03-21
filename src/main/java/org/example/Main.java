package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("GLE", "Mercedes", 2020, 350_000, "white", 5);
        CarWithLombok car2 = new CarWithLombok("GLC", "Mercedes", 2023, 200_000, "silver", 3);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println("Are these objects equal: " + car1.equals(car2));
        System.out.println("The hashcode of 1 car object is: " + car1.hashCode());
        System.out.println("The hashcode of 2 car object is: " + car2.hashCode());
    }
}