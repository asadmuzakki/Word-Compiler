package gui;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
        @SuppressWarnings("unchecked")
        private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        lvlLabel = new javax.swing.JLabel();
        displayAns = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        wordLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        word2Label = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        randBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        word3Label = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        word4Label = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        word5Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerList = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 38, 77));

        lvlLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lvlLabel.setForeground(new java.awt.Color(255,255,255));
        lvlLabel.setText("Level ");

        displayAns.setText("TEST");
        displayAns.setFont(new java.awt.Font("Segoe UI", 0, 16));
        displayAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAnsActionPerformed(evt);
            }
        });

        clearBtn = new javax.swing.JButton();
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        clearBtn.setText("X");
        clearBtn.setBackground(new java.awt.Color(0, 77, 230));
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0,77,230));

        wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wordLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordLabel.setText("wordLabel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0,77,230));

        word2Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        word2Label.setForeground(new java.awt.Color(255, 255, 255));
        word2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word2Label.setText("word2Label");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        submitBtn.setBackground(new java.awt.Color(0,77,230));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        randBtn.setBackground(new java.awt.Color(0,77,230));
        randBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        randBtn.setForeground(new java.awt.Color(255, 255, 255));
        randBtn.setText("Acak Huruf");
        randBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBackground(new java.awt.Color(0,77,230));

        word3Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        word3Label.setForeground(new java.awt.Color(255, 255, 255));
        word3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word3Label.setText("word3Label");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0,77,230));

        word4Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        word4Label.setForeground(new java.awt.Color(255, 255, 255));
        word4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word4Label.setText("word4Label");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0,77,230));

        word5Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        word5Label.setForeground(new java.awt.Color(255, 255, 255));
        word5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word5Label.setText("word5Label");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word5Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(word5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        answerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(answerList);

        jPanel8.setBackground(new java.awt.Color(0,77,230));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kata yang Benar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0,77,230));

        scoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("SCORE:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(0,77,230));

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("WAKTU:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayAns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(randBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) // Tombol "X"
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(randBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayAns))
                .addGap(8, 8, 8)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayAnsActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {
        displayAns.setText(""); // Clear the text in the displayAns field
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton randBtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lvlLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JLabel word2Label;
    private javax.swing.JLabel word3Label;
    private javax.swing.JLabel word4Label;
    private javax.swing.JLabel word5Label;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JList<String> answerList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField displayAns;
    private javax.swing.JButton clearBtn;
    // End of variables declaration//GEN-END:variables
}
package gui;

import api.JDBC;
import api.MainGame;
import api.Profile;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main extends javax.swing.JFrame {
	
	public Main() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
	private void initComponents() {
		jInternalFrame1 = new javax.swing.JInternalFrame();
		jPanel2 = new javax.swing.JPanel();
		lvlLabel = new javax.swing.JLabel();
		displayAns = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		wordLabel = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		word2Label = new javax.swing.JLabel();
		submitBtn = new javax.swing.JButton();
		randBtn = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		word3Label = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		word4Label = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		word5Label = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		answerList = new javax.swing.JList<>();
		jPanel8 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		scoreLabel = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		timeLabel = new javax.swing.JLabel();
		
		jInternalFrame1.setVisible(true);
		
		javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
		jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
		jInternalFrame1Layout.setHorizontalGroup(
				  jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGap(0, 0, Short.MAX_VALUE)
		);
		jInternalFrame1Layout.setVerticalGroup(
				  jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGap(0, 0, Short.MAX_VALUE)
		);
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		jPanel2.setBackground(new java.awt.Color(0, 38, 77));
		
		lvlLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		lvlLabel.setForeground(new java.awt.Color(255, 255, 255));
		lvlLabel.setText("Level " + MainGame.level);
		displayAns.setEditable(false);
		
		jPanel1.setBackground(new java.awt.Color(0, 77, 230));
		
		wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		wordLabel.setForeground(new java.awt.Color(255, 255, 255));
		wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		wordLabel.setText("wordLabel");
		
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
				  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		jPanel3.setBackground(new java.awt.Color(0, 77, 230));
		
		word2Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		word2Label.setForeground(new java.awt.Color(255, 255, 255));
		word2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		word2Label.setText("word2Label");
		
		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel3Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
				  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel3Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		submitBtn.setBackground(new java.awt.Color(0, 77, 230));
		submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		submitBtn.setForeground(new java.awt.Color(255, 255, 255));
		submitBtn.setText("Submit");
		submitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		
		randBtn.setBackground(new java.awt.Color(0, 77, 230));
		randBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		randBtn.setForeground(new java.awt.Color(255, 255, 255));
		randBtn.setText("Acak Huruf");
		randBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		
		jPanel5.setBackground(new java.awt.Color(0, 77, 230));
		
		word3Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		word3Label.setForeground(new java.awt.Color(255, 255, 255));
		word3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		word3Label.setText("word3Label");
		
		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel5Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel5Layout.setVerticalGroup(
				  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel5Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		jPanel6.setBackground(new java.awt.Color(0, 77, 230));
		
		word4Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		word4Label.setForeground(new java.awt.Color(255, 255, 255));
		word4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		word4Label.setText("word4Label");
		
		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(
				  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel6Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel6Layout.setVerticalGroup(
				  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel6Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		jPanel7.setBackground(new java.awt.Color(0, 77, 230));
		
		word5Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		word5Label.setForeground(new java.awt.Color(255, 255, 255));
		word5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		word5Label.setText("word5Label");
		
		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(
				  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel7Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word5Label, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel7Layout.setVerticalGroup(
				  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel7Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(word5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		answerList = new JList<>(listModel);
		jScrollPane1.setViewportView(answerList);
		
		jPanel8.setBackground(new java.awt.Color(0, 77, 230));
		
		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Kata yang Benar : " + MainGame.answer.length);
		
		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(
				  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel8Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel8Layout.setVerticalGroup(
				  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel8Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		jPanel9.setBackground(new java.awt.Color(0, 77, 230));
		
		scoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
		scoreLabel.setText("SCORE: " + Profile.score);
		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(
				  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel9Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel9Layout.setVerticalGroup(
				  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel9Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		jPanel10.setBackground(new java.awt.Color(0, 77, 230));
		
		timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		timeLabel.setForeground(new java.awt.Color(255, 255, 255));
		timeLabel.setText("WAKTU:");
		
		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(
				  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel10Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
		);
		jPanel10Layout.setVerticalGroup(
				  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel10Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
		);
		
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												  .addComponent(displayAns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
												  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
															 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
															 .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
															 .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
															 .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
															 .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
															 .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addGap(35, 35, 35)
															 .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
															 .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												  .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												  .addComponent(randBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												  .addComponent(jScrollPane1)
												  .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
				  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(jPanel2Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												  .addGroup(jPanel2Layout.createSequentialGroup()
															 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																		.addGroup(jPanel2Layout.createSequentialGroup()
																				  .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				  .addGap(82, 82, 82))
																		.addGroup(jPanel2Layout.createSequentialGroup()
																				  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																							 .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
																							 .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																				  .addGap(65, 65, 65)))
															 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																		.addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
															 .addGap(0, 0, Short.MAX_VALUE))
												  .addGroup(jPanel2Layout.createSequentialGroup()
															 .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												  .addGroup(jPanel2Layout.createSequentialGroup()
															 .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
															 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
															 .addComponent(randBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
												  .addComponent(displayAns))
										.addGap(18, 18, 18))
		);
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addGroup(layout.createSequentialGroup()
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		game();
		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents
	
	public void setWord() {
		wordLabel.setText(MainGame.word[0]);
		word2Label.setText(MainGame.word[1]);
		word3Label.setText(MainGame.word[2]);
		word4Label.setText(MainGame.word[3]);
		word5Label.setText(MainGame.word[4]);
		wordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				displayAns.setText(displayAns.getText() + wordLabel.getText());
			}
		});
		word2Label.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				displayAns.setText(displayAns.getText() + word2Label.getText());
			}
		});
		word3Label.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				displayAns.setText(displayAns.getText() + word3Label.getText());
			}
		});
		word4Label.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				displayAns.setText(displayAns.getText() + word4Label.getText());
			}
		});
		word5Label.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				displayAns.setText(displayAns.getText() + word5Label.getText());
			}
		});
	}
	
	public void game() {
		setWord();
		submitBtn.addActionListener(e -> {
			if (wordList.contains(displayAns.getText())) {
				if (cekList()) {
					addItemToList();
					displayAns.setText("");
				}
				pack();
			} else {
				JOptionPane.showMessageDialog(Main.this, "Kata tidak ditemukan", "Warning", JOptionPane.WARNING_MESSAGE);
				displayAns.setText("");
			}
			if (listModel.getSize() == MainGame.answer.length) {
				MainGame.updateScore();
				Profile.showProfile(JDBC.getUser_id());
				new UserProfile().setVisible(true);
				dispose();
			}
		});
	}
	
	public void addItemToList() {
		String newItem = displayAns.getText();
		listModel.addElement(newItem);
		setScore(newItem.length());
	}
	
	public void setScore(int wordLenght) {
		Profile.score += wordLenght*10;
//		score += Profile.score + (wordLenght * 10);
		scoreLabel.setText("SCORE: " + Profile.score);
		score = Profile.score;
	}
	
	public boolean cekList() {
		String newItem = displayAns.getText();
		String[] stringArray = new String[listModel.getSize()];
		listModel.copyInto(stringArray);
		for (int i = 0; i < stringArray.length; i++) {
			if (newItem.equals(stringArray[i])) {
				JOptionPane.showMessageDialog(Main.this, "Kata sudah ada", "Warning", JOptionPane.WARNING_MESSAGE);
				displayAns.setText("");
				return false;
			}
		}
		return true;
	}
	
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
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton submitBtn;
	private javax.swing.JButton randBtn;
	private javax.swing.JInternalFrame jInternalFrame1;
	private javax.swing.JLabel lvlLabel;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel wordLabel;
	private javax.swing.JLabel word2Label;
	private javax.swing.JLabel word3Label;
	private javax.swing.JLabel word4Label;
	private javax.swing.JLabel word5Label;
	private javax.swing.JLabel scoreLabel;
	private javax.swing.JLabel timeLabel;
	private javax.swing.JList<String> answerList;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField displayAns;
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private List<String> wordList = Arrays.asList(MainGame.answer);
	public static int score;
	// End of variables declaration//GEN-END:variables
}
