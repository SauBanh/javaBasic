public class Square implements Shape{

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public void draw() {
        System.err.println(" _______________");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println("|              |");
        System.err.println(" --------------");
    }

    public String getShapeType() {
        return "2D";
    }

}
