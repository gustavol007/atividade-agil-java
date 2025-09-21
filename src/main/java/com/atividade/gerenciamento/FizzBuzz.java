package com.atividade.gerenciamento;

public class FizzBuzz {
    public static String getResultado(int numero) {
        boolean divisivelPor3 = numero % 3 == 0;
        boolean divisivelPor5 = numero % 5 == 0;

        if (divisivelPor3 && divisivelPor5) return "FizzBuzz";
        if (divisivelPor3) return "Fizz";
        if (divisivelPor5) return "Buzz";

        return String.valueOf(numero);
    }
}
