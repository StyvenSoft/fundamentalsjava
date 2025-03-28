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
public class TypeOfData {

    public void numbersPrimitive() {
        /**
         * Tipos de datos primitivos: byte, short, int, long
         */
        byte numberByte = 10;
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo: " + Byte.MAX_VALUE);

        System.out.println("Valor ejemplo: " + numberByte);

        short numberShort = 327;
        System.out.println("numberShort = " + numberShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numberInt = 1622;
        System.out.println("numberInt = " + numberInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MIN_VALUE);

        long numberLong = 16542;
        System.out.println("numberLong = " + numberLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
        /**
         * Tipos de datos primitivos tipo flotante: float, double
         */
        
        float numberFloat = 10.5F;
        System.out.println("numberFloat = " + numberFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);        
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numberDouble = 16;
        System.out.println("numberDouble = " + numberDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
        
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varcharDecimal = 33;
        System.out.println("varcharDecimal = " + varcharDecimal);
        
        char caracterB = 'B';
        System.out.println("caracterB = " + caracterB);
        
        char varSimbol = '!';
        System.out.println("varSimbol = " + varSimbol);
        
        var varCharOne = '\u0021';
        System.out.println("varCharOne = " + varCharOne);
        
        int varEnteraSimbol = '#';
        System.out.println("varEnteraSimbol = " + varEnteraSimbol);
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var age = 30;
        var isAdult = age >= 18;
        
        if(isAdult) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menos de edad");
        }
        
        // Convertir tipo String a un tipo int
        var edad = Integer.parseInt("25");
        
        System.out.println("edad = " + (edad + 4));
        
        var valuePI = Double.parseDouble("3.1416");
        
        System.out.println("valuePI = " + valuePI);
        
        // Solicitar un valor
        
        var console = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad = Integer.parseInt(console.nextLine());
        System.out.println("Edad: " + edad);
        
        // Converir un tipo int a String
        
        var ageText = String.valueOf(10);
        System.out.println("ageText = " + ageText);
        
    }
}
