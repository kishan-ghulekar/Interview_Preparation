class Counter{

	int count =0;
}
class MyThread extends Thread{

	Counter counter;

	MyThread(Counter counter){
	
		this.counter=counter;
	}
       	public void run(){
 	
		counter.count++;
		System.out.println(Thread.currentThread().getName()+":"+counter.count); 
	}
}
class Main{

	public static void main(String[]args){
	
		Counter c=new Counter(); //One Shared Object

		MyThread t1=new MyThread(c);
		MyThread t2=new MyThread(c);

		t1.start();
		t2.start();
	}
}


/*
Output:
Thread-0:1
Thread-1:2


           Process
              │
      Shared Heap Memory
              │
      Counter Object (count)
              │
         count = 0
         /       \
        /         \
   Thread-1    Thread-2
        │           │
        └─────┬─────┘
              │
      Both access SAME object
*/
