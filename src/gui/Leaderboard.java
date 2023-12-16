package gui;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Leaderboard extends javax.swing.JFrame {

    public Leaderboard() {
        initComponents();
        initializeTable();
    }

    private void initializeTable() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Level");
        model.addColumn("Player");
        model.addColumn("Score");

        model.addRow(new Object[]{"", "Player 1", ""});
        model.addRow(new Object[]{"", "Player 2", ""});
        model.addRow(new Object[]{"", "Player 3", ""});
        model.addRow(new Object[]{"", "Player 4", ""});
        model.addRow(new Object[]{"", "Player 5", ""});
        model.addRow(new Object[]{"", "Player 6", ""});
        model.addRow(new Object[]{"", "Player 7", ""});
        model.addRow(new Object[]{"", "Player 8", ""});
        model.addRow(new Object[]{"", "Player 9", ""});
        model.addRow(new Object[]{"", "Player 10", ""});

        JTable jTable = new JTable(model);
        scrollPanePlayer.setViewportView(jTable);
        scrollPanePlayer.setBackground(new java.awt.Color(153, 153, 153));;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leaderBoardLB = new javax.swing.JLabel();
        scrollPanePlayer = new javax.swing.JScrollPane();
        jListPlayer = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        leaderBoardLB.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        leaderBoardLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leaderBoardLB.setText("Leaderboard");
        
        scrollPanePlayer.setViewportView(jListPlayer);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(leaderBoardLB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanePlayer)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(leaderBoardLB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leaderboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel leaderBoardLB;
    private javax.swing.JList<String> jListPlayer;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane scrollPanePlayer;
    // End of variables declaration//GEN-END:variables
}