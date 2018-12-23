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
public class Roman extends BasiliKitap {
    private String tür;
    private String yaşAralığı;
    private String etkilendiğiAkım;
    private String ozet;
    private String yazar;
    
    

    @Override
    public void setOduncSuresi(int OduncSuresi) {
        super.setOduncSuresi(15); 
    }
   
    public String getTür() {
        return tür;
    }

    public String getYazar() {
        return yazar;
    }

    public Roman(String tür, String yaşAralığı, String etkilendiğiAkım, String yazar, String Hamur, String baskı, String size, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean uygunluk) {
        super(Hamur, baskı, size, kitap_adi, basim_tarihi, yayim_Evi, Url,uygunluk);
        this.tür = tür;
        this.yaşAralığı = yaşAralığı;
        this.etkilendiğiAkım = etkilendiğiAkım;
        this.yazar = yazar;
        this.ozet = "";
    }

    public Roman(String tür, String yaşAralığı, String etkilendiğiAkım, String yazar, String Hamur, String baskı, String size, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url, boolean uygunluk, String AlaninAdi, String AlananinSoyadi, String Bolum, String Id, String Sifre,String TeslimTarihi) {
        super(Hamur, baskı, size, kitap_adi, basim_tarihi, yayim_Evi, Url, uygunluk, AlaninAdi, AlananinSoyadi, Bolum, Id, Sifre,TeslimTarihi);
        this.tür = tür;
        this.yaşAralığı = yaşAralığı;
        this.etkilendiğiAkım = etkilendiğiAkım;
        this.yazar = yazar;
        ozet = "";
    }

   

    public String getYaşAralığı() {
        return yaşAralığı;
    }

    public String getEtkilendiğiAkım() {
        return etkilendiğiAkım;
    }

    public String getOzet() {
        return ozet;
    }

    @Override
    public boolean KitapAl() {
        if (this.isUygun() == false) {
           super.DeleteKitapAlan();
            this.uygun = true;
            return true;
        }
       return false;
       
    }

    
   /* @Override
    public boolean KitapVer(String Ad, String SoyAd, String Bolum, String ID, String Sifre) {
        if (this.isUygun()) {
            this.setOduncSuresi(15);
            int x = this.getOduncSuresi();
            this.kitapAlan = new KitapTeslim(Ad, SoyAd,Bolum,ID,Sifre);
            this.kitapAlan.setOduncSuresi(x);
            this.kitapAlan.tarihiayarla();
            super.uygun = false;
            return true;
        }
        return false;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public boolean KitapVer(Normal KitabiAlan) {
        if (this.isUygun()) {
            this.setOduncSuresi(15);
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
