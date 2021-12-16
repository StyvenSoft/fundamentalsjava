/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentalsjava;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class FundamentalsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is a fundamentals JAVA");

        /**
         * Tipos de datos primitivos
         */
        int configureOne = 452;
        System.out.println("Value initil: " + configureOne);

        configureOne = 225;
        System.out.println("Value end: " + configureOne);

        String machineCurrent = "Pc Acer";
        System.out.println("The machine current: " + machineCurrent);

        String osCurrent = "Windows 10";
        System.out.println("The OS current: " + osCurrent);

        var numberIndicator = 625;
        System.out.println("The indicator is: " + numberIndicator);

        var nameProblem = "Conflict";
        // SOUTV
        System.out.println("The name problem is: " + nameProblem);

        /**
         * Nombre de Variables permitidas
         *
         * var miVariable; var _miVariable; var $miVariable;
         */
        var user = "Steveen";
        var proffesion = "Ingeniero";

        var union = proffesion + " " + user;
        System.out.println("Information: " + union);

        var i = 3;
        var j = 6;
        // contexto cadena
        System.out.println("Suma: " + (i + j)); // Uso de parentesis modifican la prioridad
        System.out.println(i + j + user); // Evalua de isq a der, realiza suma
        System.out.println(user + i + j); // Contexto cadena todo es una cadena

        var nameConst = "PROCESS";

        System.out.println("Nombre de constante: \n" + nameConst); // Salto de linea
        System.out.println("Nombre de constante: \t" + nameConst); // Tabulador
        System.out.println("Nombre de constante: \b" + nameConst); // Retroceso
        System.out.println("Nombre de constante: \'" + nameConst + "\'"); // Escapar comilla simple
        System.out.println("Nombre de constante: \"" + nameConst + "\""); // Escapar comilla doble

        Operators oneOperator = new Operators();
        oneOperator.arithmetic();
        
        System.out.println("Ingresa tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var username = consola.nextLine();
        System.out.println("The username is: " + username);
    }

}
