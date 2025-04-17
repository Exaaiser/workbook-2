package com.plusarsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int count = 10;
        do {
            System.out.println(count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
            } while (count >= 1);
        System.out.println("Lauch");
        } }