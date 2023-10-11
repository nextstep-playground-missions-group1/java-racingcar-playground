import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final int tryCount;

    public RacingGame(String[] carNames, int tryCount) {
        this.cars = new Cars(carNames);
        this.tryCount = tryCount;
    }
    public void run() {
        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            cars.moveCars();
            ResultView.printCarsPosition(cars);
        }
        ResultView.printWinners(getWinners());
    }
    private List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        int maxPosition = getMaxPosition();

        for (Car car : cars.getCars()) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
    private int getMaxPosition() {
        int max = 0;
        for (Car car : cars.getCars()) {
            max = Math.max(max, car.getPosition());
        }
        return max;
    }



}
