// 28.	Write a java Program for Creating Multiple Threads.


public class Multi_Thread {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("Thread 1"));
        Thread thread2 = new Thread(new MyThread("Thread 2"));
        Thread thread3 = new Thread(new MyThread("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread implements Runnable {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " starting.");
        try {
            Thread.sleep(1000);
            System.out.println(threadName + " running.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }
}
