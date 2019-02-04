/*
    contact info: hristob1999@gmail.com
    copyright January 2018 @ Hristo Belchev
    Part of the Universal Calculator Package
 */
package SI_Calc;
/*
    Made by Hristo Belchev and Svetoslav Berberski
 */
public class MainWindow extends javax.swing.JFrame  {
    public static double version = 3.43;//version number for the developer mode of the settings class
    //settings
    static boolean nullch = true; // if there should be a check for nul parsing
    static boolean vis = true;//if functions can write to history
    //opearation variables
    String text = new String();//current value/top window
    static String history = new String();//history window
    double ans, num1, num2, num3;//for basic functions
    static double X = 0, Y = 0, Z = 0;//for polinomials - visually adressed as A, B and C
    double tmp = 0;//temporary variable
    //NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
    int operation = -1;//opeartaion variable used for the switch in the "=" button - used for basic functions
    /*
        operation 0 - add
        operation 1 - minus
        operation 2 - multi
        operation 3 - div
    */
    public MainWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jButton17 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jComboBox1 = new javax.swing.JComboBox<>();
        Textfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jButton17.setText("jButton17");

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton27.setText("Q");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universal Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Adobe Caslon Pro", 0, 10)); // NOI18N
        setName("Main_Window"); // NOI18N
        setResizable(false);

        Textfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Textfield.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Textfield.setToolTipText("Current Variable Field");
        Textfield.setKeymap(Textfield.getKeymap());
        Textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Textfield_Shortcuts(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("History");
        jTextArea1.setToolTipText("History Field");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton20.setText("√");
        jButton20.setToolTipText("Square Root");
        jButton20.setFocusable(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton19.setText("^");
        jButton19.setToolTipText("Power");
        jButton19.setFocusable(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("*");
        jButton13.setToolTipText("Multiplication");
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setText("/");
        jButton12.setToolTipText("Division");
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("-");
        jButton11.setToolTipText("Subtract");
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("+");
        jButton10.setToolTipText("Add");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setText("C");
        jButton16.setToolTipText("Clear Text Fields");
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton26.setText("АC");
        jButton26.setToolTipText("Clear Text Fields and Variables");
        jButton26.setFocusable(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setText("=");
        jButton14.setToolTipText("Perform the current operation and print the result");
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton28.setText("B");
        jButton28.setToolTipText("Biquadratic Equation Solving");
        jButton28.setActionCommand("bI");
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton21.setText("Q");
        jButton21.setToolTipText("Quadratic Equation Solving");
        jButton21.setFocusable(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton30.setText("T");
        jButton30.setToolTipText("Triangle Solving");
        jButton30.setFocusable(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton31.setText("ST");
        jButton31.setToolTipText("Extended triangle solving");
        jButton31.setFocusable(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton33.setText("F");
        jButton33.setToolTipText("Solve by formula");
        jButton33.setFocusable(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("1");
        jButton1.setToolTipText("One");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("2");
        jButton3.setToolTipText("Two");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("3");
        jButton2.setToolTipText("Three");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("4");
        jButton4.setToolTipText("Four");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("5");
        jButton5.setToolTipText("Five");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("6");
        jButton6.setToolTipText("Six");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("9");
        jButton9.setToolTipText("Nine");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("8");
        jButton8.setToolTipText("Eight");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("7");
        jButton7.setToolTipText("Seven");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setText("0");
        jButton15.setToolTipText("Zero");
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton18.setText(".");
        jButton18.setToolTipText("Decimal Point");
        jButton18.setFocusable(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton29.setText("+ -");
        jButton29.setToolTipText("Change the sign of the variable");
        jButton29.setFocusable(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton23.setText("X");
        jButton23.setToolTipText("Set the value of the variable X");
        jButton23.setFocusable(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton24.setText("Y");
        jButton24.setToolTipText("Set the value of the variable Y");
        jButton24.setFocusable(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton25.setText("Z");
        jButton25.setToolTipText("Set the value of the variable Z");
        jButton25.setFocusable(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton22.setText("X/Y/C");
        jButton22.setToolTipText("Display the Values of Variables");
        jButton22.setFocusable(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton32.setText("?");
        jButton32.setToolTipText("Open the Help and Settings Menu");
        jButton32.setFocusable(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setText("Version 0.61, press ? for help/settings");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Textfield)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//1
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        text+="1";
        Textfield.setText(text);
    }//GEN-LAST:event_jButton1ActionPerformed
//2
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        text+="2";
        Textfield.setText(text);
    }//GEN-LAST:event_jButton3ActionPerformed
//3   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        text+="3";
        Textfield.setText(text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//4
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        text+="4";
        Textfield.setText(text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
//5
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        text+="5";
        Textfield.setText(text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
//6
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        text+="6";
        Textfield.setText(text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
//7
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        text+="7";
        Textfield.setText(text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
//8
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        text+="8";
        Textfield.setText(text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
//9
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        text+="9";
        Textfield.setText(text); 
    }//GEN-LAST:event_jButton9ActionPerformed
//0
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        text+="0";
        Textfield.setText(text);
    }//GEN-LAST:event_jButton15ActionPerformed
//add
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addbtn();
    }//GEN-LAST:event_jButton10ActionPerformed
//clear - "C"
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        clear();
    }//GEN-LAST:event_jButton16ActionPerformed
//equals
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
            perform ();
    }//GEN-LAST:event_jButton14ActionPerformed
//subtraction
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        subbtn();
    }//GEN-LAST:event_jButton11ActionPerformed
//product
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        multbtn();
    }//GEN-LAST:event_jButton13ActionPerformed
//div
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        divbtn();
    }//GEN-LAST:event_jButton12ActionPerformed
//decimal dot
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        text += ".";
        Textfield.setText(text);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed
//pow
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        powbtn();
    }//GEN-LAST:event_jButton19ActionPerformed
//sqrt
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        num1 = getNum(""); 
        if (num1<0){
            text = "Error, nonvalid values for SQRT\n";
            ans = sqrt (num1, vis);
        }
        else{
        ans = sqrt (num1, vis);
        text = Double.toString(ans);}
        Textfield.setText(text);
        //sqrt1 (num1);
        //jTextArea1.setText(history);
        text = "";
    }//GEN-LAST:event_jButton20ActionPerformed
//quadratic Equations
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
         quadSolve (vis);
    }//GEN-LAST:event_jButton21ActionPerformed
//X-Y-Z
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        addHistory ("X= " + eRemover(Methods.ATMP)+"\n", vis);
        addHistory ("Y= " + eRemover(Methods.BTMP)+"\n", vis);
        addHistory ("Z= " + eRemover(Methods.CTMP)+"\n", vis);
        text="";
    }//GEN-LAST:event_jButton22ActionPerformed
//X
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        X = getNum("X");
        Methods.ATMP = X;
    }//GEN-LAST:event_jButton23ActionPerformed
//Y
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Y = getNum("Y");
        Methods.BTMP = Y;
    }//GEN-LAST:event_jButton24ActionPerformed
//Z
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Z = getNum("Z");
        Methods.CTMP = Z;
    }//GEN-LAST:event_jButton25ActionPerformed
//clear - "AC"
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
    allClear ();
    }//GEN-LAST:event_jButton26ActionPerformed
//???
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed
//Biquadratic equations
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        BiQuad (vis);
    }//GEN-LAST:event_jButton28ActionPerformed
// +/-
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        text = Textfield.getText();
        if (text.equals("")){}
        else{
            if (text.charAt(0) == '-'){
                text = text.substring (1, text.length());
            }
            else{
                text = "-"+text;
            }
            Textfield.setText(text); }
    }//GEN-LAST:event_jButton29ActionPerformed
//tri1
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        tri1 (vis);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

//button to launch Triangle Solving Class
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        stbtn();
    }//GEN-LAST:event_jButton31ActionPerformed
//shortcut listener
    private void Textfield_Shortcuts(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textfield_Shortcuts
        char chr;
        chr = evt.getKeyChar();
        if (chr == '\n') perform(); //equals
        if (chr == '+') addbtn();//plus
        if (chr == '-') subbtn();//minus
        if (chr == '*') multbtn();//mult
        if (chr == '/') divbtn();//div
        if (chr == '^') powbtn();//pow
        //variables
        if ((chr == 'x')||(chr == 'X')||(chr == 'ь')||(chr == 'Ь')) X = getNum ("X"); Methods.ATMP = X;//sets number in Textfield to X
        if ((chr == 'y')||(chr == 'Y')||(chr == 'ъ')||(chr == 'Ъ')) Y = getNum ("Y"); Methods.BTMP = Y;//sets number in Textfield to Y
        if ((chr == 'z')||(chr == 'Z')||(chr == 'з')||(chr == 'З')) Z = getNum ("Z"); Methods.CTMP = Z;//sets number in Textfield to Z
        //methods for advanced functions
        if ((chr == 't')||(chr == 'T')||(chr == 'т')||(chr == 'Т')) tri1 (vis);//invokes tri1 method
        if ((chr == 'q')||(chr == 'Q')||(chr == 'я')||(chr == 'Я')) quadSolve (vis);//invokes quadSolve method
        if ((chr == 'b')||(chr == 'B')||(chr == 'б')||(chr == 'Б')) BiQuad (vis);//invokes BiQuad method
        //clears
        if ((chr == 'c')||(chr == 'C')||(chr == 'ц')||(chr == 'Ц')) clear ();//invokes the clear method
        if ((chr == 'a')||(chr == 'A')||(chr == 'а')||(chr == 'А')) allClear ();//invokes the allClear method
        //windows
        if ((chr == '?')||(chr == 'H')||(chr == 'h')||(chr == 'Х')||(chr == 'х')) hbtn();//Settings window
        if ((chr == 'f')||(chr == 'F')||(chr == 'ф')||(chr == 'Ф')) fbtn();//FormulasDIZ window
        if ((chr == 's')||(chr == 'S')||(chr == 'с')||(chr == 'С')) stbtn();//invokes the TriangleSolving window
    }//GEN-LAST:event_Textfield_Shortcuts
//Help Button
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
       hbtn();
    }//GEN-LAST:event_jButton32ActionPerformed
//Formulas Button
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        fbtn();
    }//GEN-LAST:event_jButton33ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Textfield;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    // Functions return doubles
    // Functions with names ending with 1 are for the history, write strings to it
    // Formating functions and settings
    public double getNum (String name){
        double num = 0.0;
        boolean visual = vis;
        if (name == ""){
            visual = false;
        }      
        if (fieldNullCheck(nullch)){
            String txt = Textfield.getText();
            if (numCheck (txt) == true){
                txt = hotkeySymRemover (txt);
                num = Double.parseDouble(txt);
                addHistory (name+"= " + eRemover(num)+"\n", visual);
                text="";
                Textfield.setText(text);
            }
        }
        else {
            addHistory ("New value for " + name +" is empty \n", visual);
        }
        return num;
    }//parses number from Textfield safely
    public boolean fieldNullCheck (boolean a){
        //the value given to the function is a global variable that controls wheater the code bellow should be executed
        if (a = true){
            String txt = Textfield.getText();
            if (txt != null && !txt.isEmpty()){
            System.out.println ("String not empty, content: "+txt);
            return true;
            }
            else{
            System.out.println ("String is empty");
            return false;
        }}
        else {
            System.out.println ("Null check is not enabled");
            return true;
        }
    }//returns true if field is not empty and false otherwise
    public boolean numCheck (String txt){
        return Methods.numCheck(txt);
    }//cheks if a string is a valid number
    public String hotkeySymRemover (String txt){
        return Methods.hotkeySymRemover (txt);
    }//removes symbols used for hotkeys from the string
    public String eRemover (double a){
        return Methods.eRemover(a); //Calls method eRemover from the Methods class
    } //Makes numbers human-readable in the history
    public static void addHistory (String txt, boolean visual){
            System.out.print("\naddHistory ");
            System.out.print("text to add: "+txt+"\n");
        if (visual == true){ 
            history += txt;
            jTextArea1.setText(history);
        }
    }//function that writes to history and displays the update
    public void clear (){
        text="";
        Textfield.setText(text);
        num1=0;
        num2=0;
    }//clear variables and Textfield
    public void clearText (){
        text="";
        Textfield.setText("");
    }//clears the Textfield, which holds the current variable
    public void allClear(){
        text = "";
        history = "";
        X = 0;
        Y = 0;
        Z = 0;
        Methods.ATMP = 0;
        Methods.BTMP = 0;
        Methods.CTMP = 0;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        Textfield.setText("");
        jTextArea1.setText("");
    }//clears variables, Textfield and history
    public void help (){
        //deprecated - functionality moved to Settings class
    }//prints help page
    // Basic procedure functions
    public void perform(){
            System.out.println ("Method Perform called");
            switch(operation){
            case 0: num2 = getNum(""); ans= add (num1, num2, vis); text = Double.toString(ans); Textfield.setText(text); text = ""; operation = -1; break;
            case 1: num2 = getNum(""); ans= sub (num1, num2, vis); text = Double.toString(ans); Textfield.setText(text); text = ""; operation = -1; break;
            case 2: num2 = getNum(""); ans= mult (num1, num2, vis); text = Double.toString(ans); Textfield.setText(text); text = ""; operation = -1; break;
            case 3: num2 = getNum(""); ans = div (num1, num2); history += div1 (num1, num2); if (num2!=0){text = Double.toString(ans); Textfield.setText(text);} else Textfield.setText("see error"); jTextArea1.setText(history); text = ""; operation = -1; break;
            case 4: num2 = getNum(""); ans = pow (num1, num2, vis); text = Double.toString(ans);Textfield.setText(text);  text = ""; operation = -1; break;
            case -1: 
                addHistory ("No operation selected \n", vis); 
                if (fieldNullCheck(nullch) == false){
                    System.out.println ("method perfrom called with no value");
                    addHistory ("No value\n", vis);
                }
                if (numCheck (Textfield.getText()) == false){
                    System.out.println ("String is not a number");
                    addHistory ("Not a number\n",vis);
                }
                break;
            default: System.out.println("Error: invalid operation");break;
            }
    }//method that invokes basic procedure functions and gives feedback to the user
    public void addbtn (){
        num1 = getNum("");
        operation = 0;
        clearText();
    }//method which invokes the addition operation and takes the first variable
    public double add(double a, double b, boolean visual){
        System.out.print("\nADD "+a+" "+b);
        if (visual == true) add1(a, b, visual);
        return a+b;
    }//method for addition
    public void add1 (double a, double b, boolean  visual){
        System.out.print("\nADD1 "+a+" "+b);
        double c = a+b;
        String txt;
        txt = eRemover(a) + " + " + eRemover(b) + "=" + eRemover(c)+"\n";
        System.out.println ("\n"+txt);        
        addHistory (txt, visual);
    }//history function for addition
    public void subbtn(){
        num1 = getNum("");
        operation = 1;
        clearText();
    }//method which invokes the subtraction opearation and takes the first variable
    public double sub(double a, double b, boolean visual){
        System.out.print("\nSUB "+a+" "+b);
        if (visual == true) sub1 (a, b, visual);
        return a-b;
    }//method for subtraction
    public void sub1 (double a, double b, boolean visual){
        System.out.print("\nSUB1 "+a+" "+b);
        double c = a-b;
        String txt;
        txt = eRemover(a) + " - " + eRemover(b) + "=" + eRemover(c)+"\n";
        System.out.println ("\n"+txt);        
        addHistory (txt, visual);
    }//history function for subtraction
    public void multbtn (){
        num1 = getNum("");
        operation = 2;
        clearText();
    }//method which invokes the multiplication opearation and takes the first variable
    public double mult(double a, double b, boolean visual){
        System.out.println("MULT "+a+" "+b);
        double c = a*b;
        if (visual == true) mult1 (a, b, visual);
        return c;
    }//method for multiplication
    public void mult1 (double a, double b, boolean visual){
        System.out.print("\nMULT1 "+a+" "+b);
        double c = a*b;
        String txt;
        txt = eRemover(a) + " * " + eRemover(b) + "=" + eRemover(c)+"\n";
        System.out.println ("\n"+txt);        
        addHistory (txt, visual);
    }//history function for multiplication
    public void divbtn (){
        num1 = getNum("");
        operation = 3;
        clearText ();    
    }//method which invokes the division opearation and takes the first variable
    public static double div(double a, double b){
        System.out.println("DIV "+a+" "+b);
        double c;
        if (b!=0){
        c = a/b;
        //c =(double) Math.round((a/b)*100000/100000);
        return c;
        }
        else{
        System.out.println("Error, nonvalid values");
        return 0;
        }
    } //method for division - numbers to be rounded
    public String div1(double a, double b){ 
        System.out.println("DIV1 "+a+" "+b);
        double c;
        int q;
        String txt;
        System.out.println("DIV1 "+a+" "+b);
        if (b == 0 ){ txt = "error, second number is 0\n"; return txt;}
        q=(int) ((int) a/b);
	c=a-(q*b);
        System.out.println (q+" and "+c+"/"+b);
        txt = eRemover(a) + " / " + eRemover(b) + " = (" + eRemover(q) + " and " + eRemover(c) + "/" + eRemover(b)+")"+"\n";
        System.out.println ("\n"+txt);       
        return txt;
    }//history function for division
    public double sqrt(double a, boolean visual){
        System.out.println("SQRT "+a);
        if (a<0){
            System.out.print("Error, nonvalid values for SQRT");
            sqrt1 (a, visual);
            return 0;
        }
        else
        if (visual == true) sqrt1 (a, visual);
        return (Math.sqrt(a));
    } //method for square root - numbers to be rounded
    public void sqrt1(double a, boolean visual){
        System.out.print("\nSQRT1 "+a);
        String txt="";
        if (a<0){
            addHistory ("\n"+"error, number " + a + " < 0", visual);
        }
        else{
        double c = (Math.sqrt(a));
        txt = txt + "√" + eRemover(a) + "="+ eRemover(c)+"\n";
        System.out.println ("\n"+txt);
        addHistory ("\n"+txt, visual);
        }
    }//history function for square root
    public void powbtn(){
        num1 = getNum("");
        text="";
        operation = 4;
        Textfield.setText(text); 
    }//method which invokes the power opearation and takes the first variable
    public double pow(double a, double b, boolean visual){
        System.out.println("POW "+a+" "+b);
        if (visual == true) pow1 (a, b, visual);
        return (Math.pow(a, b));
    }//method for powers
    public void pow1 (double a, double b, boolean visual){
        System.out.println("POW1 "+a+" "+b);
        double c = Math.pow(a, b);
        String txt;
        txt = eRemover (a) + " ^ " + eRemover (b) + "=" + eRemover (c) + "\n";
        System.out.println (txt);
        addHistory (txt, visual);
    }//history function for powers
    //advanced procedure functions
    public void quadSolve(boolean visual){
        double a = Methods.ATMP, b = Methods.BTMP, c = Methods.CTMP;
        double d, x1, x2;
        System.out.println("\nQuadSolve "+a+" "+b+" "+c);
        d=(b*b)-(4*a*c);
        addHistory ("D = b^2-4*a*c = " + eRemover(b) + "^2-4*" + eRemover(a) + "*" + eRemover(c) + "=" + eRemover(d)+"\n", visual);
        if (d<0){
            addHistory ("D<0, no real solutions"+"\n", visual);
        }
        if (d==0){
            x1=(0-b)/(2*a);    
            addHistory ("X1 = " + eRemover(x1)+"\n", visual);
            addHistory ("V(x) = " + eRemover(-b/2*a)+" \nV(y) = "+ eRemover(-d/4*a)+"\n", visual);
            //addHistory ("\nX1=(-b-sqrt(D)/(2*a)=("+eRemover(-b)+"-sqrt("+eRemover(d)+"))/2*"+eRemover(a)+")=("+eRemover(-b)+"-"+eRemover(Math.sqrt(d))+")/(2*"+eRemover(a)+")="+eRemover((-b)-Math.sqrt(d))+"/"+eRemover(2*a)+"="+eRemover(x1));        
        }
        if (d>0){       
        x1=((0-b)+Math.sqrt(d))/(2*a);
        x2=((0-b)-Math.sqrt(d))/(2*a);
        addHistory("X1 is: "+eRemover(x1)+"\n", visual);
        addHistory("X2 is: "+eRemover(x2)+"\n", visual);
        addHistory("X1 + X1 is: "+eRemover(x1+x2)+"\n", visual);
        addHistory("X1*X2 is: "+eRemover(x1*x2)+"\n", visual);
        addHistory ("V(x) = " + eRemover(-b/2*a)+" \nV(y) = "+ eRemover(-d/4*a)+"\n", visual);
        QuadGraph.x1 = x1;
        QuadGraph.x2 = x2;
        //addHistory("\nX1=(-b-sqrt(D)/(2*a)=("+eRemover(-b)+"-sqrt("+eRemover(d)+"))/2*"+eRemover(a)+")=("+eRemover(-b)+"-"+eRemover(Math.sqrt(d))+")/(2*"+eRemover(a)+")="+eRemover((-b)-Math.sqrt(d))+"/"+eRemover(2*a)+"="+eRemover (x1));
        //addHistory("\nX2=(-b+sqrt(D)/(2*a)=("+eRemover(-b)+"+sqrt("+eRemover(d)+"))/2*"+eRemover(a)+")=("+eRemover(-b)+"+"+eRemover(Math.sqrt(d))+")/(2*"+eRemover(a)+")="+eRemover((-b)+Math.sqrt(d))+"/"+eRemover(2*a)+"="+eRemover(x2));
        } 
        if ((vis == true)&&(a != 0.0))new QuadGraph().setVisible(true);
        else
            if (vis == false) Methods.callError("Visual elements have been disabled in Settings");
            else Methods.callError("Equation is not quadratic - A = 0");
    }//Solves quadratic equations and prints to history box
    public void BiQuad (boolean visual){
        double a = Methods.ATMP, b = Methods.BTMP, c = Methods.CTMP;
        double d, x1, x2, x3, x4, x5, x6;
        boolean flag = false;
        System.out.println("BiQuad "+a+" "+b+" "+c);
        d=(b*b)-(4*a*c);
        addHistory ("D = b^2-4*a*c = " + eRemover(b) + "^2-4*" + eRemover(a) + "*" + eRemover(c) + "=" + eRemover(d)+"\n", visual);
            if (d<0){
            }
            if (d==0){
                x5=(0-b)/(2*a);
                if (x5>0){
                    flag = true;
                    x1=Math.sqrt(x5);
                    x2=0-x1;
                    addHistory("X1 is: "+eRemover(x1)+"\n", visual);
                    addHistory("X2 is: "+eRemover(x2)+"\n", visual);
                }
                if (x5 == 0){
                    flag = true;
                    x1 = 0;
                    addHistory("X1 is: "+eRemover(x1)+"\n", visual);
                }
            }
            if (d>0){
                x5=((0-b)+Math.sqrt(d))/(2*a);
                x6=((0-b)-Math.sqrt(d))/(2*a);
                if (x5>0){
                    flag = true;
                    x1=Math.sqrt(x5);
                    x2=0-x1;                
                    addHistory("X1 is: "+eRemover(x1)+"\n", visual);
                    addHistory("X2 is: "+eRemover(x2)+"\n", visual);
                }
                if (x6>0){
                    flag = true;
                    x3=Math.sqrt(x6);
                    x4=0-x3;
                    addHistory("X3 is: "+eRemover(x3)+"\n", visual);
                    addHistory("X4 is: "+eRemover(x4)+"\n", visual);
                }
                if (x5 == 0){
                    flag = true;
                    x1 = 0;
                    addHistory("X1 is: "+eRemover(x1)+"\n", visual);
                }
                if (x6 == 0){
                    flag = true;
                    x3 = 0;
                    addHistory("X3 is: "+eRemover(x3)+"\n", visual);
                }
            }
            if (flag == false){
                addHistory ("No real solutions\n", visual);
            }
    }// Solves biquadratic equations and prints to history box
    public static void tri1 (boolean visual){
        double a = Methods.ATMP, b = Methods.BTMP, c = Methods.CTMP;
        System.out.println("tri1 "+a+" "+b+" "+c);
        String txt = "";
        double S, ma, mb, mc, anglec, angleb, anglea, la, lb, lc, R, sina, ha, hb, hc;        
        if (Methods.isTriangle(a, b, c) == false){
            txt = "Imposible triangle with sides: "+"\n";
            txt += "A: "+Methods.eRemover(a)+"\n";
            txt += "B: "+Methods.eRemover(b)+"\n";
            txt += "C: "+Methods.eRemover(c)+"\n";
            addHistory (txt, visual);
            return;
        }
        if (visual == true){
            Methods.ATMP = a;
            Methods.BTMP = b;
            Methods.CTMP = c;
            new GraphFrame();
        }
        else Methods.callError("Visual elements have been disabled in Settings");
        txt = "Triangle with sides: "+"\n";
            txt += "A: "+Methods.eRemover(a)+"\n";
            txt += "B: "+Methods.eRemover(b)+"\n";
            txt += "C: "+Methods.eRemover(c)+"\n";
        S = Methods.areaCalc (a, b, c);
        txt = txt + "S = "+Methods.eRemover(S)+"\n";
        //calculates medians
            mb=0.5*(Math.sqrt ((2*a*a+2*c*c-b*b)));
            ma=0.5*(Math.sqrt ((2*b*b+2*c*c-a*a)));
            mc=0.5*(Math.sqrt ((2*b*b-c*c+2*a*a)));
        txt = txt + "MA= " + Methods.eRemover (ma) + "\n";
        txt = txt + "MB= " + Methods.eRemover (mb) + "\n";
        txt = txt + "MC= " + Methods.eRemover (mc) + "\n";
        //calculates cosines of angles
            anglec = Methods.angleCalc (a, b, c);
            txt = txt + "Angle at C = "+Methods.eRemover (anglec) + " in degrees\n";
            angleb = Methods.angleCalc (a, c, b);
            txt = txt + "Angle at B = "+Methods.eRemover (angleb) + " in degrees\n";
            anglea = Methods.angleCalc (b, c, a);
            txt = txt + "Angle at A = "+Methods.eRemover (anglea) + " in degrees\n";
        //calculates the heights
                hc = Methods.heightCalc(a, b, c);
                hb = Methods.heightCalc(a, c, b);
                ha = Methods.heightCalc(b, c, a);
            txt = txt + "HA= " + Methods.eRemover (ha) + "\n";
            txt = txt + "HB= " + Methods.eRemover (hb) + "\n";
            txt = txt + "HC= " + Methods.eRemover (hc) + "\n";
        //calculates bisectors
            la = (b*c-((a*c)/(b+c))*((a*b)/(b+c)));
            la = Math.sqrt (la);
            txt = txt + "Bisector from A = "+Methods.eRemover(la)+"\n";
            lb=(a*c-((b*c)/(a+c))*((a*b)/(a+c)));
            lb = Math.sqrt (lb);
            txt = txt + "Bisector from B = "+Methods.eRemover(lb)+"\n";
            lc=(a*b-((b*c)/(a+b))*((a*c)/(a+b)));
            lc = Math.sqrt (lc);
            txt = txt + "Bisector from C = "+Methods.eRemover(lc)+"\n";
        //finds R
            sina = Methods.sinCalc(b, c, a);
            R=(a/sina)/2;
            txt = txt + "Radius = " + Methods.eRemover(R)+"\n";
        addHistory (txt, visual);
    }//Solves triangles based on three sides
    //opening other classes
    public void stbtn(){
        if (vis == true) new TriangleSolving().setVisible(true);
        else Methods.callError("Visual elements have been disabled in Settings");
    }//induces the class TriangleSolving
    public void fbtn(){
        if (vis == true) new FormulasDZI().setVisible(true);
        else Methods.callError("Visual elements have been disabled in Settings");
    }//induces the class FormulasDZI
    public void hbtn(){
        new Settings().setVisible(true);
    }//induces the class FormulasDZI
    //not implemented yet :(
    public static void help_old (){
    System.out.println("***HELP PAGE***");
    System.out.println("Unless stated otherwise, the program uses number variables. \nA non-numeric character(s) would cause an fatal error to occur");
    System.out.println("\nProgram Functions:");
    System.out.println("Name:           | How to call:");
    System.out.println("Addition        | +");
    System.out.println("Subtraction     | -");
    System.out.println("Multiplication  | *");
    System.out.println("Devision        | /");
    System.out.println("Power           | ^");
    System.out.println("Square root     | s/S");
    System.out.println("Quad. Equation  | q/Q");
    System.out.println("Biquad Equation | b/B");
    System.out.println("Exit Program    | e/E");
    System.out.println("This help page  | h/H/?");
    //System.out.println("");
    }
}
/*
Future functionality:
X>graphing triangles - implemented trough GraphFrame class
X>extended triangle solving - implemented trough TriangleSolving class
X>help page - implemented trough Settings class
X>keyboard inputs - implemented trough Textfield_Shortcuts
X>Graphing quadratic equations
X>Errors - implemented trough Error_window class
->Compiled for different platforms (.exe, .pkg, ...) + webJava + ANDROID?
->Advanced geometric solving
->Graph biquadratic equations
->Show current settings
->Shortcut Settings?
-->Fromulas - ДЗИ
->Settigs
->OPTIONAL: trigonometric
->decimal to SQRT conversion
X>Heights for tri1 method in MainWindow class
->Advanced Graphing?
*/

//Class Version 3.43
//Copyright Hristo Belchev and Svetoslav Berberski 2018