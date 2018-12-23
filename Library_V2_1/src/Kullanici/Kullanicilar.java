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
public class Kullanicilar {
   protected String kullanici_id;
   protected String kullanici_parola;

    public Kullanicilar(String kullanici_id, String kullanici_parola) {
        this.kullanici_id = kullanici_id;
        this.kullanici_parola = kullanici_parola;
    }

    public Kullanicilar() {
        kullanici_id = "";
        kullanici_parola = "";
    }
   
   
}
