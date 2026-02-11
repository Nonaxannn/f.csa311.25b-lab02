package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    public double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;  //this.sideLen гэдэг нь Square классын талын уртыг хадгалах хувьсагч, 
        // харин sideLen гэдэг нь конструктор руу дамжуулж буй параметр юм.//
    }
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
