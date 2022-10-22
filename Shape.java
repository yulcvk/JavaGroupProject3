package Project3;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    public void calculateArea(){
        System.out.println("Area for Circle");
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter for Circle");
    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Area for Square");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter for Square");
    }
}
class TesterShaper{
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculateArea();
        shape.calculatePerimeter();
        Shape square=new Square();
        square.calculateArea();
        square.calculatePerimeter();    }
}