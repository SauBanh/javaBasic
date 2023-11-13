public class Main {
    public static void main(String[] args) {
        displayShape(new Square());
    }

    static void displayShape(Shape shape) {
        System.out.println(shape.getName());
        shape.draw();
        System.out.println("Sides: " + shape.getSideCount());
        if (shape instanceof Square) {
            Square square = (Square) shape;
            System.out.println(square.getShapeType());            
        }
    }
}