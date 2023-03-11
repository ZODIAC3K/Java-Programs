public class thread_with_runnable_interface implements Runnable {

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
        thread_with_runnable_interface thread_created = new thread_with_runnable_interface();
        Thread thread = new Thread(thread_created);
        thread.start();
        System.out.println("Main thread running.");
    }
}
