package demo01.List;

import java.util.LinkedList;

/*
    java,util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用Linkedlist集合特有的方法，不能使用多态
            public void addFirst(E e):将指定元素插入此列表的开头。
            pubLic void addLast(E e):将指定元素添加到此列表的结尾。
            public void push(E e):将元素推入此列表所表示的堆栈。

            public E getFirst():返回此列表的第一个元素。
            public E getLast():返回此列表的最后一个元素

            public E removeFirst():移除并返回此列表的第一个元素。
            public E removeLast():移除并返回此列表的最后一个元素。
            public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于removeFirst

            public boolean isEmpty(): 如果列表不包含元素，则返回true。
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        //show01();
        // show02();
        show03();
    }

    /*
        public E removeFirst():移除并返回此列表的第一个元素。
        public E removeLast():移除并返回此列表的最后一个元素。
        public E pop():从此列表所表示的堆栈处弹出一个元素。
     */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<String>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.add("e");

        //public E removeFirst():移除并返回此列表的第一个元素。
        String first = linked.removeFirst();
        System.out.println("被移除第一个元素:" + first);
        System.out.println(linked);//[b, c, d, e]

        //public E removeLast():移除并返回此列表的最后一个元素。
        String last = linked.removeLast();
        System.out.println("被移除最后一个元素:" + last);
        System.out.println(linked);//[b, c, d]

        //public E pop():从此列表所表示的堆栈处弹出一个元素。
        String first2 = linked.pop();
        System.out.println("被移除第一个元素:" + first2);
        System.out.println(linked);//[c, d]
    }

    /*
        public E getFirst():返回此列表的第一个元素。
        public E getLast():返回此列表的最后一个元素
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<String>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //linked.clear();//清空集合中的元素，在获取集合中的元素会抛出NoSuchElementException

        //public boolean isEmpty(): 如果列表不包含元素，则返回true。
        if (!linked.isEmpty()) {
            //public E getFirst():返回此列表的第一个元素。
            String first = linked.getFirst();
            System.out.println(first);//a

            //public E getLast():返回此列表的最后一个元素
            String last = linked.getLast();
            System.out.println(last);//c
        }

    }

    /*
        public void addFirst(E e):将指定元素插入此列表的开头。
        pubLic void addLast(E e):将指定元素添加到此列表的结尾。
        public void push(E e):将元素推入此列表所表示的堆栈。
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<String>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        //public void addFirst(E e):将指定元素插入此列表的开头。
        linked.addFirst("www");
        System.out.println(linked);//[www, a, b, c]

        //pubLic void addLast(E e):将指定元素添加到此列表的结尾。
        linked.addLast("http");
        System.out.println(linked);//[www, a, b, c, http]

        //public void push(E e):将元素推入此列表所表示的堆栈。
        linked.addFirst("aaa");
        System.out.println(linked);//[aaa, www, a, b, c, http]
    }
}
