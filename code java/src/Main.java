
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2,4);
         System.out.println("p1"+p1.toString());
         System.out.println("p2"+p2.toString());

         p1.setX(1);
         p2.setY(1);
         System.out.println("p1"+p1.toString());
        System.out.println("p2"+p2.toString());

    }


}