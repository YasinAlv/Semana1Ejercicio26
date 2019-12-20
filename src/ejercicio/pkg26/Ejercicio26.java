/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg26;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         Scanner Teclado = new Scanner(System.in);
        int Num, suma=0, contador;

        System.out.println("Digite un número: ");
        Num = Teclado.nextInt();
        contador=Num;
        
        while (contador != 0)
        {
          suma=suma+contador;
          contador--;
        
        }
 
        System.out.println("La sumatoria de todos los numeros hasta 1 es de: "+suma);
    }
    
}
