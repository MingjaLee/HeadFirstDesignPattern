//双重校验锁 double checkout lock.
public class Singleton {
	private static volatile Singleton instance;
	// private static Singleton instance;

	private Singleton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}