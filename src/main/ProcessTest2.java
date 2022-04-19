package main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProcessTest2 {
	String[] s = {"Hello","OracleJavaCommunity"};

	public static void main(String[] args) throws InterruptedException {
		 Runtime r = Runtime.getRuntime();
		 
	     try {
			Process p1 = r.exec("notepad");
			p1.waitFor(3, TimeUnit.SECONDS);
			p1.destroy();
			
			ProcessBuilder pb1 = new ProcessBuilder("notepad","test.dat");
			Process p2 = pb1.start();
			p2.waitFor(3, TimeUnit.SECONDS);
			p2.destroy();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}

}
