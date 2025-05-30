import java.io.*;

public class example10_4 {
    public static void main(String[] args){
        int n= -1;
        byte []a =new byte[100];
        try{
            File f = new File("8\\example10_4.java");
            InputStream in = new FileInputStream(f);
            while((n = in.read(a,0,100))!=-1){
                String s = new String(a,0,n);
                System.out.println(s);
            }
            in.close();
        }catch(IOException e){
            System.out.println("File error"+e);
        }
    }
}
