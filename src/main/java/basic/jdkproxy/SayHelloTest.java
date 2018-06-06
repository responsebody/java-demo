package basic.jdkproxy;

import java.lang.reflect.Proxy;

/*
 * author yongkai.sun
 */
public class SayHelloTest {

    public static void main(String[] args) {
        SayHelloImpl sayHello = new SayHelloImpl();
        SayHelloHandler sayHelloHandler = new SayHelloHandler(sayHello);
        SayHello newIns = (SayHello) Proxy.newProxyInstance(SayHelloImpl.class.getClassLoader(),SayHelloImpl.class.getInterfaces(),sayHelloHandler);
        newIns.sayHello();
    }

}
