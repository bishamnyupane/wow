import java.awt.*;    
import javax.swing.*;    
public class FLowlayout{    
JFrame f;    
public FLowlayout(){    
    f=new JFrame();
        f.setSize(300,300);        
    JButton b1=new JButton("1");    
    JButton b2=new JButton("2");    
    JButton b3=new JButton("3");    
    JButton b4=new JButton("4");    
    
    f.add(b1); f.add(b2); f.add(b3);  
    f.add(b4); 
    f.setLayout(new FlowLayout(FlowLayout.LEFT));    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new FLowlayout();    
}    
}    