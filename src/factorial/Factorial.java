package factorial;

import javax.swing.JOptionPane;


public class Factorial {


    public static void main(String[] args) {


    
    int j = Integer.parseInt(JOptionPane.showInputDialog("Introduce un Valor para J"));
   
    System.out.println(calculo(j));
    }

    public static int calculo(int j) {
       
        int i ,cal;
       
        if (j == 0) {
        cal = 1;
        }
        else {
       cal = 1;
        
       for (i = j; i >= 1; i--) {
        cal = cal * i;
           
       }
       
        }
        return cal;
    
    }
    
}
