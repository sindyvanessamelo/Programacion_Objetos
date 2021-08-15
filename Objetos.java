
package Actividad;

public class Objetos {
    String marca;
    String color;
    String tipo;
    int cantidad;
    
    public static void main (String [] args){
    
   Objetos computador = new Objetos();
   
   computador.color = "negro";
   computador.marca = "Compag";
   computador.tipo = "computador de mesa";
   computador.cantidad = 1;
   
    System.out.println("El primer objeto es un computador");
   System.out.println("\nLa marca del computador es: " +computador.marca );
   System.out.println("El color del computador es: " +computador.color);
   System.out.println("El tipo de computador es de: "+computador.tipo);
   System.out.println("La cantidad de computadores son: "+computador.cantidad);
   
   Objetos impresora = new Objetos ();
 
   impresora.marca = "Epson";
   impresora.color = "blanco";
   impresora.tipo = "impresora de inyecciòn multifuncional";
   impresora.cantidad = 2;
   
   System.out.println("\n El segundo objeto es una impresora");
   System.out.println("\nLa marca de la impresora es: " +impresora.marca);
   System.out.println("El color de la impresora es: "+impresora.color);
   System.out.println("El tipo de la impresora es: "+impresora.tipo);
   System.out.println("La cantidad de impresoras son:" + impresora.cantidad);
   
   Objetos celular = new Objetos();
   
   celular.marca = "samsung";
   celular.color = "azulado";
   celular.tipo = "segunda generaciòn";
   celular.cantidad = 3;
   
    System.out.println("\n El tercer objeto es un celular");
   System.out.println("\nLa marca del celular es: " +celular.marca);
   System.out.println("El color del celular es: " +celular.color);
   System.out.println("El tipo de celular es: " +celular.tipo);
   System.out.println("La cantidad de celulares son:" + celular.cantidad);
   
    }   
}
