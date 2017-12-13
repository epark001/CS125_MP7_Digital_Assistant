  import java.util.LinkedList;
public class Manage_Contact_GUI extends javax.swing.JFrame {

    Contact_Management management = new Contact_Management();
    LinkedList<Contact> list = new LinkedList<Contact> ();
    public Manage_Contact_GUI() {
        //compilelist();
        initComponents();
        
        compilelist();
        setVisible(true);
    }
    private void compilelist()
    {
        update();
        String[] sarray = new String[list.size()];
            for ( int count = 0 ; count < list.size() ; count++)
            {
                sarray[count] = (list.get(count)).printList();
            }
            Contact_List.setListData( sarray );
    }
    private void update()
    {
        list = Contact_Entry.update();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Contact_List = new javax.swing.JList<>();
        Contact_Book_Label = new javax.swing.JLabel();
        Add_Cntact_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Fname_Label = new javax.swing.JLabel();
        LName_Label = new javax.swing.JLabel();
        Phone_Label = new javax.swing.JLabel();
        Address_Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Phone_Print = new javax.swing.JLabel();
        Lname_Print = new javax.swing.JLabel();
        Fname_Print = new javax.swing.JLabel();
        Address_Print = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contact_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Contact_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Contact_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Contact_List);

        Contact_Book_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contact_Book_Label.setText("Contact Book");

        Add_Cntact_Button.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Add_Cntact_Button.setText("Add Contact");
        Add_Cntact_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Cntact_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Fname_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fname_Label.setText("First Name:");

        LName_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LName_Label.setText("Last Name:");

        Phone_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Phone_Label.setText("Phone Number:");

        Address_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Address_Label.setText("Address: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Phone_Print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Phone_Print.setText("     ");

        Lname_Print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lname_Print.setText("     ");

        Fname_Print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fname_Print.setText("     ");
        Fname_Print.setToolTipText("");

        Address_Print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Address_Print.setText("     ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fname_Label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LName_Label)
                                .addGap(34, 34, 34)
                                .addComponent(Lname_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Phone_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Phone_Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contact_Book_Label))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add_Cntact_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(Fname_Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Address_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Address_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_Book_Label)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add_Cntact_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fname_Label)
                    .addComponent(Fname_Print))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName_Label)
                    .addComponent(Lname_Print))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone_Label)
                    .addComponent(jLabel6)
                    .addComponent(Phone_Print))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_Print)
                    .addComponent(Address_Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        Main_Menu_GUI start = new Main_Menu_GUI();
        dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Add_Cntact_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Cntact_ButtonActionPerformed
        Add_Contact_GUI start = new Add_Contact_GUI ();
        dispose();
    }//GEN-LAST:event_Add_Cntact_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        management.removeContact(Contact_List.getSelectedIndex());
        compilelist();
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Contact_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contact_ListMouseClicked
        int index = Contact_List.getSelectedIndex();
        Fname_Print.setText(list.get(index).getFname());
        Lname_Print.setText(list.get(index).getLname());
        Phone_Print.setText(list.get(index).getPhone());
        Address_Print.setText(list.get(index).getAddress());
    }//GEN-LAST:event_Contact_ListMouseClicked

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
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Contact_GUI().setVisible(true);
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
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Contact_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Contact_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Cntact_Button;
    private javax.swing.JLabel Address_Label;
    private javax.swing.JLabel Address_Print;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Contact_Book_Label;
    private javax.swing.JList<String> Contact_List;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JLabel Fname_Label;
    private javax.swing.JLabel Fname_Print;
    private javax.swing.JLabel LName_Label;
    private javax.swing.JLabel Lname_Print;
    private javax.swing.JLabel Phone_Label;
    private javax.swing.JLabel Phone_Print;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
