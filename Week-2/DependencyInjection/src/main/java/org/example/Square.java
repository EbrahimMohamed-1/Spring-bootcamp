package org.example;

public class Square implements Shape {
    public Draw2d drawShape2d;
    public Draw3d drawShape3d;

    //setter method for setter injection
    public void setDrawShapeFor2d(Draw2d drawShape2d) {
        this.drawShape2d = drawShape2d;
    }

    public void setDrawShapeFor3d(Draw3d drawShape3d) {
        this.drawShape3d = drawShape3d;
    }

    @Override
    public void drawShape2d() {
        drawShape2d.draw("square");
    }

    @Override
    public void drawShape3d() {
        drawShape3d.draw("square");
    }
}
