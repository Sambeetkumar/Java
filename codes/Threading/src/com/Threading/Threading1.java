package com.Threading;
class A extends Thread{
    public A (String name){ super(name); }
   @Override
    public void run()
    {
        for(int i = 0; i < 5; ++i) {
            System.out.println("\tFrom Thread A : i = "+i+" NAME = "+this.getName());
        }
        System.out.println("Exit from Thread A");
    }
}
class B extends Thread{
    public B (String name){
        super(name);
    }
    @Override
    public void run()
    {
        for(int j = 0; j < 5; ++j) {
            System.out.println("\tFrom Thread B : j = "+j+" NAME = "+this.getName());
        }
        System.out.println("Exit from Thread B");
    }
}
class C extends Thread{
    public C (String name){
        super(name);
    }
        @Override
    public void run()
    {
        for(int k = 0; k < 5; ++k) {
            System.out.println("\tFrom Thread C : k = "+k+" NAME = "+this.getName());
        }
        System.out.println("Exit from Thread C");
    }
}
public class Threading1 {
    public static void main(String[] args) {
        A Thread_A= new A("Thread_A");
        B Thread_B= new B("Thread_B");
        C Thread_C= new C("Thread_C");
        Thread_A.setPriority(Thread.MIN_PRIORITY);
        Thread_B.setPriority(5);
        Thread_C.setPriority(Thread.MAX_PRIORITY);
        Thread_A.start();
        Thread_B.start();
        Thread_C.start();
    }
}
