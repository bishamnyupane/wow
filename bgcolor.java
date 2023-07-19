import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class bgcolor extends JFrame implements ActionListener {
    JButton red,pink;
    public bgcolor(){
        setSize(500, 300);
        red=new JButton("Red");
        pink=new JButton("Pink");
        add(red);
        add(pink);
        setLayout(new FlowLayout());
        red.addActionListener(this);
        pink.addActionListener(this);
        red.setActionCommand("One");
        pink.setActionCommand("Two");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("One")){
            getContentPane().setBackground(Color.RED);
        }else if(e.getActionCommand().equals("Two")){
            getContentPane().setBackground(Color.PINK);
    }
    }


public static void main(String[] args){
    new bgcolor();
}
}

