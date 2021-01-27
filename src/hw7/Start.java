package hw7;

import java.lang.reflect.Method;

public class Start {
    public static void main(String[] args) {

        Class cl = TestClass.class;
        try {
            start(cl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start(Class testClass) throws Exception {
        int x = 0;
        int y = 0;
        Method[] methods = testClass.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(BeforeSuite.class)){
                x++;
            } else if(method.isAnnotationPresent(AfterSuite.class)){
                y++;
            }
        }

        if(x > 1 || y > 1){
            throw new RuntimeException("Ошибка! BeforeSuite или AfterSuite больше 1.");
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                method.invoke(null);
            }
        }

        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j < methods.length; j++) {
                if(methods[j].isAnnotationPresent(Test.class)){
                    if (methods[j].getAnnotation(Test.class).priority() == i) {
                        methods[j].invoke(null);
                    }
                }
            }
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(AfterSuite.class)) {
                method.invoke(null);
            }
        }
    }
}
