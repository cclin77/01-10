import java.io.File;

public class MethodDemo {
    public static void main(String args[]){
        File file = new File("D:\\10tian");
        showFile(file);
    }
    //局部变量
    public static void showFile(File file){
        if(file.isDirectory()){
            File files[] = file.listFiles();
            for(File f:files){
                showFile(f);
            }
        }else {
            System.out.println(file.getName());
        }
    }
}
