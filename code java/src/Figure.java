import java.awt.Graphics;
public abstract class Figure {

    private int heightBB;
    private int widthBB;
    private int surface;
    private int perimeter;

    public abstract void setBoundingBox(int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    public int getSurface() {
        return surface;
    }

    public int getPerimeter() {
        return perimeter;
    }
}
