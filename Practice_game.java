/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice05;
/**
 *
 *@author alejandropoldia 
 */
import java.util.Scanner;
import java.util.Random;
public class Practice_game {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        showMenu();
        option= sc.nextInt();
        sc.nextLine();
        
        switch(option){
            case 1 -> exercise1();
            case 2 -> exercise2();
            case 3 -> exercise3();
            case 4 -> exercise4();
            case 5 -> exercise5();
            case 6 -> exercise6();
        }
    public static void showMenu {
            System.out.println("=== Main ==");
            System.out.println("1. Exercise");
            System.out.println("2. Exercise");
            System.out.println("3. Exercise");
            System.out.println("4. Exercise");
            System.out.println("5. Exercise");
            System.out.println("6. Exercise");
    }    
/* * ¡Hola Carmen! El tema de arrays resultó ser todo un reto y aún no lo comprendo 
 * del todo, hay puntos que mi cerebro todavía está procesando. Lo que sí logré 
 * captar es la lógica, que es muy similar a la de matrices y vectores. 
 * Sé que pediste el último ejercicio, pero me tomé el tiempo de practicar 
 * con todos los demás.( Regalame un punto en el examen JAJAJAJA )
 */     
    public static void exercise1(){
    int[][] num = new int[3][6];

        num[0][0] = 30;
        num[0][1] = 0;
        num[0][2] = 2;
        num[0][5] = 5;

        num[1][0] = 75;
        num[1][4] = 0;

        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        System.out.println("Array num:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d", num[i][j]); 
            }
            System.out.println();
        }       
    }    
    public static void exercise2(){
    int[][] datos = new int[4][5];  
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                datos[i][j] = sc.nextInt();
                sumaFilas[i] += datos[i][j];
                sumaColumnas[j] += datos[i][j];
                sumaTotal += datos[i][j];
            }
        }
        System.out.println("\nHOJA DE CÁLCULO:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", datos[i][j]);
            }
            System.out.printf(" | Suma: %5d\n", sumaFilas[i]);
        }
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }      
        System.out.printf(" | TOTAL: %5d\n", sumaTotal);
    }
    public static void exercise3(){
        int[][] datos = new int[4][5];    
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                datos[i][j] = sc.nextInt();

                sumaFilas[i] += datos[i][j];
                sumaColumnas[j] += datos[i][j];
                sumaTotal += datos[i][j];
            }
        }
        System.out.println("\nCalculando...");
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%5d", datos[i][j]);
                    Thread.sleep(100); 
                }
                Thread.sleep(400); 
                System.out.printf(" | Suma: %5d\n", sumaFilas[i]);
            }
            System.out.println("-------------------------------------------------"); 
            for (int j = 0; j < 5; j++) {
                Thread.sleep(200); 
                System.out.printf("%5d", sumaColumnas[j]);
            }         
            Thread.sleep(800); 
            System.out.printf(" | TOTAL: %5d\n", sumaTotal);
        } catch (InterruptedException e) {
            System.out.println("Error en el retardo");
        }    
    }
    public static void exercise4(){
        System.out.print("Número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int cols = sc.nextInt();
        int[][] matriz = new int[filas][cols];
        System.out.println("\n--- MATRIZ ORIGINAL ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < filas - 1; i++) {
            for (int j = 0; j < filas - i - 1; j++) {
                int sumaFilaActual = 0;
                for (int k = 0; k < cols; k++) sumaFilaActual += matriz[j][k];
                int sumaFilaSiguiente = 0;
                for (int k = 0; k < cols; k++) sumaFilaSiguiente += matriz[j + 1][k];
                if (sumaFilaSiguiente > sumaFilaActual) {
                    int[] aux = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = aux;
                }
            }
        }
        System.out.println("\n--- MATRIZ REORDENADA ---");     
        String colorRojo = "\u001B[31m";
        String reset = "\u001B[0m";
        for (int i = 0; i < filas; i++) {
            if (i == 0) System.out.print(colorRojo);         
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + " ");
            }      
            if (i == 0) System.out.print(reset);
            System.out.println();
        }    
    }
    public static void exercise5(){
        System.out.print("Filas: ");
        int filas = sc.nextInt();
        System.out.print("Columnas: ");
        int cols = sc.nextInt();
        int[][] matriz = new int[filas][cols];
        System.out.println("--- ORIGINAL ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < cols - 1; i++) {
            for (int j = 0; j < cols - i - 1; j++) {               
                int sumaColActual = 0;
                for (int k = 0; k < filas; k++) sumaColActual += matriz[k][j];
                int sumaColSiguiente = 0;
                for (int k = 0; k < filas; k++) sumaColSiguiente += matriz[k][j + 1];

                if (sumaColSiguiente > sumaColActual) {
                    for (int k = 0; k < filas; k++) {
                        int aux = matriz[k][j];
                        matriz[k][j] = matriz[k][j + 1];
                        matriz[k][j + 1] = aux;
                    }
                }
            }
        }
        System.out.println("\n--- REORDENADA ---");
        String color = "\u001B[34m";
        String reset = "\u001B[0m";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0) System.out.print(color);
                System.out.print(matriz[i][j] + " ");
                if (j == 0) System.out.print(reset);
            }
            System.out.println();
        }    
    }
    
    public static void exercise6(){
        char[][] tablero = new char[5][5];
        boolean[][] barcos = new boolean[5][5]; 

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                tablero[i][j] = '-';
                barcos[i][j] = false;
            }
        }
        int filaBarco = (int)(Math.random() * 4); 
        int colBarco = (int)(Math.random() * 4);
        barcos[filaBarco][colBarco] = true;
        barcos[filaBarco+1][colBarco] = true;
        barcos[filaBarco][colBarco+1] = true;
        barcos[filaBarco+1][colBarco+1] = true;
        int aciertos = 0;
        System.out.println("¡HUNDIR LA FLOTA!");       
        while(aciertos < 4) {
            System.out.println("  A B C D E");
            for(int i=0; i<5; i++){
                System.out.print((i+1) + " ");
                for(int j=0; j<5; j++){
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Introduce disparo (ej: 2C): ");
            String entrada = sc.next().toUpperCase();
            char filaChar = entrada.charAt(0);
            char colChar = entrada.charAt(1);
            int f = Character.getNumericValue(filaChar) - 1; 
            int c = colChar - 'A'; 
            if (f >= 0 && f < 5 && c >= 0 && c < 5) {               
                if (tablero[f][c] != '-') {
                    System.out.println("¡Ya disparaste ahí!");
                } else if (barcos[f][c] == true) {
                    System.out.println("¡TOCADO!");
                    tablero[f][c] = '*';
                    aciertos++;
                } else {
                    System.out.println("Agua...");
                    tablero[f][c] = 'x';
                }              
            } else {
                System.out.println("Coordenada incorrecta.");
            }
        }
        System.out.println("\n¡ENHORABUENA! Has hundido el barco enemigo.");
    }
}
