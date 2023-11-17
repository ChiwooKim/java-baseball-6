package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Referee;
import baseball.util.GameProgress;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    private final Computer computer;
    private final Referee referee;
    private GameProgress gameProgress;

    public GameController() {
        this.computer = new Computer();
        this.referee = new Referee();
        this.gameProgress = GameProgress.START;
    }

    public void play() {
        playOrEnd();
    }

    private void playOrEnd() {
        OutputView.printStart();
        while (!GameProgress.isQuit(gameProgress)) {
            OutputView.printInputNumbers();
            List<Integer> computerNumbers = computer.generateRandomNumbers();
            playUntilThreeStrikes(computerNumbers);
        }
    }

    private void playUntilThreeStrikes(List<Integer> computerNumbers) {
        List<Integer> userNumbers = InputView.readNumbers();
        referee.checkResult(userNumbers, computerNumbers);
    }
}
