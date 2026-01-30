/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alejandropoldia
 */
import java.util.Scanner;

public class ConditionalStructures2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        mostrarMenu();
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
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
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1 - Exercise 1 - Test");
        System.out.println("2 - Exercise 2 - IsCapicua");
        System.out.println("3 - Exercise 3 - NumDigits");
        System.out.println("4 - Exercise 4 - ToWeekend");
        System.out.println("5 - Exercise 5 - BillDetail");
        System.out.println("6 - Exercise 6 - RockPaperScissors (extra)");
        System.out.print("Enter option: ");
    }

    /** Exercise 1 - TestCreate a program that builds a quiz with 5 multi-option questions. Each question should
    *show the possible answers (a), (b), (c), (d). Finally, display the grade obtained on the
    *screen, with each correct answer adding 1 point
    */
    public static void exercise1() {
        int score = 0;
        String answer;

        System.out.println("Question 1: What is the output of System.out.println(5 + 3)?");
        System.out.println("a) 53");
        System.out.println("b) 8");
        System.out.println("c) 5+3");
        System.out.println("d) Error");
        System.out.print("Answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("b")) {
            score++;
        }

        System.out.println("\nQuestion 2: Which keyword is used to create a class in Java?");
        System.out.println("a) class");
        System.out.println("b) create");
        System.out.println("c) new");
        System.out.println("d) method");
        System.out.print("Answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            score++;
        }

        System.out.println("\nQuestion 3: What data type is used to store text?");
        System.out.println("a) myString");
        System.out.println("b) String");
        System.out.println("c) Txt");
        System.out.println("d) Text");
        System.out.print("Answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("b")) {
            score++;
        }

        System.out.println("\nQuestion 4: How do you start the main method in Java?");
        System.out.println("a) public void main()");
        System.out.println("b) public static void main()");
        System.out.println("c) main()");
        System.out.println("d) static void main()");
        System.out.print("Answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("b")) {
            score++;
        }

        System.out.println("\nQuestion 5: What is the correct way to create a variable of type int?");
        System.out.println("a) int num = 5");
        System.out.println("b) integer num = 5");
        System.out.println("c) num int = 5");
        System.out.println("d) num = int 5");
        System.out.print("Answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            score++;
        }

        System.out.println("\nFinal Grade: " + score + "/5");
    }

    /** Exercise 2 - IsCapicuaWrite a program that asks for a 3-digit number and checks if it is a capicua (reads the same
    *forward and backward). Validate that the input is 3 digits. If not, display an error message
    *(This is not a 3-digit number).
    */
    public static void exercise2() {
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        sc.nextLine();

        int absNum = Math.abs(num);

        if (absNum < 100 || absNum > 999) {
            System.out.println("This is not a 3-digit number");
        } else {
            int hundreds = absNum / 100;
            int units = absNum % 10;

            if (hundreds == units) {
                System.out.println("The number is capicua");
            } else {
                System.out.println("The number is not capicua");
            }
        }
    }

    /** Exercise 3 - NumDigits
    *Create a program that calculates the number of digits in an input number. Only consider
    *numbers up to 5 digits, which may be positive or negative 
    */
    public static void exercise3() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();

        int absNum = Math.abs(num);
        if (absNum > 99999) {
            System.out.println("Number too large (max 5 digits)");
        } else {
            int digits = String.valueOf(absNum).length();
            System.out.println("The number has " + digits + " digits");
        }
    }

    /** Exercise 4 - ToWeekend
    * Write a program that calculates the minutes left until the weekend. The weekend begins
    *Friday at 3 p.m. Ask the user for a day of the week (Monday to Friday), and the time (hour
    *and minutes).
    */
    public static void exercise4() {
        System.out.print("Enter day of the week: ");
        String day = sc.nextLine();
        System.out.print("Enter time (HH MM): ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.nextLine();
        System.out.println("Hour "+ hour);
        System.out.println("Minutes "+ minute);
        int dayMinutes = 0;

        if (day.equalsIgnoreCase("monday")) {
            dayMinutes = 0;
        } else if (day.equalsIgnoreCase("tuesday")) {
            dayMinutes = 1 * 24 * 60;
        } else if (day.equalsIgnoreCase("wednesday")) {
            dayMinutes = 2 * 24 * 60;
        } else if (day.equalsIgnoreCase("thursday")) {
            dayMinutes = 3 * 24 * 60;
        } else if (day.equalsIgnoreCase("friday")) {
            dayMinutes = 4 * 24 * 60;
        } else {
            System.out.println("Invalid day");
            return;
        }

        int currentMinutes = dayMinutes + (hour * 60 + minute);
        int weekendStart = (4 * 24 * 60) + (15 * 60); 
        int remaining = weekendStart - currentMinutes;

        if (remaining < 0) {
            System.out.println("It is already weekend!");
        } else {
            System.out.println("Minutes until weekend: " + remaining);
        }
    }

    /** Exercise 5 - BillDetail
    *Write a program that calculates the final price of a product based on:
    *• The taxable base (price before tax)
    *• The TAX rate which can be general (21%), reduced (10%) or super-reduced (4%).
    *• A promo code, which may be noPromo (no discount), half (50% off), fixDiscount
    *(€5 off), or percentage (5% off)

    */ 
    public static void exercise5() {
        System.out.print("Enter the taxable base: ");
        double base = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the TAX type (general, reduced, super-reduced): ");
        String taxType = sc.nextLine();

        System.out.print("Enter the promo code (noPromo, half, fixDiscount, percentage): ");
        String promo = sc.nextLine();

        double taxRate = 0;

        if (taxType.equalsIgnoreCase("general")) {
            taxRate = 0.21;
        } else if (taxType.equalsIgnoreCase("reduced")) {
            taxRate = 0.10;
        } else if (taxType.equalsIgnoreCase("super-reduced")) {
            taxRate = 0.04;
        } else {
            System.out.println("Invalid TAX type");
            return;
        }

        double taxAmount = base * taxRate;
        double priceWithTax = base + taxAmount;
        double discount = 0;

        if (promo.equalsIgnoreCase("half")) {
            discount = priceWithTax / 2;
        } else if (promo.equalsIgnoreCase("fixDiscount")) {
            discount = 5;
        } else if (promo.equalsIgnoreCase("percentage")) {
            discount = priceWithTax * 0.05;
        } else if (promo.equalsIgnoreCase("noPromo")) {
            discount = 0;
        } else {
            System.out.println("Invalid promo code");
            return;
        }

        double total = priceWithTax - discount;

        System.out.println("\nTaxable base:   " + String.format("%.2f", base));
        System.out.println("TAX(" + (int)(taxRate * 100) + "%):   " + String.format("%.2f", taxAmount));
        System.out.println("Price with taxes:   " + String.format("%.2f", priceWithTax));
        System.out.println("Promo code(" + promo + "):  -" + String.format("%.2f", discount));
        System.out.println("TOTAL:   " + String.format("%.2f", total));
    }

    /** Exercise 6 - RockPaperScissors (extra)
    * Create a program following the instructions in the following flowchart exactly as
    *written.
    */
    public static void exercise6() {
        System.out.print("Enter your move (rock, paper, scissors): ");
        String user = sc.nextLine().toLowerCase();

        int random = (int) (Math.random() * 3);
        String computer = "";

        if (random == 0) {
            computer = "rock";
        } else if (random == 1) {
            computer = "paper";
        } else {
            computer = "scissors";
        }

        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
            System.out.println("Draw!");
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}