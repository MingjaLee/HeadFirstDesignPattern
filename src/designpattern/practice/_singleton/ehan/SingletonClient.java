import java.util.*;
import java.lang.*;

public class SingletonClient {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new MyRunnable()).start();
        }
        System.out.println("all threads start!");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + singleton);
    }
} 