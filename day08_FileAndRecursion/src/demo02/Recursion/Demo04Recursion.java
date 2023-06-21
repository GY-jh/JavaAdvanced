package demo02.Recursion;

import java.io.File;

/*
    练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("F:\\Java\\Java Advanced");
        getAllFile(file);

    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            //对遍历得到的files对象file进行判断，判断是否是文件夹
            if (file.isDirectory()) {
                //f是一个文件夹，则继续遍历这个文件夹
                // 我们发现getALLFile方法就是传递文件夹,遍历文件夹的方法
                // 所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(file);
            }else {
                //file是一个文件,直接打印即可
                System.out.println(file);
            }
        }
    }
}
