
public class ThreadsInJava extends Thread{

public void run(){
		for(int i=0; i<50;i++){
		System.out.println("override run method"+i+Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}



}


class ThreadsSubClass
{
public static void main(String[] args) {
		
		//start() ensures that the threads run simultaneosly 
		//run()- when we use this the threads run after the completion of the other 
		//currentThread()- displays the currently running thread
	   //sleep()- puts the currently executing thread to sleep
	//sleep() needs to be in try because it throws exception when we try to interrupt an already sleeping thread 
		ThreadsInJava threadsInJava=new ThreadsInJava();
		threadsInJava.setPriority(1);//min priority 
		threadsInJava.start();
	//	threadsInJava.run();
		ThreadsInJava threadsInJava1=new ThreadsInJava();
	   threadsInJava1.setPriority(10);//max priority 
		threadsInJava1.start();
		//	threadsInJava1.run();

	}
}