import java.io.*;
public class example10_5 {
    public static void main(String[] args){
        byte []a ="新年快乐".getBytes();
        byte []b = "happy new year".getBytes();
        File file = new File("a.txt");
        try{
            OutputStream out = new FileOutputStream(file);
            System.out.println(file.getName()+"的大小:"+file.length()+"字节");
            out.write(a);
            out.close();
            out = new FileOutputStream(file,true);
            System.out.println(file.getName()+"的大小："+file.length()+"字节");
            out.close();
        }catch(IOException e){
            System.out.println("Error"+e);
        }
    }
}
