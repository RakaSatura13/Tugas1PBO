package com.raka.tugas1.Konversi;

public class Konversi {
    double nomer1,nomer2,nomer3,nomer4;

    public Konversi(double nomer1, double nomer2,double nomer3,double nomer4) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
        this.nomer3 = nomer3;
        this.nomer4 = nomer4;
    }

    void calculate(Konversi konversi){
        konversi.nomer1 = (konversi.nomer1 * 9/5)+32;
        konversi.nomer2 = (konversi.nomer2 - 32)*5/9+273;
        konversi.nomer3 = (konversi.nomer3 - 273.15)* 0.80000;
        konversi.nomer4 = (konversi.nomer4 * 0.8000);
    }
}
