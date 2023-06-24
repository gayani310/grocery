/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grocery.main;

import com.grocery.main.sub.ItemManagement;

import com.grocery.db.DB;
import com.grocery.db.comman.SystemVariableList;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Gayani
 */
public class Stock extends javax.swing.JInternalFrame {

    /**
     * Creates new form Category
     */
    ResultSet rs;

    public Stock() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI b1 = (BasicInternalFrameUI) this.getUI();
        b1.setNorthPane(null);
        addDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        idtxt_search = new javax.swing.JTextField();
        itemid_CB = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_stockreport = new javax.swing.JButton();
        refresh_btn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1650, 910));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Stock");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 136, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setText("Green Grocers");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 267, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setText("ID");

        idtxt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ididtxt_searchKeyReleased(evt);
            }
        });

        itemid_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item ID", "Stock ID", "Supplier ID" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemid_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idtxt_search))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idtxt_search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemid_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 110));

        btn_add.setBackground(new java.awt.Color(204, 204, 204));
        btn_add.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_add.setText("Item Management");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 300, 45));

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Category", "Brand", "Unit", "Description", "Cost Price", "Selling Price", "Quantity", "Expire Date", "MFD Date", "Supplier", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 990, 300));

        btn_stockreport.setBackground(new java.awt.Color(204, 204, 204));
        btn_stockreport.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_stockreport.setText("Stock Report");
        btn_stockreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stockreportActionPerformed(evt);
            }
        });
        jPanel2.add(btn_stockreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 300, 45));

        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/refresh-xxl.png"))); // NOI18N
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });
        jPanel2.add(refresh_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 100, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        new ItemManagement().setVisible(true);


    }//GEN-LAST:event_btn_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void ididtxt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ididtxt_searchKeyReleased
        try {
            String id = idtxt_search.getText().trim();
            int type = itemid_CB.getSelectedIndex();

            if (type == 0) {

                rs = DB.search("select * from stock where item_id like '" + id + "%' and status='1'");
            } else if (type == 1) {

                rs = DB.search("select * from stock where stock_id like '" + id + "%' and status='1'");

            } else if (type == 2) {

                rs = DB.search("select * from stock where supplier_id like '" + id + "%' and status='1'");
            }

            jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ididtxt_searchKeyReleased

    private void btn_stockreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stockreportActionPerformed

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            HashMap<String, Object> para = new HashMap<>();
            para.put("tittle", "");

            JasperPrint jprint = null;
            JasperCompileManager.compileReportToFile(SystemVariableList.REPORT_BASE__URL+"StockReport.jrxml");
            jprint = JasperFillManager.fillReport(SystemVariableList.REPORT_BASE__URL+"StockReport.jasper", para, new JRTableModelDataSource(dtm));
            JasperViewer.viewReport(jprint, false);
            JasperExportManager.exportReportToPdfFile(jprint, SystemVariableList.PDF_BASE_URL+"Stock\\Stock.pdf");

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btn_stockreportActionPerformed

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        // TODO add your handling code here:
        addDataToTable();
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void addDataToTable() {
        try {
            ResultSet rs = DB.search("select * from stock where status='1'");
            jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_stockreport;
    private javax.swing.JTextField idtxt_search;
    private javax.swing.JComboBox<String> itemid_CB;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh_btn;
    // End of variables declaration//GEN-END:variables
}
