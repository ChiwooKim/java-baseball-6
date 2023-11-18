package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Referee;
import baseball.domain.Result;
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

            OutputView.printRetryOrEnd();
            gameProgress = GameProgress.judgeEnd(InputView.readNumber());
        }
    }

    private void playUntilThreeStrikes(List<Integer> computerNumbers) {
        while (!GameProgress.isQuit(gameProgress)) {
            Result result = referee.judge(InputView.readNumbers(), computerNumbers);
            OutputView.printResult(result.announceResult());
            judgeRetry(result);
        }
    }

    private void judgeRetry(Result result) {
        if (!result.isThreeStrikes()) {
            gameProgress = GameProgress.RETRY;
            return;
        }
        OutputView.printGameEnd();
        gameProgress = GameProgress.QUIT;
    }
}
