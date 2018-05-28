public class InsertFrame extends javax.swing.JFrame {
    
    public InsertFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderInput = new javax.swing.JTextField();
        birthdayLabel = new javax.swing.JLabel();
        birthdayInput = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelInput = new javax.swing.JTextField();
        teamInput = new javax.swing.JTextField();
        teamLabel = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        hpInput = new javax.swing.JTextField();
        atkLabel = new javax.swing.JLabel();
        atkInput = new javax.swing.JTextField();
        defLabel = new javax.swing.JLabel();
        defInput = new javax.swing.JTextField();
        spatkLabel = new javax.swing.JLabel();
        spatkInput = new javax.swing.JTextField();
        spdefInput = new javax.swing.JTextField();
        spdefLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        speedInput = new javax.swing.JTextField();
        insertButton3 = new javax.swing.JButton();
        trainerLabel = new javax.swing.JLabel();
        pokemonLabel = new javax.swing.JLabel();
        capturedLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cityInput = new javax.swing.JTextField();
        plevelLabel = new javax.swing.JLabel();
        plevelInput = new javax.swing.JTextField();
        pnameInput = new javax.swing.JTextField();
        pnameLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateInput = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        tnameLabel = new javax.swing.JLabel();
        trainerInput = new javax.swing.JTextField();
        insertButton2 = new javax.swing.JButton();
        adminBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        usernameInput.setBackground(new java.awt.Color(255, 255, 255));
        usernameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        usernameLabel.setText("username:");

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordLabel.setText("password:");

        passwordInput.setBackground(new java.awt.Color(255, 255, 255));
        passwordInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        genderLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        genderLabel.setText("gender:");

        genderInput.setBackground(new java.awt.Color(255, 255, 255));
        genderInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        birthdayLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        birthdayLabel.setText("birthday:");

        birthdayInput.setBackground(new java.awt.Color(255, 255, 255));
        birthdayInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        levelLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        levelLabel.setText("level:");

        levelInput.setBackground(new java.awt.Color(255, 255, 255));
        levelInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        teamInput.setBackground(new java.awt.Color(255, 255, 255));
        teamInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        teamLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        teamLabel.setText("team:");

        insertButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(genderLabel)
                            .addComponent(birthdayLabel)
                            .addComponent(levelLabel)
                            .addComponent(teamLabel))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(levelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdayInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayLabel)
                    .addComponent(birthdayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(levelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamLabel)
                    .addComponent(teamInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertButton)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nameInput.setBackground(new java.awt.Color(255, 255, 255));
        nameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameLabel.setText("name:");

        hpLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hpLabel.setText("hp:");

        hpInput.setBackground(new java.awt.Color(255, 255, 255));
        hpInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        atkLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        atkLabel.setText("atk:");

        atkInput.setBackground(new java.awt.Color(255, 255, 255));
        atkInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        defLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        defLabel.setText("def:");

        defInput.setBackground(new java.awt.Color(255, 255, 255));
        defInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        spatkLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        spatkLabel.setText("spatk:");

        spatkInput.setBackground(new java.awt.Color(255, 255, 255));
        spatkInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        spdefInput.setBackground(new java.awt.Color(255, 255, 255));
        spdefInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        spdefLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        spdefLabel.setText("spdef:");

        speedLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        speedLabel.setText("speed:");

        speedInput.setBackground(new java.awt.Color(255, 255, 255));
        speedInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        insertButton3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        insertButton3.setText("Insert");
        insertButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(hpLabel)
                            .addComponent(atkLabel)
                            .addComponent(defLabel)
                            .addComponent(spatkLabel)
                            .addComponent(spdefLabel)
                            .addComponent(speedLabel))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spdefInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spatkInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atkInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hpInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(insertButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpLabel)
                    .addComponent(hpInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atkLabel)
                    .addComponent(atkInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defLabel)
                    .addComponent(defInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatkLabel)
                    .addComponent(spatkInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spdefLabel)
                    .addComponent(spdefInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedLabel)
                    .addComponent(speedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(insertButton3)
                .addContainerGap())
        );

        trainerLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        trainerLabel.setText("Trainer");

        pokemonLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pokemonLabel.setText("Pokemon");

        capturedLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        capturedLabel.setText("Captured");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cityInput.setBackground(new java.awt.Color(255, 255, 255));
        cityInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        plevelLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        plevelLabel.setText("level:");

        plevelInput.setBackground(new java.awt.Color(255, 255, 255));
        plevelInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        pnameInput.setBackground(new java.awt.Color(255, 255, 255));
        pnameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        pnameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pnameLabel.setText("pokemon:");

        dateLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel.setText("date:");

        dateInput.setBackground(new java.awt.Color(255, 255, 255));
        dateInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cityLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cityLabel.setText("city:");

        tnameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tnameLabel.setText("trainer:");

        trainerInput.setBackground(new java.awt.Color(255, 255, 255));
        trainerInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        insertButton2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        insertButton2.setText("Insert");
        insertButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(trainerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnameLabel)
                            .addComponent(dateLabel)
                            .addComponent(cityLabel)
                            .addComponent(plevelLabel))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plevelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(insertButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnameLabel)
                    .addComponent(trainerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameLabel)
                    .addComponent(pnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plevelLabel)
                    .addComponent(plevelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertButton2)
                .addContainerGap())
        );

        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adminBackButton.setText("BACK");
        adminBackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capturedLabel)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pokemonLabel)
                        .addGap(62, 62, 62)
                        .addComponent(adminBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trainerLabel)
                            .addComponent(capturedLabel))
                        .addComponent(pokemonLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(adminBackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackButtonActionPerformed
        AdminFrame adminFrame = new AdminFrame();

        setVisible(false);
        adminFrame.setVisible(true);
    }//GEN-LAST:event_adminBackButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        String errorMessage;
        methods.getFullTrainerList();
        
        boolean status = true;
        int tid = methods.getTidValue();                                     //collect admin input
        String username = usernameInput.getText();
        String password = passwordInput.getText();
        char gender = genderInput.getText().charAt(0);
        String bday = birthdayInput.getText();
        int level = Integer.parseInt(levelInput.getText());
        String team = teamInput.getText();
        
        for (int x = 0; x < methods.fullTrainerList.size(); x++) {           //loop checks if trainer already in DB
            if (username.equals(methods.fullTrainerList.get(x))) {
                errorMessage = "Trainer already exists.";
                errorFrame.setMessage(errorMessage);
                errorFrame.setVisible(true);
                status = false;
            }
        }
        if (gender != 'M' && gender != 'F') {                                //checks if gender input is valid
            errorMessage = "Invalid gender input.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (!(team.equals("Mystic") || team.equals("Valor") || team.equals("Instinct"))) { //checks if team is valid
            errorMessage = "Invalid team input.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (status == true) {                                                               //if all tests are valid, then insert
            methods.registerTrainer(username, password, gender, team, bday, tid, level);
            errorMessage = "Operation completed successfully.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void insertButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton2ActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        String errorMessage;
        methods.getFullTrainerList();                   //fill arrays with all trainer info
        methods.getPokemonNamesAndStats();              //fill arrays with all pokemon info
        
        boolean status = true;
        boolean matchFound1 = false;
        boolean matchFound2 = false;
        int tid = 0;
        int pid = 0;
        String username = trainerInput.getText();       //collect admin input
        String pname = pnameInput.getText();
        String date = dateInput.getText();
        String city = cityInput.getText();
        int plevel = Integer.parseInt(plevelInput.getText());
        
        for (int x = 0; x < methods.fullTrainerList.size(); x++) {          //loop checks to see if trainer in DB
            if (username.equals(methods.fullTrainerList.get(x))) {          //if so, then get tid
                matchFound1 = true;
                tid = x + 1;
            }
        }
        if (matchFound1 == false) {                                          //if not, then display error message
            errorMessage = "Trainer does not exist.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        for (int i = 0; i < methods.fullPokemonList.size(); i++) {          //loop checks to see if pokemon in DB
            if (pname.equals(methods.fullPokemonList.get(i))) {             //if so, then get pid
                matchFound2 = true;
                pid = i + 1;
            }
        }
        if (matchFound2 == false) {                                         //if not, then display error message
            errorMessage = "Pokemon does not exist.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (status == true) {                                               //if all checks pass, then insert
            methods.insertIntoCaptured(tid, pid, date, city, plevel);
            errorMessage = "Operation completed successfully.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_insertButton2ActionPerformed

    private void insertButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton3ActionPerformed
        GroupProject methods = new GroupProject();
        ErrorFrame errorFrame = new ErrorFrame();
        String errorMessage;
        methods.getPokemonNamesAndStats();
        
        boolean status = true;
        int pid = methods.fullPokemonList.size() + 1;
        String pname = nameInput.getText();
        int hp = Integer.parseInt(hpInput.getText());                       //collect admin input
        int atk = Integer.parseInt(atkInput.getText());
        int def = Integer.parseInt(defInput.getText());
        int spatk = Integer.parseInt(spatkInput.getText());
        int spdef = Integer.parseInt(spdefInput.getText());
        int speed = Integer.parseInt(speedInput.getText());
        
        for (int x = 0; x < methods.fullPokemonList.size(); x++) {          //loop checks to see if Pmon already in DB
            if (pname.equals(methods.fullPokemonList.get(x))) {
                errorMessage = "Pokemon already exists.";
                errorFrame.setMessage(errorMessage);
                errorFrame.setVisible(true);
                status = false;
            }
        }
        
        if (status == true) {                                                //if not, then add the pokemon
            methods.insertIntoPokemon(pid, pname, hp, atk, def, spatk, spdef, speed);
            errorMessage = "Operation completed successfully.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
        }
    }//GEN-LAST:event_insertButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBackButton;
    private javax.swing.JTextField atkInput;
    private javax.swing.JLabel atkLabel;
    private javax.swing.JTextField birthdayInput;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel capturedLabel;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField dateInput;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField defInput;
    private javax.swing.JLabel defLabel;
    private javax.swing.JTextField genderInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField hpInput;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton insertButton2;
    private javax.swing.JButton insertButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField levelInput;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField plevelInput;
    private javax.swing.JLabel plevelLabel;
    private javax.swing.JTextField pnameInput;
    private javax.swing.JLabel pnameLabel;
    private javax.swing.JLabel pokemonLabel;
    private javax.swing.JTextField spatkInput;
    private javax.swing.JLabel spatkLabel;
    private javax.swing.JTextField spdefInput;
    private javax.swing.JLabel spdefLabel;
    private javax.swing.JTextField speedInput;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JTextField teamInput;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JLabel tnameLabel;
    private javax.swing.JTextField trainerInput;
    private javax.swing.JLabel trainerLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
