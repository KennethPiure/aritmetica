/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetic;

import java.util.Scanner;

/**
 *
 * @author Kenneth
 */
public class Aritmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el primer valor: \t");
        Scanner valor1 = new Scanner(System.in);
        int numero1 = valor1.nextInt();
        System.out.println("\nIntroduzca el segundo valor: \t");
        Scanner valor2 = new Scanner(System.in);
        int numero2 = valor2.nextInt();
        
        int suma = numero1+numero2;
        int resta = (numero1-numero2);
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        int modulo = numero1%numero2;
        
        System.out.println("suma: "+suma);
        System.out.println("resta: "+resta);
        System.out.println("multiplicacion: "+multiplicacion);
        System.out.println("division: "+division);
        System.out.println("modulo: "+modulo);
        
    }
    
}
