package edition.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyExample {
    public static void main(String[] args) {
        // 실제 구현 없이 프록시 객체만 생성
        Service proxyInstance = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(), // 클래스 로더
                new Class[]{Service.class}, // 구현할 인터페이스 지정
                (proxy, method, args1) -> { // InovationHandler 구현(람다 표현식)
                    System.out.println("프록시 : 메서드 호출 전 작업 수행");
                    // 메서드 호출 없이 프록시에서 동작만 수행할 경우, result 없이 null 반환
                    System.out.println("프록시 : 메서드 호출 후 작업 수행");
                    return null;
                }
        );

        // 프록시 객체로 메서드 호출
        proxyInstance.performAction();
    }
}
