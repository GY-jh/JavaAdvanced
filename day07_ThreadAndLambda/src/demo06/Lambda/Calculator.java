package demo06.Lambda;
/*
    给定一个计算器calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 */
public interface Calculator {
    //定义一个计算两个int整数的方法并返回结果
    public abstract int calc(int a,int b);
}
