/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NVT
 */
public class BookTicket extends javax.swing.JFrame {

    /**
     * Creates new form OrderFood
     */
    public BookTicket() {
        initComponents();
        this.setBounds(200, 10, 700, 700);
        this.setResizable(false);
        
       
         try
        {
            Database d=new Database();
            PreparedStatement ps=d.con.prepareStatement("select * from flight");
            ResultSet rs=ps.executeQuery();
           
            DefaultTableModel td=new DefaultTableModel();
            td=(DefaultTableModel)jTable1.getModel();
            td.setNumRows(0);
            while(rs.next())
            {
               
                String company=rs.getString(1);
                String from=rs.getString(2);
                String to=rs.getString(3);
                  String date=rs.getString(4);
                    String total=rs.getString(5);
               
                
               td.addRow(new Object[]{company,from,to,date,total});
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
          
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Book Flight");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 170, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "company", "From", "to", "date", "number of seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 60, 600, 150);

        jLabel2.setText("Company");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 230, 60, 14);

        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 280, 100, 20);

        jLabel4.setText("Dob");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 340, 60, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 220, 180, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 270, 180, 40);

        jButton1.setText("Book Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 610, 80, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 320, 190, 40);

        jLabel5.setText("Passport number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 390, 90, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 370, 190, 40);

        jLabel6.setText("Phone Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 450, 80, 20);

        jLabel7.setText("Addresss");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 510, 100, 20);

        jLabel8.setText("From");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 560, 50, 20);

        jLabel9.setText("To");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 610, 40, 14);

        jLabel10.setText("date & Time");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 650, 70, 14);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 430, 190, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(170, 490, 190, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(170, 540, 190, 40);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(170, 600, 190, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(170, 640, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
         Database d=new Database();
        String company=jTextField1.getText();
        String uname=jTextField2.getText();
        String dob=jTextField3.getText();
         String pno=jTextField4.getText();
         String phno=jTextField5.getText();
         String address=jTextField6.getText();
         String from=jTextField7.getText();
         String to=jTextField8.getText();
         String date=jTextField9.getText();
        
        
        try{
            
            PreparedStatement ps=d.con.prepareStatement("INSERT INTO `airticket`.`ticketbooking` (\n" +
"`company` ,\n" +
"`uname` ,\n" +
"`dob` ,\n" +
"`passportno` ,\n" +
"`phno` ,\n" +
"`address` ,\n" +
"`from` ,\n" +
"`to` ,\n" +
"`datetime`\n" +
") VALUES (?,?,?,?,?,?,?,?,?)");
           ps.setString(1, company);
           ps.setString(2, uname);
           ps.setString(3, dob);
          ps.setString(4, pno);
            ps.setString(5, phno);
              ps.setString(6, address);
                ps.setString(7, from);
                  ps.setString(8, to);
                    ps.setString(9, date);
          int val = ps.executeUpdate();
          if(val>=1){
              JOptionPane.showMessageDialog(null, "successfully booked");
              
             
              
          }
          else{
                            JOptionPane.showMessageDialog(null, "not successfully booked");

          }
            
        }catch(Exception e){
            System.out.println("cannot order"+e);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
