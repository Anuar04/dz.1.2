package com.company;

public final class BMW extends Car {
    private String dvigatal;

    public String getDvigatal(){
        return  dvigatal;
    }

    @Override
    protected void speedCount(double turbo) {
        super.speedCount(turbo);
    }
    public BMW(Color color, int year, double v1, String dvigatal) {
      super(color,year,v1);
    }
    public static void honda(){

    }
}
