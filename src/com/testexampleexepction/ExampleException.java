package com.testexampleexepction;

import java.util.Scanner;

public class ExampleException {

    public static void main(String[] args) {
        String[] indexToPrint = new String[]{"1", "2", "3", "10", "jeden", "-1", "dwa", "2", "10", "0", "q"};

        String[] strings = new String[]{"To", "Jest", "Bardzo", "Przydatny", "Kurs", "."};

        for (int i = 0; i<strings.length; i++){
            String next = indexToPrint[i];

            System.out.println("Pobrano wyraz: " + next);

            if (next.equals("q")){
                break;
            }

            try {
                int index = getIndex(strings, next);
                System.out.println("Wyraz o indeksie " + index + " to " + strings[index] + ".");
            }catch (IllegalArgumentException ex){
                System.out.println("Wystąpił błąd: " + ex.getMessage());
            }
        }

    }

    public static int getIndex(String[] strings, String next) throws IllegalArgumentException{
        int index = 0;
        try {
            index = Integer.valueOf(next);
        }catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Nie wprowadzono cyfry.");
        }
        if (index < 0){
            throw new IllegalArgumentException ("Wprowadzona liczba musi być większa od 0");
        }
        if (index >= strings.length) {
            throw new IllegalArgumentException ("Wprowadzona liczba musi byc mniejsza od " + strings.length + ".");
        }
        return index;
    }
}
