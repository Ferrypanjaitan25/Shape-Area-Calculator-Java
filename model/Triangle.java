package model;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //menghitung nilai luas segitiga
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
