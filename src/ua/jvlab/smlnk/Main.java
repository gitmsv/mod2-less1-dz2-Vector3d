package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objtest.Vect3d;

public class Main {

    public static void main(String[] args) {

        Vect3d vect1 = new Vect3d(3,2,-2);

        System.out.println("Величины направленных отрезков: "+"\n");
        System.out.println("Абсцисса = "+vect1.magnitudeSegmAbs());
        System.out.println("Ордината = "+vect1.magnitudeSegmOrd());
        System.out.println("Аппликата = "+vect1.magnitudeSegmAppl());
    }
}
