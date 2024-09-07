package org.thread;

public class Worker extends  Thread{
    @Override
    public void run() {
    try{
        System.out.println("Worker class started to work  : Thread name :  " + Thread.currentThread().getName()); // --> Main thread
        Thread.sleep(1000);
        System.out.println("Worker class finished the work");
    }catch (InterruptedException e){
        e.printStackTrace();
    }

    }


}
