/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Kitap.*;
import Kullanici.Normal;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author OGUZ
 */
public class InfoKitap {
    private static ArrayList<Kitap> KitapListem = new ArrayList<Kitap>();
    
    public static void KitaplariOlustur() throws FileNotFoundException, IOException{
       File f = new File("books.txt");
       
       FileReader fr = new FileReader(f);
       BufferedReader read = new BufferedReader(fr);
       String x = read.readLine();
       while(x != null){
       String []bilgiler = x.split(",");
           if (bilgiler[0].equalsIgnoreCase("r")) {
               
               if (bilgiler[12].equalsIgnoreCase("false")) {
                   KitapListem.add(new Roman(bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6], bilgiler[7], bilgiler[8], bilgiler[9], bilgiler[10], bilgiler[11], false,bilgiler[13],bilgiler[14],bilgiler[15],bilgiler[16],bilgiler[17],bilgiler[18]));
                   
               }
               else{
                  
                  
                  KitapListem.add(new Roman(bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6], bilgiler[7], bilgiler[8], bilgiler[9], bilgiler[10], bilgiler[11], true));
                  
               }
           }
           else if(bilgiler[0].equals("a")){
              
               if(bilgiler[10].equalsIgnoreCase("true")){
                 KitapListem.add(new Ansiklopedi(bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6], bilgiler[7], bilgiler[8], bilgiler[9], true));  
              
               }
               else{
                KitapListem.add(new Ansiklopedi(bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6], bilgiler[7], bilgiler[8], bilgiler[9], false,bilgiler[11],bilgiler[12],bilgiler[13],bilgiler[14],bilgiler[15],bilgiler[16]));    
                    
               }
               
           }
           else if(bilgiler[0].equals("d")){
              
             if(bilgiler[13].equalsIgnoreCase("true")){
                 
                 KitapListem.add(new Dergi(bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6], bilgiler[7], bilgiler[8], bilgiler[9],bilgiler[10],bilgiler[11],bilgiler[12],true));
                 
             } 
             else{
                  
                KitapListem.add(new Dergi(bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6], bilgiler[7], bilgiler[8], bilgiler[9], bilgiler[10], bilgiler[11],bilgiler[12],false,bilgiler[14],bilgiler[15],bilgiler[16],bilgiler[17],bilgiler[18],bilgiler[19]));
             }
           }
           x = read.readLine();
       }
       
    }
 
    public InfoKitap() {
    }
    public static void KitapEkle(Kitap k){
        
        KitapListem.add(k);
        
    }

    public static int getKitapSize(){
        return KitapListem.size();
    }
    
    public static ArrayList<Roman>getRomans(){
    ArrayList<Roman> RomanListem = new ArrayList<Roman>();
    
       for(Kitap x : KitapListem){
           if (x instanceof Roman) {
               RomanListem.add((Roman) x);
           }
       }
        
       
        
        
       return RomanListem; 
    }
    
     public static ArrayList<BasiliKitap>getBasili(){
        ArrayList<BasiliKitap> a = new ArrayList<BasiliKitap>();
        
        for(Kitap x : KitapListem){
            if (x instanceof BasiliKitap) {
                a.add((BasiliKitap) x);
            }
        }
        return a;
     }
     
     public static ArrayList<E_Kitap> getEkitap(){
      ArrayList<E_Kitap> a = new ArrayList<E_Kitap>();
      
         for (Kitap x : KitapListem) {
             if (x instanceof E_Kitap) {
                 a.add((E_Kitap) x);
             }
         }
         
         return a;
     }
     
     public static ArrayList<Ansiklopedi> getAnsiklopedi(){
         ArrayList<Ansiklopedi> a = new ArrayList<Ansiklopedi>();
         
         for(Kitap x : KitapListem){
             
             if (x instanceof Ansiklopedi) {
                 a.add((Ansiklopedi) x);
             }
             
         }
         return a;
     }
   
     public static ArrayList<Dergi> getDergi(){
         
         ArrayList<Dergi> a = new ArrayList<Dergi>();
         
         for(Kitap x : KitapListem){
             
             if (x instanceof Dergi) {
                 a.add((Dergi) x);
             }
             
         }
         return a; 
         
     }

    public static ArrayList<Kitap> getKitapListem() {
        return KitapListem;
    }
    
    
   public static Kitap KitapAra(String kitapismi){
        for (Kitap x : KitapListem) {
            if (x.getKitap_adi().equalsIgnoreCase(kitapismi)) {
                return x;
            }
        }
        return null;
    }
    public static Kitap KitapAra(int id){
    for(Kitap x : KitapListem){
        if (x.getID() == id) {
            return x;
        }
    }    
        
    return null;    
    }
    
    public static boolean KitapSil(int Id){
        for(Kitap x : KitapListem){
            if (x.getID() == Id) {
                
                KitapListem.remove(x);
                return true;
            }
   
            
            
        }
        
        return false;
    }
    
    public static boolean KitapOduncVer(Kitap VerilecekKitap,Normal KitabiAlan){
        
        for (int i = 0; i < KitapListem.size(); i++) {
            if (KitapListem.get(i).equals(VerilecekKitap)) {
               if( KitapListem.get(i).KitapVer(KitabiAlan))
                   return true;
            }
    
            
        }
        
        return false;
        
    }
    public static boolean KitapGeriAl(Kitap VerilenKitap){
        
        for (int i = 0; i < KitapListem.size(); i++) {
            if (KitapListem.get(i).equals(VerilenKitap)) {
                if (KitapListem.get(i).KitapAl()) {
                  return true;  
                }
            }
        }
    
      return false;  
    }
   
    public static ArrayList<Kitap> getOduncVerilen(String ID,String Sifre){
        ArrayList<Kitap>x = new ArrayList<Kitap>();
        for (int i = 0; i < KitapListem.size(); i++) {
            if (KitapListem.get(i).isUygun() == false) {
                if (KitapListem.get(i).getKitapAlan().Kiyasla(ID, Sifre)) {
                    x.add(KitapListem.get(i));
                }
            }
    
            
        }
        
        return x;
    }
}
