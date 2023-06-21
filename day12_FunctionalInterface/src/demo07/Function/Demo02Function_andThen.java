package demo07.Function;

import java.util.function.Function;

/*
    Function接口中的认方法andThen:用来进行组合操作

    需求:
        把string类型的”123”转换为Integer类型,把转换后的结果加10
        把增加之后的Integer类型的数据,转换为string类型

    分析:
        转换了两次
        第一次是把string类型转换为了Integer类型
            所以我们可以使用Function<string,Integer> fun1
                Integer i= fun1.apply("123”)+10;
        第二次是把Integer类型转换为String类型
            所以我们可以使用Function<Integer,string> fun2
                String s = fun2.apply(i);
        我们可以使用andThen方法,把两次转换组合在一起使用
            String s = fun1andThen(fun2).apply("123”);
            fun1先调用apply方法，把字符串转换为Integer
            fun2再调用apply方法把Integer转换为字符串
 */
public class Demo02Function_andThen {
    /*
        定义一个方法
        参数串一个字符串类型的整数
        参数再传递两个Function接口
            一个泛型使用Function<String,Integer>
            一个泛型使用Function<Integer,String>
     */
    public static void conversion(String s, Function<String,Integer> fun1, Function<Integer,String> fun2 ) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s = "123";
        //调用change方法,传递字符串类型的整数,和Lambda表达式
        /*conversion(s,(String str) ->{
            //把字符串类型的整数，转换为Integer类型的整数
            return Integer.parseInt(str)+10;
        },(Integer i) ->{
            //把字符串类型的整数，转换为Integer类型的整数
            return i + "";
        });*/

        //优化
        conversion(s, str -> Integer.parseInt(str)+10, i -> i + "");
    }
}