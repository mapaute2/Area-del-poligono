/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class LeerDatos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaracion e inicializar las variables
        
        int miEntero = 0;
        double miDecimal = 0;
        String miCadena = "";
        
        System.out.println("Ingrese un numero entero");
        miEntero = leer.nextInt();
        
        System.out.println("Ingrese un numero decimal");
        miDecimal = leer.nextDouble();
        
        System.out.println("ingrese una cadena de texto");
        miCadena = leer.next();
        
       // Salida de datos
       
        System.out.println(" Mi entero es: "+miEntero);
        System.out.println(" Mi decimal es: "+miDecimal);
        System.out.println(" Mi cadena es: "+miCadena);
        
        
        
                
         
        
        
        
       
    }
        
    }
    
    

