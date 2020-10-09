package com.raka.tugas1.Konversi;

public class nomer1 {
    public static void main(String[] args) {
        Konversi konversi;
        int C=10;
        int F=20;
        int K=30;
        int R=40;

        konversi = new Konversi(C,F,K,R);
        konversi.calculate(konversi);

        // output
        System.out.println("Hasil Konversi");
        System.out.println("C ke F\t: "+konversi.nomer1);
        System.out.println("F ke K\t: "+konversi.nomer2);
        System.out.println("K ke R\t: "+konversi.nomer3);
        System.out.println("R ke C\t: "+konversi.nomer4);
    }
}
