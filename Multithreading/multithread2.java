package Multithreading;
class Rainy implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("climate is cool");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class  Summer extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("oops");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class multithread2 {

	public static void main(String[] args) throws InterruptedException {
	
		//Rainy r=new Rainy();
	  Runnable r1=new Rainy();
		Summer s=new Summer();
		Thread t=new Thread(r1);
		t.start();
		t.join();//r.start();//r.climate();
		s.start();// s.hot();
		
	}

}
