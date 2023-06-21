package demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        void write(char[] cbuf)写入字符数组。
        abstract void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(string str)写入字符串。
        void write(String str，int off，int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndProperties\\src\\endian\\f.txt");
        char[] cs = {'a','b','c','d','e','f'};

        //void write(char[] cbuf)写入字符数组。
        fw.write(cs);//abcdef
        //abstract void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        fw.write(cs,1,3);//bcd
        //void write(string str)写入字符串。
        fw.write("古月");//古月
        //void write(String str，int off，int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("复活甲快递费",2,3);//甲快递


        fw.close();
    }
}
