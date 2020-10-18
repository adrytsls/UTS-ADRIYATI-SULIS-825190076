package com.company;

class TiketKereta extends Tiket {
    private String namaKereta, stasiunKeberangkatan, stasiunTujuan;

    TiketKereta(String kode, String harga,
                String namaKereta, String stasiunKeberangkatan, String stasiunTujuan) {
        setJenis("Kereta");
        setKode(kode);
        setHarga(harga);
        this.namaKereta = namaKereta;
        this.stasiunKeberangkatan = stasiunKeberangkatan;
        this.stasiunTujuan = stasiunTujuan;
    }

    String getNamaKereta() {
        return namaKereta;
    }

    String getStasiunKeberangkatan() {
        return stasiunKeberangkatan;
    }

    String getStasiunTujuan() {
        return stasiunTujuan;
    }
}
