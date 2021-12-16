/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentalsjava;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Operators {

    public void arithmetic() {
        /**
         * Operadores aritmeticos
         */
        Scanner keyNumbers = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.println("Ingrese el primer numero: ");
        numberOne = keyNumbers.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numberTwo = keyNumbers.nextInt();

        System.out.println("");

        int sum = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiply = numberOne * numberTwo;
        int division = numberOne / numberTwo;

        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + subtraction);
        System.out.println("La multiplicacion es: " + multiply);
        System.out.println("La division es: " + division);
        
    }
}
