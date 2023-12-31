/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.QL_TaiKhoanDAO;
import javax.swing.JOptionPane;
import view.GameFrame;


/**
 *
 * @author thung
 */
public class TrangChu extends javax.swing.JFrame {

    GameFrame gameframe;
    
    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
       txt_ten_tk.setText("user: "+QL_TaiKhoanDAO.layTenTK());
               this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_de = new javax.swing.JButton();
        btn_tb = new javax.swing.JButton();
        btn_kho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ten_tk = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuDangNhap = new javax.swing.JMenuItem();
        mnuThoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuTaiKhoan = new javax.swing.JMenuItem();
        mnuBXH = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btn_de.setText("Dễ");
        btn_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deActionPerformed(evt);
            }
        });

        btn_tb.setText("Trung Bình");
        btn_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tbActionPerformed(evt);
            }
        });

        btn_kho.setText("Khó");
        btn_kho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DÒ MÌN");

        txt_ten_tk.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_ten_tk.setText(" User");

        jMenu1.setText("Hệ thống");

        mnuDangNhap.setText("Đăng Xuất");
        mnuDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangNhap);

        mnuThoat.setText("Thoát");
        mnuThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThoatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuThoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        mnuTaiKhoan.setText("Tài Khoản");
        mnuTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTaiKhoanActionPerformed(evt);
            }
        });
        jMenu2.add(mnuTaiKhoan);

        mnuBXH.setText("Bảng xếp hạng");
        mnuBXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBXHActionPerformed(evt);
            }
        });
        jMenu2.add(mnuBXH);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_de)
                            .addComponent(btn_tb)
                            .addComponent(btn_kho)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_ten_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_de, btn_kho, btn_tb});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_ten_tk)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_de)
                .addGap(18, 18, 18)
                .addComponent(btn_tb)
                .addGap(18, 18, 18)
                .addComponent(btn_kho)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangNhapActionPerformed
        // TODO add your handling code here:
            QL_TaiKhoanDAO.capNhatTrangThai(QL_TaiKhoanDAO.layTenTK(),"Off");
         DangNhap_GUI  frmDN = new DangNhap_GUI();
         frmDN.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_mnuDangNhapActionPerformed

    private void mnuThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThoatActionPerformed
        // TODO add your handling code here:
        QL_TaiKhoanDAO.capNhatTrangThai(QL_TaiKhoanDAO.layTenTK(),"Off");
        System.exit(0);
    }//GEN-LAST:event_mnuThoatActionPerformed

    private void btn_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deActionPerformed
        // TODO add your handling code here:
        
        
        QL_TaiKhoanDAO.capNhatTrangThaiOnGame(1,"On");
        gameframe = new GameFrame(8, 8, 10);
        gameframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_deActionPerformed

    private void btn_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tbActionPerformed
        // TODO add your handling code here:
        

        QL_TaiKhoanDAO.capNhatTrangThaiOnGame(2,"On");
        gameframe = new GameFrame(16, 16, 40);
        gameframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_tbActionPerformed

    private void btn_khoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoActionPerformed
        // TODO add your handling code here:
        
  
        QL_TaiKhoanDAO.capNhatTrangThaiOnGame(3,"On");
        gameframe = new GameFrame(16, 30, 99);
        gameframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_khoActionPerformed

    private void mnuBXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBXHActionPerformed
        // TODO add your handling code here:
        BXH_admin bxh_admin =  new BXH_admin();
        bxh_admin.setVisible(true);
        
        // Đóng JFrame1 nếu cần thiết
        this.dispose();
        
        
    }//GEN-LAST:event_mnuBXHActionPerformed

    private void mnuTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTaiKhoanActionPerformed
        // TODO add your handling code here:
        
        QLTaiKHoan_GUI qLTaiKHoan_GUI =  new QLTaiKHoan_GUI();
        qLTaiKHoan_GUI.setVisible(true);
        
        // Đóng JFrame1 nếu cần thiết
        this.dispose();
        
    }//GEN-LAST:event_mnuTaiKhoanActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn đóng cửa sổ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                
                if (result == JOptionPane.YES_OPTION) {
                    QL_TaiKhoanDAO.capNhatTrangThai(QL_TaiKhoanDAO.layTenTK(),"Off");
                    
                    System.exit(0);
                    
                }
                    
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_de;
    private javax.swing.JButton btn_kho;
    private javax.swing.JButton btn_tb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuBXH;
    private javax.swing.JMenuItem mnuDangNhap;
    private javax.swing.JMenuItem mnuTaiKhoan;
    private javax.swing.JMenuItem mnuThoat;
    private javax.swing.JLabel txt_ten_tk;
    // End of variables declaration//GEN-END:variables
}
