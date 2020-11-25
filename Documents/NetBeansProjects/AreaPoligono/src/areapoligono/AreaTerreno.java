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
public class AreaTerreno {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaracion e inicializacion de variables
        double ac, b, ar, at, area;
        
        ac = 0; b = 0; ar = 0; at = 0; area = 0;
        
        // Lectura de datos 
        
        System.out.println(" Ingrese la altura del rectángulo");
        ac = leer.nextDouble();
        
        System.out.println(" Ingrese la base del rectángulo");
        b = leer.nextDouble();
        
        // Proceso
        ar = (ac * b);
        at = (ac * b) / 2;
        area = (ar + at);
        
        // Salida
        System.out.println(" El área del terreno es:" +area+", compuesto por un triangulo y un rectangulo de altura\n" +ac+", y un triangulo y rectangulo de base " +b);
    }
    
}
