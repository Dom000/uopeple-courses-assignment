package GUI;
import javax.swing.*;
import java.awt.*;

public class Gui_intro {
   public static void main(String[] args) {

//       JOptionPane.showMessageDialog(null, "Hello World Godknows welcome to Java");
       JFrame window = new JFrame("Test");
       JPanel content = new JPanel();
       content.setBackground(Color.blue);
//       content.setLocation(100, 100);
       content.setSize(10, 100);
       window.setContentPane(content);
       window.setSize(500, 500);
       window.setLocation(20, 20);
       window.setVisible(true);
   }
}