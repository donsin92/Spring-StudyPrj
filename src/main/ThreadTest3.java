package main;

public class ThreadTest3 {

	public static void main(String[] args) {
		Thread t = new Thread(
					() -> {
						Thread self = Thread.currentThread();
						System.out.println(self.getName() + " ::: " + self.getState());
						for(int i=0;i < 10;i++) {
							System.out.println(".");
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				);
        
		System.out.println(t.getState());
	    t.start();
	    System.out.println(t.getState());
	    try {
			t.join();
			System.out.println(t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if(t.getState() == Thread.State.TERMINATED) {
	    	 System.out.println(t.getName() + " ::: TERMINATED");
	    }
	}

}
