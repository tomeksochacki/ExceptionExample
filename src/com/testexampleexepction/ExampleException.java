package com.testexampleexepction;

import java.util.Scanner;

public class ExampleException {

    public static void main(String[] args) {
        String[] indexToPrint = new String[]{"1", "2", "3", "10", "jeden", "q"};

        String[] strings = new String[]{"To", "Jest", "Bardzo", "Przydatny", "Kurs", "."};

        for (int i = 0; i<strings.length; i++){
            String next = indexToPrint[i];

            System.out.println("Pobrano wyraz: " + next);

            if (next.equals("q")){
                break;
            }

            int index = getIndex(strings, next);
            System.out.println("Wyraz o indeksie " + index + " to " + strings[index] + ".");
        }
    }

    public static int getIndex(String[] strings, String next) throws Exception{
        int index = Integer.valueOf(next);
        if (index < 0) {
            throw new Exception ("Wprowadzona liczba musi być większa od 0");
        }
        if (index >= strings.length) {
            throw new Exception ("Wprowadzona liczba musi byc mniejsza od " + strings.length + ".");

        }
        return index;
    }
}
