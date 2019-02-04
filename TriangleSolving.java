/*
    contact info: hristob1999@gmail.com
    copyright January 2018 @ Hristo Belchev
    Part of the Universal Calculator Package
 */
package SI_Calc;

import java.text.DecimalFormat;

/*
    Made by Hristo Belchev and Svetoslav Berberski
 */
public class TriangleSolving extends javax.swing.JFrame {
    public TriangleSolving() {
        System.out.println ("TriangleSolving:obj Called");
        initComponents();
    }
    public static double version = 2.11;//version number for the developer mode of the settings class
    double A, B, C, aA, aB, aC;//variables for storing sides and angles
    double PI = Math.PI;
    boolean solved = false;//if the triangle has been solved
    boolean cleared = true;//if the form has been cleared
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AText = new javax.swing.JTextField();
        BText = new javax.swing.JTextField();
        CText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AAText = new javax.swing.JTextField();
        ABText = new javax.swing.JTextField();
        ACText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Triangle Solving");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(72, 94));

        AText.setToolTipText("Side A");
        AText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ATextKeyReleased(evt);
            }
        });

        BText.setToolTipText("Side B");
        BText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTextActionPerformed(evt);
            }
        });
        BText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BTextKeyReleased(evt);
            }
        });

        CText.setToolTipText("Side C");
        CText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTextKeyReleased(evt);
            }
        });

        jLabel7.setText("A");

        jLabel8.setText("B");

        jLabel9.setText("C");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BText)
                        .addComponent(AText, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(CText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(CText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(72, 94));

        AAText.setToolTipText("angle at A");
        AAText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AATextActionPerformed(evt);
            }
        });
        AAText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AATextKeyReleased(evt);
            }
        });

        ABText.setToolTipText("angle at B");
        ABText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ABTextKeyReleased(evt);
            }
        });

        ACText.setToolTipText("angle at C");
        ACText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ACTextKeyReleased(evt);
            }
        });

        jLabel4.setText("α");

        jLabel5.setText("β");

        jLabel6.setText("γ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ABText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AAText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(ACText)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AAText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ABText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("(S)olve");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("(G)raph");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("(C)lose");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Sides");

        jLabel2.setText("Angles");

        jLabel3.setText("Values Aproximate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//solve
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        solve();
    }//GEN-LAST:event_jButton1ActionPerformed
//graph
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        graph();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        side_controls[0] = AText;
        side_controls[1] = BText;
        side_controls[2] = CText;
        angle_controls[0] = AAText;
        angle_controls[1] = ABText;
        angle_controls[2] = ACText;
    }//GEN-LAST:event_formWindowOpened

    private void BTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTextActionPerformed

    private void AATextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AATextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AATextActionPerformed

    private void ACTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ACTextKeyReleased
        char chr = evt.getKeyChar();
        if (chr == '\n') solve();
        if ((chr == 'g')||(chr == 'G')||(chr == 'г')||(chr == 'Г')){
            String txt = ACText.getText();
            txt = txt.substring (0, txt.length()-1);
            ACText.setText(txt);
            graph();
        }
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')){
            String txt = ACText.getText();
            txt = txt.substring (0, txt.length()-1);
            ACText.setText(txt);
            solve();
        }
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')){
            String txt = ACText.getText();
            txt = txt.substring (0, txt.length()-1);
            ACText.setText(txt);
            setVisible(false);
            System.out.println("TriangleSolving window closed");
        }
        
    }//GEN-LAST:event_ACTextKeyReleased

    private void ABTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ABTextKeyReleased
        char chr = evt.getKeyChar();
        if (chr == '\n') solve();
        if ((chr == 'g')||(chr == 'G')||(chr == 'г')||(chr == 'Г')){
            String txt = ABText.getText();
            txt = txt.substring (0, txt.length()-1);
            ABText.setText(txt);
            graph();
        }
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')){
            String txt = ABText.getText();
            txt = txt.substring (0, txt.length()-1);
            ABText.setText(txt);
            solve();
        }
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')){
            String txt = ABText.getText();
            txt = txt.substring (0, txt.length()-1);
            ABText.setText(txt);
            setVisible(false);
            System.out.println("TriangleSolving window closed");
        }
    }//GEN-LAST:event_ABTextKeyReleased

    private void AATextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AATextKeyReleased
        char chr = evt.getKeyChar();
        if (chr == '\n') solve();
        if ((chr == 'g')||(chr == 'G')||(chr == 'г')||(chr == 'Г')){
            String txt = AAText.getText();
            txt = txt.substring (0, txt.length()-1);
            AAText.setText(txt);
            graph();
        }
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')){
            String txt = AAText.getText();
            txt = txt.substring (0, txt.length()-1);
            AAText.setText(txt);
            solve();
        }
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')){
            String txt = AAText.getText();
            txt = txt.substring (0, txt.length()-1);
            AAText.setText(txt);
            setVisible(false);
            System.out.println("TriangleSolving window closed");
        }
    }//GEN-LAST:event_AATextKeyReleased

    private void CTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTextKeyReleased
        char chr = evt.getKeyChar();
        if (chr == '\n') solve();
        if ((chr == 'g')||(chr == 'G')||(chr == 'г')||(chr == 'Г')){
            String txt = CText.getText();
            txt = txt.substring (0, txt.length()-1);
            CText.setText(txt);
            graph();
        }
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')){
            String txt = CText.getText();
            txt = txt.substring (0, txt.length()-1);
            CText.setText(txt);
            solve();
        }
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')){
            String txt = CText.getText();
            txt = txt.substring (0, txt.length()-1);
            CText.setText(txt);
            setVisible(false);
            System.out.println("TriangleSolving window closed");
        }
    }//GEN-LAST:event_CTextKeyReleased

    private void BTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTextKeyReleased
        char chr = evt.getKeyChar();
        if (chr == '\n') solve();
        if ((chr == 'g')||(chr == 'G')||(chr == 'г')||(chr == 'Г')){
            String txt = BText.getText();
            txt = txt.substring (0, txt.length()-1);
            BText.setText(txt);
            graph();
        }
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')){
            String txt = BText.getText();
            txt = txt.substring (0, txt.length()-1);
            BText.setText(txt);
            solve();
        }
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')){
            String txt = BText.getText();
            txt = txt.substring (0, txt.length()-1);
            BText.setText(txt);
            setVisible(false);
            System.out.println("TriangleSolving window closed");
        }
    }//GEN-LAST:event_BTextKeyReleased

    private void ATextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ATextKeyReleased
        char chr = evt.getKeyChar();
        if (chr == '\n') solve();
        if ((chr == 'g')||(chr == 'G')||(chr == 'г')||(chr == 'Г')){
            String txt = AText.getText();
            txt = txt.substring (0, txt.length()-1);
            AText.setText(txt);
            graph();
        }
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')){
            String txt = AText.getText();
            txt = txt.substring (0, txt.length()-1);
            AText.setText(txt);
            solve();
        }
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')){
            String txt = AText.getText();
            txt = txt.substring (0, txt.length()-1);
            AText.setText(txt);
            setVisible(false);
            System.out.println("TriangleSolving window closed");
        }
    }//GEN-LAST:event_ATextKeyReleased
//close button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        System.out.println("TriangleSolving window closed");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println ("TriangleSolving:main Called");
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
            java.util.logging.Logger.getLogger(TriangleSolving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangleSolving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangleSolving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangleSolving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TriangleSolving().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AAText;
    private javax.swing.JTextField ABText;
    private javax.swing.JTextField ACText;
    private javax.swing.JTextField AText;
    private javax.swing.JTextField BText;
    private javax.swing.JTextField CText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
   
    private Double[] sides = new Double[3];
    private Double[] angles = new Double[3];
    private javax.swing.JTextField[] side_controls = new javax.swing.JTextField[3];
    private javax.swing.JTextField[] angle_controls = new javax.swing.JTextField[3];
    public Double GetValue(String text){
        boolean ret = false;
        if (Methods.numCheck(text) == true){
            return Double.parseDouble(text);
        }
    
        return null;
    }
    public boolean IsAngleBetweenSides(Double[] sides, Double[] angles){
        for(int i = 0; i < 3; ++i)
        {
            if(sides[i] == null && angles[i] != null)
                return true;
        }
    
        return false;
    }
    public boolean IsAngleNextToSides(Double[] sides, Double[] angles){
        for(int i = 0; i < 3; ++i) {
            if(sides[i] != null && angles[i] != null)
                return true;
        }
        
        return false;
    }
    private void HandleTwoSidesAndAngleBetweenThem(Double []sides, Double[] angles) {
        for(int i = 0; i < 3; ++i) {
            if(sides[i] == null) {
                sides[i] = Methods.cosTheoCalc(sides[(i+1)%3], 
                                               sides[(i+2)%3],
                                               angles[i]);
            }
        }
        
        calAngles (sides);
    }
    private void Swap(Double val1, Double val2) {
        Double tmp = val1;
        val1 = val2;
        val2 = tmp;
    }
    private double SideFromSin(Double side1, Double side2, Double angle1, Double angle2){
        Double alpha = angle1;
        Double beta = angle2;
        Double side = side1;
        if(side == null) {
            Swap(alpha,beta);
            side = side2;
        }
        
        double sin_angle = Math.sin(Math.toRadians(alpha));
        double R = (side/sin_angle)/2;
        double ret = 2*R*Math.sin(Math.toRadians(beta));
        return ret;
    }
    private double AngleFromSin(Double side1, Double side2, Double angle1,Double angle2){
        Double a = side1;
        Double b = side2;
        Double angle = angle1;
        if(angle == null) {
            Double tmp = a;
            a = b;
            b = tmp;
            angle = angle2;
        }
        
        double sin_angle = Math.sin(Math.toRadians(angle));
        double R = (a/sin_angle)/2;
        double sin_b = b/(2*R);
        double angle_at_b = Math.asin(sin_b)/ PI * 180;
        double angle_at_c = 180 - angle - angle_at_b;
        return angle_at_c;
    }
    private void HandleTwoSidesAndAngleNextToThem(Double []sides, Double[] angles){
        for(int i =0; i < 3; ++i) {
            if(sides[i] == null && angles[i] == null) {
                angles[i] = AngleFromSin(sides[(i+1)%3], 
                                         sides[(i+2)%3], 
                                         angles[(i+1)%3], 
                                         angles[(i+2)%3]);
                HandleTwoSidesAndAngleBetweenThem(sides, angles);
                return;
            }
        }
    }
    private void HandleTwoSidesAndSingleAngle(Double []sides, Double[] angles){
        if (IsAngleBetweenSides(sides, angles)){
            HandleTwoSidesAndAngleBetweenThem(sides, angles); 
        } else if (IsAngleNextToSides(sides,angles)){
             HandleTwoSidesAndAngleNextToThem(sides, angles);
        }  
    }
    private void HandleSingleSidesAndTwoAngles(Double []sides, Double[] angles){
        // find the 3rd angle
        for(int i =0; i< 3; ++i) {
            if(angles[i] == null) {
                angles[i] = 180 - angles[(i+1)%3] - angles[(i+2)%3];
                break;
            }
        }
            
        // we have 1 side and 3 angles
        for(int i =0; i< 3; ++i) {
            if(sides[i] != null) {
                // find other 2 sides using sinus theorem
                for(int k = 1; k <= 2; ++k) {
                sides[(i+k)%3] = SideFromSin(sides[i],
                                             sides[(i+k)%3], 
                                             angles[i],
                                             angles[(i+k)%3]);
                }
                
                break;
            }
        }
    }
    private void ControlsToArrays(){
        for(int i = 0; i < 3; ++i) {
            sides[i] =  GetValue(side_controls[i].getText());
            angles[i] =  GetValue(angle_controls[i].getText());
        }
    }
    private void ArraysToControls(){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        for(int i = 0; i < 3; ++i) {
            side_controls[i].setText(decimalFormat.format(sides[i]));
            angle_controls[i].setText(decimalFormat.format(angles[i]));
        }
    }
    public void solve(){
        int sides_count = 0;
        int angles_count = 0;
        int count = 0;

        ControlsToArrays();
        
        for(int i = 0; i < 3; ++i) {
            if(sides[i] != null) {
                ++sides_count;
            }
            if(angles[i] != null){
                ++angles_count;
            }
        }

        count = sides_count + angles_count;
        
    
        if((count != 3)&&(solved==false)) {
            if (count < 3) Methods.callError("Not Enough Information was provided");
            if (count > 3) Methods.callError("Too much information was provided");
            return;
        }
        
        if (sides_count == 3) {
            calAngles (sides);
        } else if(sides_count == 2 && angles_count == 1) {
            HandleTwoSidesAndSingleAngle(sides, angles);
        } if(sides_count == 1 && angles_count == 2) {
            HandleSingleSidesAndTwoAngles(sides, angles);
        }        
        solved = true;
        ArraysToControls();
}  
    public void calAngles(Double[] sides){
        if ((Methods.isTriangle(sides[0], sides[1], sides[2]) == true)){
            System.out.println ("Three sides, "+ sides[0] + ", " + sides[1] + ", " + sides[2]);
            for(int i = 0; i < 3; ++i) {
                angles[(i+2)%3] = Methods.angleCalc(sides[i], 
                                                    sides[(i+1) % 3], 
                                                    sides[(i+2) % 3]);
                Methods.ATMP = sides[0];
                Methods.BTMP = sides[1];
                Methods.CTMP = sides[2];
            }
        }
        else {
            System.out.println ("Three sides, "+ sides[0] + ", " + sides[1] + ", " + sides[2]+ "\nNonvalid values");
            Methods.callError("Three sides, "+ sides[0] + ", " + sides[1] + ", " + sides[2]+ "\nNonvalid values");
        }
    
    }// a method that calculates the angles based on
    // the sides and updates the textfields
    public void graph(){
        solve();
        if (solved == true){
            Methods.ATMP = sides[0];
            Methods.BTMP = sides[1];
            Methods.CTMP = sides[2];
            MainWindow.tri1(true);
        }
    }//a method that invokes the GraphFrame Class
    private void clearFields(){
        if (cleared == false){
            cleared = true;
            String txt = "";
            AText.setText(txt);
            BText.setText(txt);
            CText.setText(txt);
            AAText.setText(txt);
            ABText.setText(txt);
            ACText.setText(txt);
        }
    }//a method that clears all the text fields in the jframe
}

//Class Version 2.11
//Copyright Hristo Belchev and Svetoslav Berberski 2018