package Cyclinder;

public class Cylinder {


    public static double getArea(double radius) {
        return  radius * radius * Math.PI;
    }

    public static double getPerimeter(double radius) {
        return radius * 2 * Math.PI;
    }

    public static double getVolume(double radius, double height) {
       double perimeter = getPerimeter(radius);
       double area = getArea(radius);
       return perimeter * height + 2 * area;
    }
}
