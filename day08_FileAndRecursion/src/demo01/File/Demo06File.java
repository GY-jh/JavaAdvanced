package demo01.File;

import java.io.File;

/*
    File类遍历(文件夹)目录功能
        public string[] list() : 返回一个string数组，表示该File目录中的所有子文件或目录。
        public File[] listFiles() : 返回一个File数组，表示该File目录中的所有的子文件或目录
    注意:
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
        // show01();
        show02();
    }

    /*
        public File[] listFiles() : 返回一个File数组，表示该File目录中的所有的子文件或目录
        遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件夹封装为File对象,多个Fle对象存储到FLe数组中
     */
    private static void show02() {
        File file = new File("F:\\Java\\Java Advanced\\day08_FileAndRecursion");
        File[] arr = file.listFiles();
        for (File s : arr) {
            System.out.println(s);
        }
    }

    /*
        public string[] list() : 返回一个string数组，表示该File目录中的所有子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01() {
        // File file = new File("F:\\Java\\Java Advanced\\day08_FileAndRecursion\\1.txt");//NullPointerException
        // File file = new File("F:\\Java\\Java Advanced\\day08_FileAdRecursion");//NullPointerException
        File file = new File("F:\\Java\\Java Advanced\\day08_FileAndRecursion");//
        String[] arr = file.list();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
