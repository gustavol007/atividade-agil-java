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

    // ✅ TESTE GREEN - Este deve passar no GitHub Actions
    @Test
    void testeGreen_DevePassar() {
        assertEquals("Buzz", FizzBuzz.getResultado(25)); // 25 é divisível por 5
        assertEquals("Fizz", FizzBuzz.getResultado(6));  // 6 é divisível por 3
        assertEquals("FizzBuzz", FizzBuzz.getResultado(30)); // 30 é divisível por ambos
    }

    // ❌ TESTE RED - Este deve falhar no GitHub Actions (descomente para testar)
    // @Test 
    // void testeRed_DeveFalhar() {
    //     assertEquals("Fizz", FizzBuzz.getResultado(25)); // 25 retorna "Buzz", não "Fizz" - FALHA PROPOSITAL
    // }
}