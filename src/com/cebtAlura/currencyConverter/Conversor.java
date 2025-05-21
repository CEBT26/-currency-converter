package com.cebtAlura.currencyConverter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conversor {
    

    public static void Menu(){
        Scanner keyboard = new Scanner(System.in);
        double option = 0;

        System.out.println("\t\t*** Welcome to Currency converter ;) ***");
        System.out.println("\nMenu options: ");
        System.out.println("1.Dollar =>> Argentine peso");
        System.out.println("2.Argentine peso =>> Dollar");
        System.out.println("3.Dollar =>> Brazilian real");
        System.out.println("4.Brazilian real =>> Dollar");
        System.out.println("5.Dollar =>> Colombian peso");
        System.out.println("6.Colombian peso =>> Dollar");
        System.out.println("7. Exit");

        System.out.println("Choose an option: ");
        option = keyboard.nextDouble();

        System.out.println("Enter the amount to convert: ");
        option = keyboard.nextDouble();

    }
}
