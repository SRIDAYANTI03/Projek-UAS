/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sri Dayanti
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import calmirea.panelgradasi;

public class RakBuku extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RakBuku.class.getName());

    private Object[][] dataBuku = {
    {"F01","Laskar Pelangi","Fiksi","5","Tersedia"},
    {"F02","Bumi","Fiksi","3","Tersedia"},
    {"NF01","Matematika","Non-Fiksi","4","Tersedia"},
    {"NF02","Fisika","Non-Fiksi","2","Tersedia"}
};
    /**
     * Creates new form RakBuku
     */
    public RakBuku() {
        initComponents();
       
       // placeholder search
       searchTF.setText("");
       searchTF.setForeground(java.awt.Color.GRAY);

       searchTF.addFocusListener(new java.awt.event.FocusAdapter() {

    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {

        if (searchTF.getText().equals("Cari Judul Buku...")) {
            searchTF.setText("");
            searchTF.setForeground(java.awt.Color.BLACK);
        }
    }
     @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (searchTF.getText().trim().isEmpty()) {
                searchTF.setText("Cari Judul Buku...");
                searchTF.setForeground(java.awt.Color.GRAY);
            }
        }
});
       
        // icon rak buku
       java.net.URL url =
        getClass().getResource("/images/RakBuku_1.png");

if (url != null) {
    javax.swing.ImageIcon iconRak =
            new javax.swing.ImageIcon(url);

    java.awt.Image img =
            iconRak.getImage().getScaledInstance(
                    36,
                    36,
                    java.awt.Image.SCALE_SMOOTH);

    rakLB.setIcon(new javax.swing.ImageIcon(img));
    rakLB.setIconTextGap(10);
}

      
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 430));

getContentPane().setPreferredSize(
        new java.awt.Dimension(596, 347));

pack();
setLocationRelativeTo(null);
       
pack();
setLocationRelativeTo(null);
setResizable(false);
        
jTable1.setRowHeight(32);

jTable1.getTableHeader().setReorderingAllowed(false);

jTable1.getTableHeader().setBackground(
        new java.awt.Color(52,73,94));

jTable1.getTableHeader().setForeground(
        java.awt.Color.WHITE);

// Lebar kolom
    jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(220);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(130);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
    jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);

    // Judul
    rakLB.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
    
    // Label
    jLabel2.setForeground(new java.awt.Color(70, 70, 70));

    // Search
    searchTF.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));

    // Tombol Cari
   cariBT.setForeground(java.awt.Color.BLACK);
   cariBT.setFont(new java.awt.Font("Times New Roman", 0, 14));
   
    // List kategori
    jList1.setBackground(new java.awt.Color(245, 245, 245));
    jList1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));

    // Tabel
    jTable1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    jTable1.setRowHeight(28);

    jTable1.getTableHeader().setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

    jTable1.setShowVerticalLines(true);
    jTable1.setShowHorizontalLines(true);
    jTable1.setGridColor(java.awt.Color.LIGHT_GRAY);

    // Renderer Status
    jTable1.getColumnModel()
            .getColumn(4)
            .setCellRenderer(new StatusRenderer());

    // Garis pemisah kategori
    jList1.setCellRenderer(new javax.swing.DefaultListCellRenderer() {

        @Override
        public java.awt.Component getListCellRendererComponent(
                javax.swing.JList<?> list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {

            javax.swing.JLabel label =
                    (javax.swing.JLabel) super.getListCellRendererComponent(
                            list,
                            value,
                            index,
                            isSelected,
                            cellHasFocus);

            label.setBorder(
                    javax.swing.BorderFactory.createMatteBorder(
                            0,
                            0,
                            1,
                            0,
                            java.awt.Color.LIGHT_GRAY));

            return label;
        }
    });

    // Event pilih kategori
    jList1.addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            filterkategori();
        }
    });
    
     searchTF.setText("Cari Judul Buku...");
    searchTF.setForeground(java.awt.Color.GRAY);

    searchTF.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (searchTF.getText().equals("Cari Judul Buku...")) {
                searchTF.setText("");
                searchTF.setForeground(java.awt.Color.BLACK);
            }
        }

        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (searchTF.getText().trim().isEmpty()) {
                searchTF.setText("Cari Judul Buku...");
                searchTF.setForeground(java.awt.Color.GRAY);
            }
        }
    });
}
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelgradasi1 = new calmirea.panelgradasi();
        jPanel1 = new panelgradasi();
        rakLB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        cariBT = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        kembaliBT = new javax.swing.JButton();

        javax.swing.GroupLayout panelgradasi1Layout = new javax.swing.GroupLayout(panelgradasi1);
        panelgradasi1.setLayout(panelgradasi1Layout);
        panelgradasi1Layout.setHorizontalGroup(
            panelgradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelgradasi1Layout.setVerticalGroup(
            panelgradasi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 248, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        rakLB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rakLB.setText("RAK BUKU");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Rak / Kategori");

        searchTF.setForeground(new java.awt.Color(51, 51, 51));
        searchTF.setText("Cari Judul Buku...");
        searchTF.setPreferredSize(new java.awt.Dimension(240, 36));
        searchTF.addActionListener(this::searchTFActionPerformed);

        cariBT.setBackground(new java.awt.Color(255, 102, 102));
        cariBT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cariBT.setText("Cari");
        cariBT.setPreferredSize(new java.awt.Dimension(80, 34));
        cariBT.addActionListener(this::cariBTActionPerformed);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"F01", "Laskar Pelangi", "Fiksi", "5", "Tersedia"},
                {"F02", "Bumi", "Fiksi", "3", "Tersedia"},
                {"NF01", "Matematika", "Non-Fiksi", "4", "Tersedia"},
                {"NF02", "Fisika", "Non-Fiksi", "2", "Tersedia"}
            },
            new String [] {
                "ID Buku", "Judul", "Kategori", "Stok", "Status"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(500, 150));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane7.setViewportView(jTable1);

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Semua Kategori", "Fiksi", "Non-Fiksi" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setPreferredSize(new java.awt.Dimension(120, 150));
        jScrollPane1.setViewportView(jList1);

        kembaliBT.setBackground(new java.awt.Color(255, 102, 102));
        kembaliBT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        kembaliBT.setText("Kembali");
        kembaliBT.setPreferredSize(new java.awt.Dimension(90, 32));
        kembaliBT.addActionListener(this::kembaliBTActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(rakLB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(cariBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(kembaliBT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(rakLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cariBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kembaliBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
         cariBTActionPerformed(evt);
    }//GEN-LAST:event_searchTFActionPerformed

    private void cariBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBTActionPerformed

    String keyword = searchTF.getText().trim();

    if (keyword.isEmpty() || keyword.equals("Cari Judul Buku...")) {
        return;
    }

    keyword = keyword.toLowerCase();

    DefaultTableModel model =
            (DefaultTableModel) jTable1.getModel();

    boolean ditemukan = false;

    for (int i = 0; i < model.getRowCount(); i++) {

        String judul =
                model.getValueAt(i, 1).toString().toLowerCase();

        if (judul.contains(keyword)) {

            jTable1.setRowSelectionInterval(i, i);
            jTable1.scrollRectToVisible(
                    jTable1.getCellRect(i, 0, true));

            ditemukan = true;
            break;
        }
    }

    if (!ditemukan) {
        JOptionPane.showMessageDialog(
                this,
                "Buku tidak ditemukan!");
    }
    }//GEN-LAST:event_cariBTActionPerformed

    private void kembaliBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTActionPerformed
    kembaliBT.setBackground(new java.awt.Color(108,117,125));
    kembaliBT.setForeground(java.awt.Color.WHITE);

    this.dispose();
    }//GEN-LAST:event_kembaliBTActionPerformed

    private void filterkategori() {

    String kategori = jList1.getSelectedValue();

    DefaultTableModel model =
            (DefaultTableModel) jTable1.getModel();

    model.setRowCount(0);

    for (Object[] buku : dataBuku) {

        if (kategori.equals("Semua Kategori")
                || buku[2].equals(kategori)) {

            model.addRow(buku);
        }
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      try {
        for (javax.swing.UIManager.LookAndFeelInfo info :
                javax.swing.UIManager.getInstalledLookAndFeels()) {

            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(
                        info.getClassName());
                break;
            }
        }

    } catch (Exception ex) {
        ex.printStackTrace();
    }

    java.awt.EventQueue.invokeLater(() -> {
        new RakBuku().setVisible(true);
    });
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RakBuku().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kembaliBT;
    private calmirea.panelgradasi panelgradasi1;
    private javax.swing.JLabel rakLB;
    private javax.swing.JTextField searchTF;
    // End of variables declaration//GEN-END:variables

}