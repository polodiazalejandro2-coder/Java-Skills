import java.util.Scanner; // 1️⃣ Importamos Scanner para leer datos del teclado

public class ConditionalStructures {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) // 2️⃣ Creamos el lector de entrada
        ) {
            String opcion; // 3️⃣ Guardaremos aquí la opción del usuario como texto
            // 4️⃣ Mostramos el menú
            System.out.println("==== MENÚ DE EJERCICIOS ====");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Determinar el mayor de dos números");
            System.out.println("3. Verificar si un número es par o impar");
            System.out.println("4. Calcular el promedio de tres notas");
            System.out.println("5. Mostrar si un número es positivo, negativo o cero");
            System.out.print("Elige una opción (1-5): ");
            opcion = sc.nextLine(); // 5️⃣ Leemos la opción como texto
            // 6️⃣ Convertimos el texto a número
            int opcionNum = Integer.parseInt(opcion);
            // 7️⃣ Estructura condicional principal
            if (opcionNum == 1) {
                // SUMAR DOS NÚMEROS
                System.out.print("Ingresa el primer número: ");
                double n1 = Double.parseDouble(sc.nextLine());
                System.out.print("Ingresa el segundo número: ");
                double n2 = Double.parseDouble(sc.nextLine());
                double suma = n1 + n2;
                System.out.println("La suma es: " + suma);
            } else if (opcionNum == 2) {
                // DETERMINAR EL MAYOR
                System.out.print("Ingresa el primer número: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.print("Ingresa el segundo número: ");
                int b = Integer.parseInt(sc.nextLine());
                if (a > b) {
                    System.out.println("El mayor es: " + a);
                } else if (b > a) {
                    System.out.println("El mayor es: " + b);
                } else {
                    System.out.println("Ambos números son iguales.");
                }
                
            } else if (opcionNum == 3) {
                // PAR O IMPAR
                System.out.print("Ingresa un número: ");
                int num = Integer.parseInt(sc.nextLine());
                if (num % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
                
            } else if (opcionNum == 4) {
                // PROMEDIO DE TRES NOTAS
                System.out.print("Ingresa la primera nota: ");
                double n1 = Double.parseDouble(sc.nextLine());
                System.out.print("Ingresa la segunda nota: ");
                double n2 = Double.parseDouble(sc.nextLine());
                System.out.print("Ingresa la tercera nota: ");
                double n3 = Double.parseDouble(sc.nextLine());
                double promedio = (n1 + n2 + n3) / 3;
                System.out.println("El promedio es: " + promedio);
                
            } else if (opcionNum == 5) {
                // POSITIVO, NEGATIVO O CERO
                System.out.print("Ingresa un número: ");
                double n = Double.parseDouble(sc.nextLine());
                if (n > 0) {
                    System.out.println("El número es positivo.");
                } else if (n < 0) {
                    System.out.println("El número es negativo.");
                } else {
                    System.out.println("El número es cero.");
                }
                
            } else {
                // OPCIÓN INCORRECTA
                System.out.println("Opción no válida. Por favor elige entre 1 y 5.");
            }
            // 8️⃣ Cerramos el lector de teclado
        } // 3️⃣ Guardaremos aquí la opción del usuario como texto
    }
}

