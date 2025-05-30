//package tom.cat;
import java.io.*;
public class example10_1 {
    public static void main(String[] args){
        File f = new File("8//example10_1.java");
        System.out.println(f.getName()+"是可读的嘛：\n"+f.canRead());
        System.out.println(f.getName()+"的长度：\n"+f.length());
        System.out.println(f.getName()+"的绝对路径：\n"+f.getAbsolutePath());
        File file = new File("new.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("在当前目录（运行程序的目录）下创建了新文件：\n"+file.getName());
            }catch(IOException exp){

            }
        }
    }
}
