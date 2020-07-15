package com.sda.geometry;

public class Rectangel extends FlatShape {


    public Rectangel(double x, double y) {
        super(x, y);
    }

    //  @Override
    double getArea() {
        return x*y;
    }
}
//}
