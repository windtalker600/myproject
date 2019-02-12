package com.max.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i=0; i <10; i++){
            System.out.println("main:" +i);
        }
        //下面是個匿名類別
        Thread thread = new Thread(){
            @Override
            public void run() { //複寫Thread身上的run方法
                for (int i=0; i <10; i++) {
                    System.out.println("Thread:" + i);
                    try { //處理一下可能的interrupt exception
                        sleep(50);//利用Thread方法中的sleep方法, 睡一下50msec
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
                    System.out.println("Runnable lambda" + i);
                    //無法直接使用thread身上的sleep,用Thread.sleep()方式達成:
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }; //把runnable這個物件生出來
        Thread r = new Thread(runnable); //再將runnable交到Thread()的建構子當中
        r.start(); //在呼叫這個thread.start
        //Runnable - Lambda 這就是Lambda的用法,用在常常寫匿名類別
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable" + i);
                //無法直接使用thread身上的sleep,用Thread.sleep()方式達成:
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start(); //反正一樣要.start()  常常使用匿名類別,可以有更好的寫法,底下註解是原本的匿名類別寫法
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable lambda" + i);
                }
            }
        }).start(); //反正一樣要.start()  常常使用匿名類別,可以有更好的寫法*/
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
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//一但有加上sleep 50msec後,整個thread就會交叉進行