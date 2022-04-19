package main;


class LamdaThread extends Thread {
	
	public LamdaThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thredad TEST");
	}
}

interface LamdaFn {
	int Sum(int i, int j);
	
	default int SumDefault(int i, int j) {
		System.out.println("값을 입력하세요");
		
		return i+j;
	}
}

public class LamdaTest {

	public static void main(String[] args) {
	 
		LamdaFn lfn = ((int i,int j) -> { System.out.println("값 :" + (i+j)); 
				                         return i+j; 
				                        });
		int tot = lfn.Sum(10,20);
		int dft = lfn.SumDefault(10, 10);
		System.out.println("합계 2 : " + tot + " defualt : "+ dft);
	}

}
