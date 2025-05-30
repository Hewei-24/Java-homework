import java.io.*;
public class example10_2 {
    public static void main(String[] args){
        File javaDir = new File("java");
        System.out.println(javaDir.isDirectory() );
        boolean boo = javaDir.mkdir();
        if(boo){
            System.out.println("新建子目录"+javaDir.getName());
        }
        File dirFile = new File(".");
        System.out.println("全部文件（包括文件夹）：");
        String fileName[] = dirFile.list();
        if(fileName == null){
            System.out.println("没有文件");
        }else{
            for(String name:fileName){
                System.out.println(name);
            }
        }
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        System.out.println("仅仅列出Java源文件：");
        File file[] = dirFile.listFiles(fileAccept);
        if(file == null){
            System.out.println("没有Java源文件");
        }else{
            for(File f :file){
                System.out.println(f.getName());
            }
        }
    }
}
