import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {

    JButton button;
    JFrame frame;

    public Button(){
        frame= new JFrame("Zamknij okno");
        JPanel p= new JPanel();
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizeable(true);
        frame.pack();
        frame.setSize(200,200);
        frame.setLocation((int)(Math.random()*1399),(int)(Math.random()*799));
        frame.setVisible(true);

        button = new JButton("Zamknij");
        button.addActionListener(this);
        button.setVisible(true);
        p.setLayout(new FlowLayout());
        p.setPreferredSize(new Dimension(5, 5));
        p.add(button);





    }

    public void actionPerformed(ActionEvent e)
    {
        button = (JButton)e.getSource();
        frame.dispose();
        new Button();

    }

    public static void main(String[] args) {
        new Button();
    }
}
