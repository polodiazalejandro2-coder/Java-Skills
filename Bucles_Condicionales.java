/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice05;
/**
 *
 * @author alejandropoldia
 */
import java.util.Scanner;
public class Bucles_Condicionales {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        showMenu();
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                exercise1();
                break;
            case 2:
                exercise2();
                break;
            case 3:
                exercise3();
                break;
            case 4:
                exercise4();
                break;
            case 5:
                exercise5();
                break;
            case 6:
                exercise6();
                break;
            case 7:
                exercise7();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public static void showMenu() {
        System.out.println("=== Menu chingon ===");
        System.out.println("-Exercise 1 - Sum of digits");
        System.out.println("-Exercise 2 - Count character");
        System.out.println("-Exercise 3 - Diagonal text");
        System.out.println("-Exercise 4 - Multiplication table");
        System.out.println("-Exercise 5 - Simple battle");
        System.out.println("-Exercise 6 - Nota Media");
        System.out.println("-Exercise 7 - Primos");
        System.out.print("Enter option: ");
    }
    public static void exercise1() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();

        int n = Math.abs(num);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    public static void exercise2() {
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);
    }
    public static void exercise3() {
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%" + (i + 1) + "s\n", text.charAt(i));
        }
    }
    public static void exercise4() {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
    public static void exercise5() {
        int heroHP = 20;
        int enemyHP = 15;

        while (heroHP > 0 && enemyHP > 0) {
            enemyHP -= 4;
            System.out.println("You attack! Enemy HP: " + enemyHP);

            if (enemyHP <= 0) break;

            heroHP -= 3;
            System.out.println("Enemy attacks! Your HP: " + heroHP);
        }
        if (heroHP > 0) System.out.println("You win!");
        else System.out.println("You lose...");
    }
    public static void exercise6() {
        int numAlumno = 1;
        double sumaNotas = 0;
        int max = 5;       
        System.out.println("Calculo de la nota media de 5 alumnos");
        while (numAlumno <= max){
            System.out.println("Introduce la nota del alumno: " + numAlumno + ":");
            double nota = sc.nextDouble();
            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;        
        } 
       double media = sumaNotas/(numAlumno - 1);
       System.out.println("La nota media de los alumnos es: " + media);
    }
    public static void exercise7() {
        System.out.println("Numeros primos de un numero entero");  
        System.out.println("Ingrese un numero entero: ");
        int num_apd = sc.nextInt();
        
        boolean es_primo_apd = true;
        for (int i_apd = 2; i_apd <= num_apd - 1 ;i_apd++) {
            if (num_apd %i_apd == 0) {
                es_primo_apd = false;
                System.out.println(num_apd + " es divisible entre " + i_apd);   
            }
        }
        if (es_primo_apd) {
            System.out.println("El numero " + num_apd + " es primo");    
        } 
        else {
            System.out.println("El numero " + num_apd + " no es primo");
        }  
    }
}

