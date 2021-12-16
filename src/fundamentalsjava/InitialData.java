/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentalsjava;

import java.util.Scanner;

/**
 *
 * @author Steveen
 */
public class InitialData {

    public void dataInfo() {
        String name = "Steveen";
        Integer age = 25;
        Integer followInsta = 1523;
        Integer followYou = 663;

        System.out.println("Welcome to Maiven");
        if (age >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
        String sentence = "Hello, my name is " + name + " i have " + (followInsta + followYou) + " followers";
        System.out.println(sentence);

        Scanner keyboard = new Scanner(System.in);

        /**
         * Ingreso de informacion basica
         */
        int number;
        String fullName;
        float height;

        System.out.println("Ingrese un numero: ");
        number = keyboard.nextInt();

        System.out.println("Ingrese su nombre completo: ");
        fullName = keyboard.next();

        System.out.println("Ingrese su altura");
        height = keyboard.nextFloat();

        System.out.println("Tu numero es " + number);
        System.out.println("Tu nombre completo es " + fullName);
        System.out.println("Tu altura es: " + height);

    }
}
