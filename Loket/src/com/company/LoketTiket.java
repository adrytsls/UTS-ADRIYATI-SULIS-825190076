package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoketTiket implements Loket {
    private Scanner scan = new Scanner(System.in);

    private ArrayList<String> tempKereta = new ArrayList<>();
    private ArrayList<String> tempBis = new ArrayList<>();
    private ArrayList<TiketKereta> tiketKereta = new ArrayList<>();
    private ArrayList<TiketBis> tiketBis = new ArrayList<>();

    void addTiket(TiketKereta kereta) {
        tiketKereta.add(kereta);
        tempKereta.add(kereta.getKode());
    }

    void addTiket(TiketBis bis) {
        tiketBis.add(bis);
        tempBis.add(bis.getKode());
    }

    @Override
    public void beliTiket() {
        System.out.println("Beli Tiket");
        System.out.print("Masukkan Kode : ");
        String kode = scan.nextLine();
        int foundKereta = tempKereta.indexOf(kode);
        int foundBis = tempBis.indexOf(kode);

        String abc = "ABCD";
        Random rd = new Random();
        char letter = abc.charAt(rd.nextInt(abc.length()));
        int number = (int) (Math.random() * 10);

        if (foundKereta != -1) {
            System.out.print("Masukkan Nama Penumpang : ");
            String nama = scan.nextLine();
            System.out.print("Tiket sedang dalam pemesanan");
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.print(" .");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\n ===== Berhasil Memesan Tiket =====");
            System.out.println("Nama Penumpang        : " + nama);
            System.out.println("Nama KA               : " + tiketKereta.get(foundKereta).getNamaKereta());
            System.out.println("Harga                 : " + tiketKereta.get(foundKereta).getHarga());
            System.out.println("Stasiun Keberangkatan : " + tiketKereta.get(foundKereta).getStasiunKeberangkatan());
            System.out.println("Stasiun Tujuan        : " + tiketKereta.get(foundKereta).getStasiunTujuan());
            System.out.println("Kursi                 : " + number + "" + letter);
        }

        if (foundBis != -1) {
            System.out.print("Masukkan Nama Penumpang : ");
            String nama = scan.nextLine();
            System.out.print("Tiket sedang dalam pemesanan");
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.print(" .");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\n ===== Berhasil Memesan Tiket =====");
            System.out.println("Nama Penumpang         : " + nama);
            System.out.println("Nama Bis               : " + tiketBis.get(foundBis).getNamaBis());
            System.out.println("Harga                  : " + tiketBis.get(foundBis).getHarga());
            System.out.println("Terminal Keberangkatan : " + tiketBis.get(foundBis).getTerminalKeberangkatan());
            System.out.println("Terminal Tujuan        : " + tiketBis.get(foundBis).getTerminalTujuan());
            System.out.println("Kursi                  : " + number + "" + letter);
        }

        if (foundBis == -1 && foundKereta == -1) {
            System.out.println("\nKode Tidak Ditemukan");
            System.out.println("Silahkan Pilih Menu Lihat Tiket");
        }
    }

    @Override
    public void daftarTiket() {
        System.out.println("\n......... Tiket Kereta .........");
        for (TiketKereta kereta : tiketKereta) {
            System.out.println("\nKode : " + kereta.getKode());
            System.out.println("Nama KA : " + kereta.getNamaKereta());
            System.out.println("Harga : " + kereta.getHarga());
            System.out.println("Stasiun Keberangkatan : " + kereta.getStasiunKeberangkatan());
            System.out.println("Stasiun Tujuan : " + kereta.getStasiunTujuan());
        }
        System.out.println("\n......... Tiket Bis .........");
        for (TiketBis bis : tiketBis) {
            System.out.println("\nKode : " + bis.getKode());
            System.out.println("Nama KA : " + bis.getNamaBis());
            System.out.println("Harga : " + bis.getHarga());
            System.out.println("Terminal Keberangkatan : " + bis.getTerminalKeberangkatan());
            System.out.println("Terminal Tujuan : " + bis.getTerminalTujuan());
        }
    }

    void daftarTiket(String jenis) {
        if (jenis.equals("Kereta")) {
            for (TiketKereta kereta : tiketKereta) {
                System.out.println("\nKode : " + kereta.getKode());
                System.out.println("Nama KA : " + kereta.getNamaKereta());
                System.out.println("Harga : " + kereta.getHarga());
                System.out.println("Stasiun Keberangkatan : " + kereta.getStasiunKeberangkatan());
                System.out.println("Stasiun Tujuan : " + kereta.getStasiunTujuan());
            }
        } else {
            for (TiketBis bis : tiketBis) {
                System.out.println("\nKode : " + bis.getKode());
                System.out.println("Nama KA : " + bis.getNamaBis());
                System.out.println("Harga : " + bis.getHarga());
                System.out.println("Terminal Keberangkatan : " + bis.getTerminalKeberangkatan());
                System.out.println("Terminal Tujuan : " + bis.getTerminalTujuan());
            }
        }
    }
}
