package com.test;

public class Test {

    public static void main(String[] args) {
        //   for (int i = 0; i < 100; i++) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());

            }
        }).start();

        System.out.println(Thread.currentThread().getName());
    }
    //  }
}

