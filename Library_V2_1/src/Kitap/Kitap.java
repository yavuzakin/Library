/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kitap;

import javax.swing.ImageIcon;
import ARAYUZLER.DahaFazla;
import InterFace.KitapOdunc;
import Kullanici.Normal;

public abstract class Kitap implements KitapOdunc{
    public static int Kitapid = 100;
    protected int LastUsedid;
   protected String kitap_adi;
   protected String basim_tarihi;
   protected String yayim_Evi;
  protected Normal kitapAlan;
  protected String Url;
   ImageIcon kapak_resmi;
   protected boolean uygun;
   protected int OduncSuresi = 0;

    public int getOduncSuresi() {
        return OduncSuresi;
    }

    public String getUrl() {
        return Url;
    }

    public void setOduncSuresi(int OduncSuresi) {
        this.OduncSuresi = OduncSuresi;
    }

    public Normal getKitapAlan() {
        return kitapAlan;
    }

    public ImageIcon getKapak_resmi() {
        return kapak_resmi;
    }

    

    public void DeleteKitapAlan() {
        this.kitapAlan = null;
    }

    public Kitap(String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean  uygunluk) {
        this.kitap_adi = kitap_adi;
        this.basim_tarihi = basim_tarihi;
        this.yayim_Evi = yayim_Evi;
        this.Url = Url;
        
         uygun = uygunluk;
        LastUsedid = Kitapid;
        Kitapid++;
         
         kapak_resmi = new ImageIcon(getClass().getResource("/resimler/" +Url + ".jpg"));

      //  kapak_resmi = new ImageIcon(getClass().getResource(this.Url));
        
        
    }

   public Kitap(String kitap_adi, String basim_tarihi, String yayim_Evi, String Url,boolean  uygunluk,String AlaninAdi,String AlananinSoyadi,String Bolum,String Id,String Sifre,String TeslimTarihi) {
        this.kitap_adi = kitap_adi;
        this.basim_tarihi = basim_tarihi;
        this.yayim_Evi = yayim_Evi;
        this.Url = Url;
         uygun = false;
         
        LastUsedid = Kitapid;
        Kitapid++;
      
       kapak_resmi = new ImageIcon(getClass().getResource("/resimler/" +Url + ".jpg"));
        kitapAlan = new Normal(AlaninAdi, AlananinSoyadi, Bolum, Id, Sifre,TeslimTarihi);
    }

   

   

    public boolean isUygun() {
        return uygun;
    }

  

    
 
    public String getKitap_adi() {
        return kitap_adi;
    }

    public int getID() {
        return LastUsedid;
    }

    public String getBasim_tarihi() {
        return basim_tarihi;
    }

    public String getYayim_Evi() {
        return yayim_Evi;
    }

  

   

   
           
   
}
