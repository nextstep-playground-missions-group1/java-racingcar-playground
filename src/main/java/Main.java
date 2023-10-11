public class Main {
    public static void main(String[] args) {
        String[] carNames = InputView.getCarNames();
        int tryCount = InputView.getTryCount();

        RacingGame racingGame = new RacingGame(carNames, tryCount);
        racingGame.run();
    }

}
