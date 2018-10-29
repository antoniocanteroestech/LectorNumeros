package es.estech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = getNumber();

        //String units = readUnits(number);

        String spellingNumber = "";
        if (number < 10) {
            spellingNumber = readUnits(number);
        } else if (number >= 10 && number < 20) {
            spellingNumber = readTens(number);
        } else if (number >= 20 && number < 30){
            String units = (String.valueOf(number).substring(1));
            String tens = (String.valueOf(number).substring(0));

            spellingNumber = readNumber(number);
        }


        System.out.println(spellingNumber);
    }

    private static String readNumber(int number) {
        String Units

        String spellTens = "";
        switch (number){
            case 10:
                spellTens = "diez";
                break;
            case 11:
                spellTens = "once";
                break;
            case 12:
                spellTens = "doce";
                break;
            case 13:
                spellTens = "trece";
                break;
            case 14:
                spellTens = "catorce";
                break;
            case 15:
                spellTens = "quince";
                break;
            case 16:
                spellTens = "dieciséis";
                break;
            case 17:
                spellTens = "diecisiete";
                break;
            case 18:
                spellTens = "dieciocho";
                break;
            case 19:
                spellTens = "diecinueve";
                break;
        }

        return spellTens;
    }

    private static String readTens(int number) {

        String spellTens = "";
        switch (number){
            case 10:
                spellTens = "diez";
                break;
            case 11:
                spellTens = "once";
                break;
            case 12:
                spellTens = "doce";
                break;
            case 13:
                spellTens = "trece";
                break;
            case 14:
                spellTens = "catorce";
                break;
            case 15:
                spellTens = "quince";
                break;
            case 16:
                spellTens = "dieciséis";
                break;
            case 17:
                spellTens = "diecisiete";
                break;
            case 18:
                spellTens = "dieciocho";
                break;
            case 19:
                spellTens = "diecinueve";
                break;
        }

        return spellTens;
    }

    private static String readUnits(int number) {

        String spellUnits = "";
        switch (number){
            case 0:
                spellUnits = "cero";
                break;
            case 1:
                spellUnits = "uno";
                break;
            case 2:
                spellUnits = "dos";
                break;
            case 3:
                spellUnits = "tres";
                break;
            case 4:
                spellUnits = "cuatro";
                break;
            case 5:
                spellUnits = "cinco";
                break;
            case 6:
                spellUnits = "seis";
                break;
            case 7:
                spellUnits = "siete";
                break;
            case 8:
                spellUnits = "ocho";
                break;
            case 9:
                spellUnits = "nueve";
                break;
        }

        return spellUnits;
    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entre 0 y 99");

        int number = -1;
        if (validateTypeEntry(scanner))
            number = scanner.nextInt();

        if (!validateNumberEntry(number)){
            System.out.println("El número que has introducido no está entre 0 y 99...");
            getNumber();
        }

        scanner.close();

        return number;

    }

    private static boolean validateNumberEntry(int number) {
        if (number < 0 || number > 99) return false;

        return true;
    }

    private static boolean validateTypeEntry (Scanner scanner){

        while (!scanner.hasNextInt()){
            System.out.println("Debes introducir un número. Prueba de nuevo...");
            String nonCorrectValue = scanner.next();
        }

        return true;
    }

}
