package com.ascending.training.domain;

public class Bike {
    public String wheelShape = "round";
    public int wheelNum = 2;
    public String seatShape = "triangle";

    public Bike() {
    }

    public Bike(String wheelShape, int wheelNum, String seatShape) {
        this.wheelNum = wheelNum;
        this.wheelShape = wheelShape;
        this.seatShape = seatShape;
    }


    public String toString () {
        return String.valueOf(this.wheelNum);
    }

        public static void main (String[]args){
        Bike bike = new Bike();
        System.out.println(bike.seatShape);
        System.out.println(bike);
        System.out.println(bike.wheelShape);
        Bike bike2 = new Bike("square", 3, "triangle");
        System.out.println(bike2.wheelShape);
        System.out.println(bike2.wheelNum);
        System.out.println(bike2.seatShape);
    }

}


