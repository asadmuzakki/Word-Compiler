package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class LogIn extends javax.swing.JFrame {

    private ImageIcon backgroundImage;

    public LogIn() {
        initComponents();
        URL imageURL = getClass().getResource("/assets/Background5.jpg");

        if (imageURL != null) {
            backgroundImage = new ImageIcon(imageURL);
        } else {
            throw new RuntimeException("Image not found!");
        }
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        welcomeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        registerWordLabel = new javax.swing.JLabel();
        labelRegisMenu = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameField.setFont(new java.awt.Font("Segoe UI", 1, 14));
        usernameField.setBackground(new java.awt.Color(0, 0, 0));
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(new LineBorder(Color.WHITE, 2, true));

        passwordField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(new LineBorder(Color.WHITE, 2, true));

        usernameField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setBackground(new java.awt.Color(0, 0, 0));

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 22));
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("WELCOME TO WORD COMPILE");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("Log In");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password: ");

        registerWordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12));
        registerWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerWordLabel.setText("Belum punya akun? ");
        
        labelRegisMenu.setFont(new java.awt.Font("Segoe UI", 1, 12));
        // labelRegisMenu.setBorder(new LineBorder(Color.BLACK, 2));
        labelRegisMenu.setLayout(new BorderLayout());
        labelRegisMenu.setForeground(Color.WHITE);
        labelRegisMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegisMenu.setText("<html><body style='background-color:black; margin: 4px; padding: 0px;'><font color='white'>Register</font></body></html>");

        // labelRegisMenu.setFont(new java.awt.Font("Segoe UI", 1, 12));
        // labelRegisMenu.setBorder(new LineBorder(Color.BLACK, 2));
        // labelRegisMenu.setForeground(new java.awt.Color(255, 255, 255));
        // labelRegisMenu.setBackground(new java.awt.Color(0, 0, 0, 200));
        // labelRegisMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        // labelRegisMenu.setText("Register");
        
        labelRegisMenu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new Register().setVisible(true);
				dispose();
			}
		});

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginLabel)
                                .addGap(175, 175, 175))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(welcomeLabel)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(usernameLabel)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(usernameField))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(passwordLabel)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(registerWordLabel)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(labelRegisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(passwordField)))))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(welcomeLabel)
                                .addGap(63, 63, 63)
                                .addComponent(loginLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(registerWordLabel)
                                        .addComponent(labelRegisMenu))
                                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void labelRegisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelRegisMenuActionPerformed
        // Implementasi ini akan membuka panel Register dan menyembunyikan panel LogIn
        Register registerPanel = new Register();
        registerPanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelRegisMenuActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    private JLabel labelRegisMenu;
    private JLabel welcomeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registerWordLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
}
