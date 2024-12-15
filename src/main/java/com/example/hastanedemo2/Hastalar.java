package com.example.hastanedemo2;
import javafx.util.StringConverter;

import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;
public class Hastalar{
    String isim,soyisim;
    private long TC;
    String tani;
    String recete;
    Doktorlar doktor;
    private int hastaNo=0;
    Calendar randevu = Calendar.getInstance();
    protected static ArrayList<Hastalar> hastalar=new ArrayList<>();



    public Hastalar(String isim, String soyisim, long TC) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.TC = TC;
        this.hastaNo+=1;
        hastalar.add(this);
    }

    public static ArrayList<Hastalar> getHastalar() {
        return hastalar;
    }

    public Long getTC() {
        return TC;
    }

    public static void setHastalar(ArrayList<Hastalar> hastalar) {
        Hastalar.hastalar = hastalar;
    }

    public int getHastaNo() {
        return hastaNo;
    }

    public void receteGoruntule(){
        System.out.println(this.recete);
    }

    public void taniGoruntule(){
        System.out.println(this.tani);
    }
    public void RandevuAl(int yil, int ay, int gun, int saat, int dakika) {
        randevu.set(yil, ay-1, gun, saat, dakika);
    }

    /*public void RandevuGoruntuleme()
    {
        System.out.println(doktor.isim+" "+doktor.soyisim+ " Alani : "+doktor.alan);
        System.out.println(randevu.get(randevu.YEAR)+"/"+randevu.get(randevu.MONTH)+"/"+randevu.get(randevu.DATE));
        System.out.println("Randevu saati : "+randevu.get(randevu.HOUR)+" : "+randevu.get(randevu.MINUTE));
    } */



}
