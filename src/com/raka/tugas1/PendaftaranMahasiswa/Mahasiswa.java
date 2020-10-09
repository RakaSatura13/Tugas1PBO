package com.raka.tugas1.PendaftaranMahasiswa;

import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String TTL;
    String jurusan;

    public Mahasiswa(String nama,String TTL, String jurusan) {
        this.nama = nama;
        this.TTL = TTL;
        this.jurusan = jurusan;
    }
    public Mahasiswa(){}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}