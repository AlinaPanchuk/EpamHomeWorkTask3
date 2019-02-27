package com.Epam.company.HomeWork2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the weight in pound: ");
        double weightInPound=sc.nextDouble();
        final double kilosInOnePound=0.4536;
        double weightInKilogram=weightInPound*kilosInOnePound;
        System.out.println("Weight in Kilograms = " + (int)weightInKilogram / 1 + " Kilograms "
                + (weightInKilogram/0.001-(int)weightInKilogram / 1*1000) + " grams" );
    }
}
