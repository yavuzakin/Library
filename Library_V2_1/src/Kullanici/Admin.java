
package Kullanici;

public class Admin extends Kullanicilar{

    public Admin(String kullanici_id, String kullanici_parola) {
        super(kullanici_id, kullanici_parola);
    }

    public String getKullanici_id() {
        return kullanici_id;
    }

    public String getKullanici_parola() {
        return kullanici_parola;
    }

    public void setKullanici_id(String kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public void setKullanici_parola(String kullanici_parola) {
        this.kullanici_parola = kullanici_parola;
    }
    
    
}
