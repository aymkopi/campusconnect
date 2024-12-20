package campusconnect;

import static campusconnect.CampusConnect.conn;
import java.sql.*;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

class UsersForm extends javax.swing.JFrame {

    //variables
    String userName;
    String userType = null;
    String studentLevel;
    String userID;
    String password;

    public UsersForm() {
        initComponents();
    }
    
    public void setUserDetails(String userName, String userType, String studentLevel, String userID, String password){
        studentTypeButton.setSelected(false);
        facultyTypeButton.setSelected(false);
        tertiaryLevelButton.setSelected(false);
        secondaryLevelButton.setSelected(false);
        
        inUserName.setText(userName);
        if (userType.equals("Faculty")) {
            facultyTypeButton.setSelected(true);
        } else {
            studentTypeButton.setSelected(true);
        }
        if (studentLevel.equals("Tertiary")) {
            tertiaryLevelButton.setSelected(true);
        } else if (studentLevel.equals("Secondary")){
            secondaryLevelButton.setSelected(true);
        }
        
        inUserID.setText(userID);
        inPassword.setText(password);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTypeButtonGroup = new javax.swing.ButtonGroup();
        studentLevelButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        eventLabel = new javax.swing.JLabel();
        addUserSubmitButton = new test.ButtonRound();
        userNameLabel = new javax.swing.JLabel();
        inUserName = new test.TextFieldRound();
        userTypeLabel = new javax.swing.JLabel();
        studentTypeButton = new test.ToggleButtonRound();
        facultyTypeButton = new test.ToggleButtonRound();
        studentLevelLabel = new javax.swing.JLabel();
        tertiaryLevelButton = new test.ToggleButtonRound();
        secondaryLevelButton = new test.ToggleButtonRound();
        userIDLabel = new javax.swing.JLabel();
        inUserID = new test.TextFieldRound();
        passwordLabel = new javax.swing.JLabel();
        inPassword = new test.TextFieldRound();
        userWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eventLabel.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        eventLabel.setText("User");

        addUserSubmitButton.setBackground(new java.awt.Color(255, 255, 204));
        addUserSubmitButton.setBorder(null);
        addUserSubmitButton.setText(" Confirm");
        addUserSubmitButton.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        addUserSubmitButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addUserSubmitButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addUserSubmitButton.setIconTextGap(2);
        addUserSubmitButton.setRoundBottomLeft(8);
        addUserSubmitButton.setRoundBottomRight(8);
        addUserSubmitButton.setRoundTopLeft(8);
        addUserSubmitButton.setRoundTopRight(8);
        addUserSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(eventLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(addUserSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUserSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        userNameLabel.setFont(new java.awt.Font("Inter Medium", 0, 15)); // NOI18N
        userNameLabel.setText("User Name");

        inUserName.setBorder(null);
        inUserName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        inUserName.setPlaceHolder("Enter full name");
        inUserName.setRoundBottomLeft(10);
        inUserName.setRoundBottomRight(10);
        inUserName.setRoundTopLeft(10);
        inUserName.setRoundTopRight(10);
        inUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inUserNameActionPerformed(evt);
            }
        });

        userTypeLabel.setFont(new java.awt.Font("Inter Medium", 0, 15)); // NOI18N
        userTypeLabel.setText("User Type");

        studentTypeButton.setBorder(null);
        userTypeButtonGroup.add(studentTypeButton);
        studentTypeButton.setText("Student");
        studentTypeButton.setToolTipText("");
        studentTypeButton.setFocusable(false);
        studentTypeButton.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        studentTypeButton.setRoundBottomLeft(10);
        studentTypeButton.setRoundBottomRight(10);
        studentTypeButton.setRoundTopLeft(10);
        studentTypeButton.setRoundTopRight(10);
        studentTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTypeButtonActionPerformed(evt);
            }
        });

        facultyTypeButton.setBorder(null);
        userTypeButtonGroup.add(facultyTypeButton);
        facultyTypeButton.setText("Faculty");
        facultyTypeButton.setFocusable(false);
        facultyTypeButton.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        facultyTypeButton.setRoundBottomLeft(10);
        facultyTypeButton.setRoundBottomRight(10);
        facultyTypeButton.setRoundTopLeft(10);
        facultyTypeButton.setRoundTopRight(10);
        facultyTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyTypeButtonActionPerformed(evt);
            }
        });

        studentLevelLabel.setFont(new java.awt.Font("Inter Medium", 0, 15)); // NOI18N
        studentLevelLabel.setText("Student Level");

        tertiaryLevelButton.setBorder(null);
        studentLevelButtonGroup.add(tertiaryLevelButton);
        tertiaryLevelButton.setText("Tertiary");
        tertiaryLevelButton.setToolTipText("");
        tertiaryLevelButton.setFocusable(false);
        tertiaryLevelButton.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tertiaryLevelButton.setRoundBottomLeft(10);
        tertiaryLevelButton.setRoundBottomRight(10);
        tertiaryLevelButton.setRoundTopLeft(10);
        tertiaryLevelButton.setRoundTopRight(10);
        tertiaryLevelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tertiaryLevelButtonActionPerformed(evt);
            }
        });

        secondaryLevelButton.setBorder(null);
        studentLevelButtonGroup.add(secondaryLevelButton);
        secondaryLevelButton.setText("Secondary");
        secondaryLevelButton.setFocusable(false);
        secondaryLevelButton.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        secondaryLevelButton.setRoundBottomLeft(10);
        secondaryLevelButton.setRoundBottomRight(10);
        secondaryLevelButton.setRoundTopLeft(10);
        secondaryLevelButton.setRoundTopRight(10);
        secondaryLevelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondaryLevelButtonActionPerformed(evt);
            }
        });

        userIDLabel.setFont(new java.awt.Font("Inter Medium", 0, 15)); // NOI18N
        userIDLabel.setText("User ID");
        userIDLabel.setFocusable(false);

        inUserID.setBorder(null);
        inUserID.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        inUserID.setPlaceHolder("Enter User ID");
        inUserID.setRoundBottomLeft(8);
        inUserID.setRoundBottomRight(8);
        inUserID.setRoundTopLeft(8);
        inUserID.setRoundTopRight(8);
        inUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inUserIDActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Inter Medium", 0, 15)); // NOI18N
        passwordLabel.setText("Password");
        passwordLabel.setFocusable(false);

        inPassword.setBorder(null);
        inPassword.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        inPassword.setPlaceHolder("Enter User Password");
        inPassword.setRoundBottomLeft(8);
        inPassword.setRoundBottomRight(8);
        inPassword.setRoundTopLeft(8);
        inPassword.setRoundTopRight(8);
        inPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPasswordActionPerformed(evt);
            }
        });

        userWarning.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        userWarning.setForeground(new java.awt.Color(255, 0, 0));
        userWarning.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(tertiaryLevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(secondaryLevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(inPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userIDLabel)
                                        .addComponent(studentLevelLabel)
                                        .addComponent(passwordLabel)
                                        .addComponent(userWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(userNameLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inUserID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(facultyTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userTypeLabel)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(userIDLabel)
                .addGap(11, 11, 11)
                .addComponent(inUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(userWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameLabel)
                .addGap(11, 11, 11)
                .addComponent(inUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(userTypeLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(studentLevelLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tertiaryLevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondaryLevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(passwordLabel)
                .addGap(11, 11, 11)
                .addComponent(inPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void addUserSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserSubmitButtonActionPerformed
        if (validateInputs()) {
            try {
                String checkUserExist = "SELECT * FROM users WHERE user_id = ? AND is_deleted = 0";
                PreparedStatement pst = conn().prepareStatement(checkUserExist);
                pst.setString(1, userID);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {  // If a matching student ID is found
                    JOptionPane.showMessageDialog(this, "Account with this User ID already exists.");
                    return;  // Exit the method to avoid duplicate insertion
                }
                System.out.println("was here at 1");

                String addUserQuery = "INSERT INTO users (user_id, user_name, password, user_type, student_type) "
                        + "VALUES (?, ?, ?, ?, ?)";
                pst = conn().prepareStatement(addUserQuery);
                pst.setString(1, userID);
                pst.setString(2, userName);
                pst.setString(3, password);
                pst.setString(4, userType);

                if (studentLevel != null && studentLevel.isBlank()) {
                    pst.setString(5, studentLevel);
                } else {
                    studentLevel = "null";
                    pst.setString(5, studentLevel);
                }

                pst.executeUpdate();

                System.out.println("was here at 2");
                JOptionPane.showMessageDialog(this, "User added successfully!");

                // Refresh the table in CampusConnect
                CampusConnect.getInstance().refreshMainTableData();
                dispose();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }

    private boolean validateInputs() {
        try (Connection conn = conn(); Statement st = conn.createStatement()) {
            boolean isValid = true;

            String usersExistingChecker = "SELECT * FROM users WHERE user_id = ? AND is_deleted = 0";
            try (ResultSet rp = st.executeQuery(usersExistingChecker)) {
                boolean orgExists = false;

                while (rp.next()) {
                    String UID = rp.getString("user_id");

                    if (inUserID.getText().equalsIgnoreCase(UID)) {
                        userWarning.setText("User exists");
                        inUserID.setBorder(new LineBorder(Color.RED, 1));
                        isValid = false;
                        orgExists = true;
                        break;
                    }
                }
                if(!orgExists){
                    if(inUserID.getText().isEmpty()){
                        userWarning.setText("Cannot be empty.");
                        inUserID.setBorder(new LineBorder(Color.RED, 1));
                        isValid = false;
                    } else {
                        userWarning.setText("");
                        inUserID.setBorder(null);
                        userID = inUserID.getText();
                    }
                }

            }

            if (inUserName.getText().isEmpty()) {
                inUserName.setBorder(new LineBorder(Color.RED, 1));
                isValid = false;
            } else {
                inUserName.setBorder(null);
                userName = inUserName.getText();
            }
           
            if (inPassword.getText().isEmpty()) {
                inPassword.setBorder(new LineBorder(Color.RED, 1));
                isValid = false;
            } else {
                inPassword.setBorder(null);
                password = inPassword.getText();
            }
            System.out.println("was here at 3");
            //if faculty, sets boolean on sql of is_faculty to faculty, else user is Student
            if (facultyTypeButton.isSelected()) {
                userType = "Faculty";
            } else if (studentTypeButton.isSelected()) {
                userType = "Student";
            }

            //if, tertiary, sets boolean on sql of 
            if (tertiaryLevelButton.isSelected()) {
                studentLevel = "Tertiary";
            } else if (secondaryLevelButton.isSelected()) {
                studentLevel = "Secondary";
            }
            System.out.println("was here at 4");

            return isValid;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            return false;
        }
    }//GEN-LAST:event_addUserSubmitButtonActionPerformed

    private void inUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inUserIDActionPerformed

    private void inUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inUserNameActionPerformed

    private void studentTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTypeButtonActionPerformed
    }//GEN-LAST:event_studentTypeButtonActionPerformed

    private void inPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPasswordActionPerformed

    private void tertiaryLevelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tertiaryLevelButtonActionPerformed
        if (facultyTypeButton.isSelected()) {
            studentLevelButtonGroup.clearSelection();
        }
    }//GEN-LAST:event_tertiaryLevelButtonActionPerformed
    private void facultyTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyTypeButtonActionPerformed
        if (facultyTypeButton.isSelected()) {
            studentLevelButtonGroup.clearSelection();
        }
    }//GEN-LAST:event_facultyTypeButtonActionPerformed

    private void secondaryLevelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondaryLevelButtonActionPerformed
        if (facultyTypeButton.isSelected()) {
            studentLevelButtonGroup.clearSelection();
        }
    }//GEN-LAST:event_secondaryLevelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private test.ButtonRound addUserSubmitButton;
    private javax.swing.JLabel eventLabel;
    private test.ToggleButtonRound facultyTypeButton;
    private test.TextFieldRound inPassword;
    private test.TextFieldRound inUserID;
    private test.TextFieldRound inUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private test.ToggleButtonRound secondaryLevelButton;
    private javax.swing.ButtonGroup studentLevelButtonGroup;
    private javax.swing.JLabel studentLevelLabel;
    private test.ToggleButtonRound studentTypeButton;
    private test.ToggleButtonRound tertiaryLevelButton;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.ButtonGroup userTypeButtonGroup;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel userWarning;
    // End of variables declaration//GEN-END:variables
}
