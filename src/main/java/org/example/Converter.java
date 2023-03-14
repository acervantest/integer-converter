package org.example;

public class Converter {

    public String itoa(int value, int base) {

        if(value < 0) {
            throw new IllegalArgumentException("Value must be greater than zero");
        }

        String result = "";

        if (base == 8 || base == 10 || base == 16) {
            if(base == 8) {
                result = convertToOctal(value);
            } else if (base == 10){
                result = convertToDecimal(value);
            } else if (base == 16){
                result = convertToHex(value);
            }
        } else {
            throw new IllegalArgumentException("Value must be a valid base");
        }

        return result;
    }

    private String convertToOctal( int toOctal ){

        if(toOctal < 8 ) return String.valueOf(toOctal);

        int decimalNumber = toOctal;
        int quotient = decimalNumber / 8;
        int remainder = decimalNumber % 8;

        String result = String.valueOf(remainder);

        while( quotient != 0 ){

            decimalNumber = quotient;

            quotient = decimalNumber / 8;
            remainder = decimalNumber % 8;

            result = String.valueOf(remainder) + result;
        }

        return result;
    }

    private String convertToDecimal(int toDec){
        float floatNumber = toDec/1f;

        String floatString = String.valueOf(floatNumber);

        return floatString;
    }

    private String convertToHex(int toHex ){
        String result = "";
        int remainder;

        while (toHex > 0) {
            remainder = toHex % 16;
            if (remainder == 10) {
                result = "a" + result;
            } else if (remainder == 11) {
                result = "b" + result;
            } else if (remainder == 12) {
                result = "c" + result;
            } else if (remainder == 13) {
                result = "d" + result;
            } else if (remainder == 14) {
                result = "e" + result;
            } else if (remainder == 15) {
                result = "f" + result;
            } else {
                result = remainder + result;
            }
            toHex = toHex / 16;
        }
        return result;
    }
}
