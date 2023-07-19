import javax.swing.*;

class Boxlayout extends JFrame {
    public Boxlayout() {
        JButton b1=new JButton("BTN1");
        JButton b2=new JButton("BTN2");
        JButton b3=new JButton("BTN3");
        add(b1);
        add(b2);
        add(b3);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Boxlayout();
    }
}

