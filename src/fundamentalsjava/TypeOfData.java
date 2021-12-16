/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentalsjava;

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
        
    }
}
