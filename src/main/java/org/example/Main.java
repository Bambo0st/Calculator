package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static Logger logger;

    public double findSqrt(double num) {
        if (num < 0) {
            logger.warn("Invalid input for square root: {}", num);
            return -1;
        }

        double ans = Math.sqrt(num);
        logger.info("[OPERATION] Square Root, [INPUT] {}, [RESULT] {}", num, ans);
        return ans;
    }

    public double findFact(double num) {
        if (num < 0) {
            logger.warn("Invalid input for factorial: {}", num);
            return -1;
        }

        double ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }

        logger.info("[OPERATION] Factorial, [INPUT] {}, [RESULT] {}", num, ans);
        return ans;
    }

    public double findLog(double num) {
        if (num <= 0) {
            logger.warn("Invalid input for natural logarithm: {}", num);
            return -1;
        }

        double ans = Math.log(num);
        logger.info("[OPERATION] Natural Logarithm, [INPUT] {}, [RESULT] {}", num, ans);
        return ans;
    }

    public double findPow(double num1, double num2) {
        double ans = Math.pow(num1, num2);
        logger.info("[OPERATION] Power, [INPUT1] {}, [INPUT2] {}, [RESULT] {}", num1, num2, ans);
        return ans;
    }

    public Main() {
        logger = LogManager.getLogger(Main.class);
    }

    public static void menu() {
        System.out.println("Welcome to Scientific Calculator");
        System.out.println("--------------------------");
        System.out.println("1. Square root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural logarithm (base e)");
        System.out.println("4. Power");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Main cal = new Main();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        int choice;

        do {
            Main.menu();
            choice = sc.nextInt();

            double num1;
            double num2;
            double ans;

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    ans = cal.findSqrt(num1);
                    if (ans == -1) {
                        System.out.println("Invalid input for square root entered.");
                    } else {
                        System.out.println("Square root of " + num1 + " is " + ans);
                    }
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    ans = cal.findFact(num1);
                    if (ans == -1) {
                        System.out.println("Invalid input for factorial.");
                    } else {
                        System.out.println("Factorial of " + num1 + " is " + ans);
                    }
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    ans = cal.findLog(num1);
                    if (ans == -1) {
                        System.out.println("Invalid input for natural logarithm.");
                    } else {
                        System.out.println("Natural logarithm (base e) of " + num1 + " is " + ans);
                    }
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    ans = cal.findPow(num1, num2);
                    System.out.println("Power of " + num1 + " to " + num2 + " is " + ans);
                    break;

                case 0:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid choice entered. Please try again.");
            }

            System.out.println();
        } while (choice != 0);

        sc.close();
    }


}
