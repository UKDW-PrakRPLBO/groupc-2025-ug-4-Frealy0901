package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth,merk);
    }

    public double getRealBandwidth() {
        double ratio = getPromisedBandwidth() / 50000;
        if (ratio < 1) {
            return getPromisedBandwidth() * ratio;
        } else {
            return getPromisedBandwidth();
        }
    }
}


