package demo03.Generic;

/*
    测试含有泛型的方法
 */
public class Deno03GenericMethod {

    public static void main(String[] args) {
        //创建GenericMethod方法
        GenericMethod gm = new GenericMethod();

        /*
            调用含有泛型的方法methode1
            传递什么类型，泛型就是什么类型
         */
        gm.method(20);
        gm.method("abc");
        gm.method(8.8);
        gm.method(true);

        gm.method02("静态方法，不建议创建对象使用");

        //静态方法，通过类名.方法名(参数)可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }

}
