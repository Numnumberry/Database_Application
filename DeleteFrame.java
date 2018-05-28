import java.util.ArrayList;

public class DeleteFrame extends javax.swing.JFrame {    

    public static GroupProject tempMethods;
    public static int tid = 0;                  //have global tid to be used by all methods

    public DeleteFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminBackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainerList = new javax.swing.JList<>();
        deleteButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        nameSearchLabel = new javax.swing.JLabel();
        tidSearchLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        goButton2 = new javax.swing.JButton();
        tidInput = new javax.swing.JTextField();
        trainerDisplay = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        deleteButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        capturedList = new javax.swing.JList<>();
        whereLabel = new javax.swing.JLabel();
        pLevelLabel = new javax.swing.JLabel();
        whenLabel = new javax.swing.JLabel();
        whenDisplay = new javax.swing.JLabel();
        whereDisplay = new javax.swing.JLabel();
        pLevelDisplay = new javax.swing.JLabel();
        trainerLabel = new javax.swing.JLabel();
        capturedLabel = new javax.swing.JLabel();
        pokemonLabel = new javax.swing.JLabel();
        deleteButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adminBackButton.setText("BACK");
        adminBackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        trainerList.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        trainerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        trainerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainerListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(trainerList);

        deleteButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        nameSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameSearchLabel.setText("name: ");

        tidSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tidSearchLabel.setText("tid: ");

        nameInput.setBackground(new java.awt.Color(255, 255, 255));
        nameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        goButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton2.setText("GO");
        goButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButton2ActionPerformed(evt);
            }
        });

        tidInput.setBackground(new java.awt.Color(255, 255, 255));
        tidInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tidInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        trainerDisplay.setBackground(new java.awt.Color(255, 255, 255));
        trainerDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        trainerDisplay.setText(" ");
        trainerDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(deleteButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tidSearchLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(tidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addComponent(goButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameSearchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(goButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(trainerDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tidSearchLabel)
                            .addComponent(tidInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(goButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSearchLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trainerDisplay)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deleteButton2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        deleteButton2.setText("Delete");
        deleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton2ActionPerformed(evt);
            }
        });

        capturedList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        capturedList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capturedListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(capturedList);

        whereLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        whereLabel.setText("Where:");

        pLevelLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pLevelLabel.setText("Level:");

        whenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        whenLabel.setText("When:");

        whenDisplay.setBackground(new java.awt.Color(255, 255, 255));
        whenDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        whenDisplay.setText(" ");
        whenDisplay.setOpaque(true);

        whereDisplay.setBackground(new java.awt.Color(255, 255, 255));
        whereDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        whereDisplay.setText(" ");
        whereDisplay.setOpaque(true);

        pLevelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        pLevelDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        pLevelDisplay.setText(" ");
        pLevelDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(whenDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(whenLabel)
                        .addComponent(whereLabel)
                        .addComponent(pLevelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pLevelLabel)
                        .addComponent(whereDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(deleteButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whereLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whereDisplay)
                .addGap(17, 17, 17)
                .addComponent(whenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whenDisplay)
                .addGap(18, 18, 18)
                .addComponent(pLevelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pLevelDisplay)
                .addGap(18, 18, 18)
                .addComponent(deleteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        trainerLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerLabel.setText("Trainer");

        capturedLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        capturedLabel.setText("Captured");

        pokemonLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pokemonLabel.setText("Pokemon");

        deleteButton3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        deleteButton3.setText("Delete Latest");
        deleteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainerLabel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capturedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pokemonLabel)
                        .addGap(72, 72, 72)
                        .addComponent(adminBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trainerLabel)
                        .addComponent(capturedLabel)
                        .addComponent(pokemonLabel))
                    .addComponent(adminBackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayCapturedInfo() {
        GroupProject methods = new GroupProject();
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";"); //collect capture info
        
        String[] nameList = new String[methods.pnameList.size()];
        
        whereDisplay.setText(" ");                                          //clear displays that had old information
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
        
        for (int x = 0; x < nameList.length; x++) {                         //fill an array with caught pokemon
            nameList[x] = methods.pnameList.get(x);
        }
        capturedList.setListData(nameList);                                 //display pokemon in list
    }
    
    public void displayFullTrainerList(ArrayList<String> nameList, ArrayList<Integer> tidList) { //displays every trainer in a list
        String[] list = new String[nameList.size()];
        
        for (int x = 0; x < nameList.size(); x++) {
            list[x] = Integer.toString(tidList.get(x))+ ".  " + nameList.get(x); 
        }
        trainerList.setListData(list);
    }
    
    private void adminBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackButtonActionPerformed
        AdminFrame adminFrame = new AdminFrame();

        setVisible(false);
        adminFrame.setVisible(true);
    }//GEN-LAST:event_adminBackButtonActionPerformed

    private void trainerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainerListMouseClicked
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();                                                   //fill lists with all trainer info
        tid = methods.fullTidList.get(trainerList.getAnchorSelectionIndex());           //find tid associated with trainer in list
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");
        
        String[] nameList = new String[methods.pnameList.size()];
        
        whereDisplay.setText(" ");                                          //clear displays that had old information
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
            
        trainerDisplay.setText(" " + methods.username);                     //display name of trainer
        
        for (int x = 0; x < nameList.length; x++) {                         //collect captured pokemon names
            nameList[x] = methods.pnameList.get(x);
        }
        capturedList.setListData(nameList);                                 //display them in list
    }//GEN-LAST:event_trainerListMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        boolean matchFound = false;
        String[] eraseList = {" "};
        methods.getFullTrainerList();
        
        for (int x = 0; x < methods.fullTidList.size(); x++) {                    //loop checks to see if tid exists
            if (tid == methods.fullTidList.get(x)) {
                matchFound = true;
            }
        }

        if (matchFound == true) {                                                 //if so, delete all info pertaining to it
            methods.delete("delete from trainers where tid = " + tid + ";");
            methods.delete("delete from captured where tid = " + tid + ";");
            errorFrame.setMessage("Operation completed successfully.");
            methods.getFullTrainerList();                                         //update the fullTrainerList after deleting
            displayFullTrainerList(methods.fullTrainerList, methods.fullTidList); //and display it
            trainerDisplay.setText(" ");
            whereDisplay.setText(" ");
            whenDisplay.setText(" ");
            pLevelDisplay.setText(" ");
            capturedList.setListData(eraseList);
            errorFrame.setVisible(true);
        } else {
            errorFrame.setMessage("Invalid trainer input.");
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton2ActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        String where = "initialize";                                                //assign some values to variables
        String when = "all the time";
        int level = 1;
        int pid = 1;
        
        if (capturedList.getAnchorSelectionIndex() == -1) {                         //if no pokemon selected display error
            errorFrame.setMessage("No pokemon selected.");
            errorFrame.setVisible(true);
        } else {                                                                    //if selected, collect info to be deleted
            where = tempMethods.whereList.get(capturedList.getAnchorSelectionIndex());
            when = tempMethods.whenList.get(capturedList.getAnchorSelectionIndex());
            level = tempMethods.levelList.get(capturedList.getAnchorSelectionIndex());
            pid = tempMethods.pidList.get(capturedList.getAnchorSelectionIndex());
            methods.delete("delete from captured where tid = "+tid+" and pid = "+pid+" and city = "+"'"+where+"'"+" and date = "+"'"+when+"'"+" and plevel = "+level+";");
            displayCapturedInfo();
            errorFrame.setMessage("Operation completed successfully.");
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_deleteButton2ActionPerformed

    private void capturedListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capturedListMouseClicked
        whereDisplay.setText(" " + tempMethods.whereList.get(capturedList.getAnchorSelectionIndex()));
        whenDisplay.setText(" " + tempMethods.whenList.get(capturedList.getAnchorSelectionIndex()));
        pLevelDisplay.setText(" " + Integer.toString(tempMethods.levelList.get(capturedList.getAnchorSelectionIndex())));
    }//GEN-LAST:event_capturedListMouseClicked

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();
        tid = Integer.parseInt(tidInput.getText());
        boolean matchFound = false;

        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");   //get info associated with tid
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");

        String[] nameList = new String[methods.pnameList.size()];
        String[] eraseList = {" "};

        trainerDisplay.setText(" ");                         //clear displays that had old information
        whereDisplay.setText(" ");
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
        capturedList.setListData(eraseList);
        
        for (int x = 0; x < methods.fullTidList.size(); x++) {                //loop checks to see if tid exists
            if (tid == methods.fullTidList.get(x)) {
                matchFound = true;
            }
        }

        if (matchFound == true) {                                             //if tid exists, display the name
            trainerDisplay.setText(" " + methods.username);
        }

        for (int x = 0; x < nameList.length; x++) {                           //collect pokemon trainer owns
            nameList[x] = methods.pnameList.get(x);
        }
        capturedList.setListData(nameList);                                   //display the pokemon
    }//GEN-LAST:event_goButtonActionPerformed

    private void goButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton2ActionPerformed
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();
        String username = nameInput.getText();
        tid = 0;

        methods.getTrainerTid("select tid from trainers where username = " + "'"+username+"';");    //finds tid for trainer
        tid = methods.tid;
        
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";"); //get trainer info
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");

        String[] nameList = new String[methods.pnameList.size()];
        String[] eraseList = {" "};

        trainerDisplay.setText(" ");                                        //clear displays that had old information
        whereDisplay.setText(" ");
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
        capturedList.setListData(eraseList);

        if (tid != 0) {                                                     //if tid exists, display trainers name
            trainerDisplay.setText(" " + methods.username);
        }

        for (int x = 0; x < nameList.length; x++) {                         //collect pokemon trainer owns
            nameList[x] = methods.pnameList.get(x);
        }
        capturedList.setListData(nameList);                                 //display them
    }//GEN-LAST:event_goButton2ActionPerformed

    private void deleteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton3ActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        methods.getPokemonNamesAndStats();
        int pid = methods.fullPokedexList.size();                           //set the pid to be deleted to the last one
        
        methods.delete("delete from pokemon where pid = " + pid + ";");     //delete all info associated with pokemon
        methods.delete("delete from captured where pid = " + pid + ";");
        displayCapturedInfo();
        errorFrame.setMessage("Operation completed successfully.");
        errorFrame.setVisible(true);
    }//GEN-LAST:event_deleteButton3ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBackButton;
    private javax.swing.JLabel capturedLabel;
    private javax.swing.JList<String> capturedList;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton2;
    private javax.swing.JButton deleteButton3;
    private javax.swing.JButton goButton;
    private javax.swing.JButton goButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameSearchLabel;
    private javax.swing.JLabel pLevelDisplay;
    private javax.swing.JLabel pLevelLabel;
    private javax.swing.JLabel pokemonLabel;
    private javax.swing.JTextField tidInput;
    private javax.swing.JLabel tidSearchLabel;
    private javax.swing.JLabel trainerDisplay;
    private javax.swing.JLabel trainerLabel;
    private javax.swing.JList<String> trainerList;
    private javax.swing.JLabel whenDisplay;
    private javax.swing.JLabel whenLabel;
    private javax.swing.JLabel whereDisplay;
    private javax.swing.JLabel whereLabel;
    // End of variables declaration//GEN-END:variables
}
