public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }


    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = (int) x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = (int) y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

