
    class Threads implements Runnable{  
     public void run(){  
    	 try
    	 {
    	 Thread.sleep(400);
    	 }
    	 catch(Exception e)
    	 {
    		 
    		 System.out.println(Thread.currentThread()+ "   "+Thread.currentThread().getState()+"   " +"Exception occured.....");
    	 }
      for(int i=1;i<1000;i++)
      {  
        System.out.println(Thread.currentThread()+"   "+i);  
      }  
     }  
     public static void main(String args[]){  
    	 Threads t1=new Threads();  
    	  
    	 Thread t=new Thread(t1);
    	 Thread t2=new Thread(t1);
       
      t.start();  
      t.interrupt();
      t2.start();;  
     }  
    }  