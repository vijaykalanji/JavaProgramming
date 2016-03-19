package threads;

public class SimpleThread implements Runnable {
	public static void main(String[] args) {
		SimpleThread st = new SimpleThread();
		Thread th = new Thread(st);
		th.start();
		st.aMethod();
		
	}
	public void aMethod(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("From amethod--------");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("From thread");
		}
	}

}
