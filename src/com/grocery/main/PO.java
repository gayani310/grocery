/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grocery.main;

import com.grocery.db.DB;
import com.grocery.db.comman.InvoiceItemRow;
import com.grocery.db.comman.SystemConfigData;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gayani
 */
public class PO extends javax.swing.JInternalFrame {

    Date d = new Date();
    SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
    int id, row;

    /**
     * Creates new form Category
     */
    public PO() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI b1 = (BasicInternalFrameUI) this.getUI();
        b1.setNorthPane(null);

        grngenerate();
        supplier();
        item();
        brand();
        category();
        unit();
        name();
        idSearch();

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
        jPanel4 = new javax.swing.JPanel();
        txt_productcode = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        combo_units = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        combo_supplier = new javax.swing.JComboBox<>();
        combo_itemid = new javax.swing.JComboBox<>();
        combo_category = new javax.swing.JComboBox<>();
        combo_brand = new javax.swing.JComboBox<>();
        btn_add1 = new javax.swing.JButton();
        btn_data_table = new javax.swing.JButton();
        txt_poid = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        combo_name = new javax.swing.JComboBox<>();
        btn_delete = new javax.swing.JButton();
        txt_productcode1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delall = new javax.swing.JButton();
        combo_idsearch = new javax.swing.JComboBox<>();
        txt_searh = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1650, 910));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Purchasing Order");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setText("Green Grocers");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 267, -1));

        txt_productcode.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        txt_productcode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel34.setText("Supplier ID");
        txt_productcode.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 101, 45));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel31.setText("Units");
        txt_productcode.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 80, 40));

        combo_units.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        combo_units.setEnabled(false);
        combo_units.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_unitsActionPerformed(evt);
            }
        });
        txt_productcode.add(combo_units, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 250, 40));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel38.setText("PO ID");
        txt_productcode.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 101, 34));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel39.setText("Iteam ID");
        txt_productcode.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 40));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel40.setText("Category");
        txt_productcode.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 40));

        txt_qty.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_qty.setPreferredSize(new java.awt.Dimension(111, 23));
        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtyKeyPressed(evt);
            }
        });
        txt_productcode.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 250, 40));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel30.setText("Quantity");
        txt_productcode.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 81, 40));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel32.setText("Brand");
        txt_productcode.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 40));

        combo_supplier.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        combo_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_supplierActionPerformed(evt);
            }
        });
        txt_productcode.add(combo_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 250, 40));

        combo_itemid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        combo_itemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_itemidActionPerformed(evt);
            }
        });
        txt_productcode.add(combo_itemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, 40));

        combo_category.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        combo_category.setEnabled(false);
        combo_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_categoryActionPerformed(evt);
            }
        });
        txt_productcode.add(combo_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 250, 40));

        combo_brand.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        combo_brand.setEnabled(false);
        combo_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_brandActionPerformed(evt);
            }
        });
        txt_productcode.add(combo_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 250, 40));

        btn_add1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/erase_delete_remove_wipe_out-512.png"))); // NOI18N
        btn_add1.setText("Clear");
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });
        txt_productcode.add(btn_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 50));

        btn_data_table.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_data_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/add2.png"))); // NOI18N
        btn_data_table.setText("Add");
        btn_data_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_data_tableActionPerformed(evt);
            }
        });
        txt_productcode.add(btn_data_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 150, 50));

        txt_poid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_poid.setPreferredSize(new java.awt.Dimension(111, 23));
        txt_poid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_poidActionPerformed(evt);
            }
        });
        txt_poid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_poidKeyPressed(evt);
            }
        });
        txt_productcode.add(txt_poid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 250, 34));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel43.setText("Item Name");
        txt_productcode.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 33));

        combo_name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        combo_name.setEnabled(false);
        combo_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_nameActionPerformed(evt);
            }
        });
        txt_productcode.add(combo_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 250, 30));

        btn_delete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_delete.setText("Delete");

        txt_productcode1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Added PO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        txt_productcode1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PO ID", "Supplier ID", "EMP ID", "Item ID", "Item Name", "Category", "Brand", "Quantity", "Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        txt_productcode1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 480, 320));

        btn_update.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/refresh-xxl.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        txt_productcode1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 190, 50));

        btn_del.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/delete-5123.png"))); // NOI18N
        btn_del.setText("Delete");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        txt_productcode1.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 160, 50));

        btn_save.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/2039031.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        txt_productcode1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 150, 50));

        btn_delall.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_delall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grocery/images/1447px-Icons8_flat_delete_generic.svg.png"))); // NOI18N
        btn_delall.setText("Delete All");
        btn_delall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delallActionPerformed(evt);
            }
        });
        txt_productcode1.add(btn_delall, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 180, 50));

        combo_idsearch.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        combo_idsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_idsearchActionPerformed(evt);
            }
        });
        txt_productcode1.add(combo_idsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txt_productcode, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_productcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 549, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_productcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_productcode, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 60, 1620, 800));

        jPanel2.add(txt_searh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 70, 200, 30));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setText("GRN ID");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 70, 80, 34));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 70, -1, -1));

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

        setSize(new java.awt.Dimension(980, 616));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        row = jTable1.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        combo_supplier.setSelectedItem(dtm.getValueAt(row, 1).toString().trim());
        combo_itemid.setSelectedItem(dtm.getValueAt(row, 3).toString().trim());
        txt_qty.setText(dtm.getValueAt(row, 7).toString().trim());

    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            for (int row = 0; row < dtm.getRowCount(); row++) {
                String po_id = dtm.getValueAt(row, 0).toString().trim();
                String supplier_id = dtm.getValueAt(row, 1).toString().trim();
                String emp_id = dtm.getValueAt(row, 2).toString().trim();
                String item_id = dtm.getValueAt(row, 3).toString().trim();
                String item_name = dtm.getValueAt(row, 4).toString().trim();
                String category = dtm.getValueAt(row, 5).toString().trim();
                String brand = dtm.getValueAt(row, 6).toString().trim();
                String quantity = dtm.getValueAt(row, 7).toString().trim();
                String units = dtm.getValueAt(row, 8).toString().trim();

                DB.push("INSERT INTO `purchasing_order`(`po_id`, `supplier_id`, `emp_id`, `item_id`,`iteam_name`, `category`, `brand`, `quantity`, `units`,`po_status`) VALUES ('"
                        + po_id + "','"
                        + supplier_id + "','"
                        + emp_id + "','"
                        + Integer.parseInt(item_id) + "','"
                        + item_name + "','"
                        + category + "','"
                        + brand + "','"
                        + Integer.parseInt(quantity) + "','"
                        + units + "','"
                        + 1 + "')");

            }

            JOptionPane.showMessageDialog(this, "Purchasing Orders saved", "PO", JOptionPane.INFORMATION_MESSAGE);
            grngenerate();
            supplier();
            item();
            brand();
            category();
            unit();
            Clear();
            idSearch();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {

            if (!txt_qty.getText().toString().isEmpty()) {

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setValueAt(txt_poid.getText(), row, 0);
                dtm.setValueAt(combo_supplier.getSelectedItem(), row, 1);
                dtm.setValueAt(SystemConfigData.getEmpid(), row, 2);
                dtm.setValueAt(combo_itemid.getSelectedItem(), row, 3);
                dtm.setValueAt(combo_name.getSelectedItem(), row, 4);
                dtm.setValueAt(combo_category.getSelectedItem(), row, 5);
                dtm.setValueAt(combo_brand.getSelectedItem(), row, 6);
                dtm.setValueAt(txt_qty.getText(), row, 7);
                dtm.setValueAt(combo_units.getSelectedItem(), row, 8);
                JOptionPane.showMessageDialog(this, "PO updated successfully", "success", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Empty Qty", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void combo_unitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_unitsActionPerformed

    }//GEN-LAST:event_combo_unitsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        int select = jTable1.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(select);
    }//GEN-LAST:event_btn_delActionPerformed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyActionPerformed

    private void txt_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyKeyPressed

    private void combo_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_supplierActionPerformed

    private void combo_itemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_itemidActionPerformed
        // TODO add your handling code here:

        try {
            ResultSet rs = DB.search("select * from item where item_id = '" + combo_itemid.getSelectedItem().toString() + "'and item_status = 1");
            if (rs.next()) {
                combo_name.setSelectedItem(rs.getString("item_name"));
                combo_category.setSelectedItem(rs.getString("item_category"));
                combo_brand.setSelectedItem(rs.getString("item_brand"));
                combo_units.setSelectedItem(rs.getString("item_unit"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_combo_itemidActionPerformed

    private void combo_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_categoryActionPerformed

    private void combo_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_brandActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        // TODO add your handling code here:
        txt_qty.setText(null);
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_data_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_data_tableActionPerformed
        // TODO add your handling code here:

        try {
            int qty = 0;

            if (!txt_qty.getText().toString().isEmpty()) {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                Vector v = new Vector();
                v.add(txt_poid.getText());
                v.add(combo_supplier.getSelectedItem());
                v.add(SystemConfigData.getEmpid());
                v.add(combo_itemid.getSelectedItem());
                v.add(combo_name.getSelectedItem());
                v.add(combo_category.getSelectedItem());
                v.add(combo_brand.getSelectedItem());
                qty = Integer.parseInt(txt_qty.getText());

                InvoiceItemRow checkRowRepeating = checkRowRepeating(combo_itemid.getSelectedItem().toString());

                if (checkRowRepeating != null) {
                    qty += checkRowRepeating.getQty();
                }
                v.add(qty);
                v.add(combo_units.getSelectedItem());
                dtm.addRow(v);
                txt_qty.setText(null);

            } else {
                JOptionPane.showMessageDialog(this, "Plese type valid data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btn_data_tableActionPerformed

    private void btn_delallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delallActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        grngenerate();
    }//GEN-LAST:event_btn_delallActionPerformed

    private void txt_poidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_poidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_poidActionPerformed

    private void txt_poidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_poidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_poidKeyPressed

    private void combo_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_nameActionPerformed

    private void combo_idsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_idsearchActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs = DB.search("select * from stock where item_id = '" + combo_idsearch.getSelectedItem().toString() + "' and status = '1'");
            if (rs.next()) {
                
                combo_itemid.setSelectedItem(rs.getString("item_id"));
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_combo_idsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add1;
    private javax.swing.JButton btn_data_table;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_delall;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_brand;
    private javax.swing.JComboBox<String> combo_category;
    private javax.swing.JComboBox<String> combo_idsearch;
    private javax.swing.JComboBox<String> combo_itemid;
    private javax.swing.JComboBox<String> combo_name;
    private javax.swing.JComboBox<String> combo_supplier;
    private javax.swing.JComboBox<String> combo_units;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_poid;
    private javax.swing.JPanel txt_productcode;
    private javax.swing.JPanel txt_productcode1;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JComboBox<String> txt_searh;
    // End of variables declaration//GEN-END:variables

    private void Clear() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

    }

    private void grngenerate() {
        String check = "";
        id = 0;
        try {
            ResultSet rs = DB.search("SELECT * FROM `purchasing_order`");
            while (rs.next()) {

                if (!rs.getString("po_id").matches(check)) {

                    check = rs.getString("po_id");

                    id++;

                }
            }
            txt_poid.setText("PO" + (id + 1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void supplier() {
        try {
            ResultSet rs = DB.search("select * from supplier");
            Vector v = new Vector();
            while (rs.next()) {
                boolean status = rs.getBoolean("status");
                if (status) {
                    v.add(rs.getString("id"));
                }
                combo_supplier.setModel(new DefaultComboBoxModel<>(v));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void item() {
        try {
            ResultSet rs = DB.search("select * from item");
            Vector v = new Vector();
            while (rs.next()) {
                boolean status = rs.getBoolean("item_status");
                if (status) {
                    v.add(rs.getString("item_id"));
                }
                combo_itemid.setModel(new DefaultComboBoxModel<>(v));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void brand() {
        try {
            ResultSet rs = DB.search("select * from item");
            Vector v = new Vector();
            while (rs.next()) {
                boolean status = rs.getBoolean("item_status");
                if (status) {
                    v.add(rs.getString("item_brand"));
                }
                combo_brand.setModel(new DefaultComboBoxModel<>(v));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void category() {
        try {
            ResultSet rs = DB.search("select * from item");
            Vector v = new Vector();
            while (rs.next()) {
                boolean status = rs.getBoolean("item_status");
                if (status) {
                    v.add(rs.getString("item_category"));
                }
                combo_category.setModel(new DefaultComboBoxModel<>(v));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void name() {
        try {

            ResultSet rs = DB.search("select * from item");
            Vector v = new Vector();
            while (rs.next()) {
                boolean status = rs.getBoolean("item_status");
                if (status) {
                    v.add(rs.getString("item_name"));
                }
                combo_name.setModel(new DefaultComboBoxModel<>(v));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void unit() {
        try {
            ResultSet rs = DB.search("select * from item");
            Vector v = new Vector();
            while (rs.next()) {
                boolean status = rs.getBoolean("item_status");
                if (status) {
                    v.add(rs.getString("item_unit"));
                }
                combo_units.setModel(new DefaultComboBoxModel<>(v));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

//    void searchid() {
//        try {
//            ResultSet rs = DB.search("select * from purchasing_order");
//            Vector v = new Vector();
//            while (rs.next()) {
//
//                v.add(rs.getString("poid"));
//
//            }
//            txt_searh.setModel(new DefaultComboBoxModel<>(v));
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
    void tableload() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            //dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from purchasing_order");
            jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, String.valueOf(e), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private InvoiceItemRow checkRowRepeating(String text) {

        InvoiceItemRow itemRow = null;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (text.trim().equals(jTable1.getValueAt(row, 3).toString())) {
                itemRow = new InvoiceItemRow();
                int qty = Integer.parseInt(jTable1.getValueAt(row, 7).toString());
                itemRow.setQty(qty);
                dtm.removeRow(row);
                break;

            }
        }
        return itemRow;
    }

    private void idSearch() {
        try {
            ResultSet rs = DB.search("SELECT * FROM `stock` where qty=0 and status = 1");
            Vector v = new Vector();

            while (rs.next()) {
                String data = rs.getString("item_id");
                v.add(data);
            }

            combo_idsearch.setModel(new DefaultComboBoxModel(v));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
