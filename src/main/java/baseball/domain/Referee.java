package baseball.domain;

import java.util.List;

public class Referee {

    private int ball;
    private int strike;

    public void checkResult(List<Integer> userNumbers, List<Integer> computerNumbers) {
        List<Integer> result = countBallAndStrike(userNumbers, computerNumbers);
        this.ball = result.get(0);
        this.strike = result.get(1);
    }

    private List<Integer> countBallAndStrike(List<Integer> userNumbers, List<Integer> computerNumbers) {
        int ball = 0;
        int strike = 0;
        
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i).equals(computerNumbers.get(i))) {
                strike++;
                continue;
            }
            if (computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
        return List.of(ball, strike);
    }
}
