import datechooser.model.DateChoose;
import java.awt.Frame;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class adminpick extends javax.swing.JFrame{
      Connection cn;
      PreparedStatement ps;
      ResultSet res;
    /**
     * Creates new form login
     */
    public adminpick(){
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
        b1 = new javax.swing.JButton();
        admin_masterbtn = new javax.swing.JButton();
        admin_editbtn = new javax.swing.JButton();
        admin_delbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        admin_reqpub = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        returndate = new datechooser.beans.DateChooserCombo();
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

        b1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        b1.setText("BOOK MONITOR");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 50));

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
                "Date Approved", "Book No", "Student ID"
            }
        ));
        req.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(req);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 350, 340));

        admin_reqbookno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(admin_reqbookno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));
        jPanel1.add(admin_reqtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        reqerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(reqerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Set Returning Date:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Contact No:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Gender:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Student ID:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));
        jPanel1.add(admin_reqsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, -1));
        jPanel1.add(admin_reqauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));
        jPanel1.add(admin_reqlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Publisher:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        admin_reqpub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(admin_reqpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 110, 50));

        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 110, 50));

        returndate.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    returndate.setShowOneMonth(true);
    jPanel1.add(returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, 30));

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
    jLabel6.setText("PICK-UP Book");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setText("Click to view the details");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebg.png"))); // NOI18N
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 920, 470));

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
            username.setText(model.getValueAt(selectedRowIndex, 2).toString());
            }
        catch(Exception e){
            
        }
        try{
            Function f = new Function();
            ResultSet res = null;
            res = f.find(admin_reqbookno.getText());
            if(res.next()){
                admin_reqtitle.setText(res.getString("title"));        
                admin_reqsub.setText(res.getString("subtitle"));               
                admin_reqauthor.setText(res.getString("author"));               
                admin_reqpub.setText(res.getString("publisher"));
                admin_reqlang.setText(res.getString("language"));
 
            }
            else{
                JOptionPane.showMessageDialog(null, "Select one you wish to view details");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Functionn f = new Functionn();
        ResultSet res = null;
        res = f.find(username.getText());
        try{
            if(res.next()){
                String fn = res.getString("firstname");
                String mn = res.getString("middlename");
                String ln = res.getString("lastname");
                String full = ln + ", " + fn + " "+ mn;
                name.setText(full);        
                gender.setText(res.getString("gender"));               
                contact.setText(res.getString("contact"));               
            }
            else{
                JOptionPane.showMessageDialog(null, "Select one you wish to view details");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
      
        try{
            cn=sql.myConnection();
            String ins="INSERT INTO bookmonitor Values (?,?,?,?,?,?)";
            ps=cn.prepareStatement(ins);
            String s = ourJavaDateObject.toString();
            ps.setString(1, s);
            ps.setString(2, username.getText());
            String bk = admin_reqbookno.getText().toString();
            ps.setString(3, bk);
            String title = admin_reqtitle.getText().toString();
            ps.setString(4, title);
            String rdate = returndate.getText().toString();
            ps.setString(5, rdate);
            String stat = "On-going";
            ps.setString(6, stat);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "You can now view " + bk + " in Book Monitor");
            }
             
        catch(Exception e){
            

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        monitor a = new monitor();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        counter a = new counter();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
     public void fetch(){
        try{
            cn=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
            String q = "Select date as 'Date Requested' , booknumber as 'Book No' , id as 'Student ID' from borrowlist order by date desc";
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
      public class Functionn{
        Connection cn = null;
        ResultSet res = null;
        PreparedStatement ps = null;
        public ResultSet find(String s){
            try{
                cn=DriverManager.getConnection("jdbc:mysql://localhost/lms","root","");
                ps = cn.prepareStatement("Select * from student where username = ?");
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
    private javax.swing.JLabel admin_reqbookno;
    private javax.swing.JButton admin_reqbtn1;
    private javax.swing.JLabel admin_reqlang;
    private javax.swing.JLabel admin_reqpub;
    private javax.swing.JLabel admin_reqsub;
    private javax.swing.JLabel admin_reqtitle;
    private javax.swing.JButton b1;
    private javax.swing.JButton c;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel gender;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel name;
    private javax.swing.JTable req;
    private javax.swing.JLabel reqerror;
    private datechooser.beans.DateChooserCombo returndate;
    private javax.swing.JButton s;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
