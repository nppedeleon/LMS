import datechooser.model.DateChoose;
import java.awt.Frame;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class admindrop extends javax.swing.JFrame{
      Connection cn;
      PreparedStatement ps;
      ResultSet res;
    /**
     * Creates new form login
     */
    public admindrop(){
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
        s = new javax.swing.JButton();
        c = new javax.swing.JButton();
        admin_masterbtn = new javax.swing.JButton();
        admin_editbtn = new javax.swing.JButton();
        admin_delbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b = new javax.swing.JButton();
        admin_reqbtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        req = new javax.swing.JTable();
        admin_reqbookno = new javax.swing.JLabel();
        admin_reqtitle = new javax.swing.JLabel();
        reqerror = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        admin_reqsub = new javax.swing.JLabel();
        admin_reqauthor = new javax.swing.JLabel();
        admin_reqlang = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        admin_reqpub = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        admin_reqauthor1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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

        s.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        s.setText("STUDENT INFO");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 170, 50));

        c.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        c.setText("COUNTER");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 170, 50));

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

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 630, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sony\\Desktop\\CCS\\Systems\\Backgrounds\\admintitle.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 110));

        b.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        b.setText("BOOK MONITOR");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 50));

        admin_reqbtn1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        admin_reqbtn1.setText("REQUESTS");
        admin_reqbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_reqbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(admin_reqbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        req.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Borrowed", "Book No", "Student ID", "Returning Date"
            }
        ));
        req.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(req);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 390, 330));

        admin_reqbookno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        admin_reqbookno.setText("jLabel13");
        jPanel1.add(admin_reqbookno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        admin_reqtitle.setText("jLabel13");
        jPanel1.add(admin_reqtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        reqerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(reqerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contact.setText("Gender:");
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Remarks:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.setText("Username:");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Contact No:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setText("Lastname:");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setText("Lastname:");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Gender:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Student ID:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));

        admin_reqsub.setText("jLabel13");
        jPanel1.add(admin_reqsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, -1));

        admin_reqauthor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        admin_reqauthor.setText("Click here to View ");
        jPanel1.add(admin_reqauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        admin_reqlang.setText("jLabel13");
        jPanel1.add(admin_reqlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 320, 100));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Publisher:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("RETURNED BOOKS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 150, 40));

        admin_reqpub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        admin_reqpub.setText("Language:");
        jPanel1.add(admin_reqpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 110, 50));

        jButton3.setText("CONFIRM");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 110, 50));

        admin_reqauthor1.setText("jLabel13");
        jPanel1.add(admin_reqauthor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Title:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Author:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Subtitle:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Language:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Book No:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel6.setText("DROP-OFF Book");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Click to view the details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebg.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 960, 490));

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
        fetch();

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

    private void reqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqMouseClicked
        DefaultTableModel model = (DefaultTableModel)req.getModel();
        int selectedRowIndex = req.getSelectedRow();
        
        try{
            admin_reqbookno.setText(model.getValueAt(selectedRowIndex, 1).toString());
            }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_reqMouseClicked

    private void admin_reqbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_reqbtn1ActionPerformed
       adminstatus a = new adminstatus();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_admin_reqbtn1ActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
          admininfo a = new admininfo();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_sActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
          counter a = new counter();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_cActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
       monitor a = new monitor();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_bActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        counter a = new counter();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        returnbook a = new returnbook();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    
     public void fetch(){
        try{
            cn=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            String q = "Select date as 'Date Requested' , booknumber as 'Book No' , user as 'User' from borrowlist order by date desc";
            ps = cn.prepareStatement(q);
            res=ps.executeQuery();
            req.setModel(DbUtils.resultSetToTableModel(res));
        } 
        catch(Exception e){
        }
    }
      public class Function{
        Connection cn = null;
        ResultSet res = null;
        PreparedStatement ps = null;
        public ResultSet find(String s){
            try{
                cn=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
                ps = cn.prepareStatement("Select * from masterlist where booknumber = ?");
                ps.setString(1, s);
                res = ps.executeQuery();
                }      
                catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return res;
        }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_addbtn;
    private javax.swing.JButton admin_delbtn;
    private javax.swing.JButton admin_editbtn;
    private javax.swing.JButton admin_masterbtn;
    private javax.swing.JLabel admin_reqauthor;
    private javax.swing.JLabel admin_reqauthor1;
    private javax.swing.JLabel admin_reqbookno;
    private javax.swing.JButton admin_reqbtn1;
    private javax.swing.JLabel admin_reqlang;
    private javax.swing.JLabel admin_reqpub;
    private javax.swing.JLabel admin_reqsub;
    private javax.swing.JLabel admin_reqtitle;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel gender;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel name;
    private javax.swing.JTable req;
    private javax.swing.JLabel reqerror;
    private javax.swing.JButton s;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
