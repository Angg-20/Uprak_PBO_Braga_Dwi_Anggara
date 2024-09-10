package uprak;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Uprak extends javax.swing.JFrame {

    private List<provinces> p = new ArrayList<>();
    private List<regencies> r = new ArrayList<>();
    private List<districts> d = new ArrayList<>();
    private List<Member> m = new ArrayList<>();
    private int lastMemberNumber = 1;

    public Uprak() {
        initComponents();
        AmbilDataProvinces();
        AmbilDataDistricts();
        AmbilDataRegencies();
    }

    public void AmbilDataProvinces() {
        try (Connection con = Database.KoneksiDB();
                PreparedStatement pst = con.prepareStatement("SELECT * FROM provinces");
                ResultSet hasil = pst.executeQuery()) {

            while (hasil.next()) {
                Provinsi.addItem(hasil.getString("name"));
                p.add(new provinces(hasil.getInt("id"), hasil.getString("name")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching provinces: " + e.getMessage());
        }
    }

    public void AmbilDataRegencies() {
        try (Connection con = Database.KoneksiDB();
                PreparedStatement pst = con.prepareStatement("SELECT * FROM regencies");
                ResultSet hasil = pst.executeQuery()) {

            while (hasil.next()) {
                r.add(new regencies(hasil.getInt("id"), hasil.getInt("province_id"), hasil.getString("name")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching regencies: " + e.getMessage());
        }
    }

    public void AmbilDataDistricts() {
        try (Connection con = Database.KoneksiDB();
                PreparedStatement pst = con.prepareStatement("SELECT * FROM districts");
                ResultSet hasil = pst.executeQuery()) {

            while (hasil.next()) {
                d.add(new districts(hasil.getInt("id"), hasil.getInt("regency_id"), hasil.getString("name")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching districts: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        Baru = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        KM = new javax.swing.JTextField();
        NL = new javax.swing.JTextField();
        TL = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        A = new javax.swing.JTextArea();
        Provinsi = new javax.swing.JComboBox<>();
        Kota = new javax.swing.JComboBox<>();
        Kecamatan = new javax.swing.JComboBox<>();
        NT = new javax.swing.JTextField();
        Laki = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        agama = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Kode Member");

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("Alamat");

        jLabel5.setText("Provinsi");

        jLabel6.setText("Kab / Kota");

        jLabel7.setText("Kecamatan");

        jLabel8.setText("Nomor Telepon");

        jLabel9.setText("Jenis Kelamin");

        jLabel10.setText("Agama");

        Simpan.setText("Simpan");

        Baru.setText("Baru");
        Baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaruActionPerformed(evt);
            }
        });

        Hapus.setBackground(new java.awt.Color(204, 0, 0));
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setText("Hapus");

        KM.setEnabled(false);
        KM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMActionPerformed(evt);
            }
        });

        A.setColumns(20);
        A.setRows(5);
        jScrollPane2.setViewportView(A);

        Provinsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "provinsi" }));
        Provinsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinsiActionPerformed(evt);
            }
        });

        Kota.setEnabled(false);
        Kota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KotaMouseClicked(evt);
            }
        });
        Kota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KotaActionPerformed(evt);
            }
        });

        Kecamatan.setEnabled(false);

        buttonGroup1.add(Laki);
        Laki.setText("Laki-Laki");

        buttonGroup1.add(P);
        P.setText("Perempuan");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(KM))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NL)
                                    .addComponent(TL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(Provinsi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kecamatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NT)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(Laki)
                                        .addGap(28, 28, 28)
                                        .addComponent(P)
                                        .addGap(0, 102, Short.MAX_VALUE))
                                    .addComponent(agama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Baru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(KM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Laki)
                    .addComponent(P))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Baru, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Member", "Nama Lengkap", "Jenis Kelamin", "No Telepon"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaruActionPerformed
        String year = String.valueOf(java.time.Year.now().getValue()).substring(2);

        Connection con = Database.KoneksiDB();
        String sql = "SELECT MAX(kode_member) AS last_code FROM members"; // Asumsi tabel bernama 'members'

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet hasil = pst.executeQuery();

            String lastCode = "000";
            if (hasil.next() && hasil.getString("last_code") != null) {
                String lastMemberCode = hasil.getString("last_code");
                String lastNumberStr = lastMemberCode.substring(6);
                int lastNumber = Integer.parseInt(lastNumberStr);
                int newNumber = lastNumber + 1;
                lastCode = String.format("%03d", newNumber);
            }

            String newMemberCode = "UP-" + year + "-" + lastCode;

            KM.setText(newMemberCode);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BaruActionPerformed

    private void KMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMActionPerformed

    }//GEN-LAST:event_KMActionPerformed

    private void ProvinsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinsiActionPerformed
        if (Provinsi.getSelectedItem() != null) {
            String Pro = Provinsi.getSelectedItem().toString();
            Kota.setEnabled(true);
            Kota.removeAllItems();
            for (provinces prov : p) {
                if (prov.getName().equals(Pro)) {
                    for (regencies apa : r) {
                        if (apa.getProvince_id() == prov.getId()) {
                            Kota.addItem(apa.getName());
                        }
                    }
                    break;
                }
            }
        } else {
            Kota.setEnabled(false);
            Kecamatan.setEnabled(false);
            Kecamatan.removeAllItems();
            Kota.removeAllItems();
        }
    }//GEN-LAST:event_ProvinsiActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        String year = String.valueOf(java.time.Year.now().getValue()).substring(2);

        String newMemberCode = String.format("UP-%s-%03d", year, lastMemberNumber);

        KM.setText(newMemberCode);

        lastMemberNumber++;
    }//GEN-LAST:event_formWindowActivated

    private void KotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KotaMouseClicked
    }//GEN-LAST:event_KotaMouseClicked

    private void KotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KotaActionPerformed
        if (Kota.getSelectedItem() != null) {
            String Pro = Kota.getSelectedItem().toString();
            Kecamatan.setEnabled(true);
            Kecamatan.removeAllItems();
            for (regencies prov : r) {
                if (prov.getName().equals(Pro)) {
                    for (districts apa : d) {
                        if (apa.getRegency_id()== prov.getId()) {
                            Kecamatan.addItem(apa.getName());
                        }
                    }
                    break;
                }
            }
        } else {
            Kecamatan.setEnabled(false);
            Kecamatan.removeAllItems();
        }
    }//GEN-LAST:event_KotaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uprak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea A;
    private javax.swing.JButton Baru;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField KM;
    private javax.swing.JComboBox<String> Kecamatan;
    private javax.swing.JComboBox<String> Kota;
    private javax.swing.JRadioButton Laki;
    private javax.swing.JTextField NL;
    private javax.swing.JTextField NT;
    private javax.swing.JRadioButton P;
    private javax.swing.JComboBox<String> Provinsi;
    private javax.swing.JButton Simpan;
    private com.toedter.calendar.JDateChooser TL;
    private javax.swing.JComboBox<String> agama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
