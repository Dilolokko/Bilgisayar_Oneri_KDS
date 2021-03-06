/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilgisayaroneri;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dilolokko
 */
public class Acilis extends javax.swing.JFrame {

    /**
     * Creates new form Acilis
     */
    public Acilis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_yas = new javax.swing.JTextField();
        combo_tur = new javax.swing.JComboBox();
        combo_kullanim = new javax.swing.JComboBox();
        combo_hız = new javax.swing.JComboBox();
        combo_alan = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_veriler = new javax.swing.JTextArea();
        btn_ekle = new javax.swing.JButton();
        btn_sifirla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_sonuc = new javax.swing.JTextArea();
        btn_degerlendir = new javax.swing.JButton();
        btn_kaydet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bilgisayar Fiyat Öneri Sistemi");

        jTabbedPane1.setName(""); // NOI18N

        jLabel1.setText("Kullanıcı Yaşı");

        jLabel2.setText("Tür");

        jLabel3.setText("Kullanım Miktarı");

        jLabel4.setText("Hızı");

        jLabel5.setText("Kullanım Alanı");

        txt_yas.setText("20");

        combo_tur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masaüstü", "Laptop" }));

        combo_kullanim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Çok Fazla", "Fazla", "Normal", "Az", "Çok Az" }));

        combo_hız.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Çok Hızlı", "Hızlı", "Normal", "Yavaş", "Çok Yavaş" }));

        combo_alan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kişisel", "İş", "Kişisel & İş" }));

        txt_veriler.setEditable(false);
        txt_veriler.setColumns(20);
        txt_veriler.setRows(5);
        jScrollPane1.setViewportView(txt_veriler);

        btn_ekle.setText("Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        btn_sifirla.setText("Sıfırla");
        btn_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifirlaActionPerformed(evt);
            }
        });

        jLabel6.setText("Değerlendirme kısmındaki değerlendir butonunun aktifleşmesi için ilk önce veri girişi yapılması gerekmektedir.");

        jLabel7.setText("Kaydet butonunun aktifleşmesi için ise bir değerlendirme işlemi yapılması gerekmektedir.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sifirla, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                            .addComponent(txt_yas)
                            .addComponent(combo_tur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_kullanim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_hız, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_alan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_tur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_kullanim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_hız, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_alan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ekle)
                            .addComponent(btn_sifirla))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Veri Girişi", jPanel1);

        txt_sonuc.setEditable(false);
        txt_sonuc.setColumns(20);
        txt_sonuc.setRows(5);
        jScrollPane2.setViewportView(txt_sonuc);

        btn_degerlendir.setText("Değerlendir");
        btn_degerlendir.setEnabled(false);
        btn_degerlendir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_degerlendirActionPerformed(evt);
            }
        });

        btn_kaydet.setText("Kaydet");
        btn_kaydet.setEnabled(false);
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_degerlendir, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_degerlendir, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btn_kaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Değerlendirme", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<model> veriler = new ArrayList<model>();
    String[] sonuclar;
    int sayac=1;
    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        // TODO add your handling code here:
        try{
            if(0 < (Integer.parseInt(txt_yas.getText().toString()))){
                model veri = new model();
                veri.setYas(txt_yas.getText().toString());
                veri.setHız(combo_hız.getSelectedItem().toString());
                veri.setKullanim(combo_kullanim.getSelectedItem().toString());
                veri.setTur(combo_tur.getSelectedItem().toString());
                veri.setAlan(combo_alan.getSelectedItem().toString());
                veriler.add(veri);
                txt_veriler.setText(txt_veriler.getText().toString()+String.valueOf(this.sayac)+"-) "+veri.getYas()+"  "+veri.getTur()+"  "+veri.getKullanim()+"  "+veri.getHız()+"  "+veri.getAlan()+"\n\n");
                sayac++;
                btn_degerlendir.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Girmiş olduğunuz yaş değeri yanlış, lütfen kontrol ediniz.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Girmiş olduğunuz yaş değeri yanlış, lütfen kontrol ediniz.");
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifirlaActionPerformed
        // TODO add your handling code here:
        sifirla();
    }//GEN-LAST:event_btn_sifirlaActionPerformed

    private void btn_degerlendirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_degerlendirActionPerformed
        // TODO add your handling code here:
        txt_sonuc.setText("");
        Hesapla hesapla = new Hesapla();
        int i = 0;
        String[] dizi = new String[this.veriler.size()];
        for(model veri : this.veriler){
          txt_sonuc.setText(txt_sonuc.getText().toString()+String.valueOf(i+1)+"-) "+veri.getYas()+"  "+veri.getTur()+"  "+veri.getKullanim()+"  "+veri.getHız()+"  "+veri.getAlan()+"  :  "+hesapla.sonuc(veri)+"\n\n");
          dizi[i] = hesapla.sonuc(veri);
          i++;
        }
        this.sonuclar = dizi;
        btn_kaydet.setEnabled(true);
    }//GEN-LAST:event_btn_degerlendirActionPerformed

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        // TODO add your handling code here:
        try{
            JsonOlustur json = new JsonOlustur(this.veriler,this.sonuclar);
            JOptionPane.showMessageDialog(null, "Değerlendirme sonuçlarınız Veriler.json adlı dosya içersinde masaüstünüze kayıt edildi.");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Json verileri şimdilik sadece linux sistemler için üretiyoruz. Diger sistemlere gelecek güncellemelerle destek sağlayacağız.");
        }
    }//GEN-LAST:event_btn_kaydetActionPerformed
    public void sifirla(){
        int gecici = 20;
        this.sayac = 1;
        txt_yas.setText(String.valueOf(gecici));
        combo_hız.setSelectedIndex(0);
        combo_alan.setSelectedIndex(0);
        combo_tur.setSelectedIndex(0);
        combo_kullanim.setSelectedIndex(0);
        List<model> veriler = new ArrayList<model>();
        this.veriler = veriler;
        btn_degerlendir.setEnabled(false);
        btn_kaydet.setEnabled(false);
        txt_veriler.setText("");
        txt_sonuc.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acilis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_degerlendir;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_sifirla;
    private javax.swing.JComboBox combo_alan;
    private javax.swing.JComboBox combo_hız;
    private javax.swing.JComboBox combo_kullanim;
    private javax.swing.JComboBox combo_tur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txt_sonuc;
    private javax.swing.JTextArea txt_veriler;
    private javax.swing.JTextField txt_yas;
    // End of variables declaration//GEN-END:variables
}
