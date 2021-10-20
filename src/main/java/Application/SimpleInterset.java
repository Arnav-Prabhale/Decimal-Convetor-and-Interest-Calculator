/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author arnavprabhale
 */
public class SimpleInterset extends javax.swing.JFrame
{

    /**
     * Creates new form SimpleInterset
     */
    
    
    FirstPage fp;
    SimpleInterset me;
    Conversion conversion;
    Fibonacchi fseries;
    
 
    
    public SimpleInterset(FirstPage ref)
    {
        fp = ref;
        me = this;
        initComponents();
        lblint.setVisible(false);
    }

    public SimpleInterset()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        subPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbloutputname = new javax.swing.JLabel();
        txtrate = new javax.swing.JTextField();
        txtprincipalamount = new javax.swing.JTextField();
        btnconvert = new javax.swing.JButton();
        lbloutputname1 = new javax.swing.JLabel();
        txtyears = new javax.swing.JTextField();
        txtinterest = new javax.swing.JTextField();
        lblint = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(96, 106, 116));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        subPanel1.setBackground(new java.awt.Color(134, 143, 152));
        subPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SIMPLE INTEREST CALCULATOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ayuthaya", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(168, 173, 180));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRINCIPAL AMOUNT");

        lbloutputname.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        lbloutputname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloutputname.setText("NUMBER OF YEARS");

        txtrate.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtrate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtrateActionPerformed(evt);
            }
        });
        txtrate.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtrateKeyTyped(evt);
            }
        });

        txtprincipalamount.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtprincipalamount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprincipalamount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtprincipalamountActionPerformed(evt);
            }
        });
        txtprincipalamount.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtprincipalamountKeyTyped(evt);
            }
        });

        btnconvert.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        btnconvert.setText("CALCULATE");
        btnconvert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnconvertActionPerformed(evt);
            }
        });

        lbloutputname1.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        lbloutputname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloutputname1.setText("RATE OF INTEREST");

        txtyears.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtyears.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtyears.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtyearsActionPerformed(evt);
            }
        });
        txtyears.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtyearsKeyTyped(evt);
            }
        });

        txtinterest.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtinterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtinterest.setText("INTEREST");
        txtinterest.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtinterestKeyTyped(evt);
            }
        });

        lblint.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblint.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblint.setText("INTEREST = Rs.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtprincipalamount))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblint, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtinterest)
                    .addComponent(btnconvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtyears)
                    .addComponent(lbloutputname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtrate)
                    .addComponent(lbloutputname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloutputname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloutputname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtyears, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtprincipalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtinterest, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        jButton1.setBackground(new java.awt.Color(178, 188, 192));
        jButton1.setFont(new java.awt.Font("Kailasa", 0, 18)); // NOI18N
        jButton1.setText("CONVERSIONS");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(178, 188, 192));
        jButton2.setFont(new java.awt.Font("Kailasa", 0, 18)); // NOI18N
        jButton2.setText("FIBONACCI SERIES");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(178, 188, 192));
        jButton3.setFont(new java.awt.Font("Kailasa", 0, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(subPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtrateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtrateActionPerformed
    {//GEN-HEADEREND:event_txtrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrateActionPerformed

    private void txtrateKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtrateKeyTyped
    {//GEN-HEADEREND:event_txtrateKeyTyped
        CommonFunctions.conversionValidation(evt);
    }//GEN-LAST:event_txtrateKeyTyped

    private void txtprincipalamountActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtprincipalamountActionPerformed
    {//GEN-HEADEREND:event_txtprincipalamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprincipalamountActionPerformed

    private void txtprincipalamountKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtprincipalamountKeyTyped
    {//GEN-HEADEREND:event_txtprincipalamountKeyTyped
        CommonFunctions.conversionValidation(evt);
    }//GEN-LAST:event_txtprincipalamountKeyTyped

    private void btnconvertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnconvertActionPerformed
    {//GEN-HEADEREND:event_btnconvertActionPerformed
        try
        {
            float p = Float.parseFloat(txtprincipalamount.getText());
            int n = Integer.parseInt(txtyears.getText());
            float r = Float.parseFloat(txtrate.getText());
            txtinterest.setText(String.valueOf((((p * n * r) / 100) + ((p * n * r) % 100))));
            lblint.setVisible(true);
            
        } 
        catch (NumberFormatException e)
        {
        }
        
    }//GEN-LAST:event_btnconvertActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:
        fp = new FirstPage();
        fp.setVisible(true);
        me.setVisible(false);
       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtyearsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtyearsActionPerformed
    {//GEN-HEADEREND:event_txtyearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearsActionPerformed

    private void txtyearsKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtyearsKeyTyped
    {//GEN-HEADEREND:event_txtyearsKeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtyearsKeyTyped

    private void txtinterestKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtinterestKeyTyped
    {//GEN-HEADEREND:event_txtinterestKeyTyped
        // TODO add your handling code here:
        CommonFunctions.noInputValidation(evt);
    }//GEN-LAST:event_txtinterestKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conversion = new Conversion(fp);
        conversion.setVisible(true);
        me.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fseries = new Fibonacchi(fp);
        fseries.setVisible(true);
        me.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SimpleInterset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SimpleInterset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SimpleInterset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SimpleInterset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SimpleInterset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconvert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblint;
    private javax.swing.JLabel lbloutputname;
    private javax.swing.JLabel lbloutputname1;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JTextField txtinterest;
    private javax.swing.JTextField txtprincipalamount;
    private javax.swing.JTextField txtrate;
    private javax.swing.JTextField txtyears;
    // End of variables declaration//GEN-END:variables
}
