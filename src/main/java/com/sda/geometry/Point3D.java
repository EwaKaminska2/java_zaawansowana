package com.sda.geometry;

public class Point3D extends Point2D {
    double z;

    public Point3D() {
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

}
