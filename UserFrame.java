import java.util.ArrayList;

public class UserFrame extends javax.swing.JFrame {
    
    public static GroupProject univMethods;
    
    public UserFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLogoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        trainerTeamLabel = new javax.swing.JLabel();
        trainerGender = new javax.swing.JLabel();
        trainerTeam = new javax.swing.JLabel();
        trainerNameLabel = new javax.swing.JLabel();
        trainerLevelLabel = new javax.swing.JLabel();
        trainerGenderLabel = new javax.swing.JLabel();
        trainerName = new javax.swing.JLabel();
        trainerLevel = new javax.swing.JLabel();
        trainerBdayLabel = new javax.swing.JLabel();
        trainerBday = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        capturedLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caughtList = new javax.swing.JList<>();
        whereLabel = new javax.swing.JLabel();
        whereDisplay = new javax.swing.JLabel();
        whenLabel = new javax.swing.JLabel();
        whenDisplay = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        levelDisplay = new javax.swing.JLabel();
        basestatLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        statList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        pokedexLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pokedexList = new javax.swing.JList<>();
        hpLabel = new javax.swing.JLabel();
        atkLabel = new javax.swing.JLabel();
        spdefLabel = new javax.swing.JLabel();
        defLabel = new javax.swing.JLabel();
        spatkLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        atkDisplay = new javax.swing.JLabel();
        hpDisplay = new javax.swing.JLabel();
        spatkDisplay = new javax.swing.JLabel();
        defDisplay = new javax.swing.JLabel();
        speedDisplay = new javax.swing.JLabel();
        spdefDisplay = new javax.swing.JLabel();
        gifDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLogoutButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userLogoutButton.setText("LOGOUT");
        userLogoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLogoutButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        trainerTeamLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerTeamLabel.setText("Team:");

        trainerGender.setBackground(new java.awt.Color(255, 255, 255));
        trainerGender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trainerGender.setText("gender");
        trainerGender.setOpaque(true);

        trainerTeam.setBackground(new java.awt.Color(255, 255, 255));
        trainerTeam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trainerTeam.setText("team");
        trainerTeam.setOpaque(true);

        trainerNameLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerNameLabel.setText("Trainer:");

        trainerLevelLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerLevelLabel.setText("Level:");

        trainerGenderLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerGenderLabel.setText("Gender:");

        trainerName.setBackground(new java.awt.Color(255, 255, 255));
        trainerName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trainerName.setText("name");
        trainerName.setOpaque(true);

        trainerLevel.setBackground(new java.awt.Color(255, 255, 255));
        trainerLevel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trainerLevel.setText("level");
        trainerLevel.setOpaque(true);

        trainerBdayLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerBdayLabel.setText("Birthday:");

        trainerBday.setBackground(new java.awt.Color(255, 255, 255));
        trainerBday.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trainerBday.setText("birthday");
        trainerBday.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainerNameLabel)
                    .addComponent(trainerName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainerLevelLabel)
                    .addComponent(trainerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainerGenderLabel)
                    .addComponent(trainerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trainerTeamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trainerTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trainerBdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trainerBday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainerNameLabel)
                    .addComponent(trainerLevelLabel)
                    .addComponent(trainerGenderLabel)
                    .addComponent(trainerTeamLabel)
                    .addComponent(trainerBdayLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trainerName)
                        .addComponent(trainerLevel)
                        .addComponent(trainerGender))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trainerTeam)
                        .addComponent(trainerBday)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        capturedLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        capturedLabel.setText("Captured:");

        caughtList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caughtList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "pname 1", "pname 2", "..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        caughtList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caughtListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(caughtList);

        whereLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        whereLabel.setText("Where:");

        whereDisplay.setBackground(new java.awt.Color(255, 255, 255));
        whereDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        whereDisplay.setText(" ");
        whereDisplay.setOpaque(true);

        whenLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        whenLabel.setText("When:");

        whenDisplay.setBackground(new java.awt.Color(255, 255, 255));
        whenDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        whenDisplay.setText(" ");
        whenDisplay.setOpaque(true);

        levelLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        levelLabel.setText("Level:");

        levelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        levelDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        levelDisplay.setText(" ");
        levelDisplay.setOpaque(true);

        basestatLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        basestatLabel.setText("Base Stats:");

        statList.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        statList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(statList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capturedLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(whereLabel)
                            .addComponent(whenLabel)
                            .addComponent(levelLabel)
                            .addComponent(basestatLabel)
                            .addComponent(whereDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(whenDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(levelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capturedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(whereLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whereDisplay)
                        .addGap(12, 12, 12)
                        .addComponent(whenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whenDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(levelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(levelDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(basestatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pokedexLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pokedexLabel.setText("Pokedex:");

        pokedexList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pokedexList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "pname 1", "pname 2", "..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pokedexList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokedexListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(pokedexList);

        hpLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hpLabel.setText("HP:");

        atkLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        atkLabel.setText("ATK:");

        spdefLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spdefLabel.setText("SPDEF:");

        defLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        defLabel.setText("DEF:");

        spatkLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spatkLabel.setText("SPATK:");

        speedLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        speedLabel.setText("SPEED:");

        atkDisplay.setBackground(new java.awt.Color(255, 255, 255));
        atkDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        atkDisplay.setText(" ");
        atkDisplay.setOpaque(true);

        hpDisplay.setBackground(new java.awt.Color(255, 255, 255));
        hpDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        hpDisplay.setText(" ");
        hpDisplay.setOpaque(true);

        spatkDisplay.setBackground(new java.awt.Color(255, 255, 255));
        spatkDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        spatkDisplay.setText(" ");
        spatkDisplay.setOpaque(true);

        defDisplay.setBackground(new java.awt.Color(255, 255, 255));
        defDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        defDisplay.setText(" ");
        defDisplay.setOpaque(true);

        speedDisplay.setBackground(new java.awt.Color(255, 255, 255));
        speedDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        speedDisplay.setText(" ");
        speedDisplay.setOpaque(true);

        spdefDisplay.setBackground(new java.awt.Color(255, 255, 255));
        spdefDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        spdefDisplay.setText(" ");
        spdefDisplay.setOpaque(true);

        gifDisplay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Numnumberry\\Documents\\NetBeansProjects\\GroupProject\\src\\pokedexResized2.gif")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pokedexLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(atkLabel)
                                    .addComponent(hpLabel)
                                    .addComponent(defLabel)
                                    .addComponent(spatkLabel)
                                    .addComponent(spdefLabel)
                                    .addComponent(speedLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hpDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(atkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spatkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(defDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spdefDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(gifDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pokedexLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hpLabel)
                            .addComponent(hpDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atkLabel)
                            .addComponent(atkDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(defLabel)
                            .addComponent(defDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spatkLabel)
                            .addComponent(spatkDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spdefLabel)
                            .addComponent(spdefDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedLabel)
                            .addComponent(speedDisplay))
                        .addGap(12, 12, 12)
                        .addComponent(gifDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public static void setMethods(GroupProject methods) {
        univMethods = methods;                                  //have own global copy of methods to be used by this class
    }
    private void userLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLogoutButtonActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        
        setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_userLogoutButtonActionPerformed

    private void caughtListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caughtListMouseClicked
        whereDisplay.setText(" " + univMethods.whereList.get(caughtList.getAnchorSelectionIndex())); //display info associated with chosen pokemon
        whenDisplay.setText(" " + univMethods.whenList.get(caughtList.getAnchorSelectionIndex()));
        levelDisplay.setText(" " + Integer.toString(univMethods.levelList.get(caughtList.getAnchorSelectionIndex())));
        
        int statListBaseIndex = caughtList.getAnchorSelectionIndex() * 6;
        String[] list = new String[6];
        String[] labelList = {"hp:       ", "atk:      ", "def:      ", "spatk:    ", "spdef:    ", "speed:    "};
        
        for (int x = statListBaseIndex; x < statListBaseIndex + 6; x++) {
            list[x - statListBaseIndex] = labelList[x - statListBaseIndex] + Integer.toString(univMethods.statList.get(x)) + " ";
        }
        statList.setListData(list);                         //put the pokemons stats on display
    }//GEN-LAST:event_caughtListMouseClicked

    private void pokedexListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokedexListMouseClicked
        int statListBaseIndex = pokedexList.getAnchorSelectionIndex() * 6;          //create a base index for all pokemon stats
        
        hpDisplay.setText(" " + Integer.toString(univMethods.fullStatList.get(statListBaseIndex)));     //display a chosen pokemons stats
        atkDisplay.setText(" " + Integer.toString(univMethods.fullStatList.get(statListBaseIndex + 1)));
        defDisplay.setText(" " + Integer.toString(univMethods.fullStatList.get(statListBaseIndex + 2)));
        spatkDisplay.setText(" " + Integer.toString(univMethods.fullStatList.get(statListBaseIndex + 3)));
        spdefDisplay.setText(" " + Integer.toString(univMethods.fullStatList.get(statListBaseIndex + 4)));
        speedDisplay.setText(" " + Integer.toString(univMethods.fullStatList.get(statListBaseIndex + 5)));
    }//GEN-LAST:event_pokedexListMouseClicked

    public static void setTrainerInfo(UserFrame frame, String name, int level, String gender, String team, String bday) { //method displays trainer info
        frame.trainerName.setText(" " + name);
        frame.trainerLevel.setText(" " + Integer.toString(level));
        frame.trainerTeam.setText(" " + team);
        frame.trainerGender.setText(" " + gender);
        frame.trainerBday.setText(" " + bday);
    }
    
    public static void displayPokemonNames(UserFrame frame, ArrayList<String> list) { //displays names of owned pokemon
        String[] nameList = new String[list.size()];
        String[] pokedexList = new String[univMethods.fullPokedexList.size()];
        
        for (int x = 0; x < nameList.length; x++) {             //fill String[] with ArrayList elements to be passed into list
            nameList[x] = list.get(x);
        }
        frame.caughtList.setListData(nameList);
        
        for (int i = 0; i < pokedexList.length; i++) {
            pokedexList[i] = univMethods.fullPokedexList.get(i);
        }
        frame.pokedexList.setListData(pokedexList);
    }
    
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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atkDisplay;
    private javax.swing.JLabel atkLabel;
    private javax.swing.JLabel basestatLabel;
    private javax.swing.JLabel capturedLabel;
    private javax.swing.JList<String> caughtList;
    private javax.swing.JLabel defDisplay;
    private javax.swing.JLabel defLabel;
    private javax.swing.JLabel gifDisplay;
    private javax.swing.JLabel hpDisplay;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel levelDisplay;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel pokedexLabel;
    private javax.swing.JList<String> pokedexList;
    private javax.swing.JLabel spatkDisplay;
    private javax.swing.JLabel spatkLabel;
    private javax.swing.JLabel spdefDisplay;
    private javax.swing.JLabel spdefLabel;
    private javax.swing.JLabel speedDisplay;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JList<String> statList;
    private javax.swing.JLabel trainerBday;
    private javax.swing.JLabel trainerBdayLabel;
    private javax.swing.JLabel trainerGender;
    private javax.swing.JLabel trainerGenderLabel;
    private javax.swing.JLabel trainerLevel;
    private javax.swing.JLabel trainerLevelLabel;
    private javax.swing.JLabel trainerName;
    private javax.swing.JLabel trainerNameLabel;
    private javax.swing.JLabel trainerTeam;
    private javax.swing.JLabel trainerTeamLabel;
    private javax.swing.JButton userLogoutButton;
    private javax.swing.JLabel whenDisplay;
    private javax.swing.JLabel whenLabel;
    private javax.swing.JLabel whereDisplay;
    private javax.swing.JLabel whereLabel;
    // End of variables declaration//GEN-END:variables
}
