import datechooser.model.DateChoose;
import java.awt.Frame;
import java.sql.*;
import javax.swing.*;
public class admin extends javax.swing.JFrame{
      Connection cn;
      PreparedStatement ps;
      ResultSet res;
    /**
     * Creates new form login
     */
    public admin(){
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

        home = new javax.swing.JButton();
        admin_addbtn = new javax.swing.JButton();
        admin_masterbtn = new javax.swing.JButton();
        admin_editbtn = new javax.swing.JButton();
        admin_delbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        admin_reqbtn1 = new javax.swing.JButton();
        admin_reqbtn2 = new javax.swing.JButton();
        admin_reqbtn4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admin_reqbtn3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");
        setBackground(new java.awt.Color(102, 102, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 50));

        admin_addbtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_addbtn.setText("ADD BOOK");
        admin_addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(admin_addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 50));

        admin_masterbtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_masterbtn.setText("MASTERLIST");
        admin_masterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_masterbtnActionPerformed(evt);
            }
        });
        getContentPane().add(admin_masterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 50));

        admin_editbtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_editbtn.setText("EDIT BOOK");
        admin_editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_editbtnActionPerformed(evt);
            }
        });
        getContentPane().add(admin_editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 170, 50));

        admin_delbtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_delbtn.setText("DELETE BOOK");
        admin_delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_delbtnActionPerformed(evt);
            }
        });
        getContentPane().add(admin_delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, 50));

        jButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 110, 30));

        admin_reqbtn1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_reqbtn1.setText("COUNTER");
        admin_reqbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_reqbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(admin_reqbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 170, 50));

        admin_reqbtn2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_reqbtn2.setText("STUDENT INFO");
        admin_reqbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_reqbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(admin_reqbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 170, 50));

        admin_reqbtn4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_reqbtn4.setText("REQUESTS");
        admin_reqbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_reqbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(admin_reqbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 50));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 630, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sony\\Desktop\\CCS\\Systems\\Backgrounds\\admintitle.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 110));

        admin_reqbtn3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_reqbtn3.setText("BOOK MONITOR");
        admin_reqbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_reqbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(admin_reqbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Add Book, Edit Book, View Masterlist, Delete Book, Approve or Decline Borrow Requests,");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Manage Pick up and Drop Off Book from Counter Page, Monitor Book from Book Monitor Page,");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Always logout by clicking logout button everytime you leave your PC.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("and View and Manage Students from Student Information Page.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("For any problem in the system contact System Administrator for details. Click buttons under menu to select operations. ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel6.setText("Welcome!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("NEU Library Management System Administrator Page, as an Admin you can :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebg.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 920, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admininnerbg.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 1080, 620));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sony\\Desktop\\CCS\\Systems\\Backgrounds\\adminbg.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.getExtendedState()|Frame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login a = new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        admin a = new admin();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void admin_addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_addbtnActionPerformed
       add a = new add();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_admin_addbtnActionPerformed

    private void admin_masterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_masterbtnActionPerformed
        masterlist a = new masterlist();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_admin_masterbtnActionPerformed

    private void admin_editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_editbtnActionPerformed
        view a = new view();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_admin_editbtnActionPerformed

    private void admin_delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_delbtnActionPerformed
       delete a = new delete();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_admin_delbtnActionPerformed

    private void admin_reqbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reqbtn1ActionPerformed
        counter a = new counter();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_admin_reqbtn1ActionPerformed

    private void admin_reqbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reqbtn2ActionPerformed
        admininfo a = new admininfo();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_admin_reqbtn2ActionPerformed

    private void admin_reqbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reqbtn4ActionPerformed
       adminstatus a = new adminstatus();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_admin_reqbtn4ActionPerformed

    private void admin_reqbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reqbtn3ActionPerformed
        monitor a = new monitor();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_admin_reqbtn3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_addbtn;
    private javax.swing.JButton admin_delbtn;
    private javax.swing.JButton admin_editbtn;
    private javax.swing.JButton admin_masterbtn;
    private javax.swing.JButton admin_reqbtn1;
    private javax.swing.JButton admin_reqbtn2;
    private javax.swing.JButton admin_reqbtn3;
    private javax.swing.JButton admin_reqbtn4;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
