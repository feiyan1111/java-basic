package com.ascending.training.domain;

public class Bicycle extends Bike {

    public int pedalNum = 2;

    public Bicycle() {}
    public Bicycle(String wheelShape, int wheelNum, String seatShape, int pedalNum) {
//        this.wheelNum = wheelNum;
//        this.wheelShape = wheelShape;
//        this.seatShape = seatShape;
        super(wheelShape,wheelNum,seatShape);
        this.pedalNum = pedalNum;
    }

        public static void main (String[]args){
            Bicycle bicycle = new Bicycle();
            System.out.println(bicycle.seatShape);
            System.out.println(bicycle.wheelNum);
            System.out.println(bicycle.wheelShape);
            System.out.println(bicycle.pedalNum);
            Bicycle bicycle2 = new Bicycle("round", 4, "square",2);
            System.out.println(bicycle2.wheelShape);
            System.out.println(bicycle2.wheelNum);
            System.out.println(bicycle2.seatShape);
            System.out.println(bicycle2.pedalNum);

        }
}
