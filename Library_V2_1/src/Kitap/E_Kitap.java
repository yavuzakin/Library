/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kitap;

/**
 *
 * @author OGUZ
 */
public abstract class E_Kitap extends Kitap{
    
    private String baskıElek;
    private String Ozet;
    private String dil;

    public E_Kitap(String baskıElek, String dil, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean uygunluk) {
        super(kitap_adi, basim_tarihi, yayim_Evi, Url,uygunluk);
        this.baskıElek = baskıElek;
        this.dil = dil;
        Ozet = "";
    }

    public E_Kitap(String baskıElek, String dil, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url, boolean uygunluk, String AlaninAdi, String AlananinSoyadi, String Bolum, String Id, String Sifre,String TeslimTarihi) {
        super(kitap_adi, basim_tarihi, yayim_Evi, Url, uygunluk, AlaninAdi, AlananinSoyadi, Bolum, Id, Sifre,TeslimTarihi);
        this.baskıElek = baskıElek;
        this.Ozet = "";
        this.dil = dil;
    }

   

    public String getDil() {
        return dil;
    }

    public String getBaskıElek() {
        return baskıElek;
    }

    public String getOzet() {
        return Ozet;
    }

  

  

   

    
   
 
  

   
    
    
}
