package Multithreading;
class Book implements Runnable{
  public void run() {//run
		for(int i=1;i<=5;i++)
		{
			System.out.println("update database");
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
 class Num extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e
				.printStackTrace();
			}
		}
	}
 }
	  class Multithreading1 {
	public static void main(String args[]) throws InterruptedException {
		//book b=new Book();
		Runnable b=new  Book();
		
		Num n=new Num();
		//b.updateDb();
		//n.print(); 
		Thread t=new Thread(b);
		t.start();
		t.join();
		//n.start();
        t.setName("book1");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		
	//  b.start();//run
		n.start();
		
 /*	if(b.isAlive()) {
			System.out.println("still executing");
		}
		b.join();
		b.join();
		if(b.isAlive()) {
			System.out.println("still executing"); */
		System.out.println("byeeee");
	}
	
}
 

	  
	  