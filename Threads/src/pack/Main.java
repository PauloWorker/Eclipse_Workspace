package pack;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		//Thread.activeCount() =    used to check how many threads are working
		//Thread.currentThread() =  used to check the current thread working
		//.getPriority() =          used to get the priority of the thread
		
		//System.out.println(Thread.currentThread().isAlive());
		
		/*
		for(int i = 3; i > 0; i--)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("done");
		*/
		
		MyThread thread2 = new MyThread();
		
		thread2.start();
		
		
		System.out.println(Thread.activeCount());
	}
}
