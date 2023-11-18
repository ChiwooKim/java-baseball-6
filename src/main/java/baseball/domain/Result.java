package baseball.domain;

import baseball.util.ResultMessage;
import java.util.List;

public class Result {

    private static final int DEFAULT_NUMBER = 0;

    private int ball;
    private int strike;

    public Result() {
        this.ball = DEFAULT_NUMBER;
        this.strike = DEFAULT_NUMBER;
    }

    public boolean isStrike(List<Integer> userNumbers, List<Integer> computerNumbers, int index) {
        if (userNumbers.get(index).equals(computerNumbers.get(index))) {
            strike++;
            return true;
        }
        return false;
    }

    public void countBall(List<Integer> userNumbers, List<Integer> computerNumbers, int index) {
        if (computerNumbers.contains(userNumbers.get(index))) {
            ball++;
        }
    }

    public boolean hasBall() {
        return ball > DEFAULT_NUMBER;
    }

    public String announceResult() {
        return ResultMessage.getResultMessage(ball, strike);
    }
}
