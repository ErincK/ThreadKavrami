package com.erinc;

import java.util.Scanner;

public class SleepOrnek {
    public static void main(String[] args) throws InterruptedException {

        new Thread(()-> {
            do{
                System.out.println("Davula Vurdu.");
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }while(true);
        }).start();


        Thread.sleep(2_000);
        int secim;
        do{
            System.out.println("******************");
            System.out.println("****  Islem  *****");
            System.out.println("******************");
            System.out.println("1- Toplama");
            System.out.println("2- Cikartma");
            System.out.println("3- Cikis");
            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen secin...:");
            secim=sc.nextInt();

        }while (secim!=0);
        System.out.println("Kapandi");



    }
}
