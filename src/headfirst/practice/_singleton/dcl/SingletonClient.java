package headfirst.practice._singleton.dcl;

public class SingletonClient {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
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