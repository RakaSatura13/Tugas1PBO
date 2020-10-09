package com.raka.tugas1.PendaftaranMahasiswa;
import java.util.Scanner;

public class nomer2 {

        public static void main(String[] args) {
            // Deklarasi
            String nama;
          String TTL;
            String jurusan;

            Mahasiswa daftar = new Mahasiswa();
            Scanner scan = new Scanner(System.in);

            // Input
            System.out.printf("Masukan Nama : ");
            nama = scan.nextLine();
            daftar.setNama(nama);

            System.out.printf("Masukan TTL : ");
            TTL = scan.nextLine();
            daftar.setTTL(TTL);

            System.out.printf("Masukan Pilihan jurusan : ");
            jurusan = scan.nextLine();
            daftar.setJurusan(jurusan);

            // Output
            System.out.println("Tampilan");
            System.out.println("Nama : "+daftar.getNama());
            System.out.println("TTL : "+daftar.getTTL());
            System.out.println("Jurusan : "+daftar.getJurusan());
        }
    }