package main;

class MyThread extends Thread {
	public MyThread(String name) {
		 super(name);
	} 
	
	@Override
	public void run() {
		 for (int i=1;i<=10;i++) {
			 if((i%5 == 0)) {
				 System.out.println(Thread.currentThread() + "...yield");
				 Thread.yield();
			 } else {
				 System.out.println(Thread.currentThread() + "...process");
			 }
		 }
	}
 
}
public class threadTest4 {

	public static void main(String[] args) {
		
		String sname = args[0];
		 
		new MyThread(sname).start();
		System.out.println(Thread.currentThread() + "...main");
	}

}
