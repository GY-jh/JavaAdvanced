package demo03.Exception;

import java.util.List;

/*
    异常的注意事项
 */
public class Demo01Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获有改如何处理？
            1.多个异常分别处理
            2.多个异常一次捕获，多次处理
            3.多个异常一次捕获一次处理
         */

        //1.多个异常分别处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException : 3
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(4));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //2.多个异常一次捕获，多次处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException : 3
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(4));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //3.多个异常一次捕获一次处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException : 3
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(4));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
