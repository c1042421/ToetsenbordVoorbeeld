/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;

/**
 *
 * @author c1042421
 */
public class ToetsenBord {
    private int serienummer;
    private String merk;
    private boolean draadloos;
    private double prijs;

    public ToetsenBord() {
        serienummer = 987450;
        merk = "?";
        draadloos = true;
    }

    public ToetsenBord(String merk, double prijs) {
        this.merk = merk;
        this.prijs = prijs;
    }

    public int getSerienummer() {
        return serienummer;
    }

    public void setSerienummer(int serienummer) {
        this.serienummer = serienummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean isDraadloos() {
        return draadloos;
    }

    public void setDraadloos(boolean draadloos) {
        this.draadloos = draadloos;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    
    public double getPrijsDollar(double omreken){
        return prijs * omreken;
    }

    @Override
    public String toString() {
        return "Het toetsenbord met serienummer " + serienummer + " kost € " + prijs;
    }
    
    
    
}
