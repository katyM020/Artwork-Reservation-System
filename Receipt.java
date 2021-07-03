import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Receipt extends javax.swing.JFrame {


    private String TotalPrice,p;
    private int status;
    private int receiptNo = 19739;
    public Receipt() {
        initComponents();
    }
    
    Receipt(String orderID, String Qunatity, String atId, String Price) 
    {
        initComponents();
        pay.setModel(new DefaultComboBoxModel<>(new String[]
        {
            "--Select--", "Cash on delivery", "Credit card"
        }));
        double totalPrice;
        
        Double quantity = Double.parseDouble(Qunatity);
        
        Double pprice = Double.parseDouble(Price);
        
        totalPrice = (quantity * pprice * 0.14);
        
        TotalPrice = String.valueOf(totalPrice);
        
        ++receiptNo;
        receiptN.setText(String.valueOf(receiptNo));
        oderidF.setText(orderID);
        artworkIDF.setText(atId);
        totalpriceF.setText(TotalPrice);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        receiptN = new javax.swing.JLabel();
        totalpriceF = new javax.swing.JLabel();
        oderidF = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        artworkIDF = new javax.swing.JLabel();
        Comfirm = new javax.swing.JButton();
        pay = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Receipt");

        jLabel2.setText("Receipt Number");

        jLabel3.setText("Total price");

        jLabel4.setText("Order ID");

        jLabel5.setText("Artwork ID");

        Comfirm.setText("Confirm");
        Comfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComfirmActionPerformed(evt);
            }
        });

        pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                payItemStateChanged(evt);
            }
        });
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        jLabel7.setText("Comfirm Payment Method");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Comfirm)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(receiptN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oderidF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artworkIDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(totalpriceF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(receiptN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oderidF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(artworkIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(totalpriceF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(Comfirm)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComfirmActionPerformed
        switch (status) {
            case 0:
                String p = pay.getSelectedItem().toString();
                
                if("Credit card".equals(p))
                {     
                    new CreditCard().setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                new MakeOrder().setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Must select a payment method"); 
                }
                break;
            case 1:                
                JOptionPane.showMessageDialog(rootPane, "Done");
                new Search().setVisible(true);
                this.setVisible(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_ComfirmActionPerformed

    private void payItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_payItemStateChanged
        String p = pay.getSelectedItem().toString();
        if(!"Cash on delivery".equals(p))
        {
            status = 0;
        }
        else
        {
            status = 1;
        }
    }//GEN-LAST:event_payItemStateChanged

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed

    }//GEN-LAST:event_payActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Receipt().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comfirm;
    private javax.swing.JLabel artworkIDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel oderidF;
    private javax.swing.JComboBox<String> pay;
    private javax.swing.JLabel receiptN;
    private javax.swing.JLabel totalpriceF;
    // End of variables declaration//GEN-END:variables
}
