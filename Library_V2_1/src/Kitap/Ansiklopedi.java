
package Kitap;

import Kullanici.Normal;


public class Ansiklopedi extends BasiliKitap{
   private String konu;
    private String contributors;

     @Override
    public void setOduncSuresi(int OduncSuresi) {
        super.setOduncSuresi(20); //To change body of generated methods, choose Tools | Templates.
    }
    public String getKonu() {
        return konu;
    }

    public Ansiklopedi(String konu, String contributors, String Hamur, String baskı, String size, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean uygunluk) {
        super(Hamur, baskı, size, kitap_adi, basim_tarihi, yayim_Evi, Url,uygunluk);
        this.konu = konu;
        this.contributors = contributors;
    }

    public Ansiklopedi(String konu, String contributors, String Hamur, String baskı, String size, String kitap_adi, String basim_tarihi, String yayim_Evi, String Url, boolean uygunluk, String AlaninAdi, String AlananinSoyadi, String Bolum, String Id, String Sifre,String TeslimTarihi) {
        super(Hamur, baskı, size, kitap_adi, basim_tarihi, yayim_Evi, Url, uygunluk, AlaninAdi, AlananinSoyadi, Bolum, Id, Sifre,TeslimTarihi);
        this.konu = konu;
        this.contributors = contributors;
    }

   

    public String getContributors() {
        return contributors;
    }

   /* @Override
    public boolean KitapVer(Normal KitabiAlan) {
         if (this.isUygun()) {
            int x = this.getOduncSuresi();
            this.kitapAlan = KitabiAlan;
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
             this.setOduncSuresi(12);
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

  

   

   

 
  


    

