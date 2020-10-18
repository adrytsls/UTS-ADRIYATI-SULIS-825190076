package com.company;

class TiketBis extends Tiket {
    private String namaBis, terminalKeberangkatan, terminalTujuan;

    TiketBis(String kode, String harga, String namaBis, String terminalKeberangkatan, String terminalTujuan) {
        setJenis("Bis");
        setKode(kode);
        setHarga(harga);
        this.namaBis = namaBis;
        this.terminalKeberangkatan = terminalKeberangkatan;
        this.terminalTujuan = terminalTujuan;
    }

    String getNamaBis() {
        return namaBis;
    }

    String getTerminalKeberangkatan() {
        return terminalKeberangkatan;
    }

    String getTerminalTujuan() {
        return terminalTujuan;
    }
}
