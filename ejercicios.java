
package Actividad;

import javax.swing.JOptionPane;

public class ejercicios {
   
    //atributos
    int nota1;
    int nota2;
    int nota3;
    int mayor;
    int menor;
    int intermedio;
    
    //creaciòn de los metodos
    public void pedirCalificaciones(){
    
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite tu primera nota: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("digita tu segunda nota: "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("digita tu tercera nota: "));
    } 

    public void primeraNota(){ 
        
System.out.println("tus calificaciones son: ");

 if(nota1>=0 && nota1<3)
 System.out.println(nota1 + " = INSUFICIENTE");
 else
 if(nota1>3 && nota1<=5)
 System.out.println(nota1 + " = SUFICIENTE");
    }

    public void segundaNota(){
        if (nota2 >=0 && nota2<3)
            System.out.println( nota2 + " = INSUFICIENTE");
        else
            if (nota2>=3 && nota2<=5 )
                System.out.println(nota2 + " = SUFICIENTE");
    }
    
    public void terceraNota(){
      if (nota3 >=0 && nota3<3)
          System.out.println(nota3 + " = INSUFICIENTE");
      else 
          if(nota3>=3 && nota3<=5 )
              System.out.println(nota3 + " = SUFICIENTE"); 
    }

public void mayorOmenor (){
    
     if(nota1 > nota2 && nota1 > nota3){
            mayor= nota1;
            
            if(nota1 > nota3){
                    
            intermedio = nota3;
            menor = nota2;
                }else{
                
                 intermedio = nota2;
                    menor = nota3;
                }
        }
     
            System.out.println("");
            System.out.println("La nota mayor es : "+ mayor);
            System.out.println("La nota intermedio es: "+ intermedio);
            System.out.println("La nota menor es: "+ menor);
        
        if(nota2 > nota1 && nota2 > nota3){
            mayor= nota2;
            if(nota1 > nota3){
                    
            intermedio = nota1;
            menor = nota3;
                }else{
                
                intermedio = nota3;
                menor = nota1;
            }
            
            System.out.println("");
            System.out.println(" La nota mayor es : "+ mayor);
            System.out.println("La nota intermedio es: "+ intermedio);
            System.out.println("La nota menor es: "+ menor);
                                
        }
        
        if(nota3 > nota1 && nota3 > nota2){
            mayor= nota3;
            if(nota2 > nota1){
                    
            intermedio = nota2;
            menor = nota1;
                }else{
                    
                    intermedio = nota1;
                    menor = nota2;
                }
            System.out.println("");
            System.out.println(" La nota mayor es : "+ mayor);
            System.out.println("La nota intermedio es: "+ intermedio);
            System.out.println("La nota menor es: "+ menor);  
                    
   } 
 }
}

