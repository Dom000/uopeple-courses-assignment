package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Custom_gui {

    private static class HelloWorldDisplay extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Font bigBoldFont = new Font("SansSerif", Font.BOLD, 24);
            g.setColor(Color.GREEN);

            g.setFont(bigBoldFont);
            g.drawString( "Hello World!", 20, 30 );
            g.drawLine( 10, 30, 10, 30 );
            g.drawRect( 10, 30, 300, 300 );
            g.drawOval( 10, 30, 300, 300 );
            g.drawRoundRect( 10, 300, 300, 300,10,10 );
//            g.draw3DRect(200,200,200,200,true);
//            g.drawArc( 10, 300, 300, 300,0,90 );
//            g.fillOval( 10, 300, 300, 300 );
            g.fill3DRect( 10, 300, 300, 300 ,true);
        }
        private static class ButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
//                System.out.println();
                System.exit(0);
            }
        }

        public static void main(String[] args) {
            HelloWorldDisplay displayPanel = new HelloWorldDisplay();
            JButton okButton = new JButton("OK");
            ButtonHandler listener = new ButtonHandler();
            okButton.addActionListener(i-> System.exit(0));
            JPanel content = new JPanel();
            content.setLayout(new BorderLayout());
            content.setBackground(Color.darkGray);
            content.add(displayPanel, BorderLayout.CENTER);
            content.add(okButton, BorderLayout.SOUTH);
            JFrame window = new JFrame("GUI Test");
            window.setContentPane(content);
            window.setSize(200,400);
            window.setLocation(100,100);
            window.setVisible(true);
        }


    }
}
