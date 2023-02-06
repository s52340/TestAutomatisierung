package org.campus02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //Step 1: Set up brauchen wir hier nicht
    //Step 2: exercise
    @Test
    void add() {
        // das Ergebnis der Methode
        int result = Calculator.add(2,2);
        //erwartetes Ergebnis = 4
        int erwartet = 4;

        // Step 3: verify
        //Vergleiche erwartetes Ergebnis mit tatsächlichem
        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void subract() {
        // das Ergebnis der Methode

        //Step 3:
        Assertions.assertEquals(0, Calculator.subract(2,2));
    }

    @Test
    void multiply() {
        int result = Calculator.multiply(2,2);
        int erwartet = 4;

        Assertions.assertEquals(erwartet,result);

        // 2. Möglichkeit
        Assertions.assertEquals(6, Calculator.multiply(2,3));
        Assertions.assertEquals(12, Calculator.multiply(4,3));

    }
    //WEnn Fehler in Zeile 23 - Testet er Zeile 24 nicht mehr !!

}