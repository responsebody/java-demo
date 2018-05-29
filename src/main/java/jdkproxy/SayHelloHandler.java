package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * author yongkai.sun
 */
public class SayHelloHandler implements InvocationHandler {

    private Object target;

    public SayHelloHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");
        Object object = method.invoke(target, args);
        return object;
    }
}
