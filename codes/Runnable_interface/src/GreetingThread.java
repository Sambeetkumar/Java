public class GreetingThread implements Runnable {
    private String message;
    private int interval;

    public GreetingThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(message);
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new GreetingThread("GOOD MORNING", 1000));
        Thread t2 = new Thread(new GreetingThread("GOOD AFTERNOON", 3000));

        t1.start();
        t2.start();
    }
}
