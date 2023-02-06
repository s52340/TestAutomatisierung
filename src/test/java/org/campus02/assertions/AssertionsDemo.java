package org.campus02.assertions;

import org.junit.jupiter.api.*;

public class AssertionsDemo {
    // 1.Step Set up
    int a;
    String s;

    //wird vor jedem Testcase (@Test) aufgerufen
    @BeforeEach     // alles selber geschrieben
    void setUp(){
        a = 1;
        s = "Hallo Welt";     // Man kann hier auch instanzen von Klassen erstellen
        System.out.println("before each");
    }

    // 2.Step Exercise

    @Test
    @DisplayName("Test assertEquals") //was links unten in der Konsole angezeit werden soll - Namen geben
    void assertEqualsTest(){
        //assertEquals(expected Value, actual Value)
        // kurz: es werden 2 Werte miteinander verglichen
        int actual = 1;

        // Step 3: Verify -- passiert immer in Exercise
        Assertions.assertEquals(a, actual);
    }
    @Test
    void assertTrueTest(){       //Überprüft ob die Bedingungen zutreffen; wenn ein boolean zurückgegeben wird
        String halloWelt = "hallo welt";
        String lower = s.toLowerCase();

        Assertions.assertTrue(halloWelt.equals(lower));   // wir erwarten True als ergebnis
        Assertions.assertTrue(a > 0);

    }

    @Test
    void assertFalseTest(){      // Wir prüfen ob Bedingung Falsch ist
        //Assertions.assertFalse(a > 0);     //a > 0 = true - aber wir testen ob es falsch ist - daher schlägt Test fehl!
        Assertions.assertFalse(a < 0);
    }

    @Test
    void assertThrowsTest(){
        int[] array = new int[1];  // standartmäßig Stelle 0 = 0

       // int i = array[1]; brauche ich wegen Zeile unten nicht
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> { int i = array[1];});  // NICHT Prüfungsrelevant!!
    }

    // 4.Step tear - down
    @AfterEach
    void tearDown(){
        //wird nach jedem Testcase ausgeführt
        System.out.println("after each");
    }


}
