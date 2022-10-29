    class Runnable1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i <= 5; ++i) {
                System.out.println("FROM RUNNABLE1 i = " + i);
            }
            System.out.println("Exit from Runnable1 🤣😍😊");
        }
    }

    class Runnable2 implements Runnable {
        @Override
        public void run() {
            for (int j = 0; j <= 5; ++j) {
                System.out.println("FROM RUNNABLE1 j = " + j);
            }
            System.out.println("Exit from Runnable2 🤣😍😊");
        }
    }

    class Runnable3 implements Runnable {
        @Override
        public void run() {
            for (int k = 0; k <= 5; ++k) {
                System.out.println("FROM RUNNABLE1 k = " + k);
            }
            System.out.println("Exit from Runnable3 🤣😍😊");
        }
    }

    public class Runnable_thread {
        public static void main(String[] args) {
            Runnable1 obj1 = new Runnable1();
            Thread t1 = new Thread(obj1);
            Runnable2 obj2 = new Runnable2();
            Thread t2 = new Thread(obj2);
            Runnable3 obj3 = new Runnable3();
            Thread t3 = new Thread(obj3);
            t1.start();
            t2.start();
            t3.start();
        }
    }