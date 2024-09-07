package org.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program is started : " + Thread.currentThread().getName());
        Worker w1 = new Worker();
        w1.setName("Worker Thread");
        w1.start();
        // start() methods trigger the run method behind the scenes which class extends the thread class
        System.out.println("Program is finished");

        WorkerRunnable workerRunnable = new WorkerRunnable();
        Thread runnable = new Thread(workerRunnable);
        runnable.setName("RunnableWorker");
        runnable.start();

        // Another method to use Thread class
        new Thread(){
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
        }.start();

        // to use runnable interface
        new Thread(new Runnable() {
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
        }).start();
    }
}