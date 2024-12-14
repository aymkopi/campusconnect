
package campusconnect;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.border.LineBorder;


public class LoginPage extends JFrame {

    //establish connection
    public static Connection conn() {
        try {
            String url = "jdbc:mysql://localhost:3306/campusconnect?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "justi";
            String password = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    //variables
    Connection conn = conn();
    String userName;
    String email;
    String userID;
    String password;
    
    //creates new SignUpPage
    public LoginPage() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        userIDWarning.setVisible(false);
        passwordWarning.setVisible(false);
        setBackground(new Color(0, 0, 0, 0));
       
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panelRound1 = new test.PanelRound();
        imagePlaceHolder = new test.ButtonRound();
        lblWelcomeBack = new javax.swing.JLabel();
        lblAlreadyHaveAccount1 = new javax.swing.JLabel();
        inStudentIDLogin = new test.TextFieldRound();
        inPasswordLogin = new test.PasswordRound();
        showLoginPassword = new javax.swing.JCheckBox();
        loginButton = new test.ButtonRound();
        inUserType = new test.ComboBoxRound();
        userIDWarning = new javax.swing.JLabel();
        passwordWarning = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("loginPage");
        setBackground(new java.awt.Color(204, 255, 204));
        setFont(new java.awt.Font("Helvetica", 0, 10)); // NOI18N
        setName("mainPage"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panelRound1.setBackground(new java.awt.Color(204, 204, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        imagePlaceHolder.setBorder(null);
        imagePlaceHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bird-thumbnail.jpg"))); // NOI18N
        imagePlaceHolder.setBorderPainted(false);
        imagePlaceHolder.setFocusPainted(false);
        imagePlaceHolder.setFocusable(false);
        imagePlaceHolder.setRoundBottomLeft(20);
        imagePlaceHolder.setRoundBottomRight(20);
        imagePlaceHolder.setRoundTopLeft(20);
        imagePlaceHolder.setRoundTopRight(20);
        imagePlaceHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagePlaceHolderActionPerformed(evt);
            }
        });

        lblWelcomeBack.setFont(new java.awt.Font("Inter Display SemiBold", 1, 36)); // NOI18N
        lblWelcomeBack.setText("Welcome back!");

        lblAlreadyHaveAccount1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblAlreadyHaveAccount1.setText("Please sign in to access your account");

        inStudentIDLogin.setBorder(null);
        inStudentIDLogin.setToolTipText("");
        inStudentIDLogin.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        inStudentIDLogin.setPlaceHolder("User ID");
        inStudentIDLogin.setRoundBottomLeft(8);
        inStudentIDLogin.setRoundBottomRight(8);
        inStudentIDLogin.setRoundTopLeft(8);
        inStudentIDLogin.setRoundTopRight(8);

        inPasswordLogin.setBorder(null);
        inPasswordLogin.setToolTipText("");
        inPasswordLogin.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        inPasswordLogin.setPlaceHolder("Password");
        inPasswordLogin.setRoundBottomLeft(8);
        inPasswordLogin.setRoundBottomRight(8);
        inPasswordLogin.setRoundTopLeft(8);
        inPasswordLogin.setRoundTopRight(8);
        inPasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPasswordLoginActionPerformed(evt);
            }
        });

        showLoginPassword.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        showLoginPassword.setText("Show Password");
        showLoginPassword.setAlignmentX(0.5F);
        showLoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showLoginPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        showLoginPassword.setMargin(new java.awt.Insets(2, 2, 2, 0));
        showLoginPassword.setOpaque(false);
        showLoginPassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        showLoginPassword.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        showLoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLoginPasswordActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(153, 153, 255));
        loginButton.setBorder(null);
        loginButton.setText("Log In");
        loginButton.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        loginButton.setPreferredSize(new java.awt.Dimension(86, 16));
        loginButton.setRoundBottomLeft(8);
        loginButton.setRoundBottomRight(8);
        loginButton.setRoundTopLeft(8);
        loginButton.setRoundTopRight(8);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        inUserType.setBorder(null);
        inUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Faculty", "Admin" }));
        inUserType.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        inUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inUserTypeActionPerformed(evt);
            }
        });

        userIDWarning.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        userIDWarning.setForeground(new java.awt.Color(255, 51, 51));
        userIDWarning.setText("jLabel2");
        userIDWarning.setFocusable(false);

        passwordWarning.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 51, 51));
        passwordWarning.setText("jLabel2");
        passwordWarning.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close (1).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imagePlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcomeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlreadyHaveAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelRound1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(userIDWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelRound1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(passwordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(showLoginPassword))
                                        .addComponent(inPasswordLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelRound1Layout.createSequentialGroup()
                                            .addComponent(inStudentIDLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(inUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(52, 52, 52)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblWelcomeBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlreadyHaveAccount1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inStudentIDLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(userIDWarning)
                        .addGap(20, 20, 20)
                        .addComponent(inPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordWarning)
                            .addComponent(showLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(imagePlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    if (userVerify()) {
        //database insertion
        if (conn != null) {
            try {
                Statement st = conn.createStatement();
                String checkUserExist = "SELECT * FROM users WHERE user_id = '" + userID + "' AND password = '" + password + "'";
                var rs = st.executeQuery(checkUserExist);

                if (rs.next()) {  // If a matching student ID is found
                    JOptionPane.showMessageDialog(this, "Login Successful!");
                    //launch interface based on userType
                    if ((inUserType.getSelectedItem().toString()).equals("Student")) {
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new CampusConnect().setVisible(true);
                            }
                        });
                    } else if ((inUserType.getSelectedItem().toString()).equals("Faculty")) {

                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new CampusConnect().setVisible(true);
                            }
                        });
                    } else {
                        inStudentIDLogin.setPlaceHolder("Admin ID");
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new CampusConnect().setVisible(true);
                            }
                        });
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid User ID or Password. Please try again.");
                    userIDWarning.setText("Incorrect ID. Try Again.");
                    passwordWarning.setText("Incorrect password. Try Again.");
                    userIDWarning.setVisible(true);
                    passwordWarning.setVisible(true);
                }
                inStudentIDLogin.setBorder(new LineBorder(Color.RED, 1));
                inPasswordLogin.setBorder(new LineBorder(Color.RED, 1));

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }
}

    //condition if userlogin fields are empty or not
    private boolean userVerify() {
    boolean isValid = true;

    if (inStudentIDLogin.getText().isEmpty() || inStudentIDLogin.getText().length() != 11) {
        inStudentIDLogin.setBorder(new LineBorder(Color.red, 1));

        if (inStudentIDLogin.getText().isEmpty()) {
            userIDWarning.setText("Cannot be empty.");
        }
        if (inStudentIDLogin.getText().length() != 11) {
            userIDWarning.setText("Length must be 11 and must start at 02000.");
        }
        userIDWarning.setVisible(true);
        isValid = false;
    } else {
        inStudentIDLogin.setBorder(null);
        userID = inStudentIDLogin.getText();
        userIDWarning.setVisible(false);
    }

    if (inPasswordLogin.getText().isEmpty()) {
        inPasswordLogin.setBorder(new LineBorder(Color.red, 1));
        isValid = false;
        passwordWarning.setText("Cannot be empty.");
        passwordWarning.setVisible(true);
    } else {
        inPasswordLogin.setBorder(null);
        password = new String(inPasswordLogin.getPassword());
        passwordWarning.setVisible(false);
    }

    return isValid;

    }//GEN-LAST:event_loginButtonActionPerformed

    private void showLoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLoginPasswordActionPerformed
        //mask and unmask login password
        if (showLoginPassword.isSelected()) {
            inPasswordLogin.setEchoChar((char) 0);

        } else {
            inPasswordLogin.setEchoChar('\u25cf');

        }
    }//GEN-LAST:event_showLoginPasswordActionPerformed

    private void inPasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPasswordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPasswordLoginActionPerformed

    private void inUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inUserTypeActionPerformed
        if ((inUserType.getSelectedItem().toString()).equals("Student")) {
            inStudentIDLogin.setPlaceHolder("Student ID");
        } else if ((inUserType.getSelectedItem().toString()).equals("Faculty")) {
            inStudentIDLogin.setPlaceHolder("Faculty ID");
        } else {
            inStudentIDLogin.setPlaceHolder("Admin ID");

        }
        inStudentIDLogin.update(inStudentIDLogin.getGraphics());
    }//GEN-LAST:event_inUserTypeActionPerformed

    private void imagePlaceHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagePlaceHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagePlaceHolderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());

                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new LoginPage().setVisible(true);
        }
    });

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private test.ButtonRound imagePlaceHolder;
    private test.PasswordRound inPasswordLogin;
    private test.TextFieldRound inStudentIDLogin;
    private test.ComboBoxRound inUserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAlreadyHaveAccount1;
    private javax.swing.JLabel lblWelcomeBack;
    private test.ButtonRound loginButton;
    private test.PanelRound panelRound1;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JCheckBox showLoginPassword;
    private javax.swing.JLabel userIDWarning;
    // End of variables declaration//GEN-END:variables
}
