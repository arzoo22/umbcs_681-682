package edu.umb.cs681.hw02;

import java.util.ArrayList;

public class Car{
    private int price;
    private int year;
    private String maker;
    private int mileage;
    private int dominationCounter;

    public Car(int price, int year, String make, int mileage) {
        this.price = price;
        this.mileage = mileage;
        this.year = year;
        this.maker = make;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMake(String make){
        this.maker = make;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public int getPrice(){
        return price;
    }

    public int getYear(){
        return year;
    }

    public String getMake(){
        return maker;
    }

    public int getMileage(){
        return mileage;
    }

    public void setDominationCounter(ArrayList<Car> cars){
        for (Car c :cars){
            if(this.getMileage() >= c.getMileage() && this.getPrice() >= c.getPrice() && this.getYear() <=c.getYear()){
                if(this.getMileage()> c.getMileage() || this.getPrice() >c.getPrice() || this.getYear()<c.getYear()){
                    this.dominationCounter++;
                }
            }
        }
    }

    public int getDominationCounter(){
        return this.dominationCounter;
    }

}