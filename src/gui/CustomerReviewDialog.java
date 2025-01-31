package gui;
import session.SessionManager;
import database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Window;
import javax.swing.SwingUtilities;

/**
 *
 * @author Luisa Eustaquio
 */
public class CustomerReviewDialog extends javax.swing.JDialog {

    private int userID, serviceID, addOnsID;
    private String finAddress, finContact, finName, finService, finAddOns, finDelivery, finNote, finDate;
    
    /**
     * Creates new form ReviewDialog
     */
    public CustomerReviewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        getLoggedInUserID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();
        lblDelivery = new javax.swing.JLabel();
        lblService = new javax.swing.JLabel();
        lblAddOns = new javax.swing.JLabel();
        lblDropOff = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("jLabel1");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, -1));

        lblContact.setText("jLabel1");
        getContentPane().add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));

        lblAddress.setText("jLabel1");
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, -1));

        lblNote.setText("jLabel1");
        getContentPane().add(lblNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, -1));

        lblDelivery.setText("jLabel1");
        getContentPane().add(lblDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, -1));

        lblService.setText("jLabel1");
        getContentPane().add(lblService, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, -1));

        lblAddOns.setText("jLabel1");
        getContentPane().add(lblAddOns, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, -1));

        lblDropOff.setText("jLabel1");
        getContentPane().add(lblDropOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Customer Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Contact Number:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Additional Note:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Delivery Method:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Service Type:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Add Ons:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText(" Drop Off Date:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        btnBook.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabel9.setText("Booking Form Review");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        if (userID != -1) {       
            getServiceID(finService);
            if(!finAddOns.equals("None")){
                getAddOnsID(finAddOns);
            }
            insertCustomerRecord();
            submitBookRequest();
        } else {
            System.out.println("You are not logged in.");
        }
    }//GEN-LAST:event_btnBookActionPerformed

    public void setReviewDetails(String address, String contact, String name, String service, String addOns, String delivery, String note, String date) {
        lblAddress.setText(address);
        lblContact.setText(contact);
        lblName.setText(name);
        lblService.setText(service);
        lblAddOns.setText(addOns);
        lblDelivery.setText(delivery);
        lblNote.setText(note);
        lblDropOff.setText(date);
        
        finAddress = address;
        finContact = contact;
        finName = name;
        finService = service;
        finAddOns = addOns;
        finDelivery = delivery;
        finNote = note;
        finDate = date;
    }

    private void insertCustomerRecord() {
        try (Connection conn = DatabaseUtils.getConnection()) {
            String sql = "INSERT INTO tbl_customers (u_id, c_name, c_contact, c_address) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, userID);
                stmt.setString(2, finName);
                stmt.setString(3, finContact);
                stmt.setString(4, finAddress);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Customer record inserted successfully.");
                } else {
                    System.out.println("Failed to insert customer record.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void getLoggedInUserID(){
        String username = SessionManager.getLoggedInUser();
    
        try (Connection conn = DatabaseUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT u_id FROM tbl_users WHERE u_username = ?")) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    userID = rs.getInt("u_id");
                    System.out.println("User ID: " + userID);
                } else {
                    System.out.append("You are not logged in.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private int getServiceID(String serviceName) {
        serviceID = -1; 
        try (Connection conn = DatabaseUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT s_id FROM tbl_services WHERE s_name = ?")) {
            stmt.setString(1, serviceName);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    serviceID = rs.getInt("s_id");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return serviceID;
    }

    private int getAddOnsID(String addOnsName) {
        addOnsID = -1; 
        try (Connection conn = DatabaseUtils.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT a_id FROM tbl_addOns WHERE a_name = ?")) {
            stmt.setString(1, addOnsName);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    addOnsID = rs.getInt("a_id");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return addOnsID;
    }
    
    private int getCIDForUserID() {
        try (Connection conn = DatabaseUtils.getConnection()) {
            String sql = "SELECT c_id FROM tbl_customers WHERE u_id = ? ORDER BY c_id DESC LIMIT 1";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, userID);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return rs.getInt("c_id");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    private void submitBookRequest() {
        if (userID != -1) {
            try (Connection conn = DatabaseUtils.getConnection()) {
                int c_id = getCIDForUserID();
                if (c_id != -1) {
                    String sql = "INSERT INTO tbl_transactions (c_id, s_id, a_id, t_kilo, t_total, t_note, t_deliveryMethod, t_dropOffDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                        stmt.setInt(1, c_id);
                        stmt.setInt(2, serviceID);
                        if (addOnsID != 0) {
                            stmt.setInt(3, addOnsID);
                        } else {
                            stmt.setObject(3, null); 
                        }
                        stmt.setInt(4, 0); 
                        stmt.setInt(5, 0);
                        stmt.setString(6, finNote);
                        stmt.setString(7, "pickup"); 
                        stmt.setString(8, finDate);

                        int rowsAffected = stmt.executeUpdate();
                        if (rowsAffected > 0) {
                            javax.swing.JOptionPane.showMessageDialog(this, "Book successful!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            Window parentWindow = SwingUtilities.windowForComponent(this);
                            parentWindow.dispose();
                            dispose();
                            CustomerPanel customerPanel = new CustomerPanel();
                            customerPanel.setVisible(true);
                            
                        } else {
                            System.out.println("Failed to submit book request.");
                        }
                    }
                } else {
                    System.out.println("Failed to get c_id for user.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("You are not logged in.");
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
            java.util.logging.Logger.getLogger(CustomerReviewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerReviewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerReviewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerReviewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerReviewDialog dialog = new CustomerReviewDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnEdit;
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
    private javax.swing.JLabel lblAddOns;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblDropOff;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblService;
    // End of variables declaration//GEN-END:variables
}
