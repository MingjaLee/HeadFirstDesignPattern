//懒汉方式，线程安全，不必要同步开销
public class Singleton {
	private static Singleton instance;

	private Singleton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static synchronized Singleton getInstance()  {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}