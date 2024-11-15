package org.example;

public class Circle implements Shape {
    public Draw2d draw2d;

    //constructor injection
    public Circle(Draw2d draw2d)
    {
        this.draw2d = draw2d;
    }


    @Override
    public void drawShape2d() {
        draw2d.draw("circle");
    }


    @Override
    public void drawShape3d() {

    }
}
