package com.company;

abstract class Tiket {
    private String kode, jenis, harga;

    String getKode() {
        return kode;
    }

    void setKode(String kode) {
        this.kode = kode;
    }

    void setJenis(String jenis) {
        this.jenis = jenis;
    }

    String getHarga() {
        return harga;
    }

    void setHarga(String harga) {
        this.harga = harga;
    }
}
