
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Boletin9_2 {

    public static void main(String[] args) {
  double i = 10;
  double suma = 0;
  double producto = 1;
  for(i=10; i<=90; i++){
  suma=suma+i;
  producto = producto*i;   
  
  }
  JOptionPane.showMessageDialog(null,"resultado suma = "+ suma);
  JOptionPane.showMessageDialog(null,"resultado producto = "+ producto);
    }
    
}
