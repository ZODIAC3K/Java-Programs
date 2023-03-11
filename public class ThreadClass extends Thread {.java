// 27.	Write a java Program for creating a thread with extend the Thread class.

public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Thread starting.");
        try {
            Thread.sleep(1000);
            System.out.println("Thread running.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread terminating.");
    }

    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.start();
        System.out.println("Main thread running.");
    }
}

