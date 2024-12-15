package com.example.hastanedemo2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Doktorlar extends Calisanlar implements Islemler{
    public String alan;
    private String Sifre;
    protected static ArrayList<Doktorlar> doktorlar=new ArrayList<>();

    public Doktorlar(String isim, String soyisim, long TC,String Sifre, String alan) {
        super(isim, soyisim, TC);
        this.Sifre=Sifre;
        this.alan = alan;
        doktorlar.add(this);
    }

    public static ArrayList<Doktorlar> getDoktorlar() {
        return doktorlar;
    }

    public static void setDoktorlar(ArrayList<Doktorlar> doktorlar) {
        Doktorlar.doktorlar = doktorlar;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String sifre) {
        Sifre = sifre;
    }

    public void BilgiGoster()
    {
        System.out.println("Doktorun isim : "+isim+" Doktorun soyismi : "+soyisim+"Doktorun alani : "+alan);

    }

    public void RandevuGoruntuleme(int HastaNo)
    {
        for(Hastalar h: hastalari){
            if(HastaNo == h.getHastaNo()) {
                System.out.println("Hasta adi : " + h.isim + " Soyadi : " + h.soyisim);
                System.out.println(h.randevu.get(h.randevu.YEAR) + "/" + h.randevu.get(h.randevu.MONTH) + "/" + h.randevu.get(h.randevu.DATE));
                System.out.println("Randevu saati : " + h.randevu.get(h.randevu.HOUR) + " : " + h.randevu.get(h.randevu.MINUTE));
            }
        }}

    public void taburcuEt(YatanHastalar yh) throws TaburcuException {
        if (yh.yatmaDurumu){
            yh.yatmaDurumu=false;
            hastalari.remove(yh);
        }
        else{
           throw new TaburcuException("Zaten Taburcu Edilmiş Bir Hasta Tekrar Taburcu Edilemez");
        }
    }

    public void ilacYaz(Hastalar h){
        Scanner input=new Scanner(System.in);
        h.recete=input.next();
        System.out.println("Recete basariyla tanimlandi");
    }
    public void ilacYaz(Hastalar h,String ilac,String doz){
        h.recete=ilac+" gunde "+doz+"kere kullanılmalı";
        System.out.println("Recete basariyla tanimlandi");
    }
    public void taniKoy(Hastalar h){
        Scanner input=new Scanner((System.in));
        h.tani=input.next();
        System.out.println("Hastalık teşhis edildi");
    }
}
