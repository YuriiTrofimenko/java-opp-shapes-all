package org.tyaa.shapesjava;

public class Point extends AbstractShape {

    private Double x;

    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public void show() {
        System.out.println(x + "; " + y);
    }

    
}
