import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

    public class Rectangle extends Figure {
        private int height = 0;
        private int width = 0;

        public Rectangle(int px, int py, Color c) {

            super(c, new Point(px, py));
        }

        @Override
        public void setBoundingBox(int heightBB, int widthBB) {
            this.height = heightBB;
            this.width = widthBB;
        }

        @Override
        public void draw(Graphics g) {
        }
    }




