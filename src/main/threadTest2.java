package main;

class countNum {
	private static int countNum = 0;

	public int getCountNum() {
		return countNum;
	}

	public void setCountNum() {
		this.countNum = this.countNum + 1;
	}
 
}

class Thread3 implements Runnable {
 
	@Override
	public void run() {
	 
			System.out.println("Thread1 start");
		    int j = 0;
			
			for(int i=0; i < 1000000; i++) {
				  j = j + 1;
			}
			System.out.println("Thread1 end"  + j);
 
	}
}

class Thread4 implements Runnable {

	@Override
	public void run() {
	 
			System.out.println("Thread2 start");
			
			int j = 0;
			
			for(int i=0; i < 1000000; i++) {
				  j = j + 1;
			}
 
			System.out.println("Thread2 end" + j);
		 
	}
}

public class threadTest2 {

	public static void main(String[] args) {
		 System.out.println("Main Start");
		 String[] apparg = args;
		 Boolean TheadWorker = true;
 
			for (String arg:apparg) {
	 
				if ("Thread1".equals(arg)) {
					System.out.println("arg value : " + arg); 
					Thread3 th3 = new Thread3();
					Thread td = new Thread(th3);
					td.start();
				}
				else
				{
					System.out.println("arg value2 : " + arg); 
					
					Thread4 th4 = new Thread4();
					Thread td2 = new Thread(th4);
					td2.start();
				}

			}
			
			int k = 0;
			
			while(TheadWorker) {
	 
				if ( k%10000 == 0) {
					Thread checkT =  Thread.currentThread();
					System.out.println("Thread End" + checkT.toString()); 
				}
				
			    k = k + 1;
			    
			    if ( k == 100000 )
			    	TheadWorker= false;	
			    
			}
 
		 System.out.println("Main End"); 
	}

}
