package com.company;

import java.util.Scanner;

public class RNO_DOD_6 {

    public static void main(String[] args) {

        Scanner daneWejsciowe = new Scanner(System.in);
      
        int t = daneWejsciowe.nextInt();
        daneWejsciowe.nextLine();

        int suma;

        if (t > 0 && t < 100) {
            for (int j = 0; j < t; j++) {
                suma = 0;
                int n = daneWejsciowe.nextInt();
                daneWejsciowe.nextLine();
                String line = daneWejsciowe.nextLine();
                String[] numbersStrs = line.split(" ");
                int[] numbers = new int[n];
                for (int i = 0; i < n; i++) {
                    numbers[i] = Integer.parseInt(numbersStrs[i]);
                    suma += numbers[i];
                }
                System.out.println(suma);
            }

        }
    }
}