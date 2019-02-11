package com.max.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i=0; i <10; i++){
            System.out.println("main:" +i);
        }
        Thread thread = new Thread(){
            @Override
            public void run() { //複寫Thread身上的run方法
                for (int i=0; i <10; i++) {
                    System.out.println("Thread:" + i);
                }
            }
        }; //這是一個修改過的Thread類別,不是全新的類別
        thread.start();
        //MyThread在此呼叫來用
        MyThread myThread = new MyThread();
        myThread.start();
        //實作Runnabe, 實作一個介面一定要去實作它的方法
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable" + i);
                }
            }
        }; //把runnable這個物件生出來
        Thread r = new Thread(runnable); //再將runnable交到Thread()的建構子當中
        r.start(); //在呼叫這個thread.start
        System.out.println("main end");  //可以看到結果是main thread已經結束,而Thread還沒跑完
    }
}

//在C:\Users\Max\IdeaProjects\myproject\out\production\classes\com\max\thread可以看到匿名類別

//下面的MyThread則是有名字的類別
//在C:\Users\Max\IdeaProjects\myproject\out\production\classes\com\max\thread可以看到MyThread, 是有名字的類別
class MyThread extends Thread {
    @Override
    public void run() {  //複寫Thread身上的run方法
        for (int i = 0; i < 10; i++) { //快速寫法 10.fo 就可以寫出這個1到10
            System.out.println(getName() + ":" + i);

        }
    }
}
