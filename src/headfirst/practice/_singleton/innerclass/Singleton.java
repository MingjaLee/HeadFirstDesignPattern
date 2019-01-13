package headfirst.practice._singleton.innerclass;

public class Singleton {
	private Singleton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
}