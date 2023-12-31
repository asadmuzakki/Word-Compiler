package gui;

import api.JDBC;
import api.Regis;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class Register extends JFrame {
	
	private final Image backgroundImage;
	
	public Register() {
		URL backgroundUrl = getClass().getResource("/assets/Background5.jpg");
		ImageIcon backgroundImageIcon = new ImageIcon(backgroundUrl);
		backgroundImage = backgroundImageIcon.getImage();
		initComponents();
	}
	
	private void initComponents() {
		jPanel1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		regisWordLabel = new JLabel();
		passwordLabel = new JLabel();
		usernameLabel = new JLabel();
		confirmPassLabel = new JLabel();
		usernameField = new JTextField();
		registerLabelTitle = new JLabel();
		registerLabelBTN = new JLabel();
		passwordField = new JPasswordField();
		confirmPassfield = new JPasswordField();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		usernameField.setFont(new Font("Segoe UI", 1, 14));
		usernameField.setBackground(new Color(0, 0, 0));
		usernameField.setForeground(new Color(255, 255, 255));
		usernameField.setBorder(new LineBorder(Color.WHITE, 2, true));
		
		passwordField.setBackground(new Color(0, 0, 0));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBorder(new LineBorder(Color.WHITE, 2, true));
		
		confirmPassfield.setBackground(new Color(0, 0, 0));
		confirmPassfield.setForeground(new Color(255, 255, 255));
		confirmPassfield.setBorder(new LineBorder(Color.WHITE, 2, true));
		
		registerLabelBTN.setBackground(new Color(0, 0, 0, 200));
		registerLabelBTN.setForeground(new Color(255, 255, 255));
		registerLabelBTN.setFont(new Font("Segoe UI", 1, 12));
		registerLabelBTN.setHorizontalAlignment(SwingConstants.CENTER);
		registerLabelBTN.setText("<html><body style='background-color:black; margin: 4px; padding: 0px;'><font color='white'>Log In</font></body></html>");
		registerLabelBTN.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new LogIn().setVisible(true);
				dispose();
			}
		});
		
		regisWordLabel.setFont(new Font("Segoe UI", 1, 12));
		regisWordLabel.setForeground(new Color(255, 255, 255));
		regisWordLabel.setText("Sudah punya akun? ");
		
		passwordLabel.setFont(new Font("Segoe UI", 1, 18));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setText("Password:");
		
		usernameLabel.setFont(new Font("Segoe UI", 1, 18));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setText("Username:");
		
		confirmPassLabel.setFont(new Font("Segoe UI", 1, 18));
		confirmPassLabel.setForeground(new Color(255, 255, 255));
		confirmPassLabel.setText("Confirm Password:");
		
		registerLabelTitle.setFont(new Font("Segoe UI", 1, 28));
		registerLabelTitle.setForeground(new Color(255, 255, 255));
		registerLabelTitle.setText("Register");
		
		usernameField.setOpaque(false);
		passwordField.setOpaque(false);
		confirmPassfield.setOpaque(false);
		
		usernameField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String username = usernameField.getText();
					String password = String.valueOf(passwordField.getPassword());
					String confirmPass = String.valueOf(confirmPassfield.getPassword());
					if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
						JOptionPane.showMessageDialog(Register.this, "Masukkan Data dengan Benar", "Warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if (!password.equals(confirmPass)) {
						JOptionPane.showMessageDialog(Register.this, "Password tidak sama", "Warning", JOptionPane.WARNING_MESSAGE);
						usernameField.setText("");
						passwordField.setText("");
						confirmPassfield.setText("");
						return;
					}
					registerUser();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		passwordField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String username = usernameField.getText();
					String password = String.valueOf(passwordField.getPassword());
					String confirmPass = String.valueOf(confirmPassfield.getPassword());
					if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
						JOptionPane.showMessageDialog(Register.this, "Masukkan Data dengan Benar", "Warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if (!password.equals(confirmPass)) {
						JOptionPane.showMessageDialog(Register.this, "Password tidak sama", "Warning", JOptionPane.WARNING_MESSAGE);
						usernameField.setText("");
						passwordField.setText("");
						confirmPassfield.setText("");
						return;
					}
					registerUser();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		confirmPassfield.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String username = usernameField.getText();
					String password = String.valueOf(passwordField.getPassword());
					String confirmPass = String.valueOf(confirmPassfield.getPassword());
					if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
						JOptionPane.showMessageDialog(Register.this, "Masukkan Data dengan Benar", "Warning", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if (!password.equals(confirmPass)) {
						JOptionPane.showMessageDialog(Register.this, "Password tidak sama", "Warning", JOptionPane.WARNING_MESSAGE);
						usernameField.setText("");
						passwordField.setText("");
						confirmPassfield.setText("");
						return;
					}
					registerUser();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				  jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												  .addComponent(confirmPassLabel)
												  .addComponent(passwordLabel)
												  .addComponent(usernameLabel))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												  .addGroup(jPanel1Layout.createSequentialGroup()
															 .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
																		.addGroup(jPanel1Layout.createSequentialGroup()
																				  .addComponent(regisWordLabel)
																				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				  .addComponent(registerLabelBTN, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
																		.addGroup(jPanel1Layout.createSequentialGroup()
																				  .addComponent(registerLabelTitle)
																				  .addGap(118, 118, 118)))
															 .addContainerGap(47, Short.MAX_VALUE))
												  .addGroup(jPanel1Layout.createSequentialGroup()
															 .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																		.addComponent(confirmPassfield, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
																		.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
																		.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
															 .addGap(0, 0, Short.MAX_VALUE))))
		);
		jPanel1Layout.setVerticalGroup(
				  jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap(51, Short.MAX_VALUE)
										.addComponent(registerLabelTitle)
										.addGap(39, 39, 39)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												  .addComponent(usernameLabel)
												  .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												  .addComponent(passwordLabel)
												  .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												  .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
															 .addComponent(confirmPassLabel)
															 .addComponent(confirmPassfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												  .addGroup(jPanel1Layout.createSequentialGroup()
															 .addGap(34, 34, 34)
															 .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																		.addComponent(regisWordLabel)
																		.addComponent(registerLabelBTN))))
										.addGap(47, 47, 47))
		);
		
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				  layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							 .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
				  layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							 .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
		pack();
		setLocationRelativeTo(null);
	}
	
	private void registerUser() {
		String username = usernameField.getText();
		String password = String.valueOf(passwordField.getPassword());
		if(Regis.isValidRegis(username)){
			Regis.insertUser(username, password);
			JOptionPane.showMessageDialog(Register.this, "Register Berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);
			new LogIn().setVisible(true);
			dispose();
		}else{
			JOptionPane.showMessageDialog(Register.this, "Username Sudah Terdaftar", "Warning", JOptionPane.WARNING_MESSAGE);
			usernameField.setText("");
			passwordField.setText("");
			confirmPassfield.setText("");
		}
	}
	
	public static void main(String args[]) {
		JDBC api = new JDBC();
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
			}
		});
	}
	
	private JLabel registerLabelTitle;
	private JLabel registerLabelBTN;
	private JLabel regisWordLabel;
	private JLabel passwordLabel;
	private JLabel usernameLabel;
	private JLabel confirmPassLabel;
	private JPanel jPanel1;
	private JPasswordField passwordField;
	private JPasswordField confirmPassfield;
	private JTextField jTextField3;
	private JTextField usernameField;
}
