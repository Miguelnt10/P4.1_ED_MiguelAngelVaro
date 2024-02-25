/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoragit;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class CalculadoraGit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Esto es una CALCULADORA.");
        System.out.println("Indica los numeros que quieres suamar y restar");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sumar(num1, num2);
        restar(num1,num2);
    }

    private static void sumar(int num1, int num2) {
        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
    }

    private static void restar(int num1, int num2) {
        System.out.println("La resta de los dos numeros es: " + (num1 - num2));
    }
}
