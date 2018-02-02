
package library.management.system;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Library5 extends javax.swing.JFrame {

    public Library5() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 60, 50, 40);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setText("Borrow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 210, 90, 40);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 70, 200, 30);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 210, 90, 40);

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(280, 210, 90, 40);

        jRadioButton1.setText("Professor");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(230, 110, 71, 23);

        jRadioButton2.setText("Student");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(130, 110, 63, 23);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 100, 60);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 140, 200, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Library Management System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 384, 32);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\roony\\Desktop\\Untitled.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 410, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        Library l = new Library();
        l.setVisible(true);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     
  

     
        
       if(jRadioButton2.isSelected())
       {
            
              try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
       Connection con;
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName =Library Management System","ibrahim1","12345");
       Statement st;
            st = con.createStatement();
        String q="DELETE FROM Book WHERE Title ='"+jTextField3.getText()+"'";
        st.executeUpdate(q);
        String q1="UPDATE Student SET Book1='"+jTextField3.getText()+"'WHERE Student_name='"+jTextField2.getText()+"'AND Book1 IS NULL";
               st.executeUpdate(q1);
        jTextField2.setText("");
        jTextField3.setText("");
        JOptionPane.showMessageDialog(rootPane, "Book is Borrowed");

    con.close();
    st.close();
       
        } // end of try
        catch(Exception e)
        {
            System.out.print("e : " + e.toString());
        }// end of catch
           
           
             
           
           
       }// end of if 
       
       
       
         
    else   if(jRadioButton1.isSelected())
       {
            
              try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
       Connection con;
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName =Library Management System","ibrahim1","12345");
       Statement st;
            st = con.createStatement();
        String q="DELETE FROM Book WHERE Title ='"+jTextField3.getText()+"'";
        st.executeUpdate(q);
        String q1="UPDATE Professor SET Book1='"+jTextField3.getText()+"'WHERE Prof_name='"+jTextField2.getText()+"'AND Book1 IS NULL";
               st.executeUpdate(q1);
        jTextField2.setText("");
        jTextField3.setText("");
        JOptionPane.showMessageDialog(rootPane, "Book is Borrowed");

    con.close();
    st.close();
       
        } // end of try
        catch(Exception e)
        {
            System.out.print("e : " + e.toString());
        }// end of catch
           
           
             
           
           
       }// end of if 
       
    }//GEN-LAST:event_jButton1ActionPerformed
// end of button borrow
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Library l = new Library();
        l.setVisible(true);
        
        
        
        
        
       if(jRadioButton2.isSelected())
       {
            
              try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
       Connection con;
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName =Library Management System","ibrahim1","12345");
       Statement st;
            st = con.createStatement();
      
        String q1="UPDATE Student SET Book1 = NULL WHERE Student_name='"+jTextField2.getText()+"'";
               st.executeUpdate(q1);
        jTextField2.setText("");
        jTextField3.setText("");
        

    con.close();
    st.close();
       
        } // end of try
        catch(Exception e)
        {
            System.out.print("e : " + e.toString());
        }// end of catch
           
           
             
           
           
       }// end of if 
       
       
       
         
    else   if(jRadioButton1.isSelected())
       {
            
              try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
       Connection con;
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName =Library Management System","ibrahim1","12345");
       Statement st;
            st = con.createStatement();
        String q1="UPDATE Professor SET Book1 = NULL WHERE Prof_name='"+jTextField2.getText()+"'";
               st.executeUpdate(q1);
        jTextField2.setText("");
        jTextField3.setText("");
        

    con.close();
    st.close();
       
        } // end of try
        catch(Exception e)
        {
            System.out.print("e : " + e.toString());
        }// end of catch
           
           
             
           
           
       }// end of if 
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Library5.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
// end of button return
    
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
            java.util.logging.Logger.getLogger(Library5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

   
    }

