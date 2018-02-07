public class Circle {
    double x;
    double y;
    double radius;
    double area;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean isAreasEqual(Circle circle) {
        return this.area == circle.area;
    }

    public void area() {
        area = Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 12);
        Circle circle2 = new Circle(3, 5, 11);
        circle1.area();
        circle2.area();
        if (circle1.isAreasEqual(circle2)) {
            System.out.println("Площади фигур равны");
        } else System.out.println("Фигуры имеют разные площади");

    }
}
