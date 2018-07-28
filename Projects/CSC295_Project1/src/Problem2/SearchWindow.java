/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
    Lilibeth Blandon
    CSC292-01
    Project 1: Problem 2
    About: This window searches for specific customers based on name or customer number. We then loop the arraylist
            of type Customer to find the specific customer.
    Class: SearchWindow.java
*/
/**
 *
 * @author lily
 */
public class SearchWindow extends javax.swing.JFrame {

    /**
     * Creates new form SearchWindow
     */
    private ArrayList<Customer> customer = new ArrayList<Customer>();
    private Customer currentCustomer;
    private CheckOutWindow checkoutWindow;
    private ShoppingCartWindow s;
    
    
    public SearchWindow() {
        initComponents();
    }
    
    public SearchWindow(ArrayList<Customer> customer, ShoppingCartWindow s) {
        initComponents();
        this.customer = customer;
        this.s = s;
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
        jLabel2 = new javax.swing.JLabel();
        searchByName_jTextField1 = new javax.swing.JTextField();
        searchByOrderNumber_jTextField2 = new javax.swing.JTextField();
        searchByName_jButton1 = new javax.swing.JButton();
        searchOrderNumber_jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_jTextArea1 = new javax.swing.JTextArea();
        modify_jButton3 = new javax.swing.JButton();
        delete_jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search by name:");

        jLabel2.setText("Search by order number:");

        searchByName_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByName_jTextField1ActionPerformed(evt);
            }
        });

        searchByName_jButton1.setText("Search");
        searchByName_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByName_jButton1ActionPerformed(evt);
            }
        });

        searchOrderNumber_jButton2.setText("Search");
        searchOrderNumber_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOrderNumber_jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Result");

        result_jTextArea1.setColumns(20);
        result_jTextArea1.setRows(5);
        jScrollPane1.setViewportView(result_jTextArea1);

        modify_jButton3.setText("Modify");
        modify_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_jButton3ActionPerformed(evt);
            }
        });

        delete_jButton4.setText("Delete");
        delete_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchByName_jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(searchByOrderNumber_jTextField2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchByName_jButton1)
                            .addComponent(searchOrderNumber_jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modify_jButton3)
                            .addComponent(delete_jButton4))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchByName_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByName_jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchByOrderNumber_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchOrderNumber_jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(modify_jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_jButton4)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchByName_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByName_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByName_jTextField1ActionPerformed

    private void modify_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_jButton3ActionPerformed
        //modify info
        CheckOutWindow checkout = new CheckOutWindow(currentCustomer, (customer.size()-1), customer, s);
        checkout.setVisible(true);
        checkout.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_modify_jButton3ActionPerformed

    private void searchByName_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByName_jButton1ActionPerformed
       String name = searchByName_jTextField1.getText();
       if(searchForName(name)!=null)
       {
           result_jTextArea1.setText(searchForName(name).toString());
           currentCustomer = searchForName(name);
       }
       else if(searchForName(name)==null)
       {
           JOptionPane.showMessageDialog(null, "Sorry, no name or order number was found!", "Error", JOptionPane.ERROR_MESSAGE);

       }
    }//GEN-LAST:event_searchByName_jButton1ActionPerformed

    private void searchOrderNumber_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOrderNumber_jButton2ActionPerformed
       int orderNumber = Integer.parseInt(searchByOrderNumber_jTextField2.getText());
       if(searchForOrderNumber(orderNumber)!=null)
       {
           result_jTextArea1.setText(searchForOrderNumber(orderNumber).toString());
           currentCustomer = searchForOrderNumber(orderNumber);
       }
       else if(searchForOrderNumber(orderNumber)==null)
       {
           JOptionPane.showMessageDialog(null, "Sorry, no name or order number was found!", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_searchOrderNumber_jButton2ActionPerformed

    private void delete_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButton4ActionPerformed
        currentCustomer.resetEverything();
        result_jTextArea1.setText("");
        JOptionPane.showMessageDialog(null, "Order has been deleted", "Order Deleted", JOptionPane.ERROR_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_delete_jButton4ActionPerformed

    private Customer searchForName(String c)
    {
        for(int i=0; i<customer.size(); i++)
        {
            String nameCustomer = customer.get(i).getfName() + " " + customer.get(i).getlName();
            if(c.equalsIgnoreCase(nameCustomer))
            {
                return customer.get(i);
            }
        }
        return null;
    }
    
    private Customer searchForOrderNumber(int number)
    {
        for(int i=0; i<customer.size(); i++)
        {
            int customerNumber = customer.get(i).getOrderNumber();
            if(number == customerNumber)
            {
                return customer.get(i);
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modify_jButton3;
    private javax.swing.JTextArea result_jTextArea1;
    private javax.swing.JButton searchByName_jButton1;
    private javax.swing.JTextField searchByName_jTextField1;
    private javax.swing.JTextField searchByOrderNumber_jTextField2;
    private javax.swing.JButton searchOrderNumber_jButton2;
    // End of variables declaration//GEN-END:variables
}
