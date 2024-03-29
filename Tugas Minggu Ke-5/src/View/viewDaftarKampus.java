package View;

/**
 *
 * @author Ifdhal Hadi
 * 
 */
public class viewDaftarKampus extends javax.swing.JFrame {

    /**
     * Creates new form vDaftarKampus
     */
    public viewDaftarKampus() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(360,640);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        b3BarTelU = new javax.swing.JButton();
        labelDashboard = new javax.swing.JLabel();
        bLogoutDaftarKampus = new javax.swing.JButton();
        bProfileTelU = new javax.swing.JButton();
        labelTelU = new javax.swing.JLabel();
        labelAkreditasiTelU = new javax.swing.JLabel();
        labelProdiTelU = new javax.swing.JLabel();
        bProfileITB = new javax.swing.JButton();
        labelITB = new javax.swing.JLabel();
        labelAkreditasiITB = new javax.swing.JLabel();
        labelProdiITB = new javax.swing.JLabel();
        bProfileUnpad = new javax.swing.JButton();
        labelUnpad = new javax.swing.JLabel();
        labelAkreditasiUnpad = new javax.swing.JLabel();
        labelProdiUnpad = new javax.swing.JLabel();
        bProfileTelU3 = new javax.swing.JButton();
        labelTelU3 = new javax.swing.JLabel();
        labelAkreditasiTelU3 = new javax.swing.JLabel();
        labelProdiTelU3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 640));

        b3BarTelU.setBackground(new java.awt.Color(255, 255, 255));
        b3BarTelU.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        b3BarTelU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button 3 Bar.png"))); // NOI18N
        b3BarTelU.setBorder(null);
        b3BarTelU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3BarTelUActionPerformed(evt);
            }
        });

        labelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        labelDashboard.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        labelDashboard.setText("NgampusYuk! Dashboard");

        bLogoutDaftarKampus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bLogoutDaftarKampus.setText("Logout");
        bLogoutDaftarKampus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLogoutDaftarKampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutDaftarKampusActionPerformed(evt);
            }
        });

        bProfileTelU.setBackground(new java.awt.Color(255, 255, 255));
        bProfileTelU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo PT/Logo Tel-U.png"))); // NOI18N
        bProfileTelU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileTelUActionPerformed(evt);
            }
        });

        labelTelU.setBackground(new java.awt.Color(255, 255, 255));
        labelTelU.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        labelTelU.setText("Telkom University");

        labelAkreditasiTelU.setBackground(new java.awt.Color(255, 255, 255));
        labelAkreditasiTelU.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelAkreditasiTelU.setText("Akreditasi : A");

        labelProdiTelU.setBackground(new java.awt.Color(255, 255, 255));
        labelProdiTelU.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelProdiTelU.setText("Program Studi : 38");

        bProfileITB.setBackground(new java.awt.Color(255, 255, 255));
        bProfileITB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo PT/Logo ITB.png"))); // NOI18N
        bProfileITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileITBActionPerformed(evt);
            }
        });

        labelITB.setBackground(new java.awt.Color(255, 255, 255));
        labelITB.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        labelITB.setText("Institut Teknologi Bandung");

        labelAkreditasiITB.setBackground(new java.awt.Color(255, 255, 255));
        labelAkreditasiITB.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelAkreditasiITB.setText("Akreditasi : A");

        labelProdiITB.setBackground(new java.awt.Color(255, 255, 255));
        labelProdiITB.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelProdiITB.setText("Program Studi : 38");

        bProfileUnpad.setBackground(new java.awt.Color(255, 255, 255));
        bProfileUnpad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo PT/Logo Unpad.jpg"))); // NOI18N
        bProfileUnpad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileUnpadActionPerformed(evt);
            }
        });

        labelUnpad.setBackground(new java.awt.Color(255, 255, 255));
        labelUnpad.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        labelUnpad.setText("Universitas Padjajaran");

        labelAkreditasiUnpad.setBackground(new java.awt.Color(255, 255, 255));
        labelAkreditasiUnpad.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelAkreditasiUnpad.setText("Akreditasi : A");

        labelProdiUnpad.setBackground(new java.awt.Color(255, 255, 255));
        labelProdiUnpad.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelProdiUnpad.setText("Program Studi : 51");

        bProfileTelU3.setBackground(new java.awt.Color(255, 255, 255));
        bProfileTelU3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo PT/Logo UPI.png"))); // NOI18N
        bProfileTelU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileTelU3ActionPerformed(evt);
            }
        });

        labelTelU3.setBackground(new java.awt.Color(255, 255, 255));
        labelTelU3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        labelTelU3.setText("Universitas Pendidikan Indonesia");

        labelAkreditasiTelU3.setBackground(new java.awt.Color(255, 255, 255));
        labelAkreditasiTelU3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelAkreditasiTelU3.setText("Akreditasi : A");

        labelProdiTelU3.setBackground(new java.awt.Color(255, 255, 255));
        labelProdiTelU3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelProdiTelU3.setText("Program Studi : 33");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(b3BarTelU)
                .addGap(11, 11, 11)
                .addComponent(labelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bLogoutDaftarKampus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelAkreditasiTelU, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTelU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelProdiTelU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(bProfileTelU, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bProfileUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelITB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bProfileTelU3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAkreditasiITB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelProdiITB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bProfileITB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAkreditasiUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProdiUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelU3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAkreditasiTelU3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelProdiTelU3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDashboard)
                            .addComponent(bLogoutDaftarKampus)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(b3BarTelU)))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bProfileTelU, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTelU)
                        .addGap(0, 0, 0)
                        .addComponent(labelAkreditasiTelU, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelProdiTelU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bProfileITB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelITB)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAkreditasiITB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(labelProdiITB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bProfileUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProfileTelU3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUnpad)
                    .addComponent(labelTelU3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAkreditasiUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelProdiUnpad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAkreditasiTelU3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelProdiTelU3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogoutDaftarKampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutDaftarKampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogoutDaftarKampusActionPerformed

    private void b3BarTelUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3BarTelUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3BarTelUActionPerformed

    private void bProfileTelUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileTelUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileTelUActionPerformed

    private void bProfileITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileITBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileITBActionPerformed

    private void bProfileUnpadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileUnpadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileUnpadActionPerformed

    private void bProfileTelU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileTelU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileTelU3ActionPerformed

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
            java.util.logging.Logger.getLogger(viewDaftarKampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDaftarKampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDaftarKampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDaftarKampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDaftarKampus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3BarTelU;
    private javax.swing.JButton bLogoutDaftarKampus;
    private javax.swing.JButton bProfileITB;
    private javax.swing.JButton bProfileTelU;
    private javax.swing.JButton bProfileTelU3;
    private javax.swing.JButton bProfileUnpad;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel labelAkreditasiITB;
    private javax.swing.JLabel labelAkreditasiTelU;
    private javax.swing.JLabel labelAkreditasiTelU3;
    private javax.swing.JLabel labelAkreditasiUnpad;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelITB;
    private javax.swing.JLabel labelProdiITB;
    private javax.swing.JLabel labelProdiTelU;
    private javax.swing.JLabel labelProdiTelU3;
    private javax.swing.JLabel labelProdiUnpad;
    private javax.swing.JLabel labelTelU;
    private javax.swing.JLabel labelTelU3;
    private javax.swing.JLabel labelUnpad;
    // End of variables declaration//GEN-END:variables
}
