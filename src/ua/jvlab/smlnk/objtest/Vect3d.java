package ua.jvlab.smlnk.objtest;

public class Vect3d {

    private int x;
    private int y;
    private int h;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Vect3d(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public Vect3d() {

    }

    public int magnitudeSegmAbs() {
        int abscissa = x - 0;
        return abscissa;

    }

    public int magnitudeSegmOrd() {
        int ordinate = y - 0;
        return ordinate;

    }

    public int magnitudeSegmAppl() {
        int applique = h - 0;
        return applique;

    }

}
