
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class MainForm extends javax.swing.JFrame {
    //git is pure shit
    //uwu
    boolean setting_ = false;
    boolean userinfo_ = false;
    boolean sales_ = false;
    boolean reports_ = false;
    boolean inventory_ = false;
    boolean login_ = false;
    boolean about_ = false;
    
    Color maincol = new Color(53,59,72);
    Color secol = new Color(47,54,64);
    Color slectedcol = new Color(53,59,72);
    
 
    public MainForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        UserInfo_p = new javax.swing.JPanel();
        UserInfo_b = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sales_p = new javax.swing.JPanel();
        sales_b = new javax.swing.JButton();
        inventory_p = new javax.swing.JPanel();
        inventory_b = new javax.swing.JButton();
        reports_p = new javax.swing.JPanel();
        reports_b = new javax.swing.JButton();
        setting_p = new javax.swing.JPanel();
        setting = new javax.swing.JButton();
        logout_p = new javax.swing.JPanel();
        logout_b = new javax.swing.JButton();
        About_p1 = new javax.swing.JPanel();
        Aboutb1 = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 54, 64));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 255), 5, true));

        UserInfo_p.setBackground(new java.awt.Color(47, 54, 64));

        UserInfo_b.setBackground(new java.awt.Color(39, 73, 109));
        UserInfo_b.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        UserInfo_b.setForeground(new java.awt.Color(240, 240, 240));
        UserInfo_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/user.png"))); // NOI18N
        UserInfo_b.setText("UserInfo");
        UserInfo_b.setToolTipText("");
        UserInfo_b.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        UserInfo_b.setBorderPainted(false);
        UserInfo_b.setContentAreaFilled(false);
        UserInfo_b.setDefaultCapable(false);
        UserInfo_b.setFocusPainted(false);
        UserInfo_b.setFocusable(false);
        UserInfo_b.setHideActionText(true);
        UserInfo_b.setRequestFocusEnabled(false);
        UserInfo_b.setVerifyInputWhenFocusTarget(false);
        UserInfo_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserInfo_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserInfo_bMouseExited(evt);
            }
        });
        UserInfo_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInfo_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserInfo_pLayout = new javax.swing.GroupLayout(UserInfo_p);
        UserInfo_p.setLayout(UserInfo_pLayout);
        UserInfo_pLayout.setHorizontalGroup(
            UserInfo_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserInfo_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UserInfo_pLayout.setVerticalGroup(
            UserInfo_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInfo_pLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UserInfo_b, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(47, 54, 64));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        sales_p.setBackground(new java.awt.Color(47, 54, 64));
        sales_p.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        sales_b.setBackground(new java.awt.Color(39, 73, 109));
        sales_b.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        sales_b.setForeground(new java.awt.Color(240, 240, 240));
        sales_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/point-of-sale.png"))); // NOI18N
        sales_b.setText("Sales");
        sales_b.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        sales_b.setBorderPainted(false);
        sales_b.setContentAreaFilled(false);
        sales_b.setDefaultCapable(false);
        sales_b.setFocusPainted(false);
        sales_b.setFocusable(false);
        sales_b.setHideActionText(true);
        sales_b.setRequestFocusEnabled(false);
        sales_b.setVerifyInputWhenFocusTarget(false);
        sales_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sales_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sales_bMouseExited(evt);
            }
        });
        sales_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sales_pLayout = new javax.swing.GroupLayout(sales_p);
        sales_p.setLayout(sales_pLayout);
        sales_pLayout.setHorizontalGroup(
            sales_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sales_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sales_pLayout.setVerticalGroup(
            sales_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sales_b, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        inventory_p.setBackground(new java.awt.Color(47, 54, 64));

        inventory_b.setBackground(new java.awt.Color(39, 73, 109));
        inventory_b.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        inventory_b.setForeground(new java.awt.Color(240, 240, 240));
        inventory_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/inventory.png"))); // NOI18N
        inventory_b.setText("Inventory");
        inventory_b.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        inventory_b.setBorderPainted(false);
        inventory_b.setContentAreaFilled(false);
        inventory_b.setDefaultCapable(false);
        inventory_b.setFocusPainted(false);
        inventory_b.setFocusable(false);
        inventory_b.setHideActionText(true);
        inventory_b.setRequestFocusEnabled(false);
        inventory_b.setVerifyInputWhenFocusTarget(false);
        inventory_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventory_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventory_bMouseExited(evt);
            }
        });
        inventory_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inventory_pLayout = new javax.swing.GroupLayout(inventory_p);
        inventory_p.setLayout(inventory_pLayout);
        inventory_pLayout.setHorizontalGroup(
            inventory_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventory_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inventory_pLayout.setVerticalGroup(
            inventory_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventory_b, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        reports_p.setBackground(new java.awt.Color(47, 54, 64));

        reports_b.setBackground(new java.awt.Color(39, 73, 109));
        reports_b.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        reports_b.setForeground(new java.awt.Color(240, 240, 240));
        reports_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/dashboard.png"))); // NOI18N
        reports_b.setText("Reports");
        reports_b.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        reports_b.setBorderPainted(false);
        reports_b.setContentAreaFilled(false);
        reports_b.setDefaultCapable(false);
        reports_b.setFocusPainted(false);
        reports_b.setFocusable(false);
        reports_b.setHideActionText(true);
        reports_b.setRequestFocusEnabled(false);
        reports_b.setVerifyInputWhenFocusTarget(false);
        reports_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reports_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reports_bMouseExited(evt);
            }
        });
        reports_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reports_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reports_pLayout = new javax.swing.GroupLayout(reports_p);
        reports_p.setLayout(reports_pLayout);
        reports_pLayout.setHorizontalGroup(
            reports_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        reports_pLayout.setVerticalGroup(
            reports_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reports_b, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        setting_p.setBackground(new java.awt.Color(47, 54, 64));

        setting.setBackground(new java.awt.Color(39, 73, 109));
        setting.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        setting.setForeground(new java.awt.Color(240, 240, 240));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/setting.png"))); // NOI18N
        setting.setText("Settings");
        setting.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        setting.setBorderPainted(false);
        setting.setContentAreaFilled(false);
        setting.setDefaultCapable(false);
        setting.setFocusPainted(false);
        setting.setFocusable(false);
        setting.setHideActionText(true);
        setting.setRequestFocusEnabled(false);
        setting.setVerifyInputWhenFocusTarget(false);
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setting_pLayout = new javax.swing.GroupLayout(setting_p);
        setting_p.setLayout(setting_pLayout);
        setting_pLayout.setHorizontalGroup(
            setting_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setting_pLayout.setVerticalGroup(
            setting_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        logout_p.setBackground(new java.awt.Color(47, 54, 64));

        logout_b.setBackground(new java.awt.Color(39, 73, 109));
        logout_b.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        logout_b.setForeground(new java.awt.Color(240, 240, 240));
        logout_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logout.png"))); // NOI18N
        logout_b.setText("Logout");
        logout_b.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        logout_b.setBorderPainted(false);
        logout_b.setContentAreaFilled(false);
        logout_b.setDefaultCapable(false);
        logout_b.setFocusPainted(false);
        logout_b.setFocusable(false);
        logout_b.setHideActionText(true);
        logout_b.setRequestFocusEnabled(false);
        logout_b.setVerifyInputWhenFocusTarget(false);
        logout_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_bMouseExited(evt);
            }
        });
        logout_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logout_pLayout = new javax.swing.GroupLayout(logout_p);
        logout_p.setLayout(logout_pLayout);
        logout_pLayout.setHorizontalGroup(
            logout_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logout_pLayout.setVerticalGroup(
            logout_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout_b, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        About_p1.setBackground(new java.awt.Color(47, 54, 64));
        About_p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                About_p1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                About_p1MouseExited(evt);
            }
        });

        Aboutb1.setBackground(new java.awt.Color(39, 73, 109));
        Aboutb1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        Aboutb1.setForeground(new java.awt.Color(240, 240, 240));
        Aboutb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/info.png"))); // NOI18N
        Aboutb1.setText("About");
        Aboutb1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 40, 80))));
        Aboutb1.setBorderPainted(false);
        Aboutb1.setContentAreaFilled(false);
        Aboutb1.setDefaultCapable(false);
        Aboutb1.setFocusPainted(false);
        Aboutb1.setFocusable(false);
        Aboutb1.setHideActionText(true);
        Aboutb1.setRequestFocusEnabled(false);
        Aboutb1.setVerifyInputWhenFocusTarget(false);
        Aboutb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Aboutb1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Aboutb1MouseExited(evt);
            }
        });
        Aboutb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aboutb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout About_p1Layout = new javax.swing.GroupLayout(About_p1);
        About_p1.setLayout(About_p1Layout);
        About_p1Layout.setHorizontalGroup(
            About_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aboutb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        About_p1Layout.setVerticalGroup(
            About_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aboutb1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(setting_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UserInfo_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sales_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventory_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reports_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(About_p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(UserInfo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(sales_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(inventory_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(reports_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(setting_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(About_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(47, 54, 64));
        MainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        
        
        updateMainPanel(new SettingsGUI());
        
        setting_ = true;
        userinfo_ = false;
        sales_ = false;
        inventory_ = false;
        reports_ = false;
        login_ = false;
        about_ = false;
        
        setting_p.setBackground(maincol);
        sales_p.setBackground(secol);
        reports_p.setBackground(secol);
        inventory_p.setBackground(secol);
        UserInfo_p.setBackground(secol);
        logout_p.setBackground(secol);
        About_p1.setBackground(secol);
    }//GEN-LAST:event_settingActionPerformed

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered

        setting_p.setBackground(slectedcol);
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        
        if (setting_ != true)
        {
        setting_p.setBackground(secol);
        }
        else
            setting_p.setBackground(maincol);

    }//GEN-LAST:event_settingMouseExited

    private void UserInfo_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserInfo_bMouseEntered

        UserInfo_p.setBackground(slectedcol);  
    }//GEN-LAST:event_UserInfo_bMouseEntered

    private void UserInfo_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserInfo_bMouseExited
        if (userinfo_ != true)
        {
            UserInfo_p.setBackground(secol);
        }
        else
            UserInfo_p.setBackground(maincol);
        


        

    }//GEN-LAST:event_UserInfo_bMouseExited

    private void UserInfo_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInfo_bActionPerformed
        
        updateMainPanel(new UserInfoGUI());
        
        setting_ = false;
        userinfo_ = true;
        sales_ = false;
        inventory_ = false;
        reports_ = false;
        login_ = false;
        about_ = false;
        
        setting_p.setBackground(secol);
        sales_p.setBackground(secol);
        reports_p.setBackground(secol);
        inventory_p.setBackground(secol);
        UserInfo_p.setBackground(maincol);
        logout_p.setBackground(secol);
        About_p1.setBackground(secol);
    }//GEN-LAST:event_UserInfo_bActionPerformed

    private void sales_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_bMouseEntered
        sales_p.setBackground(slectedcol);
    }//GEN-LAST:event_sales_bMouseEntered

    private void sales_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_bMouseExited
        if (sales_ != true)
        {
        sales_p.setBackground(secol);
        }
        else
            sales_p.setBackground(maincol);
    }//GEN-LAST:event_sales_bMouseExited

    private void sales_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_bActionPerformed
        
        updateMainPanel(new SalesGUI());
        setting_ = false;
        userinfo_ = false;
        sales_ = true;
        inventory_ = false;
        reports_ = false;
        login_ = false;
        about_ = false;
        
        setting_p.setBackground(secol);
        sales_p.setBackground(maincol);
        reports_p.setBackground(secol);
        inventory_p.setBackground(secol);
        UserInfo_p.setBackground(secol);
        logout_p.setBackground(secol);
        About_p1.setBackground(secol);
    }//GEN-LAST:event_sales_bActionPerformed

    private void inventory_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory_bMouseEntered
        inventory_p.setBackground(slectedcol);
    }//GEN-LAST:event_inventory_bMouseEntered

    private void inventory_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory_bMouseExited
        if (inventory_ != true)
        {
        inventory_p.setBackground(secol);
        }
        else
            inventory_p.setBackground(maincol);
    }//GEN-LAST:event_inventory_bMouseExited

    private void inventory_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_bActionPerformed

        updateMainPanel(new inventoryGUI());

        setting_ = false;
        userinfo_ = false;
        sales_ = false;
        inventory_ = true;
        reports_ = false;
        login_ = false;
        about_ = false;
        
        setting_p.setBackground(secol);
        sales_p.setBackground(secol);
        reports_p.setBackground(secol);
        inventory_p.setBackground(maincol);
        UserInfo_p.setBackground(secol);
        logout_p.setBackground(secol);
        About_p1.setBackground(secol);
    }//GEN-LAST:event_inventory_bActionPerformed

    private void reports_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_bMouseEntered
        reports_p.setBackground(slectedcol);
    }//GEN-LAST:event_reports_bMouseEntered

    private void reports_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_bMouseExited
        if (reports_ != true)
        {
        reports_p.setBackground(secol);
        }
        else
            reports_p.setBackground(maincol);
            
    }//GEN-LAST:event_reports_bMouseExited

    private void reports_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reports_bActionPerformed
       
        updateMainPanel(new reportsGUI());
        //dfgkdfgddfgdfgdgd
        setting_ = false;
        userinfo_ = false;
        sales_ = false;
        inventory_ = false;
        reports_ = true;
        login_ = false;
        about_ = false;
        
        setting_p.setBackground(secol);
        sales_p.setBackground(secol);
        reports_p.setBackground(maincol);
        inventory_p.setBackground(secol);
        UserInfo_p.setBackground(secol);
        logout_p.setBackground(secol);
        About_p1.setBackground(secol);
    }//GEN-LAST:event_reports_bActionPerformed

    private void logout_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_bMouseEntered
        logout_p.setBackground(slectedcol);  
    }//GEN-LAST:event_logout_bMouseEntered

    private void logout_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_bMouseExited
        if (login_ != true)
        {
        logout_p.setBackground(secol);
        }
        else
            logout_p.setBackground(maincol);
    }//GEN-LAST:event_logout_bMouseExited

    private void logout_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_bActionPerformed
        
        
        setting_ = false;
        userinfo_ = false;
        sales_ = false;
        inventory_ = false;
        reports_ = true;
        login_ = true;
        about_ = false;
        
        setting_p.setBackground(secol);
        sales_p.setBackground(secol);
        reports_p.setBackground(secol);
        inventory_p.setBackground(secol);
        UserInfo_p.setBackground(secol);
        logout_p.setBackground(maincol);
        About_p1.setBackground(secol);
        
        
        LoginFrame log = new LoginFrame();
        
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logout_bActionPerformed

    private void Aboutb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aboutb1MouseEntered
        About_p1.setBackground(slectedcol);
    }//GEN-LAST:event_Aboutb1MouseEntered

    private void Aboutb1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aboutb1MouseExited
       if (about_ != true)
        {
        About_p1.setBackground(secol);
        }
        else
            About_p1.setBackground(maincol);
    }//GEN-LAST:event_Aboutb1MouseExited

    private void Aboutb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aboutb1ActionPerformed
               updateMainPanel(new AboutFr());
        
        
        setting_ = false;
        userinfo_ = false;
        sales_ = false;
        inventory_ = false;
        reports_ = false;
        login_ = false;
        about_ = true;
        
        setting_p.setBackground(secol);
        sales_p.setBackground(secol);
        reports_p.setBackground(secol);
        inventory_p.setBackground(secol);
        UserInfo_p.setBackground(secol);
        logout_p.setBackground(secol);
        About_p1.setBackground(maincol);
    }//GEN-LAST:event_Aboutb1ActionPerformed

    private void About_p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_p1MouseEntered

    }//GEN-LAST:event_About_p1MouseEntered

    private void About_p1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_p1MouseExited
        
    }//GEN-LAST:event_About_p1MouseExited

    
    
    public void updateMainPanel(Component newComponent) 
    {
        MainPanel.removeAll();       // Remove all existing components from MainPanel
        MainPanel.add(newComponent); // Add the new component to MainPanel
        MainPanel.revalidate();      // Revalidate MainPanel to update its layout
        MainPanel.repaint();         // Optional: Repaint MainPanel to ensure proper rendering
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About_p1;
    private javax.swing.JButton Aboutb1;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton UserInfo_b;
    private javax.swing.JPanel UserInfo_p;
    private javax.swing.JButton inventory_b;
    private javax.swing.JPanel inventory_p;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout_b;
    private javax.swing.JPanel logout_p;
    private javax.swing.JButton reports_b;
    private javax.swing.JPanel reports_p;
    private javax.swing.JButton sales_b;
    private javax.swing.JPanel sales_p;
    private javax.swing.JButton setting;
    private javax.swing.JPanel setting_p;
    // End of variables declaration//GEN-END:variables
}
