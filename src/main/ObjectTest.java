package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Emp {
	private String ename = "";
	private int eage  = 0;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", eage=" + eage + "]";
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		 Map<String, Object> map = new HashMap<String, Object>();
		 
		 Emp emp = new Emp();
		 
		 emp.setEname("홍길동");
		 emp.setEage(10);
		 map.put("홍길동",emp);
		 
		 emp.setEname("이순신");
		 emp.setEage(20);	
		 map.put("이순신",emp);
		 
	     for (Map.Entry<String, Object> entry:map.entrySet())
	     {
	    	 System.out.println(entry.getKey());
	 
	    	 Emp emp2 = (Emp) entry.getValue();
	    	 
	    	 System.out.println(emp2.getEage());
	    	 System.out.println(emp2.getEname());
	    	 
	     }
		 
	}

}
