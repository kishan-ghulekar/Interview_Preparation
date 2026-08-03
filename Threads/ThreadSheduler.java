class MyThread extends Thread{

	public MyThread(String name){
	
		super(name);
	}

	@Override
	public void run(){
	
		for(int i=1;i<=5;i++){
		
			System.out.println(getName()+" : "+i);
		}
	}

	public static void main(String[]args){
	
		MyThread t1=new MyThread("Thread-1");
		MyThread t2=new MyThread("Thread-2");

		t1.start();
		t2.start();
	}
}
/*

Possible Output:
Thread-1 : 1
Thread-2 : 1
Thread-2 : 2
Thread-1 : 2
Thread-1 : 3
Thread-2 : 3
Thread-2 : 4
Thread-1 : 4
Thread-1 : 5
Thread-2 : 5
```
Note: The output may be different every time you run the program because the **Thread Scheduler** decides which thread gets CPU time.

*/
