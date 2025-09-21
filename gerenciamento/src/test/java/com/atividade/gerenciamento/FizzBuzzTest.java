package com.atividade.gerenciamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void deveRetornarFizz_QuandoNumeroDivisivelPor3() {
        assertEquals("Fizz", FizzBuzz.getResultado(9));
    }

    @Test
    void deveRetornarBuzz_QuandoNumeroDivisivelPor5() {
        assertEquals("Buzz", FizzBuzz.getResultado(10));
    }

    @Test
    void deveRetornarFizzBuzz_QuandoNumeroDivisivelPor3e5() {
        assertEquals("FizzBuzz", FizzBuzz.getResultado(15));
    }

    @Test
    void deveRetornarNumero_QuandoNaoForDivisivelPor3Ou5() {
        assertEquals("7", FizzBuzz.getResultado(7));
    }

    @Test
    void deveRetornarBang_QuandoNumeroPar() {
        // Este teste vai FALHAR propositalmente para demonstrar TDD Red
        // Vamos fingir que queremos uma nova regra: números pares retornam "Bang"
        assertEquals("Bang", FizzBuzz.getResultado(2));
    }
}