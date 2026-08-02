class MyThread extends Thread{

	public void run(){
	
		for(int i=1;i<=5;i++){
		
			System.out.println("🎵 Playing Music...");
			try{
			
				Thread.sleep(1000);
			}catch(InterruptedException e){
			
				System.out.println(e);
			}
		}
	}
}
class DownloadThread extends Thread{

	public void run(){
	
		for(int i=1;i<=5;i++){
		
			System.out.println("📥 Downloading File...");

			try{
			
				Thread.sleep(1000);
			}catch(InterruptedException e){
			
				System.out.println(e);
			}
		}
	}
}
class MultiTasking{

	public static void main(String[]args){
	
		MyThread t1=new MyThread();
		DownloadThread t2=new DownloadThread();

		t1.start();
		t2.start();
	}
}
