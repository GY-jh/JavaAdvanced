package demo03.Generic;

import java.util.ArrayList;
import java.util.Collection;

/*
    泛型的上限限定： ? extends E    代表使用的泛型只能是E的子类/本身
    泛型的下限限定： ? super E      代表剩下的泛型只能是E的父类/本身
 */
public class Demo06Generic {

    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElemet1(list1);
        //getElemet1(list2);//报错
        getElemet1(list3);
        //getElemet1(list4);//报错

        //getElemet2(list1);//报错
        //getElemet2(list2);//报错
        getElemet2(list3);
        getElemet2(list4);

        /*
            类与类之间的继承关系
            Integer exends Number extends Object
            String exends Object
         */
    }

    //泛型的上限限定： ? extends E    代表使用的泛型只能是E的子类/本身
    private static void getElemet1(Collection<? extends Number> coll) {}

    //泛型的下限限定： ? super E      代表剩下的泛型只能是E的父类/本身
    private static void getElemet2(Collection<? super Number> coll) {}

}
