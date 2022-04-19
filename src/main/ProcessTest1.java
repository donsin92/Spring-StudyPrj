package main;

public class ProcessTest1 {
	String[] s = {"Hello","OracleJavaCommunity"};

	public static void main(String[] args) {
		 Runtime r = Runtime.getRuntime();
		 
		 System.out.println("Num of Cpu Core : " + r.availableProcessors() );
		 System.out.println("Total memory : " + r.totalMemory() + "MB");
		 System.out.println("Free memory : " + r.freeMemory() + "MB");
		
		for ( int i = 0; i <= 100000;i++) {
			new ProcessTest1();
		}
		 
		 System.out.println("Num of Cpu Core 1: " + r.availableProcessors() );
		 System.out.println("Total memory 1 : " + r.totalMemory() + "MB");
		 System.out.println("Free memory 1 : " + r.freeMemory() + "MB");
		 
		 r.gc();

		 System.out.println("Num of Cpu Core 2: " + r.availableProcessors() );
		 System.out.println("Total memory 2 : " + r.totalMemory() + "MB");
		 System.out.println("Free memory 2 : " + r.freeMemory() + "MB");
	}

}
