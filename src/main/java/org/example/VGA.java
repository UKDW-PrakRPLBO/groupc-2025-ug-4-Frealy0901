package org.example;

public class VGA extends Colokan{

    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth,merk);
    }
    public double getRealBandwidth() {
        double ratio = getPromisedBandwidth() / 30000;
        if (ratio < 1) {
            return getPromisedBandwidth() * ratio;
        } else {
            return getPromisedBandwidth();
        }
    }
}

