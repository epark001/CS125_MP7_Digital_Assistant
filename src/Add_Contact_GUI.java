
public class Add_Contact_GUI extends javax.swing.JFrame 
{
    private String lname, fname, phone, address;
    
    public Add_Contact_GUI() {
        //startup();
        initComponents();
        setVisible(true);
        //startup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add_New_Contact_Label = new javax.swing.JLabel();
        Lname_Box = new javax.swing.JTextField();
        FName_Label = new javax.swing.JLabel();
        LName_Label = new javax.swing.JLabel();
        Phone_Label = new javax.swing.JLabel();
        Address_Label = new javax.swing.JLabel();
        Fname_Box = new javax.swing.JTextField();
        Address_Box = new javax.swing.JTextField();
        Phone_Box = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Add_Contact_Gui"); // NOI18N
        setPreferredSize(new java.awt.Dimension(520, 350));

        Add_New_Contact_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Add_New_Contact_Label.setText("Add New Contact");

        Lname_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Lname_BoxKeyReleased(evt);
            }
        });

        FName_Label.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        FName_Label.setText("First Name:");
        FName_Label.setAlignmentX(10.0F);

        LName_Label.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        LName_Label.setText("Last Name:");

        Phone_Label.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Phone_Label.setText("Phone Number:");

        Address_Label.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Address_Label.setText("Address:");

        Fname_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Fname_BoxKeyReleased(evt);
            }
        });

        Address_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Address_BoxKeyReleased(evt);
            }
        });

        Phone_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Phone_BoxKeyReleased(evt);
            }
        });

        Add_Button.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Add_New_Contact_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LName_Label)
                            .addComponent(Phone_Label)
                            .addComponent(Address_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Address_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fname_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lname_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_New_Contact_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fname_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LName_Label)
                            .addComponent(Lname_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Phone_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone_Label))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address_Label)
                    .addComponent(Address_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        Contact newc = new Contact(fname, lname, phone, address);
        Contact_Management start = new Contact_Management();
        start.addContact(newc);
        Manage_Contact_GUI start1 = new Manage_Contact_GUI();
        dispose();
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        Manage_Contact_GUI start = new Manage_Contact_GUI();
        dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Fname_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Fname_BoxKeyReleased
        fname = Fname_Box.getText()+"";
    }//GEN-LAST:event_Fname_BoxKeyReleased

    private void Lname_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Lname_BoxKeyReleased
        lname = Lname_Box.getText()+"";
    }//GEN-LAST:event_Lname_BoxKeyReleased

    private void Phone_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Phone_BoxKeyReleased
        phone = Phone_Box.getText()+"";
    }//GEN-LAST:event_Phone_BoxKeyReleased

    private void Address_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Address_BoxKeyReleased
        address = Address_Box.getText() +"";
    }//GEN-LAST:event_Address_BoxKeyReleased
    public void startup()
    {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Contact_GUI().setVisible(true);
            }
        });
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Contact_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JLabel Add_New_Contact_Label;
    private javax.swing.JTextField Address_Box;
    private javax.swing.JLabel Address_Label;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel FName_Label;
    private javax.swing.JTextField Fname_Box;
    private javax.swing.JLabel LName_Label;
    private javax.swing.JTextField Lname_Box;
    private javax.swing.JTextField Phone_Box;
    private javax.swing.JLabel Phone_Label;
    // End of variables declaration//GEN-END:variables
}
