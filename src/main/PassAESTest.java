package main;

public class PassAESTest {
 
	public static void main(String[] args) {
	
		System.out.println(PassAEST.key.getBytes());
		
	    String str = PassAEST.encrypt(PassAEST.target.getBytes(), PassAEST.key.getBytes());
	    System.out.println(str);
	        
	    String str2 = PassAEST.decrypt(str.getBytes(), PassAEST.key.getBytes());
	    System.out.println(str2);
		 
	}
 
}
