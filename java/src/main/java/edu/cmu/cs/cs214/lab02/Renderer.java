package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private final Shape[] shapes;
    
    public Renderer(Shape[] shapes) {
        this.shapes = shapes; // renderer zuvhun rectangle ees hamatai bsn bol odoo shape interface ees hamaatai
    }

    public void draw() {
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape printed");
            System.out.println("Its area is " + area);
            System.out.println();
        }
    }
}
