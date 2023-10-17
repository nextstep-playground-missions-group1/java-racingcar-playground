import java.util.List;

public class ResultView {
    public static void printCarsPosition(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printWinners(List<String> winners) {
        System.out.print(winners.get(0));
        for (int i = 1; i < winners.size(); i++) {
            System.out.print(", " + winners.get(i));
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
