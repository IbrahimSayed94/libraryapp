
package library.management.system;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Library extends javax.swing.JFrame 
{
    

    
    public Library() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Library Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 384, 32);

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel2.setText("Title");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 39, 18);

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel3.setText("ISN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 34, 18);

        jLabel4.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel4.setText("Category");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 180, 70, 18);

        jLabel5.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel5.setText("Edition");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 220, 61, 18);

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel6.setText("Author");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 260, 55, 18);

        jLabel7.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel7.setText("Publication Year");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 300, 134, 18);

        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 100, 210, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 140, 210, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 180, 210, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 220, 210, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 260, 210, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(200, 300, 210, 20);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 380, 90, 40);

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 380, 91, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\roony\\Desktop\\Library-MS.jpg")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 470, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
       Connection con;
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName =Library Management System","ibrahim1","12345");
       Statement st;
            st = con.createStatement();
       
       String q="insert into Book(Title , ISN , Category ,Edition , Author ,Publication_Year) values ('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"')";
            st.executeUpdate(q);
            
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField5.setText("");
       jTextField6.setText("");
       JOptionPane.showMessageDialog(rootPane, "Book is Saved");
    
       con.close(); 
       st.close();
        } // end of try
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.print("e : " + e.toString());
        }// end of catch
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Library.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
// end of button_Close
    
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Library().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
