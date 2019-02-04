/*
    contact info: hristob1999@gmail.com
    copyright January 2018 @ Hristo Belchev
    Part of the Universal Calculator Package
 */
package SI_Calc;

import java.awt.*;
import javax.swing.*;    
/*
    Made by Hristo Belchev and Svetoslav Berberski
 */
public class GraphFrame extends JFrame {
    public static double version = 1.4;
    public static final int CANVAS_WIDTH  = 400;
    public static final int CANVAS_HEIGHT = 400;
    public static final int OFFSETX = 35;//horizontal offset for the zero point of the graph
    public static final int OFFSETY = CANVAS_HEIGHT - 50;//vertical offset for the zero point of the graph
    double a = Methods.ATMP, b = Methods.BTMP, c = Methods.CTMP;//sides of triangle
    double scale = 1.0;//initial scale of graphed triangle
    public static boolean scaleable = true;//setting if the drawn shape should be scaled
    public static int maxScale = 50;//sets the maximum scale of a triangle
    public static boolean labels = true;//setting if there should be labels on the graph
    public static boolean AA = true;//settings for anti-aliasing
    public static int labelDisplacement = 10;//how many pixels should the displacement of the labels in each direction be from the graph
    double xa = 0, ya = 0, xb = 0, yb = 0, xc = 0, yc = 0, alabelx = 0, blabelx = 0, clabelx = 0, alabely = 0, blabely = 0, clabely = 0;//coordinates of points of triangle 
    String txt = "";//String for holding the text in the text box of the frame
    public static boolean manScale = false;//if the scale of graph is manually set  
    public static int mScale = -1;//the scale set by the user
    private DrawCanvas canvas;
    public GraphFrame() {
        //jTextField1.setText(txt);
        setVisible(true);
        System.out.println ("GraphingForm Called");
        txt += " A = " + Methods.eRemover (a); System.out.println (a);
        txt += " B = " + Methods.eRemover (b); System.out.println (b);
        txt += " C = " + Methods.eRemover (c); System.out.println (c);
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        Container cp = getContentPane();
        cp.add(canvas);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);
        pack();
        setTitle("Triangle Graph");
        //setResizable(false);
        setVisible(true);
   } 
    private class DrawCanvas extends JPanel {
    // Override paintComponent to perform your own painting
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if (AA == true){
        RenderingHints rh = new RenderingHints(
             RenderingHints.KEY_ANTIALIASING	,
             RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);}
        System.out.println ("GraphFrame paintComponent");
        if (Methods.isTriangle(a, b, c) == false){
            System.out.println ("Invalid triangle for drawing");
            g.drawString("Non-valid values", labelDisplacement, labelDisplacement);
        }
        else{
        calPoints();
        g.setColor(Color.BLACK);
        g.drawLine((int)xa, (int)ya, (int)xb, (int)yb);
        g.drawLine((int)xa, (int)ya, (int)xc, (int)yc);
        g.drawLine((int)xb, (int)yb, (int)xc, (int)yc);
        if (!manScale) g.drawString ("Scale: "+Methods.eRemover(scale), labelDisplacement, labelDisplacement);
        else g.drawString ("Manual scale: "+Methods.eRemover(scale), labelDisplacement, labelDisplacement);
        if (labels == true){
            g.drawString("A", (int)xa, (int)(ya + 15));
            g.drawString("B", (int)xb, (int)(yb + 15));
            g.drawString("C", (int)xc, (int)(yc - 5));
            g.drawString("A = "+Methods.eRemover(a), (int)alabelx, (int)alabely);
            g.drawString("B = "+Methods.eRemover(b), (int)blabelx, (int)blabely);
            g.drawString("C = "+Methods.eRemover(c), (int)clabelx, (int)clabely);
        }
    }
    }
   }
    public static void main(String[] args) {
      // Run the GUI codes on the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new GraphFrame(); 
         }
      });
   }
    //methods used for calculating the coordinates of various elements
    public void calPoints (){
        System.out.println ("GraphFrame calcPoints");
        xa = OFFSETX;
        ya = OFFSETY;
        xb = xa + c;
        yb = ya;
        double h = Methods.heightCalc(a, b, c);
        xc = xa + Math.sqrt(Math.pow(b,2) - Math.pow(h, 2));
        //xc = xa + (Methods.cosCalc(b, c, a)*b);
        yc = ya - h;
        //yc = ya  - (Methods.sinCalc(b, c, a)*b);
        System.out.println ("Coordinates:\nA: "+xa+":"+ya+"\nB: "+xb+":"+yb+"\nC: "+xc+":"+yc);
        if (scaleable == true) scalePoints();
        if (labels == true) calLabelCoordinates();
    }//method that calculates the points to draw based on the lenghts of the sides of the drianle
    public void scalePoints(){
            calScale();
            double lenC = xb - xa;
            double lenH = xc - xa;
            double H = yc - ya;
            lenC = lenC * scale;
            xb = xa + lenC;
            lenH = lenH * scale;
            xc = xa + lenH;
            H = H * scale;
            yc = ya + H;
            System.out.println ("Scaled coordinates:\nA: "+xa+":"+ya+"\nB: "+xb+":"+yb+"\nC: "+xc+":"+yc+"\nscale: "+scale);
    }//method that scales the triangle to fill the window
    public void calLabelCoordinates(){
       alabelx = ((xb + xc) / 2) - labelDisplacement;
       alabely = ((yb + yc) / 2) - labelDisplacement;
       blabelx = ((xc - xa) / 2) - labelDisplacement;
       blabely = ((ya + yc) / 2) - labelDisplacement;
       clabelx = ((xb - xa) / 2);
       clabely = ya + labelDisplacement;
   } //calculates the coordinates for the labels on the graph
    public void calScale (){
        if (manScale == false){
            if ((xa+xb)>(xa+xc)) scale = (CANVAS_WIDTH - 2*OFFSETX)/(xb - xa);
            else scale = (CANVAS_WIDTH - 2*OFFSETX)/(xc - xa);
            if ((yc - ya)*scale + OFFSETY < 25){
                scale = -(OFFSETY-30)/(yc-ya);
            }
            if (scale > maxScale) scale = maxScale;
        }
        else {
            scale = mScale;
        }
    }//calculates the scale such that the graph does not extend beyond the window
}

//Class Version 1.4
//Copyright Hristo Belchev and Svetoslav Berberski 2018