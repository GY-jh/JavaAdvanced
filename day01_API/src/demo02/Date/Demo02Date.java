package demo02.Date;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /*
        Date类的成员方法
            long getTime() 把日期转换为毫秒(相当于system.currentTimeMillis())
            返回自 1970 年 1月1日 00:0:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1672904370583
    }

    /*
        Date类的带参数构造方法:
            Date(Long date) :传递毫秒值,把毫秒转换为Date日期
     */
    private static void demo02() {
        Date d1 = new Date(0L);
        System.out.println(d1);//Thu Jan 01 08:00:00 CST 1970

        Date d2 = new Date(158111111111L);
        System.out.println(d2);//Sun Jan 05 07:45:11 CST 1975
    }

    /*
        Date类的空参数构造方法:
            Date()获取的就是当前系统的日期和时间
     */
    private static void demo01(){
        Date d = new Date();
        System.out.println(d);
    }

}
