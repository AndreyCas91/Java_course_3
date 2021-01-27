package hw7;

public class TestClass {

    @AfterSuite
    public static void finish(){
        System.out.println("Тест закончен");
    }

    @Test(priority = 2)
    public static void test2(){
        System.out.println("Тест 2");
    }

    @Test(priority = 3)
    public static void test3(){
        System.out.println("Тест 3.1");
    }

    @Test(priority = 1)
    public static void test1(){
        System.out.println("Тест 1");
    }

    @Test(priority = 3)
    public static void test4(){
        System.out.println("Тест 3.2");
    }

    @Test(priority = 4)
    public static void test5(){
        System.out.println("Тест 4");
    }

    @Test
    public static void test6(){
        System.out.println("Тест 5");
    }


    @BeforeSuite
    public static void start(){
        System.out.println("Тест начинается");
    }
}
