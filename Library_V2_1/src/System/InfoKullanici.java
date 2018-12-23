/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Kullanici.*;
import java.io.*;
import java.util.ArrayList;

public class InfoKullanici {
   
private static ArrayList<Admin> myAdmins = new ArrayList<>();
private static ArrayList<Normal> myUsers = new ArrayList<>();

   public static void Admin_Olustur() throws FileNotFoundException, IOException{
    /*myAdmins.add(new Admin("admin1", "1"));
    myAdmins.add(new Admin("admin2", "2"));
    myAdmins.add(new Admin("admin3", "3"));*/
    File f = new File("admins.txt");
    FileReader fr = new FileReader(f);
    BufferedReader read = new BufferedReader(fr);
    String x = "";
    x = read.readLine();
    while(x != null){
     String []bilgiler = x.split(" ");
     myAdmins.add(new Admin(bilgiler[0], bilgiler[1]));
        
     x = read.readLine();
    }
   }
   public static void AdminSifreDegis(String ID,String Sifre,String YeniSifre){
       
     for(int i = 0;i < myAdmins.size();i++){
    if (myAdmins.get(i).getKullanici_id().equals(ID) && myAdmins.get(i).getKullanici_parola().equals(Sifre)) {
        myAdmins.get(i).setKullanici_parola(YeniSifre);
    }
   
    
    
}  
       
   }

    public static ArrayList<Admin> getMyAdmins() {
        return myAdmins;
    }
   
public static void Admin_UserName_Degis(String User,String Sifre,String NewName){
for(int i = 0;i < myAdmins.size();i++){
    if (myAdmins.get(i).getKullanici_id().equals(User) && myAdmins.get(i).getKullanici_parola().equals(Sifre)) {
        myAdmins.get(i).setKullanici_id(NewName);
    }
   
    
    
}


}
    public static ArrayList<Normal> getMyUsers() {
        return myUsers;
    }
    
   public static void Kullanici_Olustur() throws FileNotFoundException, IOException{
  /* myUsers.add(new Normal("user1","1"));
   myUsers.add(new Normal("user2","2"));
   myUsers.add(new Normal("user3","3"));*/
  
         File f = new File("users.txt");
       FileReader fr = new FileReader(f);
       BufferedReader read = new BufferedReader(fr);
       String line = read.readLine();
       while(line != null){
           String []bilgiler = line.split(",");
           myUsers.add(new Normal(bilgiler[0], bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4]));
           line = read.readLine();
       
       
      
   }
   }
   
   
   
   public static void Kullanici_Ekle(String Ad,String Soyad,String Bolum ,String id,String Sifre) throws IOException{
     File f = new File("users.txt");
     FileWriter fr = new FileWriter(f, true);
     
   myUsers.add(new Normal(Ad, Soyad, Bolum, id, Sifre));
   fr.write(myUsers.get(myUsers.size()-1).getAlanınAdi() + "," + myUsers.get(myUsers.size()-1).getAlaninSoyadi() + "," + myUsers.get(myUsers.size()-1).getBolum() + "," + myUsers.get(myUsers.size()-1).getKullanici_id() + "," + myUsers.get(myUsers.size()-1).getKullanici_parola() + "\n");
   fr.close();
   }
   
   
   
   public static boolean Admin_Giris(String id,String Sifre){
    
       for (int i = 0; i < myAdmins.size(); i++) {
           if (myAdmins.get(i).getKullanici_id().equals(id) && myAdmins.get(i).getKullanici_parola().equals(Sifre)) {
               return true;
           }
       }
         
         return false;
     }
   
   
   public static boolean Kullanici_Giris(String id,String Sifre){
       for (int i = 0; i < myUsers.size(); i++) {
           if (myUsers.get(i).getKullanici_id().equals(id) && myUsers.get(i).getKullanici_parola().equals(Sifre)) {
               return true;
           }
   
       }
       return false;
   }
       
      public static Normal KitapAlmakİsteyeniDondur(String ID,String Sifre){
          for(Normal x : myUsers){
              if (x.Kiyasla(ID, Sifre)) {
                  return x;
              }
          }
          
          return null;
      } 
   public static void KullaniciSifreDegis(String Id,String Sifre,String YeniSifre){
       for (int i = 0; i < myUsers.size(); i++) {
           if (myUsers.get(i).getKullanici_id().equals(Id) && myUsers.get(i).getKullanici_parola().equals(Sifre)) {
               myUsers.get(i).setKullanici_parola(YeniSifre);
           }
       }
       
       
   }
      public static void KullaniciSil(Normal SilinecekKullanici) throws IOException{
      
      
          for (int i = 0; i < myUsers.size(); i++) {
              if (myUsers.get(i).equals(SilinecekKullanici)) {
                  myUsers.remove(myUsers.get(i));
              }
          }
  
          
      }
      
      public static ArrayList<Normal> IDileAra(String ID){
          ArrayList<Normal> x = new ArrayList<>();
        for(Normal temp : myUsers){
            if (temp.getKullanici_id().equals(ID)) {
                x.add(temp);
            }          
            
        }          
          return x;
          
      }   
      
      public static ArrayList<Normal> ADileAra(String AD){
          ArrayList<Normal> x = new ArrayList<>();
        for(Normal temp : myUsers){
            if (temp.getAlanınAdi().equalsIgnoreCase(AD)) {
                x.add(temp);
            }          
            
        }          
          return x;
          
      } 
      
       public static ArrayList<Normal> SOYADileAra(String SOYAD){
          ArrayList<Normal> x = new ArrayList<>();
        for(Normal temp : myUsers){
            if (temp.getAlaninSoyadi().equals(SOYAD)) {
                x.add(temp);
            }          
            
        }          
          return x;
          
      } 
      
       
        public static ArrayList<Normal> BOLUMileAra(String BOLUM){
          ArrayList<Normal> x = new ArrayList<>();
        for(Normal temp : myUsers){
            if (temp.getBolum().equals(BOLUM)) {
                x.add(temp);
            }          
            
        }          
          return x;
          
      } 
      
        public static boolean isIDExist(String ID){
            for (Normal x:myUsers) {
                if (x.getKullanici_id().equals(ID)) {
                    return true;
                }
            }
            
            return false;
        }
      
   }




 
 
 
 

