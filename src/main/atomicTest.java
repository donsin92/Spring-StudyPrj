package main;

import java.util.concurrent.atomic.AtomicInteger;

class Ojc extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			atomicTest.i.getAndAdd(1);
		}
		
		System.out.println( this + ":::::: END");
	}
}


public class atomicTest {
	 static AtomicInteger i = new AtomicInteger(0);
	
	public static void main(String[] args) {
	//	atomicTest t = new atomicTest();
		Ojc t1 = new Ojc();
		Ojc t2 = new Ojc();
		Ojc t3 = new Ojc();
		Ojc t4 = new Ojc();
		Ojc t5 = new Ojc();
		
		t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(atomicTest.i);
	}

}
