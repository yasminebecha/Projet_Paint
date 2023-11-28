import java.awt.*;
public class Square extends Rectangle{

    private int height;
    private int width;
    public Square(int px, int py, Color c) {
        super(px, py, c);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        this.height = heightBB;
        this.width = widthBB;
    }

}
