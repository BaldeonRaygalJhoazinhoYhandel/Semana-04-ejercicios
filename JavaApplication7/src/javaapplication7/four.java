/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;
import java.Util.Scanner; 
/**
 *
 * @author LAB-USR-LNORTE
 */
public class four {
   Scanner Lector = new Scanner (System.in);
        
         int opcion, boletas, mes;
         String nombre, Templeado;
         double salario;
        
        String menu = """
                      1. Ingrese el nombre del empleado.
                      2. Salario.
                      3. Imprimir.
                      4. Salir.
                      Ingresa una opción: 
                      """;
        do { 
            
            System.out.println(menu);
            opcion = Lector.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println("Ingrese el nombre");
                    
                    Lector.nextLine();
                    nombre = Lector.nextLine();
                    
                    System.out.println("Ingrese el tipo de empleado " + "(Contrato nombrado)");
                    Templeado = Lector.nextLine();
                }
 }
                case 3 -> {}
                case 4 -> {}
                default -> {}
            }
            
        } while (opcion != 4);
  
    }
}
case 2 -> {
                    System.out.println("Ingrese el salario mensual: ");
                    Lector.nextLine();
                    salario = Lector.nextDouble();
                    
                    System.out.println("Ingrese el numero de boletas: ");
                    boletas = Lector.nextInt();
                    
                    System.out.println("Ingrese el numero del mes en curso: ");
                    mes = Lector.nextInt();x