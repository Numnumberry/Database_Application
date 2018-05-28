import java.util.ArrayList;

public class SearchFrame extends javax.swing.JFrame {
    
    public static GroupProject tempMethods;                         //field stores instance of GroupProject class
    public ArrayList<String> fullTrainerList = new ArrayList<>();
    
    public SearchFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminBackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainerList = new javax.swing.JList<>();
        goButton = new javax.swing.JButton();
        trainerLabel = new javax.swing.JLabel();
        trainerDisplay = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        levelDisplay = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderDisplay = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        teamDisplay = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        bdayDisplay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        capturedLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        caughtList = new javax.swing.JList<>();
        whereLabel = new javax.swing.JLabel();
        pLevelLabel = new javax.swing.JLabel();
        whenLabel = new javax.swing.JLabel();
        whenDisplay = new javax.swing.JLabel();
        whereDisplay = new javax.swing.JLabel();
        pLevelDisplay = new javax.swing.JLabel();
        tidInput = new javax.swing.JTextField();
        nameSearchLabel = new javax.swing.JLabel();
        tidSearchLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        goButton2 = new javax.swing.JButton();
        trainerLabel1 = new javax.swing.JLabel();
        passwordDisplay = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pokedexList = new javax.swing.JList<>();
        speedDisplay = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        spdefDisplay = new javax.swing.JLabel();
        atkLabel = new javax.swing.JLabel();
        spdefLabel = new javax.swing.JLabel();
        defLabel = new javax.swing.JLabel();
        spatkLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        atkDisplay = new javax.swing.JLabel();
        hpDisplay = new javax.swing.JLabel();
        spatkDisplay = new javax.swing.JLabel();
        defDisplay = new javax.swing.JLabel();
        pnameSearchLabel = new javax.swing.JLabel();
        goButton3 = new javax.swing.JButton();
        pNumSearchLabel = new javax.swing.JLabel();
        pnameInput = new javax.swing.JTextField();
        goButton4 = new javax.swing.JButton();
        pNumInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pokemonLabel = new javax.swing.JLabel();
        pokemonDisplay = new javax.swing.JLabel();
        trainerSearchLabel = new javax.swing.JLabel();
        pokemonSearchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adminBackButton.setText("BACK");
        adminBackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        goButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        trainerLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        trainerLabel.setText("Trainer:");

        trainerDisplay.setBackground(new java.awt.Color(255, 255, 255));
        trainerDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        trainerDisplay.setText(" ");
        trainerDisplay.setOpaque(true);

        levelLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        levelLabel.setText("Level:");

        levelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        levelDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        levelDisplay.setText(" ");
        levelDisplay.setOpaque(true);

        genderLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        genderLabel.setText("Gender:");

        genderDisplay.setBackground(new java.awt.Color(255, 255, 255));
        genderDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        genderDisplay.setText(" ");
        genderDisplay.setOpaque(true);

        teamLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        teamLabel.setText("Team:");

        teamDisplay.setBackground(new java.awt.Color(255, 255, 255));
        teamDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        teamDisplay.setText(" ");
        teamDisplay.setOpaque(true);

        birthdayLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        birthdayLabel.setText("Birthday:");

        bdayDisplay.setBackground(new java.awt.Color(255, 255, 255));
        bdayDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        bdayDisplay.setText(" ");
        bdayDisplay.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        capturedLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        capturedLabel.setText("Captured:");

        caughtList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caughtList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caughtListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(caughtList);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(whereDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(whenLabel)
                                    .addComponent(whereLabel)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pLevelDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pLevelLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(whenDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(capturedLabel))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capturedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tidInput.setBackground(new java.awt.Color(255, 255, 255));
        tidInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tidInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nameSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameSearchLabel.setText("Search name: ");

        tidSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tidSearchLabel.setText("Search tid: ");

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

        trainerLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        trainerLabel1.setText("Password:");

        passwordDisplay.setBackground(new java.awt.Color(255, 255, 255));
        passwordDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        passwordDisplay.setText(" ");
        passwordDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tidSearchLabel)
                            .addComponent(nameSearchLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(goButton2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLabel)
                                    .addComponent(birthdayLabel)
                                    .addComponent(genderLabel)
                                    .addComponent(levelLabel)
                                    .addComponent(trainerLabel))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trainerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teamDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bdayDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(trainerLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(passwordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goButton)
                            .addComponent(tidInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tidSearchLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameSearchLabel)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(goButton2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trainerLabel)
                            .addComponent(trainerDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordDisplay)
                            .addComponent(trainerLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(levelLabel)
                            .addComponent(levelDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamLabel)
                            .addComponent(teamDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayLabel)
                            .addComponent(bdayDisplay))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        speedDisplay.setBackground(new java.awt.Color(255, 255, 255));
        speedDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        speedDisplay.setText(" ");
        speedDisplay.setOpaque(true);

        hpLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hpLabel.setText("HP:");

        spdefDisplay.setBackground(new java.awt.Color(255, 255, 255));
        spdefDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        spdefDisplay.setText(" ");
        spdefDisplay.setOpaque(true);

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

        pnameSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pnameSearchLabel.setText("Search name: ");

        goButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton3.setText("GO");
        goButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButton3ActionPerformed(evt);
            }
        });

        pNumSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pNumSearchLabel.setText("Search p#: ");

        pnameInput.setBackground(new java.awt.Color(255, 255, 255));
        pnameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        goButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton4.setText("GO");
        goButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButton4ActionPerformed(evt);
            }
        });

        pNumInput.setBackground(new java.awt.Color(255, 255, 255));
        pNumInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pNumInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Numnumberry\\Documents\\NetBeansProjects\\GroupProject\\src\\pokedexResized4.gif")); // NOI18N

        pokemonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pokemonLabel.setText("Pokemon:");

        pokemonDisplay.setBackground(new java.awt.Color(255, 255, 255));
        pokemonDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        pokemonDisplay.setText(" ");
        pokemonDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atkLabel)
                            .addComponent(hpLabel)
                            .addComponent(defLabel)
                            .addComponent(spatkLabel)
                            .addComponent(spdefLabel)
                            .addComponent(speedLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hpDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spatkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spdefDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(pokemonLabel)
                                    .addGap(67, 67, 67)
                                    .addComponent(pokemonDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pNumSearchLabel)
                                        .addComponent(pnameSearchLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(goButton3)
                                        .addComponent(goButton4)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton3)
                    .addComponent(pNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pNumSearchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pnameSearchLabel)
                        .addComponent(pnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(goButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokemonLabel)
                    .addComponent(pokemonDisplay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpLabel)
                    .addComponent(hpDisplay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atkLabel)
                    .addComponent(atkDisplay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defLabel)
                    .addComponent(defDisplay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatkLabel)
                    .addComponent(spatkDisplay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spdefLabel)
                    .addComponent(spdefDisplay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedLabel)
                    .addComponent(speedDisplay))
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        trainerSearchLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerSearchLabel.setText("Trainer Search");

        pokemonSearchLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pokemonSearchLabel.setText("Pokemon Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainerSearchLabel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pokemonSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminBackButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pokemonSearchLabel)
                        .addComponent(trainerSearchLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayFullTrainerList(ArrayList<String> nameList, ArrayList<Integer> tidList) { //displays a list of all trainers and tid's
        String[] list = new String[nameList.size()];
        fullTrainerList = nameList;
        
        for (int x = 0; x < nameList.size(); x++) {
            list[x] = Integer.toString(tidList.get(x))+ ".  " + nameList.get(x); 
        }
        trainerList.setListData(list);
    }
    
    public void displayFullPokemonList(ArrayList<String> nameList) { //displays a list of all pokemon and pid's
        String[] list = new String[nameList.size()];
        
        for (int x = 0; x < nameList.size(); x++) {
            list[x] = nameList.get(x);
        }
        pokedexList.setListData(list);
    }
    
    private void adminBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackButtonActionPerformed
        AdminFrame adminFrame = new AdminFrame();
        
        setVisible(false);
        adminFrame.setVisible(true);
    }//GEN-LAST:event_adminBackButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();                       //fill list with usernames of all trainers
        boolean matchFound = false;
        int tid = Integer.parseInt(tidInput.getText());

        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";"); //get captured info for trainer
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");          //get trainer info for trainer
        
        String[] nameList = new String[methods.pnameList.size()];
        String[] eraseList = {" "};
        
        trainerDisplay.setText(" ");                         //clear displays that had old information
        passwordDisplay.setText(" ");
        levelDisplay.setText(" ");
        genderDisplay.setText(" ");
        teamDisplay.setText(" ");
        bdayDisplay.setText(" ");
        whereDisplay.setText(" ");
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
        caughtList.setListData(eraseList);
        
        for (int x = 0; x < methods.fullTidList.size(); x++) {          //loop checks to see if tid exists
            if (tid == methods.fullTidList.get(x)) {
                matchFound = true;
            }
        }
            
        if (matchFound == true) {                                       //if tid exists, display info associated with it
            trainerDisplay.setText(" " + methods.username);
            passwordDisplay.setText(" " + methods.password);
            levelDisplay.setText(" " + Integer.toString(methods.tlevel));
            genderDisplay.setText(" " + methods.gender);
            teamDisplay.setText(" " + methods.team);
            bdayDisplay.setText(" " + methods.bday);
        }
        
        for (int x = 0; x < nameList.length; x++) {                     //collect names in array
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);                               //display these names in list
    }//GEN-LAST:event_goButtonActionPerformed

    private void trainerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainerListMouseClicked
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();                                   //get usernames for all trainers
        int tid = methods.fullTidList.get(trainerList.getAnchorSelectionIndex());
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");   //get capture info for trainer
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");   //get trainer info for trainer
        
        String[] nameList = new String[methods.pnameList.size()];
        
        whereDisplay.setText(" ");                                          //clear displays that had old information
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
            
        trainerDisplay.setText(" " + methods.username);                     //display the info for trainer
        passwordDisplay.setText(" " + methods.password);
        levelDisplay.setText(" " + Integer.toString(methods.tlevel));
        genderDisplay.setText(" " + methods.gender);
        teamDisplay.setText(" " + methods.team);
        bdayDisplay.setText(" " + methods.bday);
        
        for (int x = 0; x < nameList.length; x++) {                         //store the trainers pokemon in an array
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);                                   //display them in list
    }//GEN-LAST:event_trainerListMouseClicked

    private void caughtListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caughtListMouseClicked
        whereDisplay.setText(" " + tempMethods.whereList.get(caughtList.getAnchorSelectionIndex()));
        whenDisplay.setText(" " + tempMethods.whenList.get(caughtList.getAnchorSelectionIndex()));
        pLevelDisplay.setText(" " + Integer.toString(tempMethods.levelList.get(caughtList.getAnchorSelectionIndex())));
    }//GEN-LAST:event_caughtListMouseClicked

    private void goButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton2ActionPerformed
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        String username = nameInput.getText();
        int tid = 0;
        
        methods.getTrainerTid("select tid from trainers where username = "+ "'"+username+"';");     //finds tid for trainer
        tid = methods.tid;
        
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");   //get capture info for trainer
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");   //get trainer info for trainer
        
        String[] nameList = new String[methods.pnameList.size()];
        String[] eraseList = {" "};
        
        trainerDisplay.setText(" ");                                        //clear displays that had old information
        passwordDisplay.setText(" ");
        levelDisplay.setText(" ");
        genderDisplay.setText(" ");
        teamDisplay.setText(" ");
        bdayDisplay.setText(" ");
        whereDisplay.setText(" ");
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
        caughtList.setListData(eraseList);
            
        if (tid != 0) {                                                     //if tid exists, then display trainer info
            trainerDisplay.setText(" " + methods.username);
            passwordDisplay.setText(" " + methods.password);
            levelDisplay.setText(" " + Integer.toString(methods.tlevel));
            genderDisplay.setText(" " + methods.gender);
            teamDisplay.setText(" " + methods.team);
            bdayDisplay.setText(" " + methods.bday);
        }
        
        for (int x = 0; x < nameList.length; x++) {                         //store caught pokemon in array
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);                                   //display pokemon in list
    }//GEN-LAST:event_goButton2ActionPerformed

    private void pokedexListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokedexListMouseClicked
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();                                  //collect all pokemon info
        int statListBaseIndex = pokedexList.getAnchorSelectionIndex() * 6;  //make a base index variable and multiply by 6 b/c each
                                                                            //pokemon has 6 stats
        pokemonDisplay.setText(" " + methods.fullPokemonList.get(pokedexList.getAnchorSelectionIndex()));   //display selected pokemon info
        hpDisplay.setText(" " + Integer.toString(methods.fullStatList.get(statListBaseIndex)));
        atkDisplay.setText(" " + Integer.toString(methods.fullStatList.get(statListBaseIndex + 1)));
        defDisplay.setText(" " + Integer.toString(methods.fullStatList.get(statListBaseIndex + 2)));
        spatkDisplay.setText(" " + Integer.toString(methods.fullStatList.get(statListBaseIndex + 3)));
        spdefDisplay.setText(" " + Integer.toString(methods.fullStatList.get(statListBaseIndex + 4)));
        speedDisplay.setText(" " + Integer.toString(methods.fullStatList.get(statListBaseIndex + 5)));
    }//GEN-LAST:event_pokedexListMouseClicked

    private void goButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton3ActionPerformed
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();                                  //get all pokemon info
        String statListBaseIndex = pNumInput.getText();
        int baseIndex = (Integer.parseInt(statListBaseIndex) - 1) * 6;      //create a base index variable and mult by 6 b/c
                                                                            //each pokemon has 6 stats
        pokemonDisplay.setText(" ");                                        //clear previous info
        hpDisplay.setText(" ");
        atkDisplay.setText(" ");
        defDisplay.setText(" ");
        spatkDisplay.setText(" ");
        spdefDisplay.setText(" ");
        speedDisplay.setText(" ");
                
        if (baseIndex >= 0 && baseIndex < methods.fullPokemonList.size() * 6) {     //if the index exists, display info
            pokemonDisplay.setText(" " + methods.fullPokemonList.get(Integer.parseInt(pNumInput.getText()) - 1));
            hpDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex)));
            atkDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 1)));
            defDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 2)));
            spatkDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 3)));
            spdefDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 4)));
            speedDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 5)));
        }
    }//GEN-LAST:event_goButton3ActionPerformed

    private void goButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton4ActionPerformed
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();                                  //get all pokemon info
        String input = pnameInput.getText();
        int statListBaseIndex = -1;
        int baseIndex;
        int pid;
        
        for (int x = 0; x < methods.fullPokemonList.size(); x++) {          //loop finds if pokemon input exists
            if (input.equals(methods.fullPokemonList.get(x))) {             //if so, then get the base index
                statListBaseIndex = x;
            }
        }
        pid = statListBaseIndex;                                            //the base index before mult is pid
        baseIndex = statListBaseIndex * 6;                                  //mult by 6 b/c pokemon have 6 stats
        
        pokemonDisplay.setText(" ");                                        //clear previous info
        hpDisplay.setText(" ");
        atkDisplay.setText(" ");
        defDisplay.setText(" ");
        spatkDisplay.setText(" ");
        spdefDisplay.setText(" ");
        speedDisplay.setText(" ");
                
        if (baseIndex >= 0 && baseIndex < methods.fullPokemonList.size() * 6) {     //if base index valid, display info
            pokemonDisplay.setText(" " + methods.fullPokemonList.get(pid));
            hpDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex)));
            atkDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 1)));
            defDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 2)));
            spatkDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 3)));
            spdefDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 4)));
            speedDisplay.setText(" " + Integer.toString(methods.fullStatList.get(baseIndex + 5)));
        }
    }//GEN-LAST:event_goButton4ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBackButton;
    private javax.swing.JLabel atkDisplay;
    private javax.swing.JLabel atkLabel;
    private javax.swing.JLabel bdayDisplay;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel capturedLabel;
    private javax.swing.JList<String> caughtList;
    private javax.swing.JLabel defDisplay;
    private javax.swing.JLabel defLabel;
    private javax.swing.JLabel genderDisplay;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton goButton;
    private javax.swing.JButton goButton2;
    private javax.swing.JButton goButton3;
    private javax.swing.JButton goButton4;
    private javax.swing.JLabel hpDisplay;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel levelDisplay;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameSearchLabel;
    private javax.swing.JLabel pLevelDisplay;
    private javax.swing.JLabel pLevelLabel;
    private javax.swing.JTextField pNumInput;
    private javax.swing.JLabel pNumSearchLabel;
    private javax.swing.JLabel passwordDisplay;
    private javax.swing.JTextField pnameInput;
    private javax.swing.JLabel pnameSearchLabel;
    private javax.swing.JList<String> pokedexList;
    private javax.swing.JLabel pokemonDisplay;
    private javax.swing.JLabel pokemonLabel;
    private javax.swing.JLabel pokemonSearchLabel;
    private javax.swing.JLabel spatkDisplay;
    private javax.swing.JLabel spatkLabel;
    private javax.swing.JLabel spdefDisplay;
    private javax.swing.JLabel spdefLabel;
    private javax.swing.JLabel speedDisplay;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel teamDisplay;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JTextField tidInput;
    private javax.swing.JLabel tidSearchLabel;
    private javax.swing.JLabel trainerDisplay;
    private javax.swing.JLabel trainerLabel;
    private javax.swing.JLabel trainerLabel1;
    private javax.swing.JList<String> trainerList;
    private javax.swing.JLabel trainerSearchLabel;
    private javax.swing.JLabel whenDisplay;
    private javax.swing.JLabel whenLabel;
    private javax.swing.JLabel whereDisplay;
    private javax.swing.JLabel whereLabel;
    // End of variables declaration//GEN-END:variables
}
