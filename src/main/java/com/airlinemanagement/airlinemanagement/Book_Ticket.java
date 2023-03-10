/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.airlinemanagement.airlinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Book_Ticket extends javax.swing.JInternalFrame {

    /**
     * Creates new form Book_Ticket
     */
    public Book_Ticket() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arrival = new javax.swing.JComboBox<>();
        departure = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ticket_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        customer_id = new javax.swing.JTextField();
        SearchCustomer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        fare = new javax.swing.JTextField();
        seats = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        total_fare = new javax.swing.JTextField();
        bookticket = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Book Ticket");

        jLabel2.setText("Arrival");

        jLabel3.setText("Departure");

        arrival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Goa", "Channai", "Mumbai" }));

        departure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Goa", "Mumbai", "Channai" }));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Flight Name", "Arrival", "Departure", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Ticket Id");

        jLabel5.setText("Customer Id");

        customer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_idActionPerformed(evt);
            }
        });

        SearchCustomer.setText("Search");
        SearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerActionPerformed(evt);
            }
        });

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Contact");

        jLabel9.setText("Gender");

        jLabel10.setText("Fare");

        jLabel11.setText("No. of Tickets");

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        seats.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                seatsStateChanged(evt);
            }
        });

        jLabel12.setText("Total Fare");

        bookticket.setText("Book");
        bookticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookticketActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(ticket_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(157, 157, 157)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(first_name, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(seats, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                    .addComponent(last_name)
                                                    .addComponent(contact)
                                                    .addComponent(gender)
                                                    .addComponent(fare)
                                                    .addComponent(total_fare))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bookticket)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel5)
                                    .addGap(30, 30, 30)
                                    .addComponent(customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SearchCustomer)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(ticket_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchCustomer))
                            .addGap(36, 36, 36)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8))
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(total_fare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookticket)
                            .addComponent(jButton4))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_idActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Connection con;
        PreparedStatement pre = null;
        
        String Arrival = arrival.getSelectedItem().toString();
        String Departure = departure.getSelectedItem().toString();
            //connect to db
                    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to db
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedatabase","root","Sunil@123");
            //create state for interaction with db
            Statement s = con.createStatement();

            pre = con.prepareStatement("select * from flight where Arrival=? && Departure=?");
            pre.setString(1, Arrival);
            pre.setString(2, Departure);
            //storing res in resultset
            ResultSet rs = pre.executeQuery();
            //get meta data from result set
            ResultSetMetaData RSMD = rs.getMetaData();
            //cc stands for table column that we fetch from meta data
            int cc = RSMD.getColumnCount();
            //using table to show data
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            //initial row is at 0 index
            DFT.setRowCount(0);

            Vector<String> list = new Vector<>();
            while (rs.next()) {

                for (int i = 1; i <= cc; i++) {

                    list.add(rs.getString("idFlight"));
                    list.add(rs.getString("FlightName"));
                    list.add(rs.getString("Arrival"));
                    list.add(rs.getString("Departure"));
                    list.add(rs.getString("Date"));
                }
                DFT.addRow(list);
            }

        } catch (Exception ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
                int column = 0;
        //get ob the row that mouse has selected
        int row = jTable1.getSelectedRow();
        //get that particular value of that row
        String value = jTable1.getModel().getValueAt(row, column).toString();

        //connecting backend
        Connection con;
        PreparedStatement pre = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to db
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedatabase","root","Sunil@123");
            //create state for interaction with db
            Statement s = con.createStatement();

            pre = con.prepareStatement("select * from flight where idFlight=?");
            pre.setString(1, value);

            ResultSet rs = pre.executeQuery();
            rs.next();
            fare.setText(rs.getString("Fare"));

        } catch (Exception ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void seatsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_seatsStateChanged
        // TODO add your handling code here:
              int value = (int) seats.getValue();
        int price = Integer.parseInt(fare.getText());
        int total = value * price;
        total_fare.setText(String.valueOf(total));
    }//GEN-LAST:event_seatsStateChanged

    private void bookticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookticketActionPerformed
        // TODO add your handling code here:
                Connection con;
        PreparedStatement pre = null;

        String Arrival = arrival.getSelectedItem().toString();
        String Departure = departure.getSelectedItem().toString();
        String CustId = ticket_id.getText();

        // if mouse is clicked on table 
        //initial value is 0
        int columnForFare = 0;
        //get ob the row that mouse has selected
        int row = jTable1.getSelectedRow();
        //get that particular value of that row
        String FlightId = jTable1.getModel().getValueAt(row, columnForFare).toString();
        String TicketId = ticket_id.getText();
        int Seats = (int) seats.getValue();
        int columnForDate = 4;
        int rowForDate = jTable1.getSelectedRow();
        String Date = jTable1.getModel().getValueAt(rowForDate, columnForDate).toString();
        String TotalAmount = total_fare.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to db
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedatabase","root","Sunil@123");
            //create state for interaction with db
            Statement s = con.createStatement();

            pre = con.prepareStatement("insert into tickets(TicketId,idCustomer,idFlight,Arrival,Departure,Date,Seats,TotalAmount) values(?,?,?,?,?,?,?,?)");
            pre.setString(1, TicketId);
            pre.setString(2, CustId);
            pre.setString(3, FlightId);
            pre.setString(4, Arrival);
            pre.setString(5, Departure);
            pre.setString(6, String.valueOf(Seats));
            pre.setString(7, Date);
            pre.setString(8, TotalAmount);

            pre.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ticket Booked");

        } catch (Exception ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookticketActionPerformed

    private void SearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerActionPerformed
        // TODO add your handling code here:
        Connection con;
        PreparedStatement pre = null;
        try {
            String ID = customer_id.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to db
                 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/airlinedatabase","root","Sunil@123");

            pre = con.prepareStatement("Select * from customers where idCustomer=?");
            pre.setString(1, ID);
            //getting result
            ResultSet rs = pre.executeQuery();
            rs.next();

            first_name.setText(rs.getString("FirstName"));
            last_name.setText(rs.getString("LastName"));
            contact.setText(rs.getString("Contact"));
            gender.setText(rs.getString("Gender"));

        } catch (Exception ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchCustomer;
    private javax.swing.JComboBox<String> arrival;
    private javax.swing.JButton bookticket;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField customer_id;
    private javax.swing.JComboBox<String> departure;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField first_name;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField last_name;
    private javax.swing.JSpinner seats;
    private javax.swing.JTextField ticket_id;
    private javax.swing.JTextField total_fare;
    // End of variables declaration//GEN-END:variables
}
