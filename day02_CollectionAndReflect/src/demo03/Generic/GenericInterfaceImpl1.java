package demo03.Generic;

/*
    含有泛型的接口，第一种使用方式:定义接口的实现类，实现接口，指定接口的泛型
        public interface Iterator<E> {
            E next();
        }
    Scanner类实现了iterator接口,并指定接口的泛型为string,所以重写的next方法泛型认就是string
        public final class Scanner implements Iterator<String>{
            public string next() {}
        }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
