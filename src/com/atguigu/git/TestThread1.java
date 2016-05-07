package com.atguigu.git;

public class TestThread1 {
	public static void main(String[] args) {
		ThreadShareDate threadShareDate = new ThreadShareDate();
		Thread thread = new Thread(threadShareDate);
		thread.start();
		new Thread(threadShareDate).start();
		 ThreadShareDate threadShareDate2 = new ThreadShareDate();
		 ThreadShareDate threadShareDate3 = new ThreadShareDate();
		 ThreadShareDate threadShareDate4 = new ThreadShareDate();
		 new Thread(threadShareDate2).start();
		 new Thread(threadShareDate3).start();
		 new Thread(threadShareDate4).start();
	}

}

class ThreadShareDate implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
        
      int count=0;  
        
      while (true)  
      {  
          //上锁  
          synchronized(this){  
          if (tickets>0){  
              try {  
                  Thread.sleep(1000);  
              } catch (InterruptedException e) {  
                  e.printStackTrace();  
              }  
              count=100-tickets;  
              System.out.println("当前票数是:"+tickets+"售出"+count  
                      +"线程名："+Thread.currentThread().getName());  
              tickets--;  
          }else{  
              break;  
          }  
          }  
      }         
  }  

}
