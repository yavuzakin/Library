/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kitap;

import Kullanici.Normal;

/**
 *
 * @author OGUZ
 */
public class Dergi extends E_Kitap{
    private String WebSayfasi;
    private String türDergi;
    private String editor;
    private String koordinator;
    private String sayi;
    private String yayımAralığı;

    public String getTürDergi() {
        return türDergi;
    }

    public String getEditor() {
        return editor;
    }

    public Dergi(String WebSayfasi,String türDergi, String editor, String koordinator, String sayi, String yayımAralığı, String baskıElek, String dil, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean uygunluk) {
        super(baskıElek, dil, kitap_adi, basim_tarihi, yayim_Evi, Url,uygunluk);
        this.türDergi = türDergi;
        this.editor = editor;
        this.koordinator = koordinator;
        this.sayi = sayi;
        this.yayımAralığı = yayımAralığı;
        this.WebSayfasi = WebSayfasi;
    }

    public Dergi(String WebSayfasi,String türDergi, String editor, String koordinator, String sayi, String yayımAralığı, String baskıElek, String dil, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url, boolean uygunluk, String AlaninAdi, String AlananinSoyadi, String Bolum, String Id, String Sifre,String TeslimTarihi) {
        super(baskıElek, dil, kitap_adi, basim_tarihi, yayim_Evi, Url, uygunluk, AlaninAdi, AlananinSoyadi, Bolum, Id, Sifre,TeslimTarihi);
        this.türDergi = türDergi;
        this.editor = editor;
        this.koordinator = koordinator;
        this.sayi = sayi;
        this.yayımAralığı = yayımAralığı;
        this.WebSayfasi = WebSayfasi;
        
    }

    public String getWebSayfasi() {
        return WebSayfasi;
    }

   
 @Override
    public void setOduncSuresi(int OduncSuresi) {
        super.setOduncSuresi(10); //To change body of generated methods, choose Tools | Templates.
    }
    public String getKoordinator() {
        return koordinator;
    }

    public String getSayi() {
        return sayi;
    }

    public String getYayımAralığı() {
        return yayımAralığı;
    }

    /*@Override
    public boolean KitapVer(String Ad, String SoyAd, String Bolum, String ID, String Sifre) {
        if (this.isUygun()) {
            int x = this.getOduncSuresi();
            this.kitapAlan = new KitapTeslim(Ad, SoyAd,Bolum,ID,Sifre);
            this.kitapAlan.setOduncSuresi(x);
             this.kitapAlan.tarihiayarla();
            super.uygun = false;
            return true;
        }
        return false;
    }*/

  

      @Override
    public boolean KitapAl() {
        if (this.isUygun() == false) {
           super.DeleteKitapAlan();
            this.uygun = true;
            return true;
        }
       return false;
       
    }

    @Override
    public boolean KitapVer(Normal KitabiAlan) {
       if (this.isUygun()) {
           this.setOduncSuresi(10);
            int x = this.getOduncSuresi();
            this.kitapAlan = KitabiAlan;
            this.kitapAlan.setOduncSuresi(x);
            this.kitapAlan.tarihiayarla();
            super.uygun = false;
            return true;
        }
        return false;
    }

    

   

   

    

   
    
    
}
