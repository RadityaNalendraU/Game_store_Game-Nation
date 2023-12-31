/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_besar;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;


/**
 *
 * @author radit
 */

public class frm_login extends javax.swing.JFrame {
    koneksi dbsetting;
    String driver,database,user,pass;
    Statement stat;
    
    /**
     * Creates new form frm_login
     */
    public frm_login() {
        initComponents();
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signin_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_signup = new tugas_besar.U_FButton1();
        btn_login = new tugas_besar.U_FButton1();
        gambar_login_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("login_user");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        signin_panel.setBackground(new java.awt.Color(44, 47, 51));
        signin_panel.setForeground(new java.awt.Color(239, 239, 239));
        signin_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setBackground(new java.awt.Color(18, 18, 18));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 239, 239));
        jLabel3.setText("Email");

        jLabel4.setBackground(new java.awt.Color(18, 18, 18));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        txt_password.setBackground(new java.awt.Color(72, 72, 72));
        txt_password.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_password.setCaretColor(new java.awt.Color(239, 239, 239));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        txt_email.setBackground(new java.awt.Color(72, 72, 72));
        txt_email.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        txt_email.setForeground(new java.awt.Color(239, 239, 239));
        txt_email.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_email.setCaretColor(new java.awt.Color(239, 239, 239));

        jPanel2.setBackground(new java.awt.Color(80, 113, 229));

        jLabel1.setBackground(new java.awt.Color(18, 18, 18));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setText("Sign In With an Games Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        btn_signup.setForeground(new java.awt.Color(239, 239, 239));
        btn_signup.setText("Sign Up");
        btn_signup.setFillClick(new java.awt.Color(82, 88, 238));
        btn_signup.setFillOver(new java.awt.Color(82, 139, 238));
        btn_signup.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_signup.setLineOver(new java.awt.Color(82, 139, 238));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        btn_login.setForeground(new java.awt.Color(239, 239, 239));
        btn_login.setText("Login");
        btn_login.setFillClick(new java.awt.Color(82, 88, 238));
        btn_login.setFillOver(new java.awt.Color(82, 139, 238));
        btn_login.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_login.setLineOver(new java.awt.Color(82, 139, 238));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signin_panelLayout = new javax.swing.GroupLayout(signin_panel);
        signin_panel.setLayout(signin_panelLayout);
        signin_panelLayout.setHorizontalGroup(
            signin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signin_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(signin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        signin_panelLayout.setVerticalGroup(
            signin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signin_panelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gambar_login_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas_besar/Knight Clear.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(gambar_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gambar_login_user, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        frm_utama utama = new frm_utama();
        utama.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        frm_create_account create = new frm_create_account();
        create.setVisible(true);

        //menghilangkan form utama
        this.setVisible(false);
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();
            String SQL = "SELECT * FROM user_data WHERE "
            + "email='"+txt_email.getText()+
            "' AND password='"+txt_password.getText()+"'";
            ResultSet res = stt.executeQuery(SQL);
            
            if((txt_email.getText().isEmpty()) || (txt_password.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Email Atau Password Tidak Boleh Kosong");
            }
            else{
            if(res.next()){
                if(txt_email.getText().equals(res.getString("email")) && txt_password.getText().equals(res.getString("password"))){
                    frm_user_utama user = new frm_user_utama();
                    user.email.setText(txt_email.getText());
                    user.setVisible(true);
                    
                    //menghilangkan form utama
                    this.setVisible(false);}
            }
            else{
                JOptionPane.showMessageDialog(null, "email atau password salah");
            }
            kon.close();
            res.close();
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tugas_besar.U_FButton1 btn_login;
    private tugas_besar.U_FButton1 btn_signup;
    private javax.swing.JLabel gambar_login_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel signin_panel;
    public javax.swing.JTextField txt_email;
    public javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
