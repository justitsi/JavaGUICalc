/*
    contact info: hristob1999@gmail.com
    copyright January 2018 @ Hristo Belchev
    Part of the Universal Calculator Package
 */
package SI_Calc;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;


/*
    Made by Hristo Belchev and Svetoslav Berberski
 */
public class Settings extends javax.swing.JFrame {
    public static double version = 1.1;//version number for the developer mode of the settings class
    public static boolean nullch = MainWindow.nullch, vis = MainWindow.vis, scaleable = GraphFrame.scaleable, labels = GraphFrame.labels, aa = GraphFrame.AA;
    public int maxscale = GraphFrame.maxScale, labels_dis = GraphFrame.labelDisplacement, mScale = GraphFrame.mScale;  
    public String devInfo;
    private boolean dev = false;
    public Settings() {
        initComponents();
        setCurrent();
        System.out.println(devInfo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NullCH = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        VIS = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        AA = new javax.swing.JCheckBox();
        SCALEABLE = new javax.swing.JCheckBox();
        LABELS = new javax.swing.JCheckBox();
        MAXSCALE = new javax.swing.JTextField();
        LABELD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MANSCALE = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        History = new javax.swing.JTextArea();
        CLOSE = new javax.swing.JButton();
        APPLY = new javax.swing.JButton();
        DEFAULT = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings/Help");
        setPreferredSize(new java.awt.Dimension(500, 340));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel2.setText("Settings:");

        NullCH.setText("Check For Null");
        NullCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NullCHActionPerformed(evt);
            }
        });

        jLabel3.setText("Main Window");

        VIS.setText("Visual elements");
        VIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISActionPerformed(evt);
            }
        });

        jLabel4.setText("Graphing Frames");

        AA.setText("Anti-Aliasing");
        AA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAActionPerformed(evt);
            }
        });

        SCALEABLE.setText("Scaleable");
        SCALEABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCALEABLEActionPerformed(evt);
            }
        });

        LABELS.setText("Labels");
        LABELS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LABELSActionPerformed(evt);
            }
        });

        MAXSCALE.setText("Max Scale");

        LABELD.setText("Label Displacement");
        LABELD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LABELDKeyPressed(evt);
            }
        });

        jLabel5.setText("MaxScale");

        jLabel6.setText("Label Displacement");

        jLabel7.setText("ManScale");

        MANSCALE.setText("Man Scale");
        MANSCALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MANSCALEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABELD)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NullCH, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SCALEABLE, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LABELS, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MAXSCALE, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addComponent(VIS)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MANSCALE, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NullCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SCALEABLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LABELS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MAXSCALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MANSCALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(LABELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        History.setColumns(20);
        History.setRows(5);
        jScrollPane1.setViewportView(History);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        CLOSE.setText("Close");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        APPLY.setText("Apply");
        APPLY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPLYActionPerformed(evt);
            }
        });

        DEFAULT.setText("Reset");
        DEFAULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEFAULTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEFAULT)
                        .addGap(4, 4, 4)
                        .addComponent(APPLY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CLOSE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CLOSE)
                                .addComponent(APPLY)
                                .addComponent(DEFAULT)))))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NullCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NullCHActionPerformed
        
    }//GEN-LAST:event_NullCHActionPerformed

    private void VISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VISActionPerformed

    private void AAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AAActionPerformed

    private void SCALEABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCALEABLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCALEABLEActionPerformed

    private void LABELSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LABELSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LABELSActionPerformed

    private void DEFAULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEFAULTActionPerformed
        setCurrent();
    }//GEN-LAST:event_DEFAULTActionPerformed

    private void APPLYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPLYActionPerformed
        apply();
    }//GEN-LAST:event_APPLYActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        char chr;
        chr = evt.getKeyChar();
        if (chr == '\n') apply();
        if (chr == 'd') setCurrent();
    }//GEN-LAST:event_formKeyPressed

    private void MANSCALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MANSCALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MANSCALEActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
       setVisible(false);
       System.out.println("Settings window closed");
    }//GEN-LAST:event_CLOSEActionPerformed

    private void LABELDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LABELDKeyPressed
        char chr;
        chr = evt.getKeyChar();
        if (chr == 'д') {
            if (dev == false) dev = true;
            else dev = false;
        }
    }//GEN-LAST:event_LABELDKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }   catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AA;
    private javax.swing.JButton APPLY;
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton DEFAULT;
    private javax.swing.JTextArea History;
    private javax.swing.JTextField LABELD;
    private javax.swing.JCheckBox LABELS;
    private javax.swing.JTextField MANSCALE;
    private javax.swing.JTextField MAXSCALE;
    private javax.swing.JCheckBox NullCH;
    private javax.swing.JCheckBox SCALEABLE;
    private javax.swing.JCheckBox VIS;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    //procedural methods
    public void setCurrent(){
       if (nullch == true) NullCH.setSelected(true);
       if (vis == true) VIS.setSelected(true); 
       if (scaleable == true) SCALEABLE.setSelected(true);
       if (labels == true) LABELS.setSelected(true);
       if (aa == true) AA.setSelected(true);
       String txt = Integer.toString(maxscale);
       MAXSCALE.setText(txt);
       txt = Integer.toString(labels_dis);
       LABELD.setText(txt);
       txt = Integer.toString(mScale);
       MANSCALE.setText(txt);
       defHelp();
    }//sets the default values in the input spaces
    public void apply(){
        nullch = NullCH.isSelected();
        vis = VIS.isSelected();
        scaleable = SCALEABLE.isSelected();
        labels = LABELS.isSelected();
        aa = AA.isSelected();
        if (Methods.numCheck(MAXSCALE.getText()) == true) maxscale = Integer.parseInt(MAXSCALE.getText());
        else{
            MAXSCALE.setText("Error - MAXSCALE numcheck");
            return;
        }
        if (Methods.numCheck(LABELD.getText()) == true) labels_dis = Integer.parseInt(LABELD.getText());
        else{
            LABELD.setText("Error - LABELD numcheck");
            return;
        }
        if ((Methods.numCheck(MANSCALE.getText()) == true)){       
            mScale = Integer.parseInt(MANSCALE.getText());
        }
        else{
            MANSCALE.setText("Error - MANSCALE numcheck");
            return;
        }
        set();
        //Methods.callError("hello");
    }//applies the changes to local variables
    public void set(){
        System.out.println ("Set: "+vis+" "+nullch+" "+scaleable+" "+maxscale+" "+labels+" "+aa+" "+labels_dis);
        Methods.mainSettings(vis, nullch);
        Methods.graphSettings(scaleable, maxscale, labels, aa, labels_dis, mScale);
        
    }//applies the changes to other classes
    public void defHelp(){
        devInfo = "DEVELOPER INFO:"
                +"\nError_window ver: "+Double.toString(Error_window.version)
                +"\nFormulasDZI ver: "+ Double.toString(FormulasDZI.version)
                +"\nGraphFrame ver: "+ Double.toString(GraphFrame.version)
                +"\nMainWindow ver: "+ Double.toString(MainWindow.version)
                +"\nMethods ver: "+ Double.toString(Methods.version)
                +"\nQuadGraph ver: "+ Double.toString(QuadGraph.version)
                +"\nSettings ver: "+ Double.toString(Settings.version)
                +"\nTriangleSolving ver: "+ Double.toString(TriangleSolving.version)
                +"\n\nCurrent Settings: "
                +"\nMainWindow: vis: "+vis+" nullch: "+nullch
                +"\nGraphs: labels: "+labels+" aa: "+aa+" labels_dis: "+labels_dis
                +"\nGraphFrame: scaleable: "+scaleable+" maxscale: "+maxscale+" mScale: "+mScale;
        
        String txt =     "~~Help~~\n"
                + "Keyboard Shortcuts\n"
                + "+ Addition"
                + "          - Subtraction\n"
                + "* Multiplication"
                + "     / Devision\n"
                + "^ Power\n"
                + "Q Quadratic"
                + "        B Biqadratic\n"
                + "T Triangle"
                + "           S Triangle Solving (any side&angle)\n"
                + "F Formulas Math State Exam\n"
                + "C Clear"
                + "               A Clear All\n"
                + "Enter Equals\n\n"
                + "Set ManScale = -1 for off\n\n"
                + "Contact: hristob1999@gmail.com";
                
        if (dev == false) History.setText(txt);
        else History.setText(devInfo);
    }//sets the default history
}

//Class Version 1.1
//Copyright Hristo Belchev and Svetoslav Berberski 2018