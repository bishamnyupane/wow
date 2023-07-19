import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Size extends JFrame implements ActionListener {
    JTextField t;
    JButton b;

    public Size(){
        setSize(500, 300);
        t=new JTextField();
        b=new JButton("Click");
        add(t);
        add(b);
        t.setColumns(10);
        setLayout(new FlowLayout());

        b.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        Font f=new Font("Arial", Font.ITALIC,20);
        t.setFont(f);
        t.setForeground(Color.RED);

    }

    public static void main(String[] args){
        new Size();
    }
}