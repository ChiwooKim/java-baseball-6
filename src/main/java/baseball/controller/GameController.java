package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    public void play() {
        OutputView.printStart();
        List<Integer> numbers = InputView.readNumbers();
    }
}
