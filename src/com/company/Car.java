package com.company;

public class Car extends Transport {
    double turbo;
    private String avtoStart;
    public Car(Color color,int ear,double v1){
        super(color,ear, v1);
    }
    public double getTurbo(){
        return turbo;
    }
    public String getAvtoStart(){
        return avtoStart;
    }
    protected  void speedCount(double turbo){

    }
    protected void speedCount(double turbo, String avtoStart){

    }

    protected final void speedCount(double turbo, String avtoStart, integer value) {

    }

    private class integer {
    }
}
