package com.ascending.training.domain;

public class Motorcycle extends Bicycle {

    public int gastank = 10;
    public String motor = "big";

    public Motorcycle() {}
    public Motorcycle(String wheelShape, int wheelNum, String seatShape, int pedalNum, int gastank, String motor) {
//        this.wheelNum = wheelNum;
//        this.wheelShape = wheelShape;
//        this.seatShape = seatShape;
        super(wheelShape,wheelNum,seatShape,pedalNum);
        this.gastank = gastank;
        this.motor = motor;
    }

    public String toString() {
        return wheelShape + " " + wheelNum + " " + seatShape + " " + pedalNum + " " + gastank + " " + motor;
    }

    public static void main (String[]args){
        Motorcycle motorcycle = new Motorcycle();
//        System.out.println(motorcycle.seatShape);
//        System.out.println(motorcycle.wheelNum);
//        System.out.println(motorcycle.wheelShape);
//        System.out.println(motorcycle.pedalNum);
//        System.out.println(motorcycle.gastank);
//        System.out.println(motorcycle.motor);
        System.out.println(motorcycle.toString());
        Motorcycle motorcycle2 = new Motorcycle("round", 4, "square",2, 10, "big");
        System.out.println(motorcycle2.wheelShape);
        System.out.println(motorcycle2.wheelNum);
        System.out.println(motorcycle2.seatShape);
        System.out.println(motorcycle2.pedalNum);
        System.out.println(motorcycle2.pedalNum);
        System.out.println(motorcycle2.gastank);

    }
}
