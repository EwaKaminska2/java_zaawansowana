package com.sda.geometry;

public class PointApp {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,3);

        Point3D point3D = new Point3D();
        point3D.x=2;
        point3D.y=3;
        point3D.z=4;

        Point3D point3D1 =new Point3D();
        Point3D secondPoint3D = new Point3D(2,3,4);
    }
}
