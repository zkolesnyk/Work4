import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void isAreasEqualTest() {
        Circle circle1 = new Circle(0, 0, 15);
        Circle circle2 = new Circle(3, 5, 25);
        circle1.area();
        circle2.area();

        assertEquals(circle1.isAreasEqual(circle2), true);
    }
}