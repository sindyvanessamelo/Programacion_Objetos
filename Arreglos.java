
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos {

public static void main(String[] args) {
   
//sirve para lectura de datos 
Scanner entrada = new Scanner (System.in);

int nElementos;

//solicitar 
nElementos =Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos que desea"));

//creación de arreglo 
char [] letras = new char [nElementos];

System.out.println("Digita cada uno de los elementos del arreglo: ");
for(int i=0; i<nElementos; i++){
System.out.println((i+1)+". digita caracter: " );
letras [i] = entrada.next().charAt (0);
}

System.out.println(" Los caracteres del arreglo son: ");
for(int i = 0; i < nElementos;i++){
System.out.println(letras[i]);
  }
 }
}
