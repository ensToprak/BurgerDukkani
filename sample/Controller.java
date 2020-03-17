package sample;

import Factory.BurgerMenuFactory;
import Factory.UrunSecim;
import Icecek.Icecek;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.YanUrun;
import Enum.*;
import com.sun.javafx.binding.StringFormatter;
import com.sun.javafx.scene.layout.region.Margins;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collection;


public class Controller {
    public float toplamFiyat;
    public int c, d, k, t;
    String toplamAlinan = "";
    String alinanC="", alinanD="", alinanK="",alinanT="";
    boolean cKontrol = false, dKontrol = false, kKontrol = false, tKontrol = false;

    //ComboBox içerisindeki değerleri tutan listeler..
    public ArrayList<String> yanUrunList = new ArrayList<String>();
    public ArrayList<String> getYanUrunList() {
        yanUrunList.add("Yok");yanUrunList.add("Kucuk");yanUrunList.add("Orta");yanUrunList.add("Buyuk");
        return yanUrunList;
    }

    public ArrayList<String> icecekList = new ArrayList<String>();
    public ArrayList<String> getIcecekList() {
        icecekList.add("Yok");icecekList.add("0.2 Litre");icecekList.add("0.33 Litre");icecekList.add("1 Litre");
        return icecekList;
    }

    public ArrayList<String> adetList = new ArrayList<String>();
    public ArrayList<String> getAdetList() {
        adetList.add("Yok");adetList.add("1 Adet");adetList.add("2 Adet");adetList.add("3 Adet");
        return adetList;
    }

    //ComboBoxları tutan listeler..
    public ArrayList<ComboBox> yanComboList = new ArrayList<ComboBox>();
    public ArrayList<ComboBox> getYanComboList() {
        yanComboList.add(patatesC);yanComboList.add(soganHalkasiC);yanComboList.add(tavukBagetC);
        return yanComboList;
    }

    public ArrayList<ComboBox> icecekComboList = new ArrayList<ComboBox>();
    public ArrayList<ComboBox> getIcecekComboList() {
        icecekComboList.add(kolaC);icecekComboList.add(fantaC);icecekComboList.add(spriteC);
        icecekComboList.add(sogukCayC);icecekComboList.add(ayranC);
        return icecekComboList;
    }

    public ArrayList<ComboBox> sosComboList = new ArrayList<ComboBox>();
    public ArrayList<ComboBox> getSosComboList() {
        sosComboList.add(ketcapC);sosComboList.add(mayonezC);sosComboList.add(barbekuC);
        sosComboList.add(hardalC);sosComboList.add(aciC);
        return sosComboList;
    }

    public ArrayList<ComboBox> tatliComboList = new ArrayList<ComboBox>();
    public ArrayList<ComboBox> getTatliComboList() {
        tatliComboList.add(suffleC);tatliComboList.add(tartC);
        return tatliComboList;
    }

    //Urunleri kategoriler halinde tutan listeler..
    public ArrayList<String>  yList= new ArrayList<String>();
    public ArrayList<String> getYList() {
        yList.add("Patates");yList.add("Sogan Halkasi");yList.add("Tavuk Baget");
        return yList;
    }

    public ArrayList<String> iList = new ArrayList<String>();
    public ArrayList<String> getiList() {
        iList.add("Kola");iList.add("Fanta");iList.add("Sprite");iList.add("Soguk Cay");iList.add("Ayran");
        return iList;
    }

    public ArrayList<String> sList = new ArrayList<String>();
    public ArrayList<String> getsList() {
        sList.add("Mayonez");sList.add("Ketcap");sList.add("Barbeku");sList.add("Hardal");sList.add("Aci Sos");
        return sList;
    }

    public ArrayList<String> tList = new ArrayList<String>();
    public ArrayList<String> gettList() {
        tList.add("Suffle");tList.add("Tart");
        return tList;
    }

    @FXML
    private TabPane menu;

    @FXML
    private Tab burger;

    @FXML
    private Tab urun;

    @FXML
    private Button cheddarBurger;

    @FXML
    private Button doubleKofteBurger;

    @FXML
    private Button kofteBurger;

    @FXML
    private Button tavukBurger;

    @FXML
    private Button ode;

    @FXML
    private ComboBox<String> patatesC;

    @FXML
    private ComboBox<String> soganHalkasiC;

    @FXML
    private ComboBox<String> tavukBagetC;

    @FXML
    private ComboBox<String> kolaC;

    @FXML
    private ComboBox<String> fantaC;

    @FXML
    private ComboBox<String> spriteC;

    @FXML
    private ComboBox<String> sogukCayC;

    @FXML
    private ComboBox<String> ayranC;

    @FXML
    private ComboBox<String> mayonezC;

    @FXML
    private ComboBox<String> ketcapC;

    @FXML
    private ComboBox<String> barbekuC;

    @FXML
    private ComboBox<String> hardalC;

    @FXML
    private ComboBox<String> aciC;

    @FXML
    private ComboBox<String> suffleC;

    @FXML
    private ComboBox<String> tartC;

    @FXML
    private Tab odeme;

    @FXML
    private TextArea genel;

    @FXML
    private Label fiyat;

    @FXML
    private Button cikis;

    @FXML
    public void cheddar(ActionEvent event){
        Context context = new Context(new CheddarBurger());
        toplamFiyat+=context.executeMenu();
        if(cKontrol == false) {
            alinanC += "CheddarBurger\n";
            cKontrol = true;
            c++;
        }
        else{
            c++;
        }
    }
    @FXML
    public void doubleKofte(ActionEvent event){
        Context context = new Context(new DoubleKofteBurger());
        toplamFiyat+=context.executeMenu();
        if(dKontrol == false) {
            alinanD += "Double KofteBurger\n";
            dKontrol = true;
            d++;
        }
        else{
            d++;
        }
    }
    @FXML
    public void kofte(ActionEvent event){
        Context context = new Context(new KofteBurger());
        toplamFiyat+=context.executeMenu();
        if(kKontrol == false) {
            alinanK += "KofteBurger\n";
            kKontrol = true;
            k++;
        }
        else{
            k++;
        }
    }
    @FXML
    public void tavuk(ActionEvent event){
        Context context = new Context(new TavukBurger());
        toplamFiyat+=context.executeMenu();
        if(tKontrol == false) {
            alinanT += "TavukBurger\n";
            tKontrol = true;
            t++;
        }
        else{
            t++;
        }
    }
    @FXML
    public void urunC(){
        getYanUrunList();
        getIcecekList();
        getAdetList();
        patatesC.getItems().addAll(yanUrunList);
        soganHalkasiC.getItems().addAll(yanUrunList);
        tavukBagetC.getItems().addAll(yanUrunList);
        kolaC.getItems().addAll(icecekList);
        fantaC.getItems().addAll(icecekList);
        spriteC.getItems().addAll(icecekList);
        sogukCayC.getItems().addAll(icecekList);
        ayranC.getItems().addAll(icecekList);
        mayonezC.getItems().addAll(adetList);
        ketcapC.getItems().addAll(adetList);
        barbekuC.getItems().addAll(adetList);
        hardalC.getItems().addAll(adetList);
        aciC.getItems().addAll(adetList);
        suffleC.getItems().addAll(adetList);
        tartC.getItems().addAll(adetList);
    }      

    public void comboKontrol(){
        int y=0, ic=0, s=0, t=0;
        getYanComboList();
        getYanUrunList();
        getYList();
        getIcecekComboList();
        getIcecekList();
        getiList();
        getAdetList();
        getSosComboList();
        getsList();
        getTatliComboList();
        gettList();
        BurgerMenuFactory yanUrunFactory = UrunSecim.getFactory(5);
        BurgerMenuFactory icecekFactory = UrunSecim.getFactory(4);
        BurgerMenuFactory sosFactory = UrunSecim.getFactory(3);
        BurgerMenuFactory tatliFactory = UrunSecim.getFactory(6);
        while (y<3){
            YanUrun yanUrun = yanUrunFactory.getYanUrun(y+1);
            if(yanComboList.get(y) == null||yanComboList.get(y).getValue() == yanUrunList.get(0)){
            }
            else if (yanComboList.get(y).getValue() == yanUrunList.get(1)) {
                yanUrun.boy(Boy.KUCUK);
                toplamFiyat += yanUrun.fiyat();
                toplamAlinan += yanUrunList.get(1) + " Boy " + yList.get(y) + "\n";
            }
            else if (yanComboList.get(y).getValue() == yanUrunList.get(2)){
                yanUrun.boy(Boy.ORTA);
                toplamFiyat += yanUrun.fiyat();
                toplamAlinan += yanUrunList.get(2) + " Boy " +yList.get(y) + "\n";
            }
            else if(yanComboList.get(y).getValue() == yanUrunList.get(3)){
                yanUrun.boy(Boy.BUYUK);
                toplamFiyat += yanUrun.fiyat();
                toplamAlinan += yanUrunList.get(3) + " Boy " + yList.get(y) + "\n";
            }
            y++;
        }
        while(ic<5){
            Icecek icecek = icecekFactory.getIcecek(ic+1);
            if(icecekComboList.get(ic) == null||icecekComboList.get(ic).getValue() == icecekList.get(0)){
            }
            else if(icecekComboList.get(ic).getValue() == icecekList.get(1)){
                icecek.litre(Litre.L_02);
                toplamFiyat += icecek.fiyat();
                toplamAlinan += icecekList.get(1) + " Litre " + iList.get(ic) + "\n";
            }
            else if(icecekComboList.get(ic).getValue() == icecekList.get(2)){
                icecek.litre(Litre.L_033);
                toplamFiyat += icecek.fiyat();
                toplamAlinan += icecekList.get(2) + " Litre " + iList.get(ic) + "\n";
            }
            else if(icecekComboList.get(ic).getValue() == icecekList.get(3)){
                icecek.litre(Litre.L_1);
                toplamFiyat += icecek.fiyat();
                toplamAlinan += icecekList.get(3) + " Litre " + iList.get(ic) + "\n";
            }
            ic++;
        }
        while(s<5){
            Sos sos = sosFactory.getSos(s+1);
            if(sosComboList.get(s) == null || sosComboList.get(s).getValue() == adetList.get(0)){
            }
            else if(sosComboList.get(s).getValue() == adetList.get(1)){
                sos.miktar(Miktar.BIRPAKET);
                toplamFiyat += sos.fiyat();
                toplamAlinan+= adetList.get(1) + sList.get(s) + "\n";
            }
            else if(sosComboList.get(s).getValue() == adetList.get(2)){
                sos.miktar(Miktar.BIRPAKET);
                toplamFiyat += sos.fiyat();
                toplamAlinan+= adetList.get(2) + sList.get(s) + "\n";
            }
            else if(sosComboList.get(s).getValue() == adetList.get(3)){
                sos.miktar(Miktar.BIRPAKET);
                toplamFiyat += sos.fiyat();
                toplamAlinan+= adetList.get(3) + sList.get(s) + "\n";
            }
            s++;
        }
        while (t<2){
            Tatli tatli = tatliFactory.getTatli(t+1);
            if(tatliComboList.get(t) == null || tatliComboList.get(t).getValue() == adetList.get(0)){
            }
            else if(tatliComboList.get(t).getValue() == adetList.get(1)){
                tatli.secim(Secim.BIR);
                toplamFiyat += tatli.fiyat();
                toplamAlinan += adetList.get(1) + tList.get(t) + "\n";
            }
            else if(tatliComboList.get(t).getValue() == adetList.get(2)){
                tatli.secim(Secim.BIR);
                toplamFiyat += tatli.fiyat();
                toplamAlinan += adetList.get(2) + tList.get(t) + "\n";
            }
            else if(tatliComboList.get(t).getValue() == adetList.get(3)){
                tatli.secim(Secim.BIR);
                toplamFiyat += tatli.fiyat();
                toplamAlinan += adetList.get(3) + tList.get(t) + "\n";
            }
            t++;
        }
    }
    public void stringBurger(){
        if(cKontrol == true){
           toplamAlinan += c+"-"+alinanC;
        }
        if (dKontrol == true){
            toplamAlinan += d+"-"+alinanD;
        }
        if(kKontrol == true){
            toplamAlinan += k+"-"+alinanK;
        }
        if(tKontrol == true){
            toplamAlinan += t+"-"+alinanT;
        }
    }
    @FXML
    public void ode(ActionEvent event){
        stringBurger();
        comboKontrol();
        urun.setDisable(true);
        burger.setDisable(true);
        menu.getSelectionModel().selectLast();
        odeme.setDisable(false);
        genel.setText(toplamAlinan);
        genel.setDisable(true);
        fiyat.setText(String.valueOf(toplamFiyat)+" TL");
    }

    public void cikis(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Satin Alma");
        alert.setHeaderText("Isleminiz Basari Ile Gerceklesti");
        alert.setContentText("Afiyet Olsun");
        alert.showAndWait();
        Platform.exit();
    }

}
