package org.campus02.rectanlge;

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