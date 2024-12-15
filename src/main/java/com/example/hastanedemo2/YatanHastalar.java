package com.example.hastanedemo2;

import java.util.ArrayList;

public class YatanHastalar extends Hastalar{
    private int odaNumarasi;
    public Hemsireler hemsire;
    public Double tansiyon;
    public Double kanSekeri;
    public boolean yatmaDurumu=true;
    protected static ArrayList<YatanHastalar> yatanhastalar=new ArrayList<>();


    public YatanHastalar(String isim, String soyisim, long TC, int odaNumarasi, Hemsireler hemsire) {
        super(isim, soyisim, TC);
        this.odaNumarasi = odaNumarasi;
        this.hemsire = hemsire;
        yatanhastalar.add(this);
    }

    public static ArrayList<YatanHastalar> getYatanhastalar() {
        return yatanhastalar;
    }

    public static void setYatanhastalar(ArrayList<YatanHastalar> yatanhastalar) {
        YatanHastalar.yatanhastalar = yatanhastalar;
    }

    public int getOdaNumarasi() {
        return odaNumarasi;
    }
    public void setOdaNumarasi(int odaNumarasi) {
        this.odaNumarasi = odaNumarasi;
    }



}
