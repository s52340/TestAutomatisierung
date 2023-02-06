package org.campus02.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle;

    //ALT + Einfg - automatisch generieren lassen
    @BeforeEach
    void setUp(){
        rectangle = new Rectangle(2,4);
    }

    @Test
    void berechneUmfang() {
        int umfang = rectangle.berechneUmfang();
        Assertions.assertEquals(12, umfang);
    }

    @Test
    @DisplayName("Teste die Berechnung der Fläche")
    void berechneFlaeche() {

        Assertions.assertEquals(8,rectangle.berechneFlaeche());
    }


}