import java.util.Date;
public class Add_Event_GUI extends javax.swing.JFrame {
String details, title;
boolean remind = false;
int hour, min;
Date eventDate;
Event event;
int index;
    public Add_Event_GUI(Date imported) 
    {
        eventDate = imported;
        initComponents();
        Display_Date.setText(eventDate+"");
        setVisible(true);
        index = -1;
    }
    public Add_Event_GUI(Date d_i, int i, Event e_i) 
    {
        eventDate = d_i;
        event = e_i;
        initComponents();
        Display_Date.setText(eventDate+"");
        Title_Box.setText(event.getTitle());
        title = e_i.getTitle();
        Detail_Pane.setText(event.getDetail());
        details = e_i.getDetail();
        Hour_Box.setText(eventDate.getHours()+"");
        hour = eventDate.getHours();
        Min_Box.setText(eventDate.getMinutes()+"");
        min = eventDate.getMinutes();
        Remind_Toggle.setSelected(event.getReminder());
        remind = e_i.getReminder();
        index = i;
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Event_Date_Label = new javax.swing.JLabel();
        Title_Label = new javax.swing.JLabel();
        Detail_Label = new javax.swing.JLabel();
        Remind_Toggle = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Detail_Pane = new javax.swing.JTextPane();
        Display_Date = new javax.swing.JLabel();
        Title_Box = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Time_Label = new javax.swing.JLabel();
        Hour_Box = new javax.swing.JTextField();
        Semicolen_Label = new javax.swing.JLabel();
        Min_Box = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Event_Date_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Event_Date_Label.setText("Event Date:");

        Title_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title_Label.setText("Title:");

        Detail_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Detail_Label.setText("Details");

        Remind_Toggle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Remind_Toggle.setText("Remind");
        Remind_Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remind_ToggleActionPerformed(evt);
            }
        });

        Detail_Pane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Detail_Pane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Detail_PaneKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Detail_Pane);

        Display_Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Display_Date.setText("Display Date");

        Title_Box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Title_BoxKeyReleased(evt);
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

        Time_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Time_Label.setText("Time:");

        Hour_Box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hour_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Hour_BoxKeyReleased(evt);
            }
        });

        Semicolen_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Semicolen_Label.setText(":");

        Min_Box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Min_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Min_BoxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hour_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Semicolen_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Detail_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Remind_Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title_Box))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Event_Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Display_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Event_Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Display_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title_Box)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Hour_Box, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Min_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Semicolen_Label)))
                    .addComponent(Time_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remind_Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Detail_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Title_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Title_BoxKeyReleased
        title = Title_Box.getText();
    }//GEN-LAST:event_Title_BoxKeyReleased

    private void Remind_ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remind_ToggleActionPerformed
        remind = Remind_Toggle.isSelected();
    }//GEN-LAST:event_Remind_ToggleActionPerformed

    private void Detail_PaneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Detail_PaneKeyReleased
        details = Detail_Pane.getText();
    }//GEN-LAST:event_Detail_PaneKeyReleased

    
    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        Event_Management start = new Event_Management();
        if (index == -1)
        {
            eventDate.setHours(hour);
            eventDate.setMinutes(min);
            event = new Event(eventDate,title, details, remind);
            start.addEvent(event);
            Main_Menu_GUI open = new Main_Menu_GUI();
            dispose();
        }
        else
        {
            event = start.getEvent(index);
            event.setTitle(title);
            event.setDate(eventDate);
            event.setDetail(details);
            event.setReminder(remind);
            start.saveEvent(index, event);
            Main_Menu_GUI open = new Main_Menu_GUI();
            dispose();
        }
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        Main_Menu_GUI open = new Main_Menu_GUI ();
        dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Hour_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Hour_BoxKeyReleased
        hour = Integer.parseInt(Hour_Box.getText()+"");
        eventDate.setHours(hour);
    }//GEN-LAST:event_Hour_BoxKeyReleased

    private void Min_BoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Min_BoxKeyReleased
        min = Integer.parseInt(Min_Box.getText()+"");
        eventDate.setMinutes(min);
    }//GEN-LAST:event_Min_BoxKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Detail_Label;
    private javax.swing.JTextPane Detail_Pane;
    private javax.swing.JLabel Display_Date;
    private javax.swing.JLabel Event_Date_Label;
    private javax.swing.JTextField Hour_Box;
    private javax.swing.JTextField Min_Box;
    private javax.swing.JToggleButton Remind_Toggle;
    private javax.swing.JLabel Semicolen_Label;
    private javax.swing.JLabel Time_Label;
    private javax.swing.JTextField Title_Box;
    private javax.swing.JLabel Title_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}