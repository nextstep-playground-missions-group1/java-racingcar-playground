import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarsTest {
    @Test
    public void createCarsFromNames() {
        Cars cars = new Cars(new String[] {"a", "b"});
        assertEquals(2, cars.getCars().size());
    }
}
