package gui;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import api.JDBC;
import api.Login;
import api.Profile;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author HP
 */
public class LogIn extends javax.swing.JFrame {
	
	/**
	 * Creates new form LogIn
	 */
	public LogIn() {
		initComponents();
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		userTxt = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		regisLabel = new javax.swing.JLabel();
		passTxt = new javax.swing.JPasswordField();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		jPanel1.setBackground(new java.awt.Color(51, 51, 51));
		
		jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 204, 102));
		jLabel1.setText("SELAMAT DATANG DI WORD COMPILE");
		
		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 204, 102));
		jLabel2.setText("Username:");
		
		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(0, 204, 102));
		jLabel3.setText("Log In");
		
		jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(0, 204, 102));
		jLabel4.setText("Password: ");
		
		jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 204, 102));
		jLabel6.setText("Belum punya akun? ");
		
		regisLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		regisLabel.setForeground(new java.awt.Color(0, 204, 102));
		regisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		regisLabel.setText("Register");
      userTxt.addKeyListener(new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
          
          }
          
          @Override
          public void keyPressed(KeyEvent e) {
              if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                 authUser();
              }
          }
          
          @Override
          public void keyReleased(KeyEvent e) {
          
          }
      });
		passTxt.addKeyListener(new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
          
          }
          
          @Override
          public void keyPressed(KeyEvent e) {
              if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                  authUser();
						
              }
          }
          
          @Override
          public void keyReleased(KeyEvent e) {
          
          }
      });
		regisLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new Register().setVisible(true);
				dispose();
			}
		});
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel3)
										.addGap(175, 175, 175))
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(47, 47, 47)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												  .addComponent(jLabel1)
												  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
															 .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabel2)
																		.addGap(18, 18, 18)
																		.addComponent(userTxt))
															 .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabel4)
																		.addGap(18, 18, 18)
																		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																				  .addGroup(jPanel1Layout.createSequentialGroup()
																							 .addComponent(jLabel6)
																							 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																							 .addComponent(regisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
																				  .addComponent(passTxt)))))
										.addContainerGap(40, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGap(63, 63, 63)
										.addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												  .addComponent(jLabel2)
												  .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												  .addComponent(jLabel4)
												  .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												  .addComponent(jLabel6)
												  .addComponent(regisLabel))
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
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents
	
	private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_passTxtActionPerformed
	
	public void authUser() {
		String username = userTxt.getText();
		String password = String.valueOf(passTxt.getPassword());
		if (Login.isValidUser(username, password)) {
			JOptionPane.showMessageDialog(LogIn.this, "Login Berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);
			Profile.showProfile(JDBC.getUser_id());
			new UserProfile().setVisible(true);
			dispose();
		} else {
			userTxt.setText("");
			passTxt.setText("");
			JOptionPane.showMessageDialog(LogIn.this, "Login Gagal", "Warning", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel regisLabel;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField passTxt;
	private javax.swing.JTextField userTxt;
	// End of variables declaration//GEN-END:variables
}
