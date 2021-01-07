package hw4;

public class Main {
    private static char fixedCharacter = 'A';
    private static Object mon = new Object();
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (mon){
                    try {
                        while (fixedCharacter != 'A'){
                            mon.wait();
                        }
                        System.out.print(fixedCharacter);
                        fixedCharacter = 'B';
                        mon.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (mon){
                    try {
                        while (fixedCharacter != 'B'){
                            mon.wait();
                        }
                        System.out.print(fixedCharacter);
                        fixedCharacter = 'C';
                        mon.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (mon){
                    try {
                        while (fixedCharacter != 'C'){
                            mon.wait();
                        }
                        System.out.print(fixedCharacter);
                        fixedCharacter = 'A';
                        mon.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}
