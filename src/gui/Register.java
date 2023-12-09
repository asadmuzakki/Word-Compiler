package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.net.URL;

public class Register extends javax.swing.JFrame {

    private final Image backgroundImage;

    public Register() {
        URL backgroundUrl = getClass().getResource("/assets/Background5.jpg");
        ImageIcon backgroundImageIcon = new ImageIcon(backgroundUrl);
        backgroundImage = backgroundImageIcon.getImage();
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        regisWordLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        confirmPassLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        registerLabelTitle = new javax.swing.JLabel();
        registerLabelBTN = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPassfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameField.setFont(new java.awt.Font("Segoe UI", 1, 14));
        usernameField.setBackground(new java.awt.Color(0, 0, 0));
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(new LineBorder(Color.WHITE, 2, true));

        passwordField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(new LineBorder(Color.WHITE, 2, true));

        confirmPassfield.setBackground(new java.awt.Color(0, 0, 0));
        confirmPassfield.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassfield.setBorder(new LineBorder(Color.WHITE, 2, true));

        registerLabelBTN.setBackground(new java.awt.Color(0, 0, 0, 200));
        registerLabelBTN.setForeground(new java.awt.Color(255, 255, 255));
        registerLabelBTN.setFont(new java.awt.Font("Segoe UI", 1, 12));
        registerLabelBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabelBTN.setText("<html><body style='background-color:black; margin: 4px; padding: 0px;'><font color='white'>Log In</font></body></html>");
        registerLabelBTN.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new LogIn().setVisible(true);
				dispose();
			}
		});

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        regisWordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12));
        regisWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        regisWordLabel.setText("Sudah punya akun? ");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        confirmPassLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        confirmPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassLabel.setText("Confirm Password:");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        registerLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 28));
        registerLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        registerLabelTitle.setText("Register");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        confirmPassfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassfieldActionPerformed(evt);
            }
        });
        usernameField.setOpaque(false);
        passwordField.setOpaque(false);
        confirmPassfield.setOpaque(false);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPassLabel)
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regisWordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerLabelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registerLabelTitle)
                                .addGap(118, 118, 118)))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(registerLabelTitle)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(confirmPassLabel)
                        .addComponent(confirmPassfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regisWordLabel)
                            .addComponent(registerLabelBTN))))
                .addGap(47, 47, 47))
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
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void confirmPassfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void registerLabelBTNActionPerformed(java.awt.event.ActionEvent evt) {
        LogIn loginPanel = new LogIn();
        loginPanel.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel registerLabelTitle;
    private JLabel registerLabelBTN;
    private javax.swing.JLabel regisWordLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel confirmPassLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField confirmPassfield;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField usernameField;
}
