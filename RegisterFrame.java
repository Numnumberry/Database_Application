public class RegisterFrame extends javax.swing.JFrame {
    
    public static GroupProject univMethods;
    
    public static void setMethods(GroupProject methods) {
        univMethods = methods;                              //have own global copy of methods to be used by this class
    }
    
    public RegisterFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamSelectionList = new javax.swing.JList<>();
        usernameInput = new javax.swing.JTextField();
        monthInput = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        genderList = new javax.swing.JList<>();
        dayInput = new javax.swing.JTextField();
        yearInput = new javax.swing.JTextField();
        bdayExample = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        passwordInput2 = new javax.swing.JPasswordField();
        password2Label = new javax.swing.JLabel();
        adminBackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(bounds());
        getContentPane().setLayout(null);

        usernameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        usernameLabel.setText("username:");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(10, 50, 95, 24);

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordLabel.setText("password:");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(10, 90, 92, 24);

        genderLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        genderLabel.setText("gender:");
        getContentPane().add(genderLabel);
        genderLabel.setBounds(10, 340, 69, 24);

        teamLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        teamLabel.setText("team:");
        getContentPane().add(teamLabel);
        teamLabel.setBounds(10, 230, 51, 24);

        birthdayLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        birthdayLabel.setText("birthday:");
        getContentPane().add(birthdayLabel);
        birthdayLabel.setBounds(10, 170, 79, 24);

        teamSelectionList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        teamSelectionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Valor", "Mystic", "Instinct" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(teamSelectionList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 230, 86, 99);

        usernameInput.setBackground(new java.awt.Color(255, 255, 255));
        usernameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(usernameInput);
        usernameInput.setBounds(210, 50, 145, 27);

        monthInput.setBackground(new java.awt.Color(255, 255, 255));
        monthInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(monthInput);
        monthInput.setBounds(210, 170, 47, 27);

        registerButton.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton);
        registerButton.setBounds(90, 440, 172, 63);

        genderList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        genderList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "M", "F" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(genderList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(210, 340, 38, 63);

        dayInput.setBackground(new java.awt.Color(255, 255, 255));
        dayInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(dayInput);
        dayInput.setBounds(260, 170, 33, 27);

        yearInput.setBackground(new java.awt.Color(255, 255, 255));
        yearInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(yearInput);
        yearInput.setBounds(300, 170, 53, 27);

        bdayExample.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bdayExample.setForeground(new java.awt.Color(0, 0, 0));
        bdayExample.setText("ex:  Jan        01      92");
        getContentPane().add(bdayExample);
        bdayExample.setBounds(190, 200, 136, 19);

        passwordInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(passwordInput);
        passwordInput.setBounds(210, 90, 145, 25);

        passwordInput2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(passwordInput2);
        passwordInput2.setBounds(210, 130, 145, 25);

        password2Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password2Label.setText("password again:");
        getContentPane().add(password2Label);
        password2Label.setBounds(10, 130, 144, 24);

        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adminBackButton.setText("BACK");
        adminBackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminBackButton);
        adminBackButton.setBounds(290, 10, 69, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Numnumberry\\Documents\\NetBeansProjects\\GroupProject\\src\\pikachu2.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -20, 390, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        ErrorFrame errorFrame = new ErrorFrame();
        
        univMethods.getFullTrainerList();
        boolean status = true;
        String username = usernameInput.getText();      //collect the info
        String password = passwordInput.getText();
        String password2 = passwordInput2.getText();
        String birthday = monthInput.getText() + " " + dayInput.getText() + ", " + yearInput.getText();
        char gender = 'M';
        String team = "Valor";
        int tid = univMethods.getTidValue();
        String errorMessage;
        
        if (!password.equals(password2)) {                      //check if two passwords match
            errorMessage = "The two passwords do not match.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        for (int x = 0; x < univMethods.fullTrainerList.size(); x++) {      //see if username already taken
            if ((username.equals(univMethods.fullTrainerList.get(x))) ||
                (username.equals("admin"))) {
                errorMessage = "Please change username.";
                errorFrame.setMessage(errorMessage);
                errorFrame.setVisible(true);
                status = false;
            }
        }
        if (!(monthInput.getText().equals("Jan") || monthInput.getText().equals("Feb") || monthInput.getText().equals("Mar") ||  //see if month is valid
              monthInput.getText().equals("Apr") || monthInput.getText().equals("May") || monthInput.getText().equals("Jun") ||
              monthInput.getText().equals("Jul") || monthInput.getText().equals("Aug") || monthInput.getText().equals("Sep") ||
              monthInput.getText().equals("Oct") || monthInput.getText().equals("Nov") || monthInput.getText().equals("Dec"))) {
            errorMessage = "Please input birthday in following format: \n Jan 01, 96    (3 letters, 2 digits, 2 digits)";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;                                             //statement checks if month in right format
        }
        if (dayInput.getText().charAt(0) != '0' && dayInput.getText().length() == 1) {  //checks if day in right format
            errorMessage = "Please input birthday in following format: \n Jan 01, 96    (3 letters, 2 digits, 2 digits)";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (yearInput.getText().length() > 2) {                         //checks if year in right format
            errorMessage = "Please input birthday in following format: \n Jan 01, 96    (3 letters, 2 digits, 2 digits)";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (teamSelectionList.getAnchorSelectionIndex() == 0){          //chooses team based on list choice
            team = "Valor";
        } else if (teamSelectionList.getAnchorSelectionIndex() == 1) {
            team = "Mystic";
        } else if (teamSelectionList.getAnchorSelectionIndex() == 2) {
            team = "Instinct";
        } else {                                                        //if nothing chosen, display error
            errorMessage = "Please select a team.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (genderList.getAnchorSelectionIndex() == 0) {                //check if gender valid
            gender = 'M';
        } else if (genderList.getAnchorSelectionIndex() == 1) {
            gender = 'F';
        } else {
            errorMessage = "Please select a gender.";
            errorFrame.setMessage(errorMessage);
            errorFrame.setVisible(true);
            status = false;
        }
        if (status == true) {                                   //if all things valid, then insert trainer
            LoginFrame loginFrame = new LoginFrame();
            
            univMethods.registerTrainer(username, password, gender, team, birthday, tid, 1);
            setVisible(false);
            loginFrame.setVisible(true);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void adminBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackButtonActionPerformed
        LoginFrame loginFrame = new LoginFrame();

        setVisible(false);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_adminBackButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBackButton;
    private javax.swing.JLabel bdayExample;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JTextField dayInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JList<String> genderList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField monthInput;
    private javax.swing.JLabel password2Label;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JPasswordField passwordInput2;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JList<String> teamSelectionList;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField yearInput;
    // End of variables declaration//GEN-END:variables
}
