import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;

public class Search extends javax.swing.JFrame {

    private Searchh S = new Searchh(); 
    public Search() {
        initComponents();
        
    }

    private String userName;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchF = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Artwork_price = new javax.swing.JLabel();
        IDF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cart = new javax.swing.JButton();
        cart1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        Exhibition1 = new javax.swing.JButton();
        Exhibition = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namef = new javax.swing.JLabel();
        Artisit_ID = new javax.swing.JLabel();
        Artwork_genre = new javax.swing.JLabel();
        Artwork_Description = new javax.swing.JLabel();
        Artwork_price1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Artisit_ID1 = new javax.swing.JLabel();
        Artwork_genre1 = new javax.swing.JLabel();
        Artwork_Description1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fav = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        favourite1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFActionPerformed(evt);
            }
        });
        searchF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFKeyPressed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel2.setText("ArtWork_ID");

        jLabel1.setText("ArtWork Name");

        cart.setText("Add to cart");
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });

        cart1.setText("Add to cart");
        cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cart1ActionPerformed(evt);
            }
        });

        jLabel3.setText("ArtWork_ID");

        jLabel4.setText("ArtWork_Name");

        Exhibition1.setText("Exhibtion");
        Exhibition1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exhibition1ActionPerformed(evt);
            }
        });

        Exhibition.setText("Exhibtion");
        Exhibition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExhibitionActionPerformed(evt);
            }
        });

        jLabel5.setText("Artwork price");

        jLabel6.setText("Artwork genre");

        jLabel7.setText("Artwork Description");

        jLabel8.setText("Artisit ID");

        jLabel9.setText("Artwork price");

        jLabel10.setText("Artwork genre");

        jLabel11.setText("Artwork Description");

        jLabel12.setText("Artisit ID");

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\icons8-male-user-30.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fav.setText("Favourite");
        fav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favMouseClicked(evt);
            }
        });
        fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favActionPerformed(evt);
            }
        });

        jLabel13.setText("Add to favorites");

        jLabel14.setText("Add to favorites");

        favourite1.setText("Favourite");
        favourite1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favourite1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search)
                .addGap(268, 268, 268)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artwork_price, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artwork_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artisit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artwork_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(35, 35, 35)
                        .addComponent(fav)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Artwork_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artwork_genre1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artisit_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artwork_Description1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(53, 53, 53)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(35, 35, 35)
                        .addComponent(favourite1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(Exhibition1)
                        .addGap(34, 34, 34)
                        .addComponent(cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Exhibition)
                .addGap(18, 18, 18)
                .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search)
                            .addComponent(searchF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Artwork_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artwork_price1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Artwork_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Artwork_genre1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Artwork_Description1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(Artwork_Description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Artisit_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Artisit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(favourite1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(fav)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cart1)
                        .addComponent(Exhibition1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cart)
                        .addComponent(Exhibition)))
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFActionPerformed
        
    }//GEN-LAST:event_searchFActionPerformed
    
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        S.showOrder(searchF.getText());
        
        IDF.setText(S.setID());
        namef.setText(S.setName());
        Artwork_price.setText(S.setPrice());
        Artwork_genre.setText(S.setGenre());
        Artwork_Description.setText(S.setDesc());
        Artisit_ID.setText(S.setArtistID());
        
        idField.setText(S.setID1());
        nameField.setText(S.setName1());
        Artwork_price1.setText(S.setPrice1());
        Artwork_genre1.setText(S.setGenre1());
        Artwork_Description1.setText(S.setDesc1());
        Artisit_ID1.setText(S.setArtistID1());        

    }//GEN-LAST:event_SearchActionPerformed

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        new Order(IDF.getText(),namef.getText(),Artwork_price.getText()).setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_cartActionPerformed

    private void cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cart1ActionPerformed
        new Order(idField.getText(),nameField.getText(),Artwork_price1.getText()).setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_cart1ActionPerformed

    private void ExhibitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExhibitionActionPerformed
       new Exhibition(IDF.getText(),idField.getText()).setVisible(true);
       this.setVisible(false);  
    }//GEN-LAST:event_ExhibitionActionPerformed

    private void Exhibition1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exhibition1ActionPerformed
       new Exhibition(IDF.getText(),idField.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Exhibition1ActionPerformed

    private void searchFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {   
        S.showOrder(searchF.getText());
        
        IDF.setText(S.setID());
        namef.setText(S.setName());
        Artwork_price.setText(S.setPrice());
        Artwork_genre.setText(S.setGenre());
        Artwork_Description.setText(S.setDesc());
        Artisit_ID.setText(S.setArtistID());
        
        idField.setText(S.setID1());
        nameField.setText(S.setName1());
        Artwork_price1.setText(S.setPrice1());
        Artwork_genre1.setText(S.setGenre1());
        Artwork_Description1.setText(S.setDesc1());
        Artisit_ID1.setText(S.setArtistID1());     
        }
    }//GEN-LAST:event_searchFKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        UserProfile P = new UserProfile();
        P.setVisible(true);
        P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void favActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favActionPerformed
          
    }//GEN-LAST:event_favActionPerformed

    private void favMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favMouseClicked
         S.storeFavourite(IDF.getText());
    }//GEN-LAST:event_favMouseClicked

    private void favourite1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favourite1MouseClicked
        S.storeFavourite(idField.getText());
    }//GEN-LAST:event_favourite1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Search().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Artisit_ID;
    private javax.swing.JLabel Artisit_ID1;
    private javax.swing.JLabel Artwork_Description;
    private javax.swing.JLabel Artwork_Description1;
    private javax.swing.JLabel Artwork_genre;
    private javax.swing.JLabel Artwork_genre1;
    private javax.swing.JLabel Artwork_price;
    private javax.swing.JLabel Artwork_price1;
    private javax.swing.JButton Exhibition;
    private javax.swing.JButton Exhibition1;
    private javax.swing.JLabel IDF;
    private javax.swing.JButton Search;
    private javax.swing.JButton cart;
    private javax.swing.JButton cart1;
    private javax.swing.JCheckBox fav;
    private javax.swing.JCheckBox favourite1;
    private javax.swing.JLabel idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel namef;
    private javax.swing.JTextField searchF;
    // End of variables declaration//GEN-END:variables
}
