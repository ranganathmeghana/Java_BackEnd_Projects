
public class RunnableThreads implements Runnable{

	public static void main(String[] args) {
		

	}

	public void run() {
		
		System.out.println("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class RunnableSubThread
{
	public static void main(String[] args) {
		RunnableThreads runnableThreads=new RunnableThreads();
		Thread thread=new Thread(runnableThreads);
		thread.start();
	}
}