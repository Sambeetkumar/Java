package com.Threading;
class Thread1 extends Thread{
    int n;
    public Thread1(int num){
        this.n = num;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; ++i)
            System.out.println("Hello from thread1 : "+this.getName()+" i = "+i);
        System.out.println("Exit from thread1");
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        for (int j = 0; j < 10; ++j) {
            System.out.println("Hello from thread2 : " + this.getName() + " j = " + j);
            if (j == 4) {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Exit from thread2");
    }
}
class Thread3 extends Thread{
    @Override
    public void run() {
        for (int k = 0; k < 10; ++k)
            System.out.println("Hello from thread3 : "+this.getName()+" k= "+k);
        System.out.println("Exit from thread3");
    }
}
public class Thread_constructor {
    public static void main(String[] args) {
        Thread1 X = new Thread1(6);
        Thread2 Y = new Thread2();
        Thread3 Z = new Thread3();
        X.setName("Sambeet");
        Y.setName("Alex");
        Z.setName("sam");
        //System.out.println("Name of Thread1 = "+X.getName());
        //System.out.println("Name of Thread1 = "+Y.getName());
        X.start();
        try {
            X.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        Y.start();
        Z.start();
    }
}
