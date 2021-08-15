
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio {
   
  public static void main(String[] args) {
    
      String nombres;
     
           
  Scanner entrada = new Scanner(System.in);
  int cantidad;
  JOptionPane.showMessageDialog(null, "****¡hola, hoy vamos a crear su playlist favorita!****");
  cantidad =Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de canciones que desee en la playlist: "));
 
  String canciones[] = new String [cantidad];
  
  for (int i =0; i < cantidad; i++){
      System.out.println("\n ingrese el nombre de la canción Nª "+(i+1));
 nombres=entrada.next();
canciones[i]=nombres;  
  
  }
 System.out.println("**** tu playlist favorita quedo: ****");
  for (int i = 0; i<canciones.length;i++){
      System.out.println("\n canción Nª "+(i+1)+ ":" + canciones[i]);
  }
  
 System.out.println("\n disfrutalo");
  }
}


