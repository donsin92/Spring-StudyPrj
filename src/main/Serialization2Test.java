package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Date;

public class Serialization2Test {

	public static void main(String[] args) {
		ObjectInput s;
		try {
			s = new ObjectInputStream(new FileInputStream("test.dat"));
			
			String hello = (String) s.readObject();
			Date date = (Date) s.readObject();
			
			System.out.println(hello);
			System.out.println(date);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
