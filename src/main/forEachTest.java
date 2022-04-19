package main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


class OjcConsumer implements Consumer<String>{
	
	public void accept(String s) {
		System.out.println("Consumer impl ::" + s);
	}
	
}
public class forEachTest {

	public static void main(String[] args) {
		String[] myArr = {"자바","오라클","파이썬"};
  
		List<String> list = (List)Arrays.asList(myArr);
		
		list.forEach((s) -> { 
			if ("자바" == s )
				System.out.println("1누구냐 넌? " + s);
			else if ("오라클" ==  s) {
				System.out.println("2누구냐 넌? " + s);
			} else {
				System.out.println("3누구냐 넌? " + s);
			}
			
		});
 
		list.forEach( System.out::println );
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Consumer<String> consumer = new OjcConsumer();
		
		for(String s:list) {
			consumer.accept(s);
		} 
		
		String[] as = {"a","b","c"};
		String[] as2;
		
		as2 =  as;
		
		as2[2] = "k";
		
		if ( as.equals(as2))
			System.out.println("같다" + as.toString() + as2[2]);
		else
			System.out.println("다르다" + as.toString() + as2[2]);
	}

}
