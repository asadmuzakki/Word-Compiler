package gui;

import api.JDBC;
import api.Login;
import api.Profile;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class LogIn extends JFrame {
	
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
		
		jPanel1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		welcomeLabel = new JLabel();
		usernameLabel = new JLabel();
		usernameField = new JTextField();
		loginLabel = new JLabel();
		passwordLabel = new JLabel();
		registerWordLabel = new JLabel();
		labelRegisMenu = new JLabel();
		passwordField = new JPasswordField();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		usernameField.setFont(new Font("Segoe UI", 1, 14));
		usernameField.setBackground(new Color(0, 0, 0));
		usernameField.setForeground(new Color(255, 255, 255));
		usernameField.setBorder(new LineBorder(Color.WHITE, 2, true));
		
		passwordField.setBackground(new Color(0, 0, 0));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBorder(new LineBorder(Color.WHITE, 2, true));
		
		usernameField.setBackground(new Color(0, 0, 0));
		passwordField.setBackground(new Color(0, 0, 0));
		
		welcomeLabel.setFont(new Font("Segoe UI", 1, 22));
		welcomeLabel.setForeground(new Color(255, 255, 255));
		welcomeLabel.setText("WELCOME TO WORD COMPILE");
		
		usernameLabel.setFont(new Font("Segoe UI", 1, 18));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setText("Username:");
		
		loginLabel.setFont(new Font("Segoe UI", 1, 18));
		loginLabel.setForeground(new Color(255, 255, 255));
		loginLabel.setText("Log In");
		
		passwordLabel.setFont(new Font("Segoe UI", 1, 18));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setText("Password: ");
		
		registerWordLabel.setFont(new Font("Segoe UI", 1, 12));
		registerWordLabel.setForeground(new Color(255, 255, 255));
		registerWordLabel.setText("Belum punya akun? ");
		
		labelRegisMenu.setFont(new Font("Segoe UI", 1, 12));
		// labelRegisMenu.setBorder(new LineBorder(Color.BLACK, 2));
		labelRegisMenu.setLayout(new BorderLayout());
		labelRegisMenu.setForeground(Color.WHITE);
		labelRegisMenu.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisMenu.setText("<html><body style='background-color:black; margin: 4px; padding: 0px;'><font color='white'>Register</font></body></html>");
		
		// labelRegisMenu.setFont(new java.awt.Font("Segoe UI", 1, 12));
		// labelRegisMenu.setBorder(new LineBorder(Color.BLACK, 2));
		// labelRegisMenu.setForeground(new java.awt.Color(255, 255, 255));
		// labelRegisMenu.setBackground(new java.awt.Color(0, 0, 0, 200));
		// labelRegisMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		// labelRegisMenu.setText("Register");
		
		usernameField.addKeyListener(new KeyListener() {
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
		passwordField.addKeyListener(new KeyListener() {
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
		
		labelRegisMenu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				new Register().setVisible(true);
				dispose();
			}
		});
		
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				  jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							 .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(loginLabel)
										.addGap(175, 175, 175))
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(47, 47, 47)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												  .addComponent(welcomeLabel)
												  .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
															 .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																		.addComponent(usernameLabel)
																		.addGap(18, 18, 18)
																		.addComponent(usernameField))
															 .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																		.addComponent(passwordLabel)
																		.addGap(18, 18, 18)
																		.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
																				  .addGroup(jPanel1Layout.createSequentialGroup()
																							 .addComponent(registerWordLabel)
																							 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																							 .addComponent(labelRegisMenu, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
																				  .addComponent(passwordField)))))
										.addContainerGap(40, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				  jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(welcomeLabel)
										.addGap(63, 63, 63)
										.addComponent(loginLabel)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												  .addComponent(usernameLabel)
												  .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												  .addComponent(passwordLabel)
												  .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												  .addComponent(registerWordLabel)
												  .addComponent(labelRegisMenu))
										.addContainerGap(90, Short.MAX_VALUE))
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
	}// </editor-fold>//GEN-END:initComponents
	
	private void authUser() {
		String username = usernameField.getText();
		String password = String.valueOf(passwordField.getPassword());
		if (Login.isValidUser(username, password)) {
			JOptionPane.showMessageDialog(LogIn.this, "Login Berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);
			Profile.showProfile();
			new UserProfile().setVisible(true);
			dispose();
		} else {
			usernameField.setText("");
			passwordField.setText("");
			JOptionPane.showMessageDialog(LogIn.this, "Login Gagal", "Warning", JOptionPane.WARNING_MESSAGE);
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
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
		         UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		EventQueue.invokeLater(() -> {
			new LogIn().setVisible(true);
		});
	}
	
	private JLabel labelRegisMenu;
	private JLabel welcomeLabel;
	private JLabel usernameLabel;
	private JLabel loginLabel;
	private JLabel passwordLabel;
	private JLabel registerWordLabel;
	private JPanel jPanel1;
	private JPasswordField passwordField;
	private JTextField usernameField;
}
