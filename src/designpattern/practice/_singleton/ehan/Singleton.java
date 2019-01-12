//恶汉式，线程安全；没有延迟创建
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance()  {
		return instance;
	}
}