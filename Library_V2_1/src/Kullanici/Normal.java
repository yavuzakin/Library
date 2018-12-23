/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kullanici;

/**
 *
 * @author OGUZ
 */
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Normal extends Kullanicilar{
    
     private Date now = new Date();
    long oneDayLongValue = 1000 * 60 * 60 * 24;
    private Date TeslimGünü;
    SimpleDateFormat df = new SimpleDateFormat("dd/M/yyyy");
    
    
    private String AlanınAdi;
    private String AlaninSoyadi;
    private String Bolum;
    private String TeslimTarihi;
     private int oduncSuresi = 0; 
     public void setOduncSuresi(int oduncSuresi) {
        this.oduncSuresi = oduncSuresi;
    }

    public Normal(String AlanınAdi, String AlaninSoyadi, String Bolum, String kullanici_id, String kullanici_parola) {
        super(kullanici_id, kullanici_parola);
        this.AlanınAdi = AlanınAdi;
        this.AlaninSoyadi = AlaninSoyadi;
        this.Bolum = Bolum;
        
        
    }
     public Normal(String AlanınAdi, String AlaninSoyadi, String Bolum, String kullanici_id, String kullanici_parola,String TesliGunu) {
        super(kullanici_id, kullanici_parola);
        this.AlanınAdi = AlanınAdi;
        this.AlaninSoyadi = AlaninSoyadi;
        this.Bolum = Bolum;
        this.TeslimTarihi = TesliGunu;
        
    }

    public String getAlanınAdi() {
        return AlanınAdi;
    }

    public String getAlaninSoyadi() {
        return AlaninSoyadi;
    }

    public String getBolum() {
        return Bolum;
    }

    public String getKullanici_id() {
        return kullanici_id;
    }

    public String getKullanici_parola() {
        return kullanici_parola;
    }

   
    
    
    public void tarihiayarla(){
         TeslimGünü = new Date(now.getTime() + this.oduncSuresi * oneDayLongValue);
        
        System.out.println(df.format(TeslimGünü));
        TeslimTarihi = df.format(TeslimGünü);
    }
    

    

    public void setKullanici_parola(String kullanici_parola) {
        this.kullanici_parola = kullanici_parola;
    }
    
    public void sifre_degis(String yeniSifre){
     this.kullanici_parola = yeniSifre;
        
    }

    public boolean Kiyasla(String ID,String Sifre){
       
        
        if (this.kullanici_id.equals(ID) && this.kullanici_parola.equals(Sifre)) {
            return true;
        }
         return false;
    }

    public String getTeslimTarihi() {
        return TeslimTarihi;
    }
    
    
}
