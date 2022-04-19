package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
/*		String[] arr = new String[]{"a","b","c"};
		System.out.println(arr[0]);
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr,1,3);
		
		stream.forEach(s -> System.out.println("입력값은 : " + s));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("입력값은 : " + arr[i]);
		}
 */
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list);
		
		//Stream<String> st =  list.stream();
		
	 
		
	}

}
