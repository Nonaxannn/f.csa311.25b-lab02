package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {//circle n shape interface iig heregjuulne//

    private final double radius; //final avsnaar utga uurchlugduhgui//

    public Circle(double radius) {
        this.radius = radius;// this.radius gesen huvisagchid radius gesen parametr avsan//
    }
    @Override//shape interface dotorr getarea method bgauchir override avsan//
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
