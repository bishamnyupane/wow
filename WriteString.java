import java.io.*;
import java.util.*;
class WriteString{
    public static void main(String[]args) {
        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("Enter you name:");
            String msg=scan.nextLine();
            FileOutputStream fos=new FileOutputStream("sample2.txt");
            byte[]b=msg.getBytes();
            fos.write(b);
            fos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}