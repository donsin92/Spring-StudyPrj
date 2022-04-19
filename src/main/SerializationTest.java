package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		 
		ObjectOutput s = new ObjectOutputStream( new FileOutputStream("test.dat") );
		
		s.writeObject("hello~");
		s.writeObject(new java.util.Date());
		s.flush();

	}

}
