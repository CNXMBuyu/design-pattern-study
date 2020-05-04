package cn.hgy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class DynamicProxy {

    public Object createProxy(Object proxiedObject) {
        Class[] interfaces = proxiedObject.getClass().getInterfaces();
        // 把具体的类传递进去
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, dynamicProxyHandler);
    }

    public class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(proxiedObject, args);
            // 可以进行特殊处理
            if (method.getName().equals("invoke")) {
                OperationService operationService = new OperationService();
                operationService.record();
            } else {
                System.out.println(method.getName());
            }
            return result;
        }
    }

}
