package com.example.hastanedemo2;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.util.ArrayList;

public class HastaGirisEkrani {
    @FXML
    private TextField HastaTCEntry;

    @FXML
    private Button HastaGirişYapBt;

    @FXML
    private Label HastaGirisLable;


    @FXML
    protected void onGirisYapClick() {
        String tcText = HastaTCEntry.getText();
        System.out.println("Girilen TC: " + tcText); // Debugging için

        Long hastaTc;
        boolean found=false;
        try {
            hastaTc = Long.valueOf(tcText);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz TC girişi");
            return;
        }
        ArrayList<Hastalar> hasta=Hastalar.getHastalar(); //hasta listesi boş gözüküyor
        for(Hastalar h:hasta){
            System.out.println(h.isim);
        }
        if(hasta.isEmpty()){
            System.out.println("hasta listesi boş");
            return;
        }
        for (Hastalar h : hasta) {
            System.out.println(h.getTC());
            if (h.getTC()==hastaTc.longValue()) {
                found=true;
                System.out.println("Hasta TC bulundu:"+ hastaTc);
                break;
            }
        }
        if(found){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/hastanedemo2/hastaislemekrani.fxml"));
        Pane root = null;
        try {
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Hasta İşlem Ekranı");
            stage.setScene(new Scene(root, 400, 300));
            stage.show();

        }catch(IOException e){
            System.out.println("ekran goruntulenemiyor");
        }}
        else{
            System.out.println("hasta bulunamadı");
        }


    }
}
