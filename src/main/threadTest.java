package main;

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Therad1 work" );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 StringBuffer s1 = new StringBuffer();
		 
		 for (int i =0; i<100 ;i++) {
			   s1.append(i);
		 }
		 
		 System.out.println(s1.toString() + " : 출력 : " + s1.length());
		 String s2 = s1.toString();
		 System.out.println(s2.toString() + " : 출력 : " + s1.length());
	}
	
}

interface intfTest {
	void printTest(String name);
}



public class threadTest {

	public static String name = "Lee";
 
	
	public static void main(String[] args) {
		 System.out.println("Therad Test Start : " + name);
		 
		 System.out.println(args);
		 
		 if (args.length ==0) {
			 System.out.println("Therad DEFAULT"  );
		 }
		 else {
			 for(String s:args) {
				 System.out.println("Therad Test Start : " + s);
			 }
		 }
		 
		 intfTest tf = ((s) -> {  if (!"donsin".equals(s))
			                        System.out.println("폭탄");
		                           else
		                            System.out.println(s);    
		                       }
		               );
		 
		 tf.printTest("donsin");
		 
		 Thread t1 = new Thread1();
		 Thread2 t2 = new Thread2();
         t1.start();
         
         try {
  			t1.join();
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
         
         Thread t3 = new Thread(t2);
         t3.start();

         System.out.println("Therad Test end : " + name);
	}

}
