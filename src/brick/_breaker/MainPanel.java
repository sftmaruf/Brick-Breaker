package brick._breaker;

import java.awt.Color;

public class MainPanel extends javax.swing.JFrame {

    public MainPanel() {
        initComponents();
        signUpbtn.setBackground(new Color(0, 0, 0, 1));
        guestbtn.setBackground(new Color(0, 0, 0, 1));
        logInbtn.setBackground(new Color(0, 0, 0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        signUpbtn = new javax.swing.JButton();
        guestbtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        logInbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        signUpbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signUpbtn.setForeground(new java.awt.Color(0, 102, 102));
        signUpbtn.setText("SIGN UP AS A NEW PLAYER");
        signUpbtn.setOpaque(false);
        signUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpbtnActionPerformed(evt);
            }
        });
        jPanel2.add(signUpbtn);
        signUpbtn.setBounds(234, 167, 185, 62);

        guestbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        guestbtn.setForeground(new java.awt.Color(0, 102, 102));
        guestbtn.setText("PLAY AS GUEST");
        guestbtn.setOpaque(false);
        guestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestbtnActionPerformed(evt);
            }
        });
        jPanel2.add(guestbtn);
        guestbtn.setBounds(253, 265, 147, 55);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("BRICK BREAKER");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(122, 58, 427, 59);

        jTextField2.setForeground(new java.awt.Color(204, 0, 51));
        jTextField2.setText("If you are a registered player");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(218, 425, 150, 14);

        logInbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logInbtn.setForeground(new java.awt.Color(0, 102, 102));
        logInbtn.setText("LOG IN");
        logInbtn.setOpaque(false);
        logInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInbtnActionPerformed(evt);
            }
        });
        jPanel2.add(logInbtn);
        logInbtn.setBounds(374, 421, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brick/_breaker/resources/gamers_1200x627.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(656, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestbtnActionPerformed
        Brick_Breaker.setShow(true);
        dispose();
    }//GEN-LAST:event_guestbtnActionPerformed

    private void signUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpbtnActionPerformed
        new sign_up().show();
        dispose();
    }//GEN-LAST:event_signUpbtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void logInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInbtnActionPerformed
        new LogIn().show();
        dispose();
    }//GEN-LAST:event_logInbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guestbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logInbtn;
    private javax.swing.JButton signUpbtn;
    // End of variables declaration//GEN-END:variables
}
