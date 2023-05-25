/*3) Переписать код в соответствии с Interface Segregation Principle:
public interface Shape {
double area();
double volume();
}
public class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double area() {
return 2 * 3.14 * radius;
}
@Override
public double volume() {
throw new UnsupportedOperationException();
}
}
public class Cube implements Shape {
private int edge;
public Cube(int edge) {
this.edge = edge;
}
@Override
public double area() {
return 6 * edge * edge;
}
@Override
public double volume() {
return edge * edge * edge;
}
}

Подсказка: круг не объемная фигура и этому классу не нужен метод volume().
*/

package for_HW_Java.Homework7;

public class InterfaceSegregationPrinciple {

    //Интерфейс для двумерных фигур
    public interface TwoDimensionalShape {
        double area();
    }
    
    //Интерфейс для трехмерных фигур
    public interface ThreeDimensionalShape {
        double volume();
    }
    
    //Класс Circle - круг
    public class Circle implements TwoDimensionalShape {
        private double radius; //радиус круга
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }
    
    //Класс Cube - куб
    public class Cube implements ThreeDimensionalShape, TwoDimensionalShape {
        private int edge; //длина ребра куба
    
        public Cube(int edge) {
            this.edge = edge;
        }
    
        @Override
        public double area() {
            return 6 * edge * edge;
        }
    
        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
}