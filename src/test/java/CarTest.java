import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void createCarWithValidName() {
        Car car = new Car("test");
        assertEquals("test", car.getName());
    }

    @Test
    public void throwExceptionForInvalidNameLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Car("tooLongName");
        });
    }

    @Test
    public void moveCarBasedOnRandomNumber() {
        Car car = new Car("test");
        car.move(5);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void notMoveCarBasedOnRandomNumber() {
        Car car = new Car("test");
        car.move(3);
        assertEquals(0, car.getPosition());
    }
}
