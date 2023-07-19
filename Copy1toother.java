import java.io.*;

public class Copy1toother {
 
    public static void main (String[] args) throws FileNotFoundException,IOException{  
        FileInputStream fis = new FileInputStream("sample2.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");
        int data; 
        while ((data=fis.read()) != -1) {
            fos.write(data);
        }
        fos.close();
        fis.close();
}
}

