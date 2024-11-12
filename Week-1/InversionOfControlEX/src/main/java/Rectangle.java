public class Rectangle implements Shape {
    int h,w;
    public Rectangle() {}
    public Rectangle(int h, int w){
        this.h=h;
        this.w=w;
    }

    @Override
    public int getArea(int h, int w){
        return h*w;
    }


}
