import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;

public class Main_Menu_GUI extends javax.swing.JFrame {

    private LinkedList<Event> list = new LinkedList<Event>(); 
    private LinkedList<Event> dispList = new LinkedList<Event>();
    private Date selected, current, nextDate;
    private Event nextEvent;
    int month, day, year, hour, min, listIndex;
    Event_Management evm = new Event_Management();
    public Main_Menu_GUI() {
        startSystem();
        //setNext();
    }
    public void startSystem()
    {
        //setNext();
        startup();
        startupThreads();
        //setNext();
        //clock();
        //System.out.println(nextDate);
        //run();
        //setNext();
        //checkNext();
    }
    public void setNext()
    {
        updateList();
        Date tempd = new Date();
        //System.out.println("current date - "+tempd);
        boolean on = true;
        int i = 0;
        while(on==true && i<list.size())
        {
            if( (tempd.before(list.get(i).getDate())) && (list.get(i).getReminder() == true))
            {
                nextEvent = list.get(i);
                nextDate = nextEvent.getDate();
                on = false;
            }
            else
            {
                i++;
            }
        }
        //System.out.println("next date - "+nextEvent.getDate());
    }
    public void startup()
    {
        updateList();
        initComponents();
        Event_Combo_Box.setSelectedIndex(0);
        setVisible(true);
        selected = Calendar_Table.getDate();
        selected.setHours(0);
        selected.setMinutes(0);
        refreshList();
        //setNext();
    }
  public void startupThreads()
  {
    new Thread(new Runnable() {
        public void run() 
            {
            clock();
            }
    }).start();

    new Thread(new Runnable() {
        public void run() {
            try 
            {
                Thread.sleep(1999);
                setNext();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }).start();
    
    new Thread(new Runnable() {
        public void run() 
            {
                try 
            {
                Thread.sleep(4000);
                //System.out.println("date toString = "+current.toString());
                checkNext();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
                //checkNext();
            }
    }).start();
      
  }
  public void clock()
  {
    ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
    exec.scheduleAtFixedRate(new Runnable() {
      @Override
      public void run() {
        current = new Date();
        Date_Label.setText(current+"");
      }
    }, 0, 1, TimeUnit.SECONDS);
  }
  public void checkNext()
  {
      new Thread(new Runnable() {
        public void run() 
            {
            try 
            {
                //System.out.println("check next iteratated");
                Thread.sleep(800);
                cc();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            }
    }).start();
  }
  public void cc()
  {
      if( current.after(nextDate) ) 
        {
            Alert_GUI alert = new Alert_GUI(nextEvent);
            setNext();
            checkNext();
        }
      else
      {
          checkNext();
      }
  }
  
  
  
  public void updateList()
  {
      list.clear();
      list = Event_Entry.update();
  }
  public void dispDay()
  {
      updateList();
      
      for(int i = 0; i<list.size();i++)
      {
          Date tempd = list.get(i).getDate();
          Date tmro = new Date(selected.getTime() + (1000 * 60 * 60 * 24));
          if( (selected.compareTo(tempd)==0) || (selected.before(tempd)&&tmro.after(tempd)) )
          {
              list.get(i).setCsvIndex(i);
              dispList.add(list.get(i));
          }
      }
      displayList();
  }
  public void dispMonth()
  {
      updateList();
      for(int i = 0; i<list.size();i++)
      {
          Date tempd = list.get(i).getDate();
          Date select = new Date(selected.toString());
          select.setDate(1);
          Date tmro = new Date(select.toString());
          tmro.setDate(1);
          if(select.getMonth()==11)
          {
              tmro.setYear(select.getYear()+1);
              tmro.setMonth(0);
          }
          else
          {
              tmro.setMonth(select.getMonth()+1);
          }
          if( (selected.compareTo(tempd)==0) || (select.before(tempd)&&tmro.after(tempd)) )
          {
              list.get(i).setCsvIndex(i);
              dispList.add(list.get(i));
          }
      }
      
      
      displayList();
  }
  public void dispYear()
  {
      updateList();
      for(int i = 0; i<list.size();i++)
      {
          Date tempd = list.get(i).getDate();
          Date select = new Date(selected.toString());
          select.setDate(1);
          select.setMonth(0);
          Date tmro = new Date(select.toString());
          tmro.setYear(select.getYear()+1);
          if( (selected.compareTo(tempd)==0) || (select.before(tempd)&&tmro.after(tempd)) )
          {
              list.get(i).setCsvIndex(i);
              dispList.add(list.get(i));
          }
      }
      displayList();
  }
  public void displayList()
  {
      Event_List.clearSelection();
      String[] sarray = new String[list.size()];
            for ( int count = 0 ; count < dispList.size() ; count++)
            {
                sarray[count] = (dispList.get(count)).displayEvent();
            }
      Event_List.setListData(sarray);
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D_Assistant_Label = new javax.swing.JLabel();
        Current_Date_Label = new javax.swing.JLabel();
        Date_Label = new javax.swing.JLabel();
        Calendar_Table = new com.toedter.calendar.JCalendar();
        Open_Event_Button = new javax.swing.JButton();
        Manga_Contacts_Button = new javax.swing.JButton();
        New_Event_Button = new javax.swing.JButton();
        Delete_Event_Button = new javax.swing.JButton();
        Event_Combo_Box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Event_List = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 255));

        D_Assistant_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        D_Assistant_Label.setText("Digital Assistant");

        Current_Date_Label.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Current_Date_Label.setText("Current: ");

        Date_Label.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Date_Label.setText("12:12 AM 11/9/2016");

        Calendar_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Calendar_Table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Calendar_TablePropertyChange(evt);
            }
        });

        Open_Event_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Open_Event_Button.setText("Open Event");
        Open_Event_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_Event_ButtonActionPerformed(evt);
            }
        });

        Manga_Contacts_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Manga_Contacts_Button.setText("Manage Contacts");
        Manga_Contacts_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manga_Contacts_ButtonActionPerformed(evt);
            }
        });

        New_Event_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        New_Event_Button.setText("Add");
        New_Event_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Event_ButtonActionPerformed(evt);
            }
        });

        Delete_Event_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Delete_Event_Button.setText("Delete Event");
        Delete_Event_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Event_ButtonActionPerformed(evt);
            }
        });

        Event_Combo_Box.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Event_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Month", "Year" }));
        Event_Combo_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Event_Combo_BoxActionPerformed(evt);
            }
        });

        Event_List.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Event_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Event_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Event_List);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(D_Assistant_Label)
                        .addGap(119, 119, 119)
                        .addComponent(Current_Date_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calendar_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Manga_Contacts_Button))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Event_Combo_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(New_Event_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Delete_Event_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Open_Event_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D_Assistant_Label)
                    .addComponent(Current_Date_Label)
                    .addComponent(Date_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Event_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(Calendar_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(New_Event_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Manga_Contacts_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(Open_Event_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete_Event_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Manga_Contacts_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manga_Contacts_ButtonActionPerformed
        Manage_Contact_GUI open = new Manage_Contact_GUI();
        dispose();
    }//GEN-LAST:event_Manga_Contacts_ButtonActionPerformed

    private void New_Event_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Event_ButtonActionPerformed
        selected.setSeconds(0);
        Add_Event_GUI open = new Add_Event_GUI(selected);
        dispose();
    }//GEN-LAST:event_New_Event_ButtonActionPerformed

    private void Open_Event_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_Event_ButtonActionPerformed
        int i = Event_List.getSelectedIndex();
        Event te = dispList.get(i);
        Add_Event_GUI open = new Add_Event_GUI(te.getDate(),te.getCsvIndex(),te);
        dispose();
    }//GEN-LAST:event_Open_Event_ButtonActionPerformed

    private void Delete_Event_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Event_ButtonActionPerformed
        int i = Event_List.getSelectedIndex();
        
        evm.removeEvent( dispList.get(i).getCsvIndex() );
        updateList();
        refreshList();
    }//GEN-LAST:event_Delete_Event_ButtonActionPerformed

    private void Calendar_TablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Calendar_TablePropertyChange

        selected = Calendar_Table.getDate();
        selected.setHours(0);
        selected.setMinutes(0);
        selected.setSeconds(0);
       
        refreshList();
    }//GEN-LAST:event_Calendar_TablePropertyChange

    private void Event_Combo_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Event_Combo_BoxActionPerformed

       refreshList();
    }//GEN-LAST:event_Event_Combo_BoxActionPerformed

    private void refreshList()
    {
        updateList();
        int snum = Event_Combo_Box.getSelectedIndex();
        dispList.clear();
        if (snum == 0)
        {
            dispDay();
        }
        else if (snum == 1)
        {
            dispMonth();
        }
        else if(snum == 2)
        {
            dispYear();
        }
    }
    
    private void Event_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Event_ListMouseClicked
        listIndex = Event_List.getSelectedIndex();
    }//GEN-LAST:event_Event_ListMouseClicked

    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu_GUI().setVisible(true);
            }
        });
        


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar Calendar_Table;
    private javax.swing.JLabel Current_Date_Label;
    private javax.swing.JLabel D_Assistant_Label;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JButton Delete_Event_Button;
    private javax.swing.JComboBox<String> Event_Combo_Box;
    private javax.swing.JList<String> Event_List;
    private javax.swing.JButton Manga_Contacts_Button;
    private javax.swing.JButton New_Event_Button;
    private javax.swing.JButton Open_Event_Button;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
