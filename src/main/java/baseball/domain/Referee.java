package baseball.domain;

import java.util.List;

public class Referee {

    private int ball;
    private int strike;

    public Referee() {
        this.ball = 0;
        this.strike = 0;
    }

    public void checkResult(List<Integer> userNumbers, List<Integer> computerNumbers) {
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i).equals(computerNumbers.get(i))) {
                strike++;
                continue;
            }

            if (computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
    }
}
