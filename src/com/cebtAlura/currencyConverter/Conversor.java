package com.cebtAlura.currencyConverter;

import java.util.Scanner;

public class Conversor {
    private double ARS;
    private double BRL;
    private double COP;

    //Constructor method
    public Conversor(converter currency)
    {
        this.ARS = currency.ARS();
        this.BRL = currency.BRL();
        this.COP = currency.COP();
    }

    //Getter methods
    public double getARS() {
        return ARS;
    }

    public double getBRL() {
        return BRL;
    }

    public double getCOP() {
        return COP;
    }

    public void Menu(){
        Scanner keyboard = new Scanner(System.in);
        double option;      //Variable to save the user infromation
        int auxOption = 0;  //Auxiliar variable

        while(auxOption != 7)
        {
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
            auxOption = (int)option;

            if(option == 7)
            {
                break;
            }

            System.out.println("Enter the amount to convert: ");
            option = keyboard.nextDouble();

            switch(auxOption)
            {
                case 1:
                    System.out.printf("The value of %.2f [USD], it´s equals to %.2f [ARS]", option, option * getARS());
                    break;
                case 2:
                    System.out.printf("The value of %.2f [ARS], it´s equals to %.2f [USD]", option, option / getARS());
                    break;
                case 3:
                    System.out.printf("The value of %.2f [USD], it´s equals to %.2f [BRL]", option, option * getBRL());
                    break;
                case 4:
                    System.out.printf("The value of %.2f [BRL], it´s equals to %.2f [USD]", option, option / getBRL());
                    break;
                case 5:
                    System.out.printf("The value of %.2f [USD], it´s equals to %.2f [COP]", option, option * getCOP());
                    break;
                case 6:
                    System.out.printf("The value of %.2f [COP], it´s equals to %.2f [USD]", option, option / getCOP());
                    break;
                default:
                    System.out.println("Choose another option");
                    break;
            }

            System.out.println("\n");
        }
    }
}
