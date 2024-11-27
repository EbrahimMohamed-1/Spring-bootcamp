package org.example;

public class Circle implements Shape {
    public Draw2d draw2d;
    public Draw3d draw3d;

    //constructor injection
    public Circle(Draw2d draw2d, Draw3d draw3d)
    {
        this.draw3d = draw3d;
        this.draw2d = draw2d;
    }


    @Override
    public void drawShape2d() {
        draw2d.draw("circle");
    }


    @Override
    public void drawShape3d() {
        draw3d.draw("Circle");
    }
}
