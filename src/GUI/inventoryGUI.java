/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author igohs
 */
public class inventoryGUI extends javax.swing.JPanel {

        boolean search_ = false;
        boolean addbtn_ = false;
        boolean edit_btn = false;
        boolean delete_btn = false;
        Color secol = new Color(39,73,109);
        Color slectedcol = new Color(52,61,80);
        
        Color AddMain = new Color(26,188,156);
        Color AddSel = new Color(6, 204, 113);
        Color SearchMain = new Color(149,165,166);
        Color SearchSel = new Color(236, 240, 241);

        Color EditMain = new Color(0,168,255);
        Color EditSel = new Color(41, 128, 185);
        Color DeleteMain = new Color(231,76,60);
        Color DeleteSel = new Color(192, 57, 43);
    public inventoryGUI() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search_p = new javax.swing.JPanel();
        search_b = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Edit_p = new javax.swing.JPanel();
        EditButton = new javax.swing.JButton();
        Add_p = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        Delete_p = new javax.swing.JPanel();
        DeleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(47, 54, 64));

        jPanel2.setBackground(new java.awt.Color(47, 54, 64));

        jScrollPane1.setBackground(new java.awt.Color(130, 176, 188));

        jTable1.setBackground(new java.awt.Color(47, 54, 64));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Milk",  new Integer(1),  new Float(7.0)},
                { new Integer(2), "Bread",  new Integer(3),  new Float(4.0)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(66);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1391, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        search_p.setBackground(new java.awt.Color(149, 165, 166));
        search_p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 54, 82), 2, true));
        search_p.setForeground(new java.awt.Color(240, 240, 240));

        search_b.setBackground(new java.awt.Color(0, 168, 255));
        search_b.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        search_b.setForeground(new java.awt.Color(240, 240, 240));
        search_b.setText("Search");
        search_b.setActionCommand("delet item");
        search_b.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        search_b.setBorderPainted(false);
        search_b.setContentAreaFilled(false);
        search_b.setDefaultCapable(false);
        search_b.setFocusPainted(false);
        search_b.setFocusable(false);
        search_b.setHideActionText(true);
        search_b.setRequestFocusEnabled(false);
        search_b.setVerifyInputWhenFocusTarget(false);
        search_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_bMouseExited(evt);
            }
        });
        search_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout search_pLayout = new javax.swing.GroupLayout(search_p);
        search_p.setLayout(search_pLayout);
        search_pLayout.setHorizontalGroup(
            search_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_b, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        search_pLayout.setVerticalGroup(
            search_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search_pLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(search_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setBackground(new java.awt.Color(99, 110, 114));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField1.setText("Search product");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Edit_p.setBackground(new java.awt.Color(0, 168, 255));
        Edit_p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 54, 82), 2, true));

        EditButton.setBackground(new java.awt.Color(39, 73, 109));
        EditButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        EditButton.setForeground(new java.awt.Color(240, 240, 240));
        EditButton.setText("Edit Item");
        EditButton.setActionCommand("delet item");
        EditButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        EditButton.setBorderPainted(false);
        EditButton.setContentAreaFilled(false);
        EditButton.setDefaultCapable(false);
        EditButton.setFocusPainted(false);
        EditButton.setFocusable(false);
        EditButton.setHideActionText(true);
        EditButton.setRequestFocusEnabled(false);
        EditButton.setVerifyInputWhenFocusTarget(false);
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditButtonMouseExited(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Edit_pLayout = new javax.swing.GroupLayout(Edit_p);
        Edit_p.setLayout(Edit_pLayout);
        Edit_pLayout.setHorizontalGroup(
            Edit_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Edit_pLayout.setVerticalGroup(
            Edit_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_pLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Add_p.setBackground(new java.awt.Color(26, 188, 156));
        Add_p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 54, 82), 2, true));

        AddButton.setBackground(new java.awt.Color(39, 73, 109));
        AddButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        AddButton.setForeground(new java.awt.Color(240, 240, 240));
        AddButton.setText("Add Item");
        AddButton.setActionCommand("");
        AddButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        AddButton.setBorderPainted(false);
        AddButton.setContentAreaFilled(false);
        AddButton.setDefaultCapable(false);
        AddButton.setFocusPainted(false);
        AddButton.setFocusable(false);
        AddButton.setHideActionText(true);
        AddButton.setRequestFocusEnabled(false);
        AddButton.setVerifyInputWhenFocusTarget(false);
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonMouseExited(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Add_pLayout = new javax.swing.GroupLayout(Add_p);
        Add_p.setLayout(Add_pLayout);
        Add_pLayout.setHorizontalGroup(
            Add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Add_pLayout.setVerticalGroup(
            Add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_pLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Delete_p.setBackground(new java.awt.Color(231, 76, 60));
        Delete_p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 54, 82), 2, true));

        DeleteButton.setBackground(new java.awt.Color(39, 73, 109));
        DeleteButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(240, 240, 240));
        DeleteButton.setText("Delete Item");
        DeleteButton.setActionCommand("");
        DeleteButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        DeleteButton.setBorderPainted(false);
        DeleteButton.setContentAreaFilled(false);
        DeleteButton.setDefaultCapable(false);
        DeleteButton.setFocusPainted(false);
        DeleteButton.setFocusable(false);
        DeleteButton.setHideActionText(true);
        DeleteButton.setRequestFocusEnabled(false);
        DeleteButton.setVerifyInputWhenFocusTarget(false);
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseExited(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Delete_pLayout = new javax.swing.GroupLayout(Delete_p);
        Delete_p.setLayout(Delete_pLayout);
        Delete_pLayout.setHorizontalGroup(
            Delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Delete_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Delete_pLayout.setVerticalGroup(
            Delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Delete_pLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addGap(18, 18, 18)
                .addComponent(search_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Add_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Delete_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(search_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void search_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bMouseEntered
        search_p.setBackground(slectedcol);
    }//GEN-LAST:event_search_bMouseEntered

    private void search_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bMouseExited
        if (search_ != true)
        {
            search_p.setBackground(SearchMain);
        }
        else
        search_p.setBackground(SearchSel);
        
        
    }//GEN-LAST:event_search_bMouseExited

    private void search_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bActionPerformed


        search_p.setBackground(SearchSel);
    }//GEN-LAST:event_search_bActionPerformed

    private void EditButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseEntered
        Edit_p.setBackground(EditSel);
    }//GEN-LAST:event_EditButtonMouseEntered

    private void EditButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseExited
        if (edit_btn != true)
        {
            Edit_p.setBackground(EditMain);
        }
        else
        Edit_p.setBackground(EditSel);
        
    }//GEN-LAST:event_EditButtonMouseExited

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
       Inventory_ADD ADDForm = new Inventory_ADD();
        ADDForm.setVisible(true); 
        
        
    }//GEN-LAST:event_EditButtonActionPerformed

    private void AddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseEntered
        Add_p.setBackground(AddSel);
    }//GEN-LAST:event_AddButtonMouseEntered

    private void AddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseExited
        if (addbtn_ != true)
        {
            Add_p.setBackground(AddMain);
        }
        else
        Add_p.setBackground(AddSel);
        
    }//GEN-LAST:event_AddButtonMouseExited

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        Inventory_ADD ADDForm = new Inventory_ADD();
        ADDForm.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseEntered
        Delete_p.setBackground(DeleteSel);
    }//GEN-LAST:event_DeleteButtonMouseEntered

    private void DeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseExited
        if (delete_btn != true)
        {
            Delete_p.setBackground(DeleteMain);
        }
        else
        Delete_p.setBackground(DeleteSel);
    }//GEN-LAST:event_DeleteButtonMouseExited

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel Add_p;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JPanel Delete_p;
    private javax.swing.JButton EditButton;
    private javax.swing.JPanel Edit_p;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton search_b;
    private javax.swing.JPanel search_p;
    // End of variables declaration//GEN-END:variables
}
