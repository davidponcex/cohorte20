package principal;

import threads.Thread1;
import threads.Thread2;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h1 = new Thread1();
		Thread h2 = new Thread2();
		
		h1.start();
		h2.start();
		try {
			
			h1.join();
			h2.join();
			
		} catch (InterruptedException e) {
			
		}
		System.out.println("se han ejecutado los 2 Threads");
		
	}

}
