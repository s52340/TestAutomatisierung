package org.campus02.rectangle;

public class Rectangle {
    // Rechteck

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int berechneUmfang(){
        int umfang = (2 * a) + (2 * b);
        return umfang;
    }

    public int berechneFlaeche(){
        int flaeche = a * b;
        return flaeche;
    }

}
