//By Extending the `Thread` Class
class MyThread1 extends Thread{

	@Override
	public void run(){
	
		System.out.println("Thread Creation using Thread");
	}
}

//By Implementing the `Runnable` Interface ✅ (Recommended)		
class MyThread2 implements Runnable{

	@Override
	public void run(){
	
		System.out.println("Thread Creation using Runnable");
	}
}
class Client{

	public static void main(String[]args){
	
		MyThread1 t1=new MyThread1();
		MyThread2 thread2=new MyThread2();
		Thread t2=new Thread(thread2);

		t1.start();
		t2.start();
	}
}
