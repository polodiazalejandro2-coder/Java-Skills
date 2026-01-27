/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice05;
import java.util.Scanner;
/**
 *
 * @author alejandropoldia
 */
public class Arrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
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
                case 8:
                    exercise8();
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
        System.out.println("===   Menu del dia ===");
        System.out.println("1 - numeros en orden inverso");
        System.out.println("2 - numeros, cuadrados y cubos");
        System.out.println("3 - maximo y minimo");
        System.out.println("4 - rotar array de palabras");
        System.out.println("5 - cambiar valores en array aleatorio");
        System.out.println("6 - pares e impares");
        System.out.println("7 - mover primos al inicio");
        System.out.println("8 - colores al inicio");
        System.out.println("0 - Salir");
        System.out.print("Elige una opcion: ");
    }
    public static void exercise1() {
        int[] numeros = new int[10];
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    public static void exercise2() {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        System.out.println("Numero\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
    public static void exercise3() {
        int[] numeros = new int[10];
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("Numeros introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == max) {
                System.out.print(" maximo");
            }
            if (numeros[i] == min) {
                System.out.print(" minimo");
            }
            System.out.println();
        }
    }
    public static void exercise4() {
        String[] palabras = new String[15];
        System.out.println("Introduce 15 palabras:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Palabra" + i + ":");
            palabras[i] = sc.next();
        }
        String ultima = palabras[14];
        for (int i = 14; i > 0; i--) {
            palabras[i] = palabras[i - 1];
        }
        palabras[0] = ultima;
        System.out.println("Array rotado:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Rotacion:" + palabras[i]);
        }
    }
    public static void exercise5() {
        int numeros[] = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ((int) (Math.random() * 21));
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("Introduce un valor a cambiar:");
        int valorOrigen = sc.nextInt();
        System.out.println("Valor Nuevo:");
        int valorNuevo = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorOrigen) {
                numeros[i] = valorNuevo;
                System.out.print("'" + numeros[i] + "'" + " ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
    public static void exercise6() {
        int[] numeros = new int[8];
        System.out.println("Introduce 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Resultado:");
        for (int i = 0; i < 8; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] % 2 == 0) {
                System.out.println(" par");
            } else {
                System.out.println(" impar");
            }
        }
    }
    public static void exercise7() {
        int[] numeros = new int[10];
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Tabla original:");
        System.out.println("Indice\tValor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int cuentaPrimos = 0;
        int cuentaNoPrimos = 0;
        for (int i = 0; i < 10; i++) {
            int num = numeros[i];
            boolean esPrimo = true;
            if (num <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                primos[cuentaPrimos] = num;
                cuentaPrimos++;
            } else {
                noPrimos[cuentaNoPrimos] = num;
                cuentaNoPrimos++;
            }
        }
        int[] resultado = new int[10];
        int pos = 0;
        for (int i = 0; i < cuentaPrimos; i++) {
            resultado[pos] = primos[i];
            pos++;
        }
        for (int i = 0; i < cuentaNoPrimos; i++) {
            resultado[pos] = noPrimos[i];
            pos++;
        }
        System.out.println("Array con primos primero:");
        for (int i = 0; i < 10; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
    public static void exercise8() {
        String[] palabras = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        System.out.println("Introduce 8 palabras:");
        for (int i = 0; i < 8; i++) {
            palabras[i] = sc.next();
        }
        String[] resultado = new String[8];
        int pos = 0;
        for (int i = 0; i < 8; i++) {
            for (String color : colores) {
                if (palabras[i].equalsIgnoreCase(color)) {
                    resultado[pos] = palabras[i];
                    pos++;
                    break;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            boolean esColor = false;
            for (String color : colores) {
                if (palabras[i].equalsIgnoreCase(color)) {
                    esColor = true;
                    break;
                }
            }
            if (!esColor) {
                resultado[pos] = palabras[i];
                pos++;
            }
        }
        System.out.println("Array con colores al inicio:");
        for (int i = 0; i < 8; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
