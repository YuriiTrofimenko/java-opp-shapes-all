package org.tyaa.shapesjava;

public class Rectangle extends AbstractShape implements IScalable {

    public Point startPoint;

    public Double width;

    public Double height;

    @Override
    public void show() {
        System.out.println("Rectangle: [StartPoint: x = " + startPoint.getX() + "; y = " + startPoint.getY() + "; width = " + width + "; height = " + height +"]");
    }

    @Override
    public void scale(Double _zoom) {
        width = width * _zoom;
        height = height * _zoom;
    }
}
