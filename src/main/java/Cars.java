import java.util.ArrayList;
import java.util.List;
public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public Cars(String[] carNames) {
        for(String name : carNames) {
            cars.add(new Car(name));
        }
    }
    public void moveCars() {
        for (Car car : cars) {
            int randomNumber = (int)(Math.random() * 10);
            car.move(randomNumber);
        }
    }
    public List<Car> getCars() {
        return cars;
    }

}
