package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {      //shape n obyektuudiig zurdag bol renderer n zurah uuregtei class//
    private final Shape[] shapes;// renderer class n shape array iig ashiglana.//
    
    public Renderer(Shape[] shapes) {
        this.shapes = shapes; // renderer zuvhun rectangle ees hamatai bsn bol odoo shape interface ees hamaatai
    }
//array uusgej massiv avsnaar olon durs zereg hergejuulj boln//
    public void draw() {
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape printed");
            System.out.println("Its area is " + area);
            System.out.println();
        }
    }
}
