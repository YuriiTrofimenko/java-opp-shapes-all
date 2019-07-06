/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.shapesjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class ShapesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.centerPoint = new Point(10d, 50d);
        c.radius = 30d;
        /*c.show();
        c.scale(2);
        c.show();*/
        
        //System.out.println("***");
        
        Rectangle r = new Rectangle();
        r.startPoint = new Point(35d, 40d);
        r.height = 100d;
        r.width = 250d;
        /*r.show();
        r.scale(2);
        r.show();*/
        
        //System.out.println("***");
        
        //Создали список для объектов любых фигур,
        //классы которых наследуют класс AbstractShape
        List<AbstractShape> shapes = new ArrayList<>();
        shapes.add(r);
        shapes.add(c);
        //Для каждого объекта в списке выполняем действия,
        //описанные в фигурных скобках
        shapes.forEach((shape) -> {
            shape.show();
            ((IScalable)shape).scale(0.33);
            shape.show();
            System.out.println("***");
        });
    }
    
}
