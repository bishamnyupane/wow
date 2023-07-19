import javax.swing.*;
import java.awt.event.*;
class MyMenu extends JFrame implements ActionListener,MouseListener {
    JLabel l;
    JPopupMenu menu;
    JMenuItem one,two;
    public MyMenu(){
        setSize(500,400);
        l=new JLabel();
        l.setBounds(150, 50, 200, 100);
        menu=new JPopupMenu();
        add(menu);
        add(l);
        one=new JMenuItem("One");
        two=new JMenuItem("Two");
        menu.add(one);
        menu.add(two);
                setLayout(null);

        setVisible(true);
        one.addActionListener(this);
        two.addActionListener(this);
        addMouseListener(this);
        
    }

    public void mouseClicked(MouseEvent e){
        menu.show(this,e.getX(),e.getY());
    }

    public void actionPerformed(ActionEvent e){
        String item=e.getActionCommand();
        l.setText(item + "item is selected");

    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public static void main(String[] args){
        new MyMenu();
    }
    }
