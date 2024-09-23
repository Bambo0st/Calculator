package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter  .
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public int add(int a , int b) {
        return a + b;
    }
    public int sub(int a , int b)
    {
        return a-b;
    }

    public static void main(String[] args) {

        System.out.print("Hello and welcome!");

    }
}
