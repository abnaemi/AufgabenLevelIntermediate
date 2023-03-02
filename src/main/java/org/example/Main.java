package org.example;

public class Main {
    public static void main(String[] args) {

    // String[] zahlen = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
    String test = method1(23);
        System.out.println(test);

    }

    public  static String method1(int value){
            String[] zahlen = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
            switch (value) {
                case 1:
                    return zahlen[0];
                case 2:
                    return zahlen[1];
                case 3:
                    return zahlen[2];
                case 4:
                    return zahlen[3];
                case 5:
                    return zahlen[4];
                case 6:
                    return zahlen[5];
                case 7:
                    return zahlen[6];
                case 8:
                    return zahlen[7];
                case 9:
                    return zahlen[8];
                case 10:
                    return zahlen[9];
                default:
                    return "Zahl außerhalb des Arrays";
            }
        }


//        String[] zahlen = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
//        if (value == 1)
//            return zahlen[0];
//        if (value == 2)
//            return zahlen[1];
//        if (value == 3)
//            return zahlen[2];
//        if (value == 4)
//            return zahlen[3];
//        if (value == 5)
//            return zahlen[4];
//        if (value == 6)
//            return zahlen[5];
//        if (value == 7)
//            return zahlen[6];
//        if (value == 8)
//            return zahlen[7];
//        if (value == 9)
//            return zahlen[8];
//        if (value == 10)
//            return zahlen[9];
//        if (value == 2)
//            return zahlen[1];

//        String monthString;
//        switch (zahlen) {
//            case 1:  monthString = "Eins";
//                break;
//            case 2:  monthString = "Zwei";
//                break;
//            case 3:  monthString = "Drei";
//                break;
//            case 4:  monthString = "Vier";
//                break;
//            case 5:  monthString = "Fünft";
//                break;
//            case 6:  monthString = "Sechs";
//                break;
//            case 7:  monthString = "Sieben";
//                break;
//            case 8:  monthString = "Acht";
//                break;
//            case 9:  monthString = "Neun";
//                break;
//            case 10: monthString = "Zehn";
//                break;
//            default: monthString = "Keine gültige Zahl";
//                break;



    }



