package org.example;

public class TV {
    private int resolusi;
    private Colokan colokan;
    public TV(int resolusi){
        this.resolusi = resolusi;
    }
    public int getResolution() {
        return resolusi;
    }


    public void connect(Colokan colokan){
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

}
