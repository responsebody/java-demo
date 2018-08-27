package juc.basic;

/**
 * @author yongkai.sun
 */
public class SingletonTest {
	private static SingletonTest instance = null;

	private SingletonTest(){}

	public static SingletonTest getInstance(){
		if (instance==null){
			synchronized (SingletonTest.class){
				if (instance==null){
					instance = new SingletonTest();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 1000; j++) {
					SingletonTest instance = SingletonTest.getInstance();
					System.out.println(instance);
				}
			}).start();
		}
	}
}
