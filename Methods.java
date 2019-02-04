/*
    contact info: hristob1999@gmail.com
    copyright January 2018 @ Hristo Belchev
    Part of the Universal Calculator Package
 */
package SI_Calc;
/*
    Made by Hristo Belchev and Svetoslav Berberski
 */
public class Methods{
    public static double version = 1.91;//version number for the developer mode of the settings class
    static int acc_default = 5;//default setting for how many numbers after the decimal point (including it) to keep
    static int acc = acc_default;//how many numbers after the decimal point (including it) to keep
    public static boolean decToSQRT = false;//if decimal numbers should be converted to SQRT numbers
    public static double ATMP = 0, BTMP = 0, CTMP = 0;//interface variables used to store values passed between classes
    public static void mainSettings(boolean vis, boolean nullcheck){
        MainWindow.vis = vis;//whether the main window should output to history
        MainWindow.nullch = nullcheck;//whether the main window should check for null inputs
        //default settings: (true, true);
    }//a method to change the settings of main window
    public static void graphSettings(boolean scaleable, int maxscale, boolean labels, boolean aa, int labelDisplacement, int manScale){
        GraphFrame.scaleable = scaleable;//whether the graphing panel should scale graphics
        if (maxscale != -1) GraphFrame.maxScale = maxscale;//the maximum scale a graph can have in the graphing window
        GraphFrame.labels = labels;//whether the graphing panel should show labels on the graph
        QuadGraph.labels = labels;//whether the quadratic equation graphing panel should show labels on the graph
        GraphFrame.AA = aa;//whether the triangle graph should be anti-aliased
        QuadGraph.AA = aa;//whether the quadratic equation graph should be anti-aliased
        if (labelDisplacement != -1) GraphFrame.labelDisplacement = labelDisplacement;//how many pixels should the displacement of the labels in each direction be from the graph 
        if (manScale <= 0){
            GraphFrame.mScale = -1;
            GraphFrame.manScale = false;
        }
        else {
            GraphFrame.mScale = manScale;
            GraphFrame.manScale = true;
        }
        //default settings: (true, 50, true, true, 10, -1);
    }//a method to change the settings of the graphing window
    public static void callError(String txt){
        Error_window.text = txt;
        new Error_window().setVisible(true);
    }
    //methods for procedural functions
    public static boolean numCheck (String txt){
        System.out.println ("\nMethods Class numCheck");
        int dot_count = 0, E_count = 0, minus_count = 0;
        boolean flag = false;
        if (txt.equals("Infinity") == true) {
            return true;
        }
        if (txt.equals("NaN") == true) {
            return true;
        }
        for (int i = 0; i<txt.length(); i++){
           if (txt.charAt(i) != '1' || txt.charAt(i) != '2' || txt.charAt(i) != '3' || txt.charAt(i) != '4' || txt.charAt(i) != '5' || txt.charAt(i) !=  '6' || txt.charAt(i) != '7' || txt.charAt(i) != '8' || txt.charAt(i) != '9' || txt.charAt(i) != '0'){
               flag = true;
           }
           if (txt.charAt(i) == 'E'){
               E_count++;
               if (E_count > 1){
                   flag = false;
                   break;
               }
           }
           if (txt.charAt(i) == '.'){
               dot_count++;
               if (dot_count>1){
                   flag = false;
                   break;
               }
           }
           if (txt.charAt(i) == '-'){
               minus_count++;
               if (minus_count>1){
                   flag = false;
                   break;
               }
           }
        }
        if (flag==false){
            System.out.println("String " + txt + " is not a number");
        }
        return flag;
    }//cheks if a string is a valid number
    public static String eRemover (double a){
        System.out.print ("\nMethods Class eRemover\nDouble "+a+" converted to: ");
        String txt = Double.toString(a);
        int index = -1;
        int index2 = -1;
        //find position of 'E', if none, index = -1     
        for (int i = 0; i<txt.length(); i++){
            if (txt.charAt(i) == 'E'){
                index = i;
            }
        }
        //finds position of '.', if none index2 = -1
        for (int i = 0; i<txt.length(); i++){
            if (txt.charAt(i) == '.'){
                index2 = i;
            }
        }
        //leaves acc numbers after the decimal point (acc is a global variable) 
        if (index2 != -1){
            int len = 0;
            if (index != -1){
                len = index - index2;
                if (len > acc){
                    txt = txt.substring (0, (index2) + acc) + txt.substring (index, txt.length());
                    txt = '~' + txt;
                }
            }
            else {
                len = txt.length() - index2;
                if (len > acc){
                    txt = txt.substring (0, (index2) + acc);
                    txt = '~' + txt;
                }
            }
        }
        //replace "E" with "*10^"; if none - returns original - DOES NOT WORK PROPERLY
        /*if (index != -1){
           
                txt = txt.substring(0, index - 1) + "*10^" + txt.substring(index+1, txt.length());
                txt = '(' + txt + ')';
        }*/
        //checks if number is out of range
        if (txt.equals("Infinity") == true){
            txt = "N/R";
            return txt;
        }
        if (txt.equals("NaN") == true){
            txt = "No Value/Math Error";
            return txt;
        }
        System.out.print(txt+"\n");
        return txt;
    }//Makes numbers human-readable
    public static String eRemover2 (double a){
        String txt = (eRemover(a));
        if (txt.charAt(0) == '~'){
            txt = txt.substring (1, txt.length());
        }
        return txt;
    }//Makes numbers human-readable but without the ~ at the beggining
    public static String hotkeySymRemover (String txt){
        int k = -1;
        for (int i = 0; i < txt.length(); i++){
        if (txt.charAt(i) == '*' || txt.charAt(i) == '/' || txt.charAt(i) == '+' || txt.charAt(i) == 'x' || txt.charAt(i) == 'X' || txt.charAt(i) == 'y' || txt.charAt(i) == 'Y' || txt.charAt(i) == 'z' || txt.charAt(i) == 'Z' || txt.charAt(i) == 't' || txt.charAt(i) == 'T' || txt.charAt(i) == 'q' || txt.charAt(i) == 'Q' || txt.charAt(i) == 'b' || txt.charAt(i) == 'B' || txt.charAt(i) == 'ь' || txt.charAt(i) == 'Ь' || txt.charAt(i) == 'ъ' || txt.charAt(i) == 'Ъ' || txt.charAt(i) == 'з' || txt.charAt(i) == 'З' || txt.charAt(i) == 'т' || txt.charAt(i) == 'Т' || txt.charAt(i) == 'я' || txt.charAt(i) == 'Я' || txt.charAt(i) == 'б' || txt.charAt(i) == 'Б' || txt.charAt(i) == 'а' || txt.charAt(i) == 'А' || txt.charAt(i) == 'ц' || txt.charAt(i) == 'Ц' || txt.charAt(i) == 'S' || txt.charAt(i) == 's' || txt.charAt(i) == 'С' || txt.charAt(i) == 'с' || txt.charAt(i) == '?'|| txt.charAt(i) == 'H' || txt.charAt(i) == 'h' || txt.charAt(i) == 'Х' || txt.charAt(i) == 'х' || txt.charAt(i) == '^' || txt.charAt(i) == 'f' || txt.charAt(i) == 'F' || txt.charAt(i) == 'ф' || txt.charAt(i) == 'Ф'){
            k = i;
            //(txt.charAt(i) == '-')
        }}
        txt = txt.substring ((k+1), txt.length());
        return txt;
    }//removes symbols used for hotkeys from the string
    public static boolean isTriangle (double a, double b, double c){
        return !((c>a+b)||(b>a+c)||(a>c+b)||(a<=0)||(b<=0)||(c<=0));
    }
    //for the angle, cos and sin calcs, the side opposite of the angle goes last, the order of the other two does not matter
    public static double angleCalc (double a, double b, double c){
        System.out.println ("Methods Class angleCalc: "+a+" "+b+" "+c);
        return Math.acos(cosCalc (a, b, c)) * (180/Math.PI);//angle opposite of c
    }//returns angles in degrees from given three sides
    public static double cosCalc (double a, double b, double c){
        System.out.println ("Methods Class cosCalc: "+a+" "+b+" "+c);
        return (a*a+b*b-c*c)/(2*a*b);//angle opposite of c
    }//returns the decimal value of a cos from given three sides
    public static double sinCalc (double a, double b, double c){
        System.out.println("Methods Class sinCalc: "+a+" "+b+" "+c);
        return Math.sqrt (1 - Math.pow(cosCalc (a, b, c), 2));//angle opposite of c
    }//returns the decimal value of a sin from given three sides
    public static double tanCalc (double a, double b, double c){
        System.out.println("Methods Class tanCalc: "+a+" "+b+" "+c);
        return (sinCalc(a, b, c)/cosCalc (a, b, c));//angle opposite of c
    }//returns the decimal value of a tan from given three sides
    public static double cotanCalc (double a, double b, double c){
        System.out.println("Methods Class cotanCalc: "+a+" "+b+" "+c);
        return (cosCalc(a, b, c)/sinCalc(a, b, c));//angle opposite of c
    }//returns the decimal value of a cotan from given three sides
    public static double areaCalc (double a, double b, double c){
        System.out.println("Methods Class areaCalc: "+a+" "+b+" "+c);
        double p = ((a+b+c)/2);
        return Math.sqrt ((p*(p-a)*(p-b)*(p-c)));
    }//calculates and returns the area of a triangle based on three sides
    public static double heightCalc (double a, double b, double c){
        System.out.println("Methods Class heightCalc: "+a+" "+b+" "+c);
        return (2*(areaCalc (a, b, c)))/c;
    }//calculates and returns the height of a triangle based on three sides
    public static double cosTheoCalc (double a, double b, double angle){
        System.out.println("Methods Class cosTheoCalc: "+a+" "+b+" "+angle);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(angle)));
    }//calculates the third side of a triangle based on two sides and an angle between those two side in degrees
    public static double quadS (double a, double b, double c, double x){
        return -(a*Math.pow(x, 2) + b*x + c);//currently behaving normally, but - in beggining shouldn't be needed
    }//calculates a quadratic equation with given ALL parameters
    public static double calQuadD (double a, double b, double c){
        return (b*b)-(4*a*c);
    }//calculates the descriminant of a quadratic equation based on the parameters
    public static double abs (double a){
        if (a<0) return -a;
        else return a;
    }//returns the absolute value of a variable
    public static double absAdd (double a, double b){
        return abs(abs(a)+abs(b));
    }//adds the absolute values of two numbers and returns an absolute
    public static double absSub (double a, double b){
        return abs(abs(a)-abs(b));
    }//subtracts the absoulute values of two numbers and returns an absolute
    public static String decSQRT (String txt){
       System.out.println("\ndecSQRT @ Methods: Source: "+txt);
        if (decToSQRT == false || numCheck(txt) == false){
            System.out.println("\nFailed: decToSQRT = "+decToSQRT+" numCheck = "+numCheck(txt));
            return txt;
        }
        else{
            double num = Double.parseDouble(txt);
            String temp;
            for (double i = 1; i < 100; i++){
                if (wholeNumberCheck(num/Math.sqrt(i))){
                   txt =  "√"+i+"*"+num/Math.sqrt(i);
                }
            }
            return txt;
        }
    }//converts decimal numbers to radicals
    public static boolean wholeNumberCheck (double a){
        String txt = Double.toString(a);
        return (txt.substring (txt.length()-1, txt.length()).equals(".0"));
    }//checks if an number is an whole number
}
/*
Known bugs:
-> method eRemover has a bug where numbers in the format __E__ do not get reformated properly - not catastrophic
--> functionality has been disabled
*/

//Class Version 1.91
//Copyright Hristo Belchev and Svetoslav Berberski 2018