package com.erinc;

public class SleepKullanimi {
    public static void main(String[] args) throws Exception {
        System.out.println("islemler basladi lutfen bekleyin.");
        Thread.sleep(5_000);
        System.out.println("Bok ye.");
        for (int i=0;i<10;i++){
            System.out.println(". ");
            Thread.sleep(3_000);
        }
        System.out.println();
        System.out.println("islem sonlandi.");






    }
}
