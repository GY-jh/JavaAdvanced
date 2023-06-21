package demo07.Integer;

/*
    基本类型与字符串之间的转换
    基本类型-->字符串
        1.基本类型数据的值+"”最简单的方式(工作中常用)
        2.使用包装类中的静态方法
            static String tostring(int i) 返回一个表示指定整数的 string 对象。
        3.使用string类中的静态方法
            static string valueof(int i) 返回 int 参数的字符串表示形式。
    字符串-->基本类型
        使用包装类的静态方法parsexX(“字符串”)
            Integer类:static int parseInt(string s)
            Double类:static double parseDouble(string s)
            ...
 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型 --> 字符串
        //基本类型数据的值+"”最简单的方式(工作中常用)
        String s1 = 100 + "";
        System.out.println(s1+200);//100200

        //使用包装类中的静态方法
        String s2 = Integer.toString(100);
        System.out.println(s2+200);//100200

        //使用string类中的静态方法
        String s3 = String.valueOf(100);
        System.out.println(s3+200);//100200

        System.out.println("=========");
        //字符串-->基本类型
        int i = Integer.parseInt("100");
        System.out.println(i+200);//300

        int i2 = Integer.parseInt("a");//NumberFormatException: For input string: "a" 数字格式化异常
        System.out.println(i2);
    }
}
