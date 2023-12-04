package gui;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import api.Regis;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author HP
 */
public class Register extends javax.swing.JFrame {
	
	/**
	 * Creates new form Register
	 */
	public Register() {
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
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		userTxt = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		loginLabel = new javax.swing.JLabel();
		passTxt = new javax.swing.JPasswordField();
		confirmPassTxt = new javax.swing.JPasswordField();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		jPanel1.setBackground(new java.awt.Color(51, 51, 51));
		
		jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 204, 102));
		jLabel6.setText("Sudah punya akun? ");
		
		jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(0, 204, 102));
		jLabel7.setText("Password:");
		
		jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(0, 204, 102));
		jLabel8.setText("Username:");
		
		jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(0, 204, 102));
		jLabel9.setText("Confirm Password:");
		
		userTxt.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String username = userTxt.getText();
					String password = String.valueOf(passTxt.getPassword());
					String confirmPass = String.valueOf(confirmPassTxt.getPassword());
					if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
						JOptionPane.showMessageDialog(Register.this, "Masukkan Data dengan Benar", "Warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if (!password.equals(confirmPass)) {
						JOptionPane.showMessageDialog(Register.this, "Password tidak sama", "Warning", JOptionPane.WARNING_MESSAGE);
						userTxt.setText("");
						passTxt.setText("");
						confirmPassTxt.setText("");
						return;
					}
					registerUser();
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
					String username = userTxt.getText();
					String password = String.valueOf(passTxt.getPassword());
					String confirmPass = String.valueOf(confirmPassTxt.getPassword());
					if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
						JOptionPane.showMessageDialog(Register.this, "Masukkan Data dengan Benar", "Warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if (!password.equals(confirmPass)) {
						JOptionPane.showMessageDialog(Register.this, "Password tidak sama", "Warning", JOptionPane.WARNING_MESSAGE);
						userTxt.setText("");
						passTxt.setText("");
						confirmPassTxt.setText("");
						return;
					}
					registerUser();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		confirmPassTxt.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String username = userTxt.getText();
					String password = String.valueOf(passTxt.getPassword());
					String confirmPass = String.valueOf(confirmPassTxt.getPassword());
					if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
						JOptionPane.showMessageDialog(Register.this, "Masukkan Data dengan Benar", "Warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if (!password.equals(confirmPass)) {
						JOptionPane.showMessageDialog(Register.this, "Password tidak sama", "Warning", JOptionPane.WARNING_MESSAGE);
						userTxt.setText("");
						passTxt.setText("");
						confirmPassTxt.setText("");
						return;
					}
					registerUser();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(0, 204, 102));
		jLabel10.setText("Register");
		
		loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		loginLabel.setForeground(new java.awt.Color(0, 204, 102));
		loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		loginLabel.setText("Log In");
		loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new LogIn().setVisible(true);
				dispose();
			}
		});
		
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												  .addComponent(jLabel9)
												  .addComponent(jLabel7)
												  .addComponent(jLabel8))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
															 .addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabel6)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
															 .addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(jLabel10)
																		.addGap(118, 118, 118)))
												  .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
												  .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
												  .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(47, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap(51, Short.MAX_VALUE)
										.addComponent(jLabel10)
										.addGap(39, 39, 39)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												  .addComponent(jLabel8)
												  .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												  .addComponent(jLabel7)
												  .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
															 .addComponent(jLabel9)
															 .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												  .addGroup(jPanel1Layout.createSequentialGroup()
															 .addGap(34, 34, 34)
															 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(jLabel6)
																		.addComponent(loginLabel))))
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
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents
	
	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField3ActionPerformed
	public void registerUser(){
		String username = userTxt.getText();
		String password = String.valueOf(passTxt.getPassword());
		if(Regis.isValidRegis(username)){
			Regis.insertUser(username, password);
			JOptionPane.showMessageDialog(Register.this, "Register Berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);
			new LogIn().setVisible(true);
			dispose();
		}else{
			JOptionPane.showMessageDialog(Register.this, "Username Sudah Terdaftar", "Warning", JOptionPane.WARNING_MESSAGE);
			userTxt.setText("");
			passTxt.setText("");
			confirmPassTxt.setText("");
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel loginLabel;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField passTxt;
	private javax.swing.JPasswordField confirmPassTxt;
	private javax.swing.JTextField userTxt;
	// End of variables declaration//GEN-END:variables
}
