package demo01.File;

import java.io.File;

/*
    路径:
        绝对路径:是一个完整的路径
            以盘符(C:,D:)开始的路径
                C:\\a.txt
                C:\\User\\script\\IdeaProjects\\shantung\\123.txt
                D:\\demo\\b.txt
        相对路径:是一个简化的路径相对指的是相对于当前项目的根目录(F:\Java\Java Advanced)
        如果使用当前项目的根目录，路径可以简化书写
            F:\\Java\\Java Advanced\\123.txt-->简化为: 123.txt(可以省略项目的根目录)

    注意:
        1.路径是不区分大小写
        2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个普通的反斜打
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
            File类的构造方法
         */
        // show01();
        //show02("F:\\","a.txt");//F:\a.txt
        //show02("D:\\","a.txt");//D:\a.txt
        show03();
    }

    /*
        File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
        参数：把路径分成了两部分
            File parent：父路径
            String child ：子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活;父路径和子路径都可以变化
            父路径是File类型，可以使用File的方法对路径进行一些操作,再使用路创建对象
     */
    private static void show03() {
        File parent = new File("F:\\");
        File file = new File(parent,"hello.txt");
        System.out.println(file);//F:\hello.txt
    }

    /*
        File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
        参数：把路径分成了两部分
            String parent：父路径
            String child ：子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活;父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);//F:\a.txt
    }

    /*
        File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        参数：
            String pathname : 字符串的路径名称
            路径可以是以文件结尾，也可以是以文件夹结尾
            路径可以是相对路径，也可以是绝对路径
            路径可以是存在，也可以是不存在
            创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
     */
    private static void show01() {
        File f1 = new File("F:\\Java\\Java Advanced\\a.txt");
        System.out.println(f1);//重写了Object类的toString方法 F:\Java\Java Advanced\a.txt

        File f2 = new File("F:\\Java\\Java Advanced");
        System.out.println(f2);//F:\Java\Java Advanced

        File f3 = new File("a.txt");
        System.out.println(f3);//a.txt
    }
}
