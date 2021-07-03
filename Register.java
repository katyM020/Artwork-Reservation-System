
import com.sun.glass.events.KeyEvent;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameFiled = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IDF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddressF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PhoneNOF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AccountID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setText("UserName");

        jLabel3.setText("password");

        usernameFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFiledActionPerformed(evt);
            }
        });
        usernameFiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFiledKeyPressed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Already hava an account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        remove.setText("Remove All");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel4.setText("User_ID");

        IDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDFKeyPressed(evt);
            }
        });

        jLabel5.setText("First Name");

        Fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FnameKeyPressed(evt);
            }
        });

        jLabel6.setText("Address");

        AddressF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddressFKeyPressed(evt);
            }
        });

        jLabel7.setText("Phone Number");

        PhoneNOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNOFActionPerformed(evt);
            }
        });
        PhoneNOF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNOFKeyPressed(evt);
            }
        });

        jLabel8.setText("Account ID");

        AccountID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AccountIDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PhoneNOF)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(usernameFiled, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(AccountID)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(Fname)
                                    .addComponent(AddressF)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(AddressF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNOF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFiledActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login L = new Login();
        L.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String username = usernameFiled.getText().trim();
        String password = passwordField.getText().trim();
        String id = IDF.getText().trim();
        String name = Fname.getText().trim();
        String Address = AddressF.getText().trim();
        String Phoneno = PhoneNOF.getText().trim();
        String Accountid = AccountID.getText().trim();
        
        Registerr R = new Registerr();
        R.addUserInfo(username, password, id, name, Address, Phoneno, Accountid);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
       Registerr R = new Registerr();
       R.remove();     
    }//GEN-LAST:event_removeActionPerformed

    private void PhoneNOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNOFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PhoneNOFActionPerformed

    private void IDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDFKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Fname.requestFocus();
        }
        
    }//GEN-LAST:event_IDFKeyPressed

    private void usernameFiledKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFiledKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            passwordField.requestFocus();
        }     
    }//GEN-LAST:event_usernameFiledKeyPressed

    private void FnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            AddressF.requestFocus();
        }
        
    }//GEN-LAST:event_FnameKeyPressed

    private void AddressFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            PhoneNOF.requestFocus();
        }
    }//GEN-LAST:event_AddressFKeyPressed

    private void PhoneNOFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNOFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            AccountID.requestFocus();
        }
    }//GEN-LAST:event_PhoneNOFKeyPressed

    private void AccountIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccountIDKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            usernameFiled.requestFocus();
        }
    }//GEN-LAST:event_AccountIDKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountID;
    private javax.swing.JTextField AddressF;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField IDF;
    private javax.swing.JTextField PhoneNOF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton remove;
    private javax.swing.JTextField usernameFiled;
    // End of variables declaration//GEN-END:variables
}
