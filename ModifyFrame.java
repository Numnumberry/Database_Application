import java.util.ArrayList;

public class ModifyFrame extends javax.swing.JFrame {

    public static GroupProject tempMethods;         //fields here store info for multiple method access
    public static int tid = 0;
    public static String pokeName = "@";
    public static int oldHp = 0;
    public static int oldAtk = 0;
    public static int oldDef = 0;
    public static int oldSpatk = 0;
    public static int oldSpdef = 0;
    public static int oldSpeed = 0;
    
    public ModifyFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminBackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pokedexList = new javax.swing.JList<>();
        hpLabel = new javax.swing.JLabel();
        atkLabel = new javax.swing.JLabel();
        spdefLabel = new javax.swing.JLabel();
        defLabel = new javax.swing.JLabel();
        spatkLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        pnameSearchLabel = new javax.swing.JLabel();
        goButton3 = new javax.swing.JButton();
        pNumSearchLabel = new javax.swing.JLabel();
        pnameInput = new javax.swing.JTextField();
        goButton4 = new javax.swing.JButton();
        pNumInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        modifyButton3 = new javax.swing.JButton();
        pokemonLabel = new javax.swing.JLabel();
        pokemonDisplay = new javax.swing.JTextField();
        defDisplay = new javax.swing.JTextField();
        atkDisplay = new javax.swing.JTextField();
        spatkDisplay = new javax.swing.JTextField();
        spdefDisplay = new javax.swing.JTextField();
        speedDisplay = new javax.swing.JTextField();
        hpDisplay = new javax.swing.JTextField();
        trainerSearchLabel = new javax.swing.JLabel();
        pokemonSearchLabel = new javax.swing.JLabel();
        trainerDisplay = new javax.swing.JTextField();
        levelDisplay = new javax.swing.JTextField();
        teamDisplay = new javax.swing.JTextField();
        genderDisplay = new javax.swing.JTextField();
        bdayDisplay = new javax.swing.JTextField();
        pLevelDisplay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainerList = new javax.swing.JList<>();
        teamLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        tidInput = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        nameSearchLabel = new javax.swing.JLabel();
        trainerLabel = new javax.swing.JLabel();
        tidSearchLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        goButton2 = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        capturedLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        caughtList = new javax.swing.JList<>();
        whereLabel = new javax.swing.JLabel();
        pLevelLabel = new javax.swing.JLabel();
        whenLabel = new javax.swing.JLabel();
        whereDisplay = new javax.swing.JTextField();
        whenDisplay = new javax.swing.JTextField();
        pnameDisplay = new javax.swing.JTextField();
        pnameLabel = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        modifyButton2 = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        passwordDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adminBackButton.setText("BACK");
        adminBackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });

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

        modifyButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        modifyButton3.setText("Modify");
        modifyButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButton3ActionPerformed(evt);
            }
        });

        pokemonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pokemonLabel.setText("Pokemon:");

        pokemonDisplay.setBackground(new java.awt.Color(255, 255, 255));
        pokemonDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        defDisplay.setBackground(new java.awt.Color(255, 255, 255));
        defDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        atkDisplay.setBackground(new java.awt.Color(255, 255, 255));
        atkDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        spatkDisplay.setBackground(new java.awt.Color(255, 255, 255));
        spatkDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        spdefDisplay.setBackground(new java.awt.Color(255, 255, 255));
        spdefDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        speedDisplay.setBackground(new java.awt.Color(255, 255, 255));
        speedDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        hpDisplay.setBackground(new java.awt.Color(255, 255, 255));
        hpDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
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
                                    .addComponent(goButton4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(atkLabel)
                                    .addComponent(hpLabel)
                                    .addComponent(defLabel)
                                    .addComponent(spatkLabel)
                                    .addComponent(spdefLabel)
                                    .addComponent(speedLabel)
                                    .addComponent(pokemonLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pokemonDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(defDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spdefDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spatkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hpDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(atkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(modifyButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pokemonLabel)
                            .addComponent(pokemonDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hpDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hpLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atkLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(defDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spatkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spatkLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spdefDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spdefLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedLabel))
                        .addGap(55, 55, 55)
                        .addComponent(modifyButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        trainerSearchLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerSearchLabel.setText("Trainer Search");

        pokemonSearchLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pokemonSearchLabel.setText("Pokemon Search");

        trainerDisplay.setBackground(new java.awt.Color(255, 255, 255));
        trainerDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        levelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        levelDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        teamDisplay.setBackground(new java.awt.Color(255, 255, 255));
        teamDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        genderDisplay.setBackground(new java.awt.Color(255, 255, 255));
        genderDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        bdayDisplay.setBackground(new java.awt.Color(255, 255, 255));
        bdayDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        pLevelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        pLevelDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

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

        teamLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        teamLabel.setText("Team:");

        birthdayLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        birthdayLabel.setText("Birthday:");

        tidInput.setBackground(new java.awt.Color(255, 255, 255));
        tidInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tidInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        goButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        nameSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameSearchLabel.setText("Search name: ");

        trainerLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        trainerLabel.setText("Trainer:");

        tidSearchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tidSearchLabel.setText("Search tid: ");

        nameInput.setBackground(new java.awt.Color(255, 255, 255));
        nameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        levelLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        levelLabel.setText("Level:");

        goButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goButton2.setText("GO");
        goButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButton2ActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        genderLabel.setText("Gender:");

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

        whereDisplay.setBackground(new java.awt.Color(255, 255, 255));
        whereDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        whenDisplay.setBackground(new java.awt.Color(255, 255, 255));
        whenDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        pnameDisplay.setBackground(new java.awt.Color(255, 255, 255));
        pnameDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        pnameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pnameLabel.setText("Pokemon:");

        modifyButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        modifyButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        modifyButton2.setText("Modify");
        modifyButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButton2ActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordLabel.setText("Pass:");

        passwordDisplay.setBackground(new java.awt.Color(255, 255, 255));
        passwordDisplay.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainerSearchLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(whenLabel)
                                    .addComponent(whereLabel)
                                    .addComponent(pLevelLabel)
                                    .addComponent(whereDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(whenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pLevelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnameLabel)
                                    .addComponent(pnameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(capturedLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameSearchLabel)
                                            .addComponent(tidSearchLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(goButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(goButton))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(trainerLabel)
                                            .addComponent(passwordLabel))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(trainerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(levelLabel)
                                            .addComponent(genderLabel)
                                            .addComponent(teamLabel)
                                            .addComponent(birthdayLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(teamDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(levelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bdayDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(modifyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pokemonSearchLabel)
                        .addGap(197, 197, 197)
                        .addComponent(adminBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trainerSearchLabel)
                            .addComponent(pokemonSearchLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adminBackButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(goButton)
                                    .addComponent(tidInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tidSearchLabel))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameSearchLabel)
                                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(goButton2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(trainerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trainerLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(levelLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(genderLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(teamLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(birthdayLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(levelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(genderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(teamDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bdayDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(capturedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pnameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(whereLabel)
                                        .addGap(3, 3, 3)
                                        .addComponent(whereDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(whenLabel)
                                        .addGap(4, 4, 4)
                                        .addComponent(whenDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pLevelLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pLevelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modifyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackButtonActionPerformed
        AdminFrame adminFrame = new AdminFrame();

        setVisible(false);
        adminFrame.setVisible(true);
    }//GEN-LAST:event_adminBackButtonActionPerformed

    private void pokedexListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokedexListMouseClicked
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();                                          //collect all pokemon info
        int statListBaseIndex = pokedexList.getAnchorSelectionIndex() * 6;          //create a base index to access stats
        pokeName = methods.fullPokemonList.get(pokedexList.getAnchorSelectionIndex()); //set the global pokemon name

        oldHp = methods.fullStatList.get(statListBaseIndex);                        //set global pokemon stats
        oldAtk = methods.fullStatList.get(statListBaseIndex + 1);
        oldDef = methods.fullStatList.get(statListBaseIndex + 2);
        oldSpatk = methods.fullStatList.get(statListBaseIndex + 3);
        oldSpdef = methods.fullStatList.get(statListBaseIndex + 4);
        oldSpeed = methods.fullStatList.get(statListBaseIndex + 5);
        
        pokemonDisplay.setText(methods.fullPokemonList.get(pokedexList.getAnchorSelectionIndex())); //display selected pokemon info
        hpDisplay.setText(Integer.toString(methods.fullStatList.get(statListBaseIndex)));
        atkDisplay.setText(Integer.toString(methods.fullStatList.get(statListBaseIndex + 1)));
        defDisplay.setText(Integer.toString(methods.fullStatList.get(statListBaseIndex + 2)));
        spatkDisplay.setText(Integer.toString(methods.fullStatList.get(statListBaseIndex + 3)));
        spdefDisplay.setText(Integer.toString(methods.fullStatList.get(statListBaseIndex + 4)));
        speedDisplay.setText(Integer.toString(methods.fullStatList.get(statListBaseIndex + 5)));
    }//GEN-LAST:event_pokedexListMouseClicked

    private void goButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton3ActionPerformed
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();
        String statListBaseIndex = pNumInput.getText();                 //collect admin input
        int baseIndex = (Integer.parseInt(statListBaseIndex) - 1) * 6;  //mult by 6 to get base index

        pokemonDisplay.setText(" ");                                    //clear previous displays
        hpDisplay.setText(" ");
        atkDisplay.setText(" ");
        defDisplay.setText(" ");
        spatkDisplay.setText(" ");
        spdefDisplay.setText(" ");
        speedDisplay.setText(" ");

        if (baseIndex >= 0 && baseIndex < methods.fullPokemonList.size() * 6) {     //see if base index valid
            pokeName = methods.fullPokemonList.get(Integer.parseInt(pNumInput.getText()) - 1); //if so, collect information
            pokemonDisplay.setText(methods.fullPokemonList.get(Integer.parseInt(pNumInput.getText()) - 1));
            
            oldHp = methods.fullStatList.get(baseIndex);                //set global variables
            oldAtk = methods.fullStatList.get(baseIndex + 1);
            oldDef = methods.fullStatList.get(baseIndex + 2);
            oldSpatk = methods.fullStatList.get(baseIndex + 3);
            oldSpdef = methods.fullStatList.get(baseIndex + 4);
            oldSpeed = methods.fullStatList.get(baseIndex + 5);
            
            hpDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex)));   //display stats
            atkDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 1)));
            defDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 2)));
            spatkDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 3)));
            spdefDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 4)));
            speedDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 5)));
        }
    }//GEN-LAST:event_goButton3ActionPerformed

    private void goButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton4ActionPerformed
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();
        String input = pnameInput.getText();
        int statListBaseIndex = -1;
        int baseIndex;
        int pid;
        
        for (int x = 0; x < methods.fullPokemonList.size(); x++) {      //check to see if pokemon exists
            if (input.equals(methods.fullPokemonList.get(x))) {
                statListBaseIndex = x;
            }
        }
        pid = statListBaseIndex;                                        //pid is same as base index
        baseIndex = statListBaseIndex * 6;                              //mult by 6

        pokemonDisplay.setText(" ");                                    //clear displays
        hpDisplay.setText(" ");
        atkDisplay.setText(" ");
        defDisplay.setText(" ");
        spatkDisplay.setText(" ");
        spdefDisplay.setText(" ");
        speedDisplay.setText(" ");

        if (baseIndex >= 0 && baseIndex < methods.fullPokemonList.size() * 6) {     //see if base index valid
            pokeName = methods.fullPokemonList.get(pid);                            //if so, collect info
            pokemonDisplay.setText(methods.fullPokemonList.get(pid));
            
            oldHp = methods.fullStatList.get(baseIndex);                            //set global variables
            oldAtk = methods.fullStatList.get(baseIndex + 1);
            oldDef = methods.fullStatList.get(baseIndex + 2);
            oldSpatk = methods.fullStatList.get(baseIndex + 3);
            oldSpdef = methods.fullStatList.get(baseIndex + 4);
            oldSpeed = methods.fullStatList.get(baseIndex + 5);
            
            hpDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex)));   //display stats
            atkDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 1)));
            defDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 2)));
            spatkDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 3)));
            spdefDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 4)));
            speedDisplay.setText(Integer.toString(methods.fullStatList.get(baseIndex + 5)));
        }
    }//GEN-LAST:event_goButton4ActionPerformed

    private void trainerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainerListMouseClicked
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();
        tid = methods.fullTidList.get(trainerList.getAnchorSelectionIndex());
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");

        String[] nameList = new String[methods.pnameList.size()];

        whereDisplay.setText(" ");                                          //clear displays that had old information
        whenDisplay.setText(" ");
        pLevelDisplay.setText(" ");
        pnameDisplay.setText(" ");

        trainerDisplay.setText(methods.username);                           //display trainer info
        passwordDisplay.setText(methods.password);
        levelDisplay.setText(Integer.toString(methods.tlevel));
        genderDisplay.setText(methods.gender);
        teamDisplay.setText(methods.team);
        bdayDisplay.setText(methods.bday);

        for (int x = 0; x < nameList.length; x++) {                         //display trainer's pokemon
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);
    }//GEN-LAST:event_trainerListMouseClicked

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();
        boolean matchFound = false;
        tid = Integer.parseInt(tidInput.getText());

        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";"); //get trainer info
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");

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
        pnameDisplay.setText(" ");
        caughtList.setListData(eraseList);

        for (int x = 0; x < methods.fullTidList.size(); x++) {          //loop checks to see if tid exists
            if (tid == methods.fullTidList.get(x)) {
                matchFound = true;
            }
        }
        if (matchFound == false) {                                      //if tid does not exist, set to 0 for later use
            tid = 0;
        }
        if (matchFound == true) {                                       //if exists, then display trainer info
            trainerDisplay.setText(methods.username);
            passwordDisplay.setText(methods.password);
            levelDisplay.setText(Integer.toString(methods.tlevel));
            genderDisplay.setText(methods.gender);
            teamDisplay.setText(methods.team);
            bdayDisplay.setText(methods.bday);
        }
        for (int x = 0; x < nameList.length; x++) {                     //collect trainer pokemon and display
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);
    }//GEN-LAST:event_goButtonActionPerformed

    private void goButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton2ActionPerformed
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getFullTrainerList();
        String username = nameInput.getText();
        tid = 0;

        methods.getTrainerTid("select tid from trainers where username = "+ "'"+username+"';");     //finds tid for trainer
        tid = methods.tid;

        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");
        methods.selectionTrainers("select * from trainers where tid = " + tid + ";");

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
        pnameDisplay.setText(" ");
        caughtList.setListData(eraseList);

        if (tid != 0) {                                                     //if tid exists, then display info
            trainerDisplay.setText(methods.username);
            passwordDisplay.setText(methods.password);
            levelDisplay.setText(Integer.toString(methods.tlevel));
            genderDisplay.setText(methods.gender);
            teamDisplay.setText(methods.team);
            bdayDisplay.setText(methods.bday);
        }
        for (int x = 0; x < nameList.length; x++) {                         //display owned pokemon
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);
    }//GEN-LAST:event_goButton2ActionPerformed

    private void caughtListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caughtListMouseClicked
        whereDisplay.setText(tempMethods.whereList.get(caughtList.getAnchorSelectionIndex()));
        whenDisplay.setText(tempMethods.whenList.get(caughtList.getAnchorSelectionIndex()));
        pLevelDisplay.setText(Integer.toString(tempMethods.levelList.get(caughtList.getAnchorSelectionIndex())));
        pnameDisplay.setText(tempMethods.pnameList.get(caughtList.getAnchorSelectionIndex()));
    }//GEN-LAST:event_caughtListMouseClicked

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        boolean status = true;
        String username = "some initialization";                        //initialize variables to something
        String password = "make America great again";
        int level = 12;
        char gender = 'M';
        String team = "yas";
        String bday = "unborn";
        
        if (tid != 0) {                                                     //if tid exists, then collect info
            username = trainerDisplay.getText();
            password = passwordDisplay.getText();
            level = Integer.parseInt(levelDisplay.getText());
            gender = genderDisplay.getText().charAt(0);
            team = teamDisplay.getText();
            bday = bdayDisplay.getText();
            methods.selectionTrainers("select * from trainers where tid = " + tid + ";");
        } else {                                                            //if not, then display error
            errorFrame.setMessage("Invalid input.");
            errorFrame.setVisible(true);
            status = false;
        }
        
        if (tid != 0 && username.equals(methods.username) && password.equals(methods.password) && level == methods.tlevel
            && gender == methods.gender.charAt(0) && team.equals(methods.team) && bday.equals(methods.bday)) {            //check to see if nothing has changed
            errorFrame.setMessage("Nothing has been modified.");
            errorFrame.setVisible(true);
            status = false;
        }
        
        if (status == true) {                   //if all checks pass, then modify info
            methods.modify("update trainers set username = "+"'"+username+"'"+", password = "+"'"+password+"'"+", tlevel = "+level+", gender = "+"'"+gender+"'"+
                           ", team = "+"'"+team+"'"+", bday = "+"'"+bday+"' where tid = "+tid+";");
            errorFrame.setMessage("Operation completed successfully.");
            methods.getFullTrainerList();                                         //update the fullTrainerList after modifying
            displayFullTrainerList(methods.fullTrainerList, methods.fullTidList); //and display it
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void modifyButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButton2ActionPerformed
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();
        ErrorFrame errorFrame = new ErrorFrame();
        boolean status = true;
        boolean matchFound = false;
        String newPname = "@";              //initialize variables to collect all information before and after modification
        String newCity = "@";
        String newDate = "@";
        int newPlevel = 0;
        int newPid = 0;
        String oldPname = "@@";
        String oldCity = "@@";
        String oldDate = "@@";
        int oldPlevel = 0;
        int oldPid = 0;
        
        if (caughtList.getAnchorSelectionIndex() == -1 || tid == 0 || pnameDisplay.getText().equals(" ") //check to see if any changes
            || whereDisplay.getText().equals(" ") || whenDisplay.getText().equals(" ") || pLevelDisplay.getText().equals(" ")) { //if conditions fail, do not attempt to modify
            errorFrame.setMessage("Nothing has been modified.");
            errorFrame.setVisible(true);
            status = false;
        } else {                                                            //else, collect all the info
            newPname = pnameDisplay.getText();
            newCity = whereDisplay.getText();
            newDate = whenDisplay.getText();
            newPlevel = Integer.parseInt(pLevelDisplay.getText());
            oldPname = tempMethods.pnameList.get(caughtList.getAnchorSelectionIndex());
            oldCity = tempMethods.whereList.get(caughtList.getAnchorSelectionIndex());
            oldDate = tempMethods.whenList.get(caughtList.getAnchorSelectionIndex());
            oldPlevel = tempMethods.levelList.get(caughtList.getAnchorSelectionIndex());
            oldPid = tempMethods.pidList.get(caughtList.getAnchorSelectionIndex());
        }
        if (caughtList.getAnchorSelectionIndex() != -1 && newPname.equals(oldPname)                      //was any info actually altered?
            && newCity.equals(oldCity) && newDate.equals(oldDate) && newPlevel == oldPlevel) {      
            errorFrame.setMessage("Nothing has been modified.");                                         //if not, do not attempt to modify
            errorFrame.setVisible(true);
            status = false;
        }
        for (int x = 0; x < methods.fullPokemonList.size(); x++) {          //loop checks to see if modified pokemon in DB
            if (newPname.equals(methods.fullPokemonList.get(x))) {          //if so, then get the pid
                newPid = x + 1;
                matchFound = true;
            }
        }
        if (tid != 0 && caughtList.getAnchorSelectionIndex() != -1 && matchFound == false) {   //if not in DB, display error                                       //if there is no match, then do not modify
            errorFrame.setMessage("Invalid input.");
            errorFrame.setVisible(true);
            status = false;
        }
        if (status == true) {                                                           //if all checks pass, then modify info
            oldPid = tempMethods.pidList.get(caughtList.getAnchorSelectionIndex());
            methods.modify("update captured set pid = "+newPid+", city = "+"'"+newCity+"'"+", date = "+"'"+newDate+"'"
                           +", plevel = "+newPlevel+" where pid = "+oldPid+" and city = "+"'"+oldCity+"'"+" and date = "+"'"+oldDate+"'"
                           +" and plevel = "+oldPlevel+" and tid = "+tid+";");
            errorFrame.setMessage("Operation completed successfully.");
            displayCapturedInfo();
            errorFrame.setVisible(true);
        }
        
    }//GEN-LAST:event_modifyButton2ActionPerformed

    private void modifyButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButton3ActionPerformed
        GroupProject methods = new GroupProject();
        methods.getPokemonNamesAndStats();
        ErrorFrame errorFrame = new ErrorFrame();
        boolean status = true;
        String pname = "@";
        int hp = 0;                             //initialize stats to be collected
        int atk = 0;
        int def = 0;
        int spatk = 0;
        int spdef = 0;
        int speed = 0;
        
        if (pokemonDisplay.getText().equals(" ") || hpDisplay.getText().equals(" ") || atkDisplay.getText().equals(" ")     //checks for spaces
            || defDisplay.getText().equals(" ") || spatkDisplay.getText().equals(" ") || spdefDisplay.getText().equals(" ")
            || speedDisplay.getText().equals(" ")) {
            errorFrame.setMessage("Invalid input.");
            errorFrame.setVisible(true);
            status = false;
        } else {                                                                    //if input valid, then collect info
            pname = pokemonDisplay.getText();
            hp = Integer.parseInt(hpDisplay.getText());
            atk = Integer.parseInt(atkDisplay.getText());
            def = Integer.parseInt(defDisplay.getText());
            spatk = Integer.parseInt(spatkDisplay.getText());
            spdef = Integer.parseInt(spdefDisplay.getText());
            speed = Integer.parseInt(speedDisplay.getText());
        }
        if (pokemonDisplay.getText().equals(pokeName) && hp == oldHp && atk == oldAtk && def == oldDef  //if nothing changed, then do not modify
            && spatk == oldSpatk && spdef == oldSpdef && speed == oldSpeed) {
            errorFrame.setMessage("Nothing has been modified.");
            errorFrame.setVisible(true);
            status = false;
        }
        if (status == true) {                                           //if all checks pass, then modify info
            methods.modify("update pokemon set pname = "+"'"+pname+"'"+", hp = "+hp+", atk = "+atk+", def = "+def
                           +", spatk = "+spatk+", spdef = "+spdef+", speed = "+speed+" where pname = "+"'"+pokeName+"';");
            errorFrame.setMessage("Operation completed successfully.");
            methods.getPokemonNamesAndStats();
            displayFullPokemonList(methods.fullPokedexList);
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_modifyButton3ActionPerformed

    public void displayCapturedInfo() {                         //displays pokemon a trainer owns
        GroupProject methods = new GroupProject();
        tempMethods = methods;
        methods.getCapturedInfo("select pid, date, city, plevel from captured where tid = " + tid + ";");
        
        String[] nameList = new String[methods.pnameList.size()];
        
        for (int x = 0; x < nameList.length; x++) {
            nameList[x] = methods.pnameList.get(x);
        }
        caughtList.setListData(nameList);
    }
    
    public void displayFullTrainerList(ArrayList<String> nameList, ArrayList<Integer> tidList) {    //updates the full trainer list
        String[] list = new String[nameList.size()];
        
        for (int x = 0; x < nameList.size(); x++) {
            list[x] = Integer.toString(tidList.get(x))+ ".  " + nameList.get(x); 
        }
        trainerList.setListData(list);
    }
    
    public void displayFullPokemonList(ArrayList<String> nameList) {    //updates the full pokemon list
        String[] list = new String[nameList.size()];
        
        for (int x = 0; x < nameList.size(); x++) {
            list[x] = nameList.get(x);
        }
        pokedexList.setListData(list);
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
            java.util.logging.Logger.getLogger(ModifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBackButton;
    private javax.swing.JTextField atkDisplay;
    private javax.swing.JLabel atkLabel;
    private javax.swing.JTextField bdayDisplay;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel capturedLabel;
    private javax.swing.JList<String> caughtList;
    private javax.swing.JTextField defDisplay;
    private javax.swing.JLabel defLabel;
    private javax.swing.JTextField genderDisplay;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton goButton;
    private javax.swing.JButton goButton2;
    private javax.swing.JButton goButton3;
    private javax.swing.JButton goButton4;
    private javax.swing.JTextField hpDisplay;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField levelDisplay;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton modifyButton2;
    private javax.swing.JButton modifyButton3;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameSearchLabel;
    private javax.swing.JTextField pLevelDisplay;
    private javax.swing.JLabel pLevelLabel;
    private javax.swing.JTextField pNumInput;
    private javax.swing.JLabel pNumSearchLabel;
    private javax.swing.JTextField passwordDisplay;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField pnameDisplay;
    private javax.swing.JTextField pnameInput;
    private javax.swing.JLabel pnameLabel;
    private javax.swing.JLabel pnameSearchLabel;
    private javax.swing.JList<String> pokedexList;
    private javax.swing.JTextField pokemonDisplay;
    private javax.swing.JLabel pokemonLabel;
    private javax.swing.JLabel pokemonSearchLabel;
    private javax.swing.JTextField spatkDisplay;
    private javax.swing.JLabel spatkLabel;
    private javax.swing.JTextField spdefDisplay;
    private javax.swing.JLabel spdefLabel;
    private javax.swing.JTextField speedDisplay;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JTextField teamDisplay;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JTextField tidInput;
    private javax.swing.JLabel tidSearchLabel;
    private javax.swing.JTextField trainerDisplay;
    private javax.swing.JLabel trainerLabel;
    private javax.swing.JList<String> trainerList;
    private javax.swing.JLabel trainerSearchLabel;
    private javax.swing.JTextField whenDisplay;
    private javax.swing.JLabel whenLabel;
    private javax.swing.JTextField whereDisplay;
    private javax.swing.JLabel whereLabel;
    // End of variables declaration//GEN-END:variables
}
