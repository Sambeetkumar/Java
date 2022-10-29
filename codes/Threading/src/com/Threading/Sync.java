package com.Threading;
class Pyramid{
    synchronized void DrawPyramid(char ch){
        for (int i = 0; i < 10; i+= 2){
            for (int k = 10-i; k>0 ; k-=2){
                System.out.print(" ");
            }
            for (int j =0; j< i; ++j){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
class MyThread1 extends Thread{
    Pyramid p1;
    MyThread1(Pyramid p){ this.p1 = p;}
    @Override
    public void run()
    {
       p1.DrawPyramid('*');
    }
}
class MyThread2 extends Thread{
    Pyramid p2;
    MyThread2 (Pyramid p){ this.p2 = p;}
    @Override
    public void run()
    {
        p2.DrawPyramid('$');
    }
}
public class Sync {
    public static void main(String[] args) {
        Pyramid pobj = new Pyramid();
        MyThread1 X1 = new MyThread1(pobj);
        MyThread2 X2 = new MyThread2(pobj);
        X1.start();
        X2.start();
    }
}
