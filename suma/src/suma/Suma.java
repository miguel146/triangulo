/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        double a,b,c,p;
        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        a = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        b = sc.nextDouble();
        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        c = sc.nextDouble();
        p = (a+b+c)/2;
    System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    System.out.println("este es mi primer programa suvido en subversion");
    }
    
}
