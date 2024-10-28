public class Drawing {

    private static Drawing instance;

    private Drawing() {}

    public static Drawing getInstance() {
        if (instance == null) {
            instance = new Drawing();
        }
        return instance;
    }

     public void drawShape(Shape shape) {
        System.out.println("Drawing a " + shape.getClass().getSimpleName() +
                           " with color: " + shape.getColor() +
                           " and area: " + shape.calculateArea());
    }
}