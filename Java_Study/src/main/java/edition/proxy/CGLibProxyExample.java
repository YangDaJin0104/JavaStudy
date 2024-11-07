package edition.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxyExample {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("CGLIB 프록시: 메서드 호출 전 작업 수행");
                // 실제 메서드가 없으므로 super 호출 없이 프록시 작업만 수행
                System.out.println("CGLIB 프록시: 메서드 호출 후 작업 수행");
                return null;
            }
        });
    }
}

