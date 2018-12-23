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
public abstract class BasiliKitap extends Kitap{
    private String Hamur;
    private String baskı;
    private String size;

    public BasiliKitap(String Hamur, String baskı, String size, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean uygunluk) {
        super(kitap_adi, basim_tarihi, yayim_Evi, Url,uygunluk);
        this.Hamur = Hamur;
        this.baskı = baskı;
        this.size = size;
    }

    public BasiliKitap(String Hamur, String baskı, String size, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url, boolean uygunluk, String AlaninAdi, String AlananinSoyadi, String Bolum, String Id, String Sifre,String TeslimTarihi) {
        super(kitap_adi, basim_tarihi, yayim_Evi, Url, uygunluk, AlaninAdi, AlananinSoyadi, Bolum, Id, Sifre,TeslimTarihi);
        this.Hamur = Hamur;
        this.baskı = baskı;
        this.size = size;
    }

    
    

    public String getHamur() {
        return Hamur;
    }

    public String getBaskı() {
        return baskı;
    }

    public String getSize() {
        return size;
    }

    
  

    

  
 
  

    
  

    
    
    
}
