package org.example;

public abstract class Colokan {
    private int harga;
    private double promisedBandwidth;
    private String merk;

    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }


    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public abstract double getRealBandwidth();
}
