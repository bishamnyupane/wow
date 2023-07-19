//wap to read tex a file and display content in the console

import java.io.*;
class read{
    public static void main(String[]args) {
        try{
            FileInputStream fis=new FileInputStream("sample2.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.println((char)i);
            }
            fis.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }catch(IOException e){
        System.out.println(e.getMessage());
        }
    }
}