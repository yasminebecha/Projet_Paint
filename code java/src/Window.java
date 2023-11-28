import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Window extends JFrame {
    public Window(String Title,int x,int y) {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;

        JMenuBar m= new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenuItem open = new JMenuItem("Open") ;
        menu1.add(open);
        m.add(menu1);

        JButton OkButton= new JButton("Welcome to paint!");
        contentPanel.add(OkButton);

        this.setVisible(true);
        System.out.println("Ceci est un test");
    }

    public static void main (String args[]){
        Window win = new Window("My paint",800,600);
    }
}
