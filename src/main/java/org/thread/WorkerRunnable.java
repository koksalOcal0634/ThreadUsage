package org.thread;

public class WorkerRunnable implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Worker Runnable started to work  : Thread name :  " + Thread.currentThread().getName()); // --> Main thread
            Thread.sleep(1000);
            System.out.println("Worker Runnable finished the work");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
