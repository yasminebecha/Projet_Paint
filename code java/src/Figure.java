import java.awt.Graphics;
import java.awt.Color;
public abstract class Figure {


    protected Color color;
    protected Point origin;
    private int height;
    private int width;
    private float surface;
    private float perimeter;

    public Figure(Color c, Point p) {


        this.color = c;
        this.origin= p;
    }


    public void setBoundingBox(int heightBB, int widthBB){
        this.height=heightBB;
        this.width=widthBB;
    }

    public abstract void draw (Graphics g);


    public Color getColor() {
        return color;
    }

    public Point getOrigin() {
        return origin;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getPerimeter(int height, int width) {
        perimeter=2*(height+width);
        return perimeter;
    }

    public double getSurface(int height,int width) {
        surface=height*width;
        return surface;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                ", origin=" + origin +
                ", perimeter=" + perimeter +
                ", surface=" + surface +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}


