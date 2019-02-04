/*
    contact info: hristob1999@gmail.com
    copyright January 2018 @ Hristo Belchev
    Part of the Universal Calculator Package
 */
package SI_Calc;
/*
    Made by Hristo Belchev and Svetoslav Berberski
 */

//TO BE CALLED FROM Methods.callError("yourText");
public class Error_window extends javax.swing.JFrame {
    public static double version = 1.0;//version number for the developer mode of the settings class
    public static String text = "";
    public Error_window() {
        initComponents();
        setText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Error_Box = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Error");
        setName("Error_Window"); // NOI18N
        setPreferredSize(new java.awt.Dimension(250, 125));

        Error_Box.setSize(new java.awt.Dimension(250, 125));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextPane1.setFocusable(false);
        jTextPane1.setMinimumSize(new java.awt.Dimension(240, 70));
        jTextPane1.setName(""); // NOI18N
        jTextPane1.setSize(new java.awt.Dimension(240, 70));
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout Error_BoxLayout = new javax.swing.GroupLayout(Error_Box);
        Error_Box.setLayout(Error_BoxLayout);
        Error_BoxLayout.setHorizontalGroup(
            Error_BoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Error_BoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Error_BoxLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1))
        );
        Error_BoxLayout.setVerticalGroup(
            Error_BoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Error_BoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Error_Box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Error_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("Error Message");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       System.out.println("Error window closed");
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(Error_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Error_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Error_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Error_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Error_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Error_Box;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
    public static void setText(){
        //jTextPane1.setText("");
        if (text.equals("")){
            text = "Undefined Error";
            jTextPane1.setText(text);
            //System.out.println ("Error string is "+text+" from true");
        }
        else{
            jTextPane1.setText(text);
            //System.out.println ("Error string is "+text+" from else");
        }
        System.out.println("Error called with text: "+text);
        text = "";
    }
}

//Class Version 1.0
//Copyright Hristo Belchev and Svetoslav Berberski 2018