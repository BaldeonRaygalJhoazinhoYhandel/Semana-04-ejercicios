/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;
import java.util.regex.Pattern;
/** 
 *
 * @author LAB-USR-LNORTE
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        String menu="""
                    ####################################
                    #              MENU                #
                    ####################################
                    #1.-Ingresa empleado               #
                    #2.-Ingresa Salario                #
                    #3.-Emitir boleta                  #
                    #4.-Salir                          #
                    ####################################
                    Ingrese una opcion:
                    """;
        int opcion;
        String nombre,apellido;
        Pattern nombresPatron=Pattern.compile("^[A-Za-z\\s]+$");
         
        do{
            System.out.println(menu);
            opcion=lector.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el nombre");
                    lector.nextLine();
                    nombre=lector.nextLine();
                    if(!nombresPatron.matcher(nombre).matches()){
                        System.out.println("Nombre invalido");
                        continue;
                    }
                    do{
                        System.out.println("Ingresa apellido");
                        apellido=lector.nextLine();
                        
                        if(!nombresPatron.matcher(apellido).matches()){
                        System.out.println("Solo acepta letras, ingresa nuevamente");
                        }
                    }while (!nombresPatron.matcher(apellido).matches());
                    break;
                case 2:
                    System.out.println("Ingresa salario");
                    break;
                case 3:
                    System.out.println("Emitir boleta");
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(opcion!=4 );
            lector.close();
        }
        }
