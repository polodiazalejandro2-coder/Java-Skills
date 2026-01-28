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

public class Strings_MathRandom { 

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do { 
            showMenu();
            option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1:
                    exercise01();
                    break;
                case 2:
                    exercise02();
                    break;
                case 3:
                    exercise03();
                    break;
                case 4:
                    exercise04();
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println("\nPresiona Enter para continuar...");
            sc.nextLine();    
        } while (option != 0);
    }

    public static void showMenu() {
        System.out.println("\n=== Strings y Math ===");
        System.out.println("1 - Ejercicio 01: Manipulacion de String");
        System.out.println("2 - Ejercicio 02: Efecto Matrix (Random char)");
        System.out.println("3 - Ejercicio 03: Adivina el numero");
        System.out.println("4 - Ejercicio 04: Tragaperras simplificada");
        System.out.println("0 - Salir");
        System.out.print("Elige una opcion: ");
    }

    public static void exercise01() {
        System.out.println("--- Ejercicio 01 ---");
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        String textoA = "";
        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            
            if (actual == 'a') {
                if (i == 0 || texto.charAt(i - 1) != ' ') {
                    textoA += 'A';
                } else {
                    textoA += 'a';
                }
            } else {
                textoA += actual;
            }
        }
        System.out.println("Texto modificado ('a' por 'A'): " + textoA);
        System.out.print("Iniciales: ");
        if (texto.length() > 0) {
            System.out.print(texto.charAt(0)); 
            for (int i = 1; i < texto.length(); i++) {
                if (texto.charAt(i - 1) == ' ' && texto.charAt(i) != ' ') {
                    System.out.print(texto.charAt(i));
                }
            }
        }
        System.out.println();
        String textoPares = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
        if (i % 2 == 0) {
                textoPares += String.valueOf(c).toUpperCase();
            } else {
                textoPares += String.valueOf(c).toLowerCase();
            }
        }
        System.out.println("Pares Mayús/Impares Minus: " + textoPares);
    }

    public static void exercise02() {
        System.out.println("--- Ejercicio 02 (Matrix) ---");

        for (int i = 0; i < 2000; i++) {
            int codigoAscii = (int) (Math.random() * (126 - 32 + 1) + 32);
            char caracter = (char) codigoAscii;
            System.out.print(caracter + " ");
            if (i % 80 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void exercise03() {
        System.out.println("--- Ejercicio 03 (Adivina el numero) ---");
        int numeroSecreto = (int) (Math.random() * 101); 
        int intentos = 5;
        boolean acertado = false;
        System.out.println("He pensado un numero del 0 al 100. Tienes 5 intentos.");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": ");
            int respuesta = sc.nextInt();
            sc.nextLine(); 

            if (respuesta == numeroSecreto) {
                System.out.println("¡Correcto! Has adivinado el numero.");
                acertado = true;
                break; 
            } else if (respuesta < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");
            } else {
                System.out.println("El número secreto es MENOR.");
            }
        }

        if (!acertado) {
            System.out.println("Lo siento, has perdido. El número era: " + numeroSecreto);
        }
    }

    public static void exercise04() {
        System.out.println("--- Ejercicio 04 (Tragaperras) ---");
        int fig1 = (int) (Math.random() * 5);
        int fig2 = (int) (Math.random() * 5);
        int fig3 = (int) (Math.random() * 5);

        System.out.print("Tirada: ");
        printFigura(fig1);
        System.out.print(" | ");
        printFigura(fig2);
        System.out.print(" | ");
        printFigura(fig3);
        System.out.println();

        if (fig1 == fig2 && fig2 == fig3) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (fig1 != fig2 && fig1 != fig3 && fig2 != fig3) {
            System.out.println("Lo siento, ha perdido");
        } else {
            System.out.println("Bien, ha recuperado su moneda");
        }
    }
    // Método auxiliar para el Ejercicio 4: convierte número a nombre de figura
    public static void printFigura(int n) {
        switch(n) {
            case 0: System.out.print("Corazon"); break;
            case 1: System.out.print("Diamante"); break;
            case 2: System.out.print("Herradura"); break;
            case 3: System.out.print("Campana"); break;
            case 4: System.out.print("Limon"); break;
        }
    }
}