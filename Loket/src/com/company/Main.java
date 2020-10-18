package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih, pilihKendaraan;

        // Tambah data loket
        LoketTiket loket = new LoketTiket();

        loket.addTiket(new TiketKereta("KRT123", "Rp 120.000", "Argo Parahyangan", "Gambir (GMR)", "Bandung Kiaracondong (KAC)"));
        loket.addTiket(new TiketKereta("KRT213", "Rp 90.000", "Tawang Jaya", "Pasar Senen (PSE)", "Semarang Tawang (SMT)"));
        loket.addTiket(new TiketKereta("KRT321", "Rp 150.000", "Argo Muria", "Gambir (GMR)", "Semarang Tawang (SMT)"));

        loket.addTiket(new TiketBis("BUS231", "Rp 160.000", "Kramat Djati", "Jakarta", "Solo"));
        loket.addTiket(new TiketBis("BUS456", "Rp 125.000", "Lorena", "Bogor", "Jakarta"));
        loket.addTiket(new TiketBis("BUS987", "Rp 100.000", "Rosalia Indah", "Yogyakarta", "Malang"));

        do {
            menu();
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    loket.beliTiket();
                    break;
                case 2:
                    pilihTiket();
                    pilihKendaraan = scan.nextInt();
                    if (pilihKendaraan == 1) {
                        loket.daftarTiket("Kereta");
                    } else if (pilihKendaraan == 2) {
                        loket.daftarTiket("Bis");
                    } else if (pilihKendaraan == 3) {
                        loket.daftarTiket();
                    } else {
                        System.out.println("Tidak ada dalam menu !");
                    }
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
                default:
                    System.err.println("Menu tidak ada !");
            }
        } while (pilih != 3);
    }

    private static void menu() {
        System.out.println("\n///////// Pemesanan Tiket /////////");
        System.out.println("/ 1. Beli Tiket                   /");
        System.out.println("/ 2. Lihat Tiket                  /");
        System.out.println("/ 3. Keluar                       /");
        System.out.println("///////////////////////////////////");
        System.out.print("Pilih : ");
    }

    private static void pilihTiket() {
        System.out.println("->");
        System.out.println("1. Tiket Kereta");
        System.out.println("2. Tiket Bis");
        System.out.println("3. Semua Tiket");
        System.out.print("Pilih : ");
    }
}
