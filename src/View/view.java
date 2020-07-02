/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Vafe
 */
import Controller.Control;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.Perusahaan;


public class view extends javax.swing.JFrame {

   Control control;
   
    public view() throws SQLException  {
        initComponents();
        this.control = new Control();
        this.showTabelPerusahaan();
        this.hidden_id.show(false);
    }
    
    private void showTabelPerusahaan() throws SQLException {
        DefaultTableModel dtbmPerusahaan = new DefaultTableModel(new String[]{"Id Perusahaan","Nama ","Kode Pos", "No Telp", "Alamat"},0);
        dtbmPerusahaan.setRowCount(0);
        for(Perusahaan p : this.control.getDataPerusahaan()){
            dtbmPerusahaan.addRow(new String[]{p.getId_perusahaan().toString(), p.getNama_perusahaan(), p.getKode_pos().toString(), p.getNo_telp(), p.getAlamat()});
        }
        this.tblPer.setModel(dtbmPerusahaan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPer = new javax.swing.JTable();
        btUpdate = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        tfNmPrs = new javax.swing.JTextField();
        tfKdPos = new javax.swing.JTextField();
        tfNoTlp = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        hidden_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPer);

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        tfNmPrs.setText("Nama_Perusahaan");
        tfNmPrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNmPrsActionPerformed(evt);
            }
        });

        tfKdPos.setText("Kode_Pos");
        tfKdPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKdPosActionPerformed(evt);
            }
        });

        tfNoTlp.setText("No_Telp");

        tfAlamat.setText("Alamat");

        hidden_id.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNmPrs, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNoTlp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfKdPos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hidden_id))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btUpdate)
                        .addGap(32, 32, 32)
                        .addComponent(btHapus)
                        .addGap(47, 47, 47)
                        .addComponent(btSimpan)
                        .addGap(36, 36, 36)
                        .addComponent(btExit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btUpdate)
                            .addComponent(btHapus)
                            .addComponent(btSimpan)
                            .addComponent(btExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tfNmPrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tfKdPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(tfNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hidden_id)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        Perusahaan perusahaan = new Perusahaan();
            try {
                perusahaan.setId_perusahaan(Integer.parseInt(hidden_id.getText()));
                this.control.deletePerusahaan(perusahaan);
                this.showTabelPerusahaan();
            } catch (SQLException err) {
                System.out.println(err);
            }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        Perusahaan p = new Perusahaan();
        try {
            p.setId_perusahaan(Integer.parseInt(this.hidden_id.getText()));
            p.setNama_perusahaan(this.tfNmPrs.getText());
            p.setKode_pos(Integer.parseInt(this.tfKdPos.getText()));
            p.setNo_telp(this.tfNoTlp.getText());
            p.setAlamat(this.tfAlamat.getText());
            this.control.editPerusahaan(p);
            this.showTabelPerusahaan();
            } catch (SQLException err) {
                System.out.println(err);
            }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        Perusahaan p = new Perusahaan();
        try {
            p.setNama_perusahaan(this.tfNmPrs.getText());
            p.setKode_pos(Integer.parseInt(this.tfKdPos.getText()));
            p.setNo_telp(this.tfNoTlp.getText());
            p.setAlamat(this.tfAlamat.getText());
            this.control.insertPerusahaan(p);
            this.showTabelPerusahaan();
            } catch (SQLException err) {
                System.out.println(err);
            }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void tblPerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblPer.getSelectedRow();
        hidden_id.setText((String) tblPer.getValueAt(selectedRow, 0));
        tfNmPrs.setText((String) (tblPer.getValueAt(selectedRow, 1)));
        tfKdPos.setText((String) (tblPer.getValueAt(selectedRow, 2)));
        tfNoTlp.setText((String) (tblPer.getValueAt(selectedRow, 3)));
        tfAlamat.setText((String) (tblPer.getValueAt(selectedRow, 4)));
        
    }//GEN-LAST:event_tblPerMouseClicked

    private void tfNmPrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNmPrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNmPrsActionPerformed

    private void tfKdPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKdPosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKdPosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel hidden_id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPer;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfKdPos;
    private javax.swing.JTextField tfNmPrs;
    private javax.swing.JTextField tfNoTlp;
    // End of variables declaration//GEN-END:variables

    
}
