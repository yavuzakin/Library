/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARAYUZLER;

import ARAYUZLER.Kullanici_GUI;
import Kitap.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
public class DahaFazla extends javax.swing.JFrame {

     Dergi adres;
    public DahaFazla(Kitap x) {
        initComponents();
        tAOzet.setVisible(false);
        jLabel2.setVisible(false);
        panelOzet.setVisible(false);
        jpanelTeslimTarihi.setVisible(false);
        panelicon.setVisible(false);
        panelOKU.setVisible(false);
       decide(x);
       
        
    }

    
   public void decide(Kitap x){
       String id = Integer.toString(x.getID());
       PanelKitap.setVisible(true);
        KitapTurleri.setVisible(true);
        HangiTur.setVisible(true);
       
            panelicon.setVisible(true);
            
        
        if (x.getKitapAlan() != null && x.getKitapAlan().getTeslimTarihi().equals("") == false) {
           jpanelTeslimTarihi.setVisible(true);
           tfTeslimTarihi.setText(x.getKitapAlan().getTeslimTarihi());
       }
        
          if (x.isUygun()) {
               tfUygunluk.setText("Yes, This book can be borrowed.");
               
           }
           else{
               tfUygunluk.setText("No, This book has already borrowed !!");
               
           }
       if (x instanceof Roman) {
           lblicon.setIcon(x.getKapak_resmi());
           if (((Roman) x).getOzet().equals("")) {
             panelOzet.setVisible(false);
           }
           else{
               panelOzet.setVisible(true);
           }
        PanelBasili.setVisible(true);
        panelElektronik.setVisible(false);
        HangiTur.setVisible(true);
        panelRoman.setVisible(true);
        panelAnsiklopedi.setVisible(false);
        panelDergi.setVisible(false);
        tfKitapID.setText(id);
        tfAd.setText(x.getKitap_adi());
        tfBasiTarihi.setText(x.getBasim_tarihi());
        tfYayinEvi.setText(x.getYayim_Evi());
        tfHamur.setText(((Roman) x).getHamur());
        tfBaski.setText(((Roman) x).getBaskı());
        tfSize.setText(((Roman) x).getSize());
        tfTür.setText(((Roman) x).getTür());
        tfYasAraligi.setText(((Roman) x).getYaşAralığı());
        tfAkim.setText(((Roman) x).getEtkilendiğiAkım());
        tfYazar.setText(((Roman) x).getYazar());
        tAOzet.setText(((Roman) x).getOzet());
         
          tAOzet.setText(((Roman) x).getOzet());
       }
       else if(x instanceof Dergi){
           lblicon.setIcon(x.getKapak_resmi());
           panelOKU.setVisible(true);
           adres = (Dergi) x;
           if (((Dergi) x).getOzet().equals("")) {
             panelOzet.setVisible(false);
           }
           else{
               panelOzet.setVisible(true);
           }
        
        KitapTurleri.setVisible(true);
        panelDergi.setVisible(true);
        panelElektronik.setVisible(true);
        PanelBasili.setVisible(false);
        panelRoman.setVisible(false);
        panelAnsiklopedi.setVisible(false);
           tfKitapID.setText(id);
       tfYayinEvi.setText(x.getYayim_Evi());
       tfBasiTarihi.setText(x.getBasim_tarihi());
       tfAd.setText(x.getKitap_adi());
       tfDil.setText(((Dergi) x).getDil());
       tfBaski2.setText(((Dergi) x).getBaskıElek());
       tAOzet.setText(((Dergi) x).getOzet());
       tfTür1.setText(((Dergi) x).getTürDergi());
       tfEditor.setText(((Dergi) x).getEditor());
       tfKordinator.setText(((Dergi) x).getKoordinator());
       tfSayi.setText(((Dergi) x).getSayi());
       tfYayimAraligi.setText(((Dergi) x).getYayımAralığı());
       tAOzet.setText(((Dergi) x).getOzet());
        
       }
       else if(x instanceof Ansiklopedi){
           lblicon.setIcon(x.getKapak_resmi());
       PanelBasili.setVisible(true);
       panelAnsiklopedi.setVisible(true);
       panelRoman.setVisible(false);
       panelDergi.setVisible(false);
       panelElektronik.setVisible(false);
          
       tfKitapID.setText(id);
       tfYayinEvi.setText(x.getYayim_Evi());
       tfBasiTarihi.setText(x.getBasim_tarihi());
       tfAd.setText(x.getKitap_adi());
       tfHamur.setText(((Ansiklopedi) x).getHamur());
       tfBaski.setText(((Ansiklopedi) x).getBaskı());
       tfSize.setText(((Ansiklopedi) x).getSize());
       tfKonu.setText(((Ansiklopedi) x).getKonu());
       tfDagitici.setText(((Ansiklopedi) x).getContributors());
       
       }
       
       
   }

   public void clear(){
       
       
       
       
       
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelKitap = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfAd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfYayinEvi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBasiTarihi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfUygunluk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfKitapID = new javax.swing.JTextField();
        KitapTurleri = new javax.swing.JPanel();
        PanelBasili = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfHamur = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfBaski = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        panelElektronik = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tfBaski2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfDil = new javax.swing.JTextField();
        HangiTur = new javax.swing.JPanel();
        panelDergi = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tfKordinator = new javax.swing.JTextField();
        tfSayi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfYayimAraligi = new javax.swing.JTextField();
        tfTür1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfEditor = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        panelAnsiklopedi = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfKonu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfDagitici = new javax.swing.JTextField();
        panelRoman = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfTür = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfYasAraligi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfAkim = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfYazar = new javax.swing.JTextField();
        btnCık = new javax.swing.JButton();
        panelOzet = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAOzet = new javax.swing.JTextArea();
        jpanelTeslimTarihi = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tfTeslimTarihi = new javax.swing.JTextField();
        panelicon = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        panelOKU = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 611));
        jPanel1.setLayout(null);

        PanelKitap.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("BOOK NAME :");

        tfAd.setEditable(false);
        tfAd.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("PUBLISHER :");

        tfYayinEvi.setEditable(false);
        tfYayinEvi.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("PUBLISH DATE :");

        tfBasiTarihi.setEditable(false);
        tfBasiTarihi.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("AVAILABLE ? :");

        tfUygunluk.setEditable(false);
        tfUygunluk.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("BOOK ID :");

        tfKitapID.setEditable(false);
        tfKitapID.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        javax.swing.GroupLayout PanelKitapLayout = new javax.swing.GroupLayout(PanelKitap);
        PanelKitap.setLayout(PanelKitapLayout);
        PanelKitapLayout.setHorizontalGroup(
            PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelKitapLayout.createSequentialGroup()
                        .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelKitapLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUygunluk, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfBasiTarihi, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfYayinEvi, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfKitapID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(tfAd, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKitapLayout.setVerticalGroup(
            PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKitapID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYayinEvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBasiTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUygunluk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel1.add(PanelKitap);
        PanelKitap.setBounds(10, 11, 400, 197);

        KitapTurleri.setOpaque(false);
        KitapTurleri.setLayout(new java.awt.CardLayout());

        PanelBasili.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("DOUGH :");

        tfHamur.setEditable(false);
        tfHamur.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tfHamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHamurActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("PRINT :");

        tfBaski.setEditable(false);
        tfBaski.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("SIZE :");

        tfSize.setEditable(false);
        tfSize.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tfSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBasiliLayout = new javax.swing.GroupLayout(PanelBasili);
        PanelBasili.setLayout(PanelBasiliLayout);
        PanelBasiliLayout.setHorizontalGroup(
            PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBasiliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBasiliLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(tfBaski))
                    .addGroup(PanelBasiliLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(tfHamur, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBasiliLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(tfSize)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        PanelBasiliLayout.setVerticalGroup(
            PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBasiliLayout.createSequentialGroup()
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBaski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        KitapTurleri.add(PanelBasili, "card2");

        panelElektronik.setOpaque(false);

        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel22.setText("PRINTING :");

        tfBaski2.setEditable(false);
        tfBaski2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("LANGUAGE :");

        tfDil.setEditable(false);
        tfDil.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelElektronikLayout = new javax.swing.GroupLayout(panelElektronik);
        panelElektronik.setLayout(panelElektronikLayout);
        panelElektronikLayout.setHorizontalGroup(
            panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElektronikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBaski2)
                    .addComponent(tfDil, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(0, 251, Short.MAX_VALUE))
        );
        panelElektronikLayout.setVerticalGroup(
            panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElektronikLayout.createSequentialGroup()
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBaski2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        KitapTurleri.add(panelElektronik, "card3");

        jPanel1.add(KitapTurleri);
        KitapTurleri.setBounds(10, 208, 639, 116);

        HangiTur.setOpaque(false);
        HangiTur.setLayout(new java.awt.CardLayout());

        panelDergi.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel19.setText("COORDINATOR :");

        tfKordinator.setEditable(false);
        tfKordinator.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        tfSayi.setEditable(false);
        tfSayi.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel20.setText("NUMBER");

        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel21.setText("RANGE :");

        tfYayimAraligi.setEditable(false);
        tfYayimAraligi.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        tfTür1.setEditable(false);
        tfTür1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel18.setText("TYPE :");

        tfEditor.setEditable(false);
        tfEditor.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel23.setText("EDITOR :");

        javax.swing.GroupLayout panelDergiLayout = new javax.swing.GroupLayout(panelDergi);
        panelDergi.setLayout(panelDergiLayout);
        panelDergiLayout.setHorizontalGroup(
            panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDergiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(tfEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDergiLayout.createSequentialGroup()
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfYayimAraligi, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(tfKordinator)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDergiLayout.createSequentialGroup()
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSayi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDergiLayout.createSequentialGroup()
                                .addComponent(tfTür1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGap(43, 43, 43))
        );
        panelDergiLayout.setVerticalGroup(
            panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDergiLayout.createSequentialGroup()
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYayimAraligi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKordinator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTür1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        HangiTur.add(panelDergi, "card4");

        panelAnsiklopedi.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel16.setText("SUBJECT :");

        tfKonu.setEditable(false);
        tfKonu.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel17.setText("DISTRIBUTOR :");

        tfDagitici.setEditable(false);
        tfDagitici.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelAnsiklopediLayout = new javax.swing.GroupLayout(panelAnsiklopedi);
        panelAnsiklopedi.setLayout(panelAnsiklopediLayout);
        panelAnsiklopediLayout.setHorizontalGroup(
            panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnsiklopediLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDagitici, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(tfKonu))
                .addGap(43, 43, 43))
        );
        panelAnsiklopediLayout.setVerticalGroup(
            panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnsiklopediLayout.createSequentialGroup()
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDagitici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        HangiTur.add(panelAnsiklopedi, "card3");

        panelRoman.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("TYPE :");

        tfTür.setEditable(false);
        tfTür.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tfTür.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTürActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setText("AGE RANGE :");

        tfYasAraligi.setEditable(false);
        tfYasAraligi.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel14.setText("Influenced Current :");

        tfAkim.setEditable(false);
        tfAkim.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel15.setText("AUTHOR :");

        tfYazar.setEditable(false);
        tfYazar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tfYazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfYazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRomanLayout = new javax.swing.GroupLayout(panelRoman);
        panelRoman.setLayout(panelRomanLayout);
        panelRomanLayout.setHorizontalGroup(
            panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRomanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRomanLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(tfTür, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRomanLayout.createSequentialGroup()
                        .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(15, 15, 15)
                        .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfYazar)
                            .addComponent(tfYasAraligi)
                            .addComponent(tfAkim))))
                .addGap(43, 43, 43))
        );
        panelRomanLayout.setVerticalGroup(
            panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRomanLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTür, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYasAraligi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAkim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        HangiTur.add(panelRoman, "card2");

        jPanel1.add(HangiTur);
        HangiTur.setBounds(10, 330, 429, 201);

        btnCık.setBackground(new java.awt.Color(0, 155, 167));
        btnCık.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnCık.setText("EXIT");
        btnCık.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCıkActionPerformed(evt);
            }
        });
        jPanel1.add(btnCık);
        btnCık.setBounds(520, 370, 164, 37);

        panelOzet.setOpaque(false);
        panelOzet.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OZET");

        tAOzet.setEditable(false);
        tAOzet.setColumns(20);
        tAOzet.setRows(5);
        jScrollPane1.setViewportView(tAOzet);

        javax.swing.GroupLayout panelOzetLayout = new javax.swing.GroupLayout(panelOzet);
        panelOzet.setLayout(panelOzetLayout);
        panelOzetLayout.setHorizontalGroup(
            panelOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOzetLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelOzetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelOzetLayout.setVerticalGroup(
            panelOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOzetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelOzet);
        panelOzet.setBounds(460, 0, 0, 10);

        jpanelTeslimTarihi.setOpaque(false);

        jLabel24.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel24.setText("DELIVERY DATE :");

        tfTeslimTarihi.setEditable(false);
        tfTeslimTarihi.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpanelTeslimTarihiLayout = new javax.swing.GroupLayout(jpanelTeslimTarihi);
        jpanelTeslimTarihi.setLayout(jpanelTeslimTarihiLayout);
        jpanelTeslimTarihiLayout.setHorizontalGroup(
            jpanelTeslimTarihiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTeslimTarihiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(tfTeslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpanelTeslimTarihiLayout.setVerticalGroup(
            jpanelTeslimTarihiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTeslimTarihiLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpanelTeslimTarihiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTeslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel1.add(jpanelTeslimTarihi);
        jpanelTeslimTarihi.setBounds(10, 510, 426, 59);

        panelicon.setOpaque(false);

        javax.swing.GroupLayout paneliconLayout = new javax.swing.GroupLayout(panelicon);
        panelicon.setLayout(paneliconLayout);
        paneliconLayout.setHorizontalGroup(
            paneliconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        paneliconLayout.setVerticalGroup(
            paneliconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneliconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        );

        jPanel1.add(panelicon);
        panelicon.setBounds(490, 30, 247, 229);

        panelOKU.setOpaque(false);

        jButton1.setBackground(new java.awt.Color(0, 155, 167));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setText("READ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOKULayout = new javax.swing.GroupLayout(panelOKU);
        panelOKU.setLayout(panelOKULayout);
        panelOKULayout.setHorizontalGroup(
            panelOKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelOKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOKULayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelOKULayout.setVerticalGroup(
            panelOKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(panelOKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOKULayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        jPanel1.add(panelOKU);
        panelOKU.setBounds(522, 298, 160, 60);

        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/Webp.net-resizeimage.jpg"))); // NOI18N
        jPanel1.add(lblBackGround);
        lblBackGround.setBounds(0, 0, 790, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfHamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHamurActionPerformed

    private void tfSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSizeActionPerformed

    private void tfYazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfYazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfYazarActionPerformed

    private void btnCıkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCıkActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCıkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String web = adres.getWebSayfasi();
    Desktop d = Desktop.getDesktop();
    
         try {
             d.browse(new URI(web));
         } catch (URISyntaxException ex) {
             Logger.getLogger(DahaFazla.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(DahaFazla.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfTürActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTürActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTürActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HangiTur;
    private javax.swing.JPanel KitapTurleri;
    private javax.swing.JPanel PanelBasili;
    private javax.swing.JPanel PanelKitap;
    private javax.swing.JButton btnCık;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelTeslimTarihi;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblicon;
    private javax.swing.JPanel panelAnsiklopedi;
    private javax.swing.JPanel panelDergi;
    private javax.swing.JPanel panelElektronik;
    private javax.swing.JPanel panelOKU;
    private javax.swing.JPanel panelOzet;
    private javax.swing.JPanel panelRoman;
    private javax.swing.JPanel panelicon;
    private javax.swing.JTextArea tAOzet;
    private javax.swing.JTextField tfAd;
    private javax.swing.JTextField tfAkim;
    private javax.swing.JTextField tfBasiTarihi;
    private javax.swing.JTextField tfBaski;
    private javax.swing.JTextField tfBaski2;
    private javax.swing.JTextField tfDagitici;
    private javax.swing.JTextField tfDil;
    private javax.swing.JTextField tfEditor;
    private javax.swing.JTextField tfHamur;
    private javax.swing.JTextField tfKitapID;
    private javax.swing.JTextField tfKonu;
    private javax.swing.JTextField tfKordinator;
    private javax.swing.JTextField tfSayi;
    private javax.swing.JTextField tfSize;
    private javax.swing.JTextField tfTeslimTarihi;
    private javax.swing.JTextField tfTür;
    private javax.swing.JTextField tfTür1;
    private javax.swing.JTextField tfUygunluk;
    private javax.swing.JTextField tfYasAraligi;
    private javax.swing.JTextField tfYayimAraligi;
    private javax.swing.JTextField tfYayinEvi;
    private javax.swing.JTextField tfYazar;
    // End of variables declaration//GEN-END:variables
}
