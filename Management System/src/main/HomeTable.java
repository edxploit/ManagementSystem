package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomeTable extends javax.swing.JFrame {
    public HomeTable() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        searchData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mCost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hAdd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mFre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mDes = new javax.swing.JTextField();
        hApp = new javax.swing.JTextField();
        notes = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setMinimumSize(new java.awt.Dimension(1090, 596));
        setPreferredSize(new java.awt.Dimension(1090, 622));
        setResizable(false);
        setSize(new java.awt.Dimension(1090, 596));

        user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(0, 51, 102));
        user.setText("user");

        LogoutBtn.setForeground(new java.awt.Color(25, 118, 211));
        LogoutBtn.setText("LOGOUT");
        LogoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name ", "Cost ", "Description ", "Frequency ", "Address ", "Appointment ", "Notes "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        Table.setMinimumSize(new java.awt.Dimension(700, 600));
        Table.setPreferredSize(new java.awt.Dimension(700, 600));
        Table.setShowGrid(true);
        jScrollPane1.setViewportView(Table);

        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });

        jLabel5.setText("Search or Delete By ID");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setText("Find");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Medicine Name ");

        mName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Medicine Cost ");

        mCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mCost.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Medicine Description ");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Hospital Appointment ");

        hAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hAdd.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Hospital Address ");

        mFre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mFre.setForeground(new java.awt.Color(102, 102, 102));

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Medicine Frequency ");

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Notes");

        mDes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mDes.setForeground(new java.awt.Color(102, 102, 102));

        hApp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hApp.setForeground(new java.awt.Color(102, 102, 102));

        notes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        notes.setForeground(new java.awt.Color(102, 102, 102));

        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoutBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mFre)
                            .addComponent(hAdd)
                            .addComponent(mCost)
                            .addComponent(mName)
                            .addComponent(mDes)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCreate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear)))
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addComponent(hApp)
                            .addComponent(notes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mCost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mDes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mFre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hApp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String searchKeyword = searchData.getText();
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySQL://localhost:3306/java_user_database";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            if ("".equals(searchKeyword)) {
                JOptionPane.showMessageDialog(new JFrame(), "Search criteria is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM user_db WHERE " +
                             "ID LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_name LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_cost LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_description LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_frequency LIKE '%" + searchKeyword + "%' OR " +
                             "hospital_address LIKE '%" + searchKeyword + "%' OR " +
                             "hospital_appointment LIKE '%" + searchKeyword + "%' OR " +
                             "notes LIKE '%" + searchKeyword + "%'";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    notFound = 1;
                    String sql2 = "DELETE FROM user_db WHERE " +
                                  "ID LIKE '%" + searchKeyword + "%' OR " +
                                  "medicine_name LIKE '%" + searchKeyword + "%' OR " +
                                  "medicine_cost LIKE '%" + searchKeyword + "%' OR " +
                                  "medicine_description LIKE '%" + searchKeyword + "%' OR " +
                                  "medicine_frequency LIKE '%" + searchKeyword + "%' OR " +
                                  "hospital_address LIKE '%" + searchKeyword + "%' OR " +
                                  "hospital_appointment LIKE '%" + searchKeyword + "%' OR " +
                                  "notes LIKE '%" + searchKeyword + "%'";
                    st.executeUpdate(sql2);
                    loadData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "No records found for deletion", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
    }//GEN-LAST:event_searchDataActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        mName.setText("");
        mCost.setText("");
        mDes.setText("");
        mFre.setText("");
        hAdd.setText("");
        hApp.setText("");
        notes.setText("");
        searchData.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    public void loadData() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:MySQL://localhost:3306/java_user_database";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM user_db");

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            int id = rs.getInt("ID");
            String medicineName = rs.getString("medicine_name");
            int medicineCost = rs.getInt("medicine_cost");
            String medicineDescription = rs.getString("medicine_description");
            int medicineFrequency = rs.getInt("medicine_frequency");
            String hospitalAddress = rs.getString("hospital_address");
            String hospitalAppointment = rs.getString("hospital_appointment");
            String note = rs.getString("notes");

            Object[] row = {id, medicineName, medicineCost, medicineDescription, medicineFrequency, hospitalAddress, hospitalAppointment, note};
            model.addRow(row);
        }


        con.close();
    } catch (Exception e) {
        System.out.println("Error " + e.getMessage());
    }
}


    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String medicineName = mName.getText();
        int medicineCost = Integer.parseInt(mCost.getText());
        String medicineDescription = mDes.getText();
        int medicineFrequency = Integer.parseInt(mFre.getText());
        String hospitalAddress = hAdd.getText();
        String hospitalAppointment = hApp.getText();
        String note = notes.getText();

        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            {
                String query = "INSERT INTO user_db(medicine_name, medicine_cost, medicine_description, medicine_frequency, hospital_address, hospital_appointment, notes)"+
                       "VALUES('"+medicineName+"', "+medicineCost+", '"+medicineDescription+"', "+medicineFrequency+", '"+hospitalAddress+"', '"+hospitalAppointment+"', '"+note+"')";

                    st.executeUpdate(query);
                    mName.setText("");
                    mCost.setText("");
                    mDes.setText("");
                    mFre.setText("");
                    hAdd.setText("");
                    hApp.setText("");
                    notes.setText("");
                    JOptionPane.showMessageDialog(null, "Successfully registered.");
                    loadData();
                    con.close();
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String searchKeyword = searchData.getText();
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySQL://localhost:3306/java_user_database";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            if ("".equals(searchKeyword)) {
                JOptionPane.showMessageDialog(new JFrame(), "Search criteria is required", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM user_db WHERE " +
                             "ID LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_name LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_cost LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_description LIKE '%" + searchKeyword + "%' OR " +
                             "medicine_frequency LIKE '%" + searchKeyword + "%' OR " +
                             "hospital_address LIKE '%" + searchKeyword + "%' OR " +
                             "hospital_appointment LIKE '%" + searchKeyword + "%' OR " +
                             "notes LIKE '%" + searchKeyword + "%'";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    notFound = 1;
                    String newName = mName.getText();
                    String newCost = mCost.getText();
                    String newDesc = mDes.getText();
                    String newFreq = mFre.getText();
                    String newAdd = hAdd.getText();
                    String newApp = hApp.getText();
                    String newNotes = notes.getText();
                    String sql2 = "UPDATE user_db SET " +
                                  "medicine_name='"+newName+"', " +
                                  "medicine_cost='"+newCost+"', " +
                                  "medicine_description='"+newDesc+"', " +
                                  "medicine_frequency='"+newFreq+"', " +
                                  "hospital_address='"+newAdd+"', " +
                                  "hospital_appointment='"+newApp+"', " +
                                  "notes='"+newNotes+"' " +
                                  "WHERE ID LIKE '%" + searchKeyword + "%'";
                    st.executeUpdate(sql2);
                    loadData();
                    con.close();
                }
                if (notFound == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "No records found for update", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchKeyword = searchData.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:MySQL://localhost:3306/java_user_database";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String sql = "SELECT * FROM user_db WHERE ";
            sql += 
                    "medicine_name LIKE '%" + searchKeyword + "%' OR " +
                    "medicine_cost LIKE '%" + searchKeyword + "%' OR " +
                    "medicine_description LIKE '%" + searchKeyword + "%' OR " +
                    "medicine_frequency LIKE '%" + searchKeyword + "%' OR " +
                    "hospital_address LIKE '%" + searchKeyword + "%' OR " +
                    "hospital_appointment LIKE '%" + searchKeyword + "%' OR " +
                    "notes LIKE '%" + searchKeyword + "%'";

            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setRowCount(0);

            while(rs.next()){
                int id = rs.getInt("ID");
                String medicineName = rs.getString("medicine_name");
                int medicineCost = rs.getInt("medicine_cost");
                String medicineDescription = rs.getString("medicine_description");
                int medicineFrequency = rs.getInt("medicine_frequency");
                String hospitalAddress = rs.getString("hospital_address");
                String hospitalAppointment = rs.getString("hospital_appointment");
                String note = rs.getString("notes");

                Object[] row = {id, medicineName, medicineCost, medicineDescription, 
                                medicineFrequency, hospitalAddress, hospitalAppointment, note};
                model.addRow(row);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        HomeMainFrame homeFrame = new HomeMainFrame();
        homeFrame.setVisible(true);
        homeFrame.pack();
        homeFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
    public void setUser(String name){
        user.setText(name);
    }
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField hAdd;
    private javax.swing.JTextField hApp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mCost;
    private javax.swing.JTextField mDes;
    private javax.swing.JTextField mFre;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField notes;
    private javax.swing.JTextField searchData;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}