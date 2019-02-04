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
public class QuadGraph extends JFrame {
    public static double version = 0.32;//version number for the developer mode of the settings class
    public static final int CANVAS_WIDTH  = 400;
    public static final int CANVAS_HEIGHT = 400;
    public static final int OFFSETX = 35;//horizontal offset for the zero point of the graph
    public static final int OFFSETY = CANVAS_HEIGHT - 50;//vertical offset for the zero point of the graph
    double scale = 1.0;//initial scale of graphed triangle
    public static boolean scaleable = true;//setting if the drawn shape should be scaled
    public static boolean labels = true;//setting if there should be labels on the graph
    public static boolean AA = true;//settings for anti-aliasing
    public static int labelDisplacement = 10;//how many pixels should the displacement of the labels in each direction be from the graph
    String txt = "";//String for holding the text in the text box of the frame
    public static boolean manScale = false;//if the scale of graph is manually set  
    public static int mScale = -1;//the scale set by the user
    public static double a = Methods.ATMP, b = Methods.BTMP, c = Methods.CTMP;//sides of triangle
    double vx = 0, vy = 0, y1 = 0, y2 = 0;
    public static double x1, x2;//to be set from MainWindow class
    
    private DrawCanvas canvas;
    public QuadGraph() {
        //jTextField1.setText(txt);
        setVisible(true);
        System.out.println ("QuadGraph Called");
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
        setTitle("Quadratic Equation Graph");
        //setResizable(false);
        setVisible(true);
   } 
    private class DrawCanvas extends JPanel {
    // Override paintComponent to perform your own painting
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        System.out.println ("QuadGraph paintComponent");
        if (AA == true){
        RenderingHints rh = new RenderingHints(
             RenderingHints.KEY_ANTIALIASING	,
             RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);}
        g.drawLine((int)CANVAS_WIDTH/2, (int)0, (int)CANVAS_WIDTH/2, (int)CANVAS_HEIGHT);
        g.drawLine((int)0, (int)CANVAS_HEIGHT/2, (int)CANVAS_WIDTH, (int)CANVAS_HEIGHT/2);
        if (labels == true)g.drawString("(0; 0)", (int)(CANVAS_WIDTH/2 + labelDisplacement), (int)(CANVAS_HEIGHT/2 + labelDisplacement*2));
        if (Methods.calQuadD(a, b, c)<0){
            g.drawString("EQUATION HAS NO \nREAL SOLUTIONS", (int)labelDisplacement, (int)labelDisplacement);
            Methods.callError("EQUATION HAS NO REAL SOLUTIONS");
        }
        else {
            if (a>0){
                //calculating bounds of graph
                calPoints();
                System.out.println("QuadGraph("+a+","+b+","+c+"), points:");
                double Dmax;
                Dmax = Methods.calQuadD(a, b, c-(CANVAS_HEIGHT/2));
                int xmin=(int)(((0-b)-Math.sqrt(Dmax))/(2*a));//lowest value
                int xmax=(int)(((0-b)+Math.sqrt(Dmax))/(2*a));//highest value
                System.out.println("Graphing between X = ("+(int)(xmin)+") and ("+(int)(xmax)+")-> "+Methods.absSub(xmin, xmax+2)+"/"+CANVAS_WIDTH+" calculations");
                //calculating initial values
                double tmp1 = Methods.quadS(a, b, c, -(CANVAS_HEIGHT / 2));
                int tmp2 = xmin;
                //calculating points and graphing them
                for (int i = xmin; i < xmax; i++ ){
                    double y1 = tmp1;
                    int xc1 = tmp2;

                    double y2 = Methods.quadS(a, b, c, (i+1));
                    int xc2 = i + CANVAS_WIDTH/2 + 1;

                    System.out.println("X:"+i+" Y:"+y1 + " X1:"+(i+1)+" Y1:"+y2);

                    g.drawLine(xc1, (int)y1 + CANVAS_HEIGHT/2, xc2, (int)y2 + CANVAS_HEIGHT/2);
                    tmp1 = y2;
                    tmp2 = xc2;
                }
                //drawing labels if enabled
                if (labels == true){
                    g.drawString("A= ("+Methods.eRemover(a)+") B= ("+Methods.eRemover(b)+") C= ("+Methods.eRemover(c)+")", (int)labelDisplacement, (int)labelDisplacement);
                    g.drawString("("+Methods.eRemover(vx)+"; "+Methods.eRemover(-vy)+")",(int) vx+CANVAS_WIDTH/2 - labelDisplacement,(int) vy+CANVAS_HEIGHT/2 - labelDisplacement);
                    g.drawString("("+Methods.eRemover(x1)+"; "+Methods.eRemover(y1)+")",(int) x1+CANVAS_WIDTH/2 + labelDisplacement,(int) y1+CANVAS_HEIGHT/2 + labelDisplacement);
                    g.drawString("("+Methods.eRemover(x2)+"; "+Methods.eRemover(y2)+")",(int) x2+CANVAS_WIDTH/2 - labelDisplacement,(int) y2+CANVAS_HEIGHT/2 - labelDisplacement);
                }
            }
            if (a<0){
                //calculating bounds of graph
                calPoints();
                System.out.println("QuadGraph("+a+","+b+","+c+"), points:");
                double Dmax;
                Dmax = Methods.calQuadD(a, b, c+(CANVAS_HEIGHT/2));
                int xmax=(int)(((0-b)-Math.sqrt(Dmax))/(2*a))+(int)(CANVAS_WIDTH*0.005);//highest value - ADJUSTED - old 0.025
                int xmin=(int)(((0-b)+Math.sqrt(Dmax))/(2*a));//lowest value
                System.out.println("Graphing between X = ("+(int)(xmin)+") and ("+(int)(xmax)+")-> "+Methods.absSub(xmin, xmax+2)+"/"+CANVAS_WIDTH+" calculations - ADJUSTED ALGORITHM");
                //calculating initial values
                double tmp1 = Methods.quadS(a, b, c, -(CANVAS_HEIGHT / 2));
                int tmp2 = xmin;
                //calculating points and graphing them
                for (int i = xmin; i < xmax; i++ ){
                    double y1 = tmp1;
                    int xc1 = tmp2;

                    double y2 = Methods.quadS(a, b, c, (i+1));
                    int xc2 = i + CANVAS_WIDTH/2 + 1;

                    System.out.println("X:"+i+" Y:"+y1 + " X1:"+(i+1)+" Y1:"+y2);

                    g.drawLine(xc1, (int)y1 + CANVAS_HEIGHT/2, xc2, (int)y2 + CANVAS_HEIGHT/2);
                    tmp1 = y2;
                    tmp2 = xc2;
                }
                if (labels == true){
                    g.drawString("A= ("+Methods.eRemover(a)+") B= ("+Methods.eRemover(b)+") C= ("+Methods.eRemover(c)+")", (int)labelDisplacement, (int)labelDisplacement);
                    g.drawString("("+Methods.eRemover(vx)+"; "+Methods.eRemover(-vy)+")",(int) vx+CANVAS_WIDTH/2 + labelDisplacement,(int) vy+CANVAS_HEIGHT/2 + labelDisplacement);
                    g.drawString("("+Methods.eRemover(x1)+"; "+Methods.eRemover(y1)+")",(int) x1+CANVAS_WIDTH/2 + labelDisplacement*2,(int) y1+CANVAS_HEIGHT/2 + labelDisplacement);
                    g.drawString("("+Methods.eRemover(x2)+"; "+Methods.eRemover(y2)+")",(int) x2+CANVAS_WIDTH/2 - labelDisplacement*4,(int) y2+CANVAS_HEIGHT/2 - labelDisplacement);
                }
            }
            if (a == 0){
                /*
                g.drawString("Functionaity for a=0\n not supported yet", (int)labelDisplacement, (int)labelDisplacement);
                Methods.callError("Functionaity for a=0 not supported yet");
                */
            }
        }
    }
   }
    public static void main(String[] args) {
      // Run the GUI codes on the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new QuadGraph(); 
         }
      });
   }
    //methods used for calculating the coordinates of various elements
    public void calPoints (){
        vx = -(b/(2*a));
        vy = Methods.quadS(a, b, c, vx);
        y1 = Methods.quadS(a, b, c, x1);
        y2 = Methods.quadS(a, b, c, x2);
    }//method that calculates the points to draw based on the lenghts of the sides of the trianle
}


//algorithm for bounds of graph has to be reworked

//Class Version 0.32
//Copyright Hristo Belchev and Svetoslav Berberski 2018