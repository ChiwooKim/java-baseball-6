package baseball.domain;

import java.util.List;

public class Result {

    private int ball;
    private int strike;

    public Result() {
        this.ball = 0;
        this.strike = 0;
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
}
