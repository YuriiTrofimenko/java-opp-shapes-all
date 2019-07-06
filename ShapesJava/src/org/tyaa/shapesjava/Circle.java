package org.tyaa.shapesjava;

public class Circle extends AbstractShape implements IScalable {

    public Point centerPoint;

    public Double radius;

    @Override
    public void show() {
        System.out.println("Center: " + centerPoint.getX() + "; " + centerPoint.getY() + "; Radius :" + radius);
    }

    @Override
    public void scale(Double _zoom) {
        radius = radius * _zoom;
    }
}
