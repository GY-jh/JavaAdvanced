package demo03.Exception;

/*
    如果finalLy有return语句,永远返回finalLy中的结果,避免该情况
 */
public class Demo02Excepyion {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    //定义一个方法，返回变量a的值
    public static int getA(){
        int a = 10;
        try {
            return a;
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            //一定会执行的代码
            a = 100;
            return a;
        }
    }

}
