package brick._breaker;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class sign_up extends javax.swing.JFrame {

	Dbms_Connector database;
    private Connection connection = null;

    private static String userName = "0";
    private static String userId= "0";
    private static String email = "0";

    public sign_up() {
        initComponents();
        sgnUPbtn.setBackground(new Color(0, 0, 0, 1));
    }

    public void set_userName(String userName) {
        this.userName = userName;
    }

    public static String get_userName() {
        return userName;
    }

//
//    public void set_userId(String userId) {
//        this.userId = userId;
//    }
//
//    public static String get_userId() {
//        return userId;
//    }
//
//    public void set_email(String email) {
//        this.email = email;
//    }
//
//    public static String get_email() {
//        return email;
//    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        su = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        ui = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        ue = new javax.swing.JTextField();
        mailtxt = new javax.swing.JTextField();
        up = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        sgnUPbtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        su.setEditable(false);
        su.setBackground(new java.awt.Color(204, 204, 204));
        su.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        su.setForeground(new java.awt.Color(0, 0, 204));
        su.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su.setText("SIGN UP");
        su.setBorder(null);
        su.setOpaque(false);
        su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suActionPerformed(evt);
            }
        });
        jPanel1.add(su);
        su.setBounds(180, 20, 290, 100);

        un.setEditable(false);
        un.setBackground(new java.awt.Color(255, 0, 51));
        un.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        un.setForeground(new java.awt.Color(0, 102, 102));
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un.setText("USER NAME");
        un.setToolTipText("");
        un.setBorder(null);
        un.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        un.setOpaque(false);
        jPanel1.add(un);
        un.setBounds(80, 170, 111, 41);

        nametxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 102, 102));
        nametxt.setToolTipText("");
        nametxt.setBorder(null);
        nametxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nametxt.setOpaque(false);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt);
        nametxt.setBounds(220, 170, 257, 40);

        ui.setEditable(false);
        ui.setBackground(new java.awt.Color(204, 0, 0));
        ui.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ui.setForeground(new java.awt.Color(0, 102, 102));
        ui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ui.setText("USER ID");
        ui.setBorder(null);
        ui.setOpaque(false);
        ui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiActionPerformed(evt);
            }
        });
        jPanel1.add(ui);
        ui.setBounds(90, 220, 111, 41);

        idtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 102, 102));
        idtxt.setToolTipText("");
        idtxt.setBorder(null);
        idtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idtxt.setDoubleBuffered(true);
        idtxt.setOpaque(false);
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt);
        idtxt.setBounds(220, 210, 257, 40);

        ue.setEditable(false);
        ue.setBackground(new java.awt.Color(255, 0, 51));
        ue.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ue.setForeground(new java.awt.Color(0, 102, 102));
        ue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ue.setText("EMAIL");
        ue.setBorder(null);
        ue.setOpaque(false);
        ue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ueActionPerformed(evt);
            }
        });
        jPanel1.add(ue);
        ue.setBounds(100, 270, 111, 41);

        mailtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mailtxt.setForeground(new java.awt.Color(0, 102, 102));
        mailtxt.setToolTipText("");
        mailtxt.setBorder(null);
        mailtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mailtxt.setDoubleBuffered(true);
        mailtxt.setOpaque(false);
        mailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailtxtActionPerformed(evt);
            }
        });
        jPanel1.add(mailtxt);
        mailtxt.setBounds(220, 260, 257, 40);

        up.setEditable(false);
        up.setBackground(new java.awt.Color(255, 0, 51));
        up.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        up.setForeground(new java.awt.Color(0, 102, 102));
        up.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        up.setText("PASSWORD");
        up.setBorder(null);
        up.setOpaque(false);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel1.add(up);
        up.setBounds(80, 320, 111, 41);

        passwordtxt.setBorder(null);
        passwordtxt.setOpaque(false);
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordtxt);
        passwordtxt.setBounds(220, 310, 257, 40);

        sgnUPbtn.setBackground(new java.awt.Color(51, 51, 51));
        sgnUPbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sgnUPbtn.setForeground(new java.awt.Color(0, 102, 102));
        sgnUPbtn.setText("SIGN UP");
        sgnUPbtn.setOpaque(false);
        sgnUPbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgnUPbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sgnUPbtn);
        sgnUPbtn.setBounds(210, 400, 90, 43);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(220, 208, 260, 2);

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(220, 250, 260, 10);

        jSeparator3.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(220, 342, 260, 20);

        jSeparator4.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(220, 295, 260, 20);

        backbtn.setBackground(new java.awt.Color(51, 51, 51));
        backbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backbtn.setForeground(new java.awt.Color(0, 102, 102));
        backbtn.setText("BACK");
        backbtn.setOpaque(false);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn);
        backbtn.setBounds(350, 400, 90, 43);

        jLabel3.setBackground(new java.awt.Color(255, 0, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brick/_breaker/resources/gamers_1200x627.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -50, 640, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(656, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sgnUPbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgnUPbtnActionPerformed

        if (mailtxt.getText().equals("") || idtxt.getText().equals("") || idtxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill All The Filed");
        } else {
        	
        	database = Dbms_Connector.getDatabase();
            connection = database.databaseConnection();
            
            try {
                set_userName(mailtxt.getText());
                //set_userId(nametxt.getText());
                //set_email(mailtxt.getText());
                Statement st = connection.createStatement();
                st.executeUpdate("insert into user_reg values('" + nametxt.getText() + "' , '" + Integer.parseInt(idtxt.getText()) + "' , '" + mailtxt.getText() + "' , '" + passwordtxt.getText() + "')");
                JOptionPane.showMessageDialog(null, "Inserted Into Database");
                this.hide();

                new LogIn().show();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }

        // dispose();
        // new menu().show();
    }//GEN-LAST:event_sgnUPbtnActionPerformed

    private void suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void uiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiActionPerformed

    private void ueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ueActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void mailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailtxtActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new MainPanel().show();
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(sign_up.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JButton sgnUPbtn;
    private javax.swing.JTextField su;
    private javax.swing.JTextField ue;
    private javax.swing.JTextField ui;
    private javax.swing.JTextField un;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables
}
