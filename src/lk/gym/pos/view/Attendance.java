/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import lk.gym.pos.Controller.AttendanceController;
import lk.gym.pos.Controller.MemberController;
import lk.gym.pos.Model.AttendanceModel;
import lk.gym.pos.Model.MemberModel;

/**
 *
 * @author DILSHAN
 */
public class Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
    public Attendance() {
        try {
            initComponents();
            
            loadAllMemberId();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        show_time();
        
       // loadtable
         detailsRefrish();
        
         //date
        Date date=new Date();
        String formatDate=formatDate(date);
        labDate.setText(formatDate);
        
    }
    
    private void show_time(){
        new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d=new Date();
                SimpleDateFormat s=new SimpleDateFormat("hh : mm : ss : a ");
                labTime.setText(s.format(d));
                
            }
        }).start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbMid = new rojerusan.RSComboMetro();
        jLabel7 = new javax.swing.JLabel();
        labMemberName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labTime = new javax.swing.JLabel();
        labDate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbMid.setAutoscrolls(true);
        cmbMid.setColorArrow(new java.awt.Color(170, 166, 157));
        cmbMid.setColorBorde(new java.awt.Color(170, 166, 157));
        cmbMid.setColorFondo(new java.awt.Color(170, 166, 157));
        cmbMid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cmbMid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMidItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 270, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Arrival Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 40));

        labMemberName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labMemberName.setForeground(new java.awt.Color(72, 84, 96));
        labMemberName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        labMemberName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        labMemberName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labMemberNameActionPerformed(evt);
            }
        });
        jPanel1.add(labMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 470, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Member Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 30));

        jLabel38.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 20, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Member Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 30));

        labTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 230, 40));

        labDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labDate.setForeground(new java.awt.Color(72, 84, 96));
        labDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDate.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Date");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 61, 92));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MARK");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 61, 92), 2));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 50));

        jPanel2.setBackground(new java.awt.Color(21, 79, 113));

        jLabel1.setBackground(new java.awt.Color(21, 79, 113));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATTENDANCY MARK");
        jLabel1.setOpaque(true);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/subtract_32px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        labClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/delete_32px.png"))); // NOI18N
        labClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labClose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labClose)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 50));

        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MEMBER ID", "DATE", "ARRIVAL TIME"
            }
        ));
        table.setRowHeight(25);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 470, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1250, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMidItemStateChanged

    
        try {
            // TODO add your handling code here:
            String memberId=cmbMid.getSelectedItem().toString();
            MemberModel m=new MemberController().getMemberName(memberId);
            
            labMemberName.setText(m.getName());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_cmbMidItemStateChanged

    private void labMemberNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labMemberNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labMemberNameActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        if(cmbMid.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"Please select member..");
            
        }else{
            try {
                AttendanceModel a=new AttendanceModel(cmbMid.getSelectedItem().toString(),labDate.getText(),labTime.getText());
                
                if(new AttendanceController().markAttandance(a)){
                    JOptionPane.showMessageDialog(this,"marked..");
                    detailsRefrish();
                }else{
                    JOptionPane.showMessageDialog(this,"try again...");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Payments.ICONIFIED);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void labCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCloseMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_labCloseMouseClicked

    private void labCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCloseMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_labCloseMouseEntered

    private void labCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCloseMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_labCloseMouseExited

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSComboMetro cmbMid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labClose;
    private javax.swing.JLabel labDate;
    private javax.swing.JTextField labMemberName;
    private javax.swing.JLabel labTime;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadAllMemberId() throws ClassNotFoundException, SQLException {
         ArrayList<MemberModel> Member = new MemberController().allMemberId();

            for (MemberModel Mem : Member) {
                cmbMid.addItem(Mem.getmId());

            }
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    private void detailsRefrish() {
        try {
            ArrayList<AttendanceModel> Attendance = AttendanceController.getAttendance();
            DefaultTableModel  model=(DefaultTableModel) table.getModel();
            model.setRowCount(0);
            for (AttendanceModel a : Attendance) {
                
                Object[] rowData={a.getMember_id(),a.getDate(),a.getArrival_time()
                };
                model.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}