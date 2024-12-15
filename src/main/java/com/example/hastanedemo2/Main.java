package com.example.hastanedemo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Doktorlar d1=new Doktorlar("Bade","Yıldırım",1234567891L,"123BB6","Kardiyoloji");
        Hemsireler h1=new Hemsireler("Zeynep","Kar",122567899L,"234kV90");
        Hastalar hasta1=new Hastalar("Mehmet","Deniz", 123888923);
        Hastalar hasta2=new Hastalar("Ayse","Yılmaz",12456789);
        ArrayList<Hastalar> hasta=Hastalar.getHastalar();
        for(Hastalar h:hasta){
            System.out.println(h.isim);
        }



    }
}