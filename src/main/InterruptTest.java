package main;

public class InterruptTest extends Thread {

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(i+1 + ".before sleep...");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException 발생");
		}
	}
	
	public static void main(String[] args) {
		InterruptTest t = new InterruptTest();
    	InterruptTest t2 = new InterruptTest();
    	
		t.start();
		t.interrupt();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
	       String s = t2.getName();
	       System.out.println(s + " ...ssss ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main Thread 종료...");
	}

}
