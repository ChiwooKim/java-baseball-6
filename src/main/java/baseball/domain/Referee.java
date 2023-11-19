package baseball.domain;

import java.util.List;

public class Referee {

    public Result judge(List<Integer> userNumbers, List<Integer> computerNumbers) {
        Result result = new Result();
        for (int i = 0; i < userNumbers.size(); i++) {
            if (result.isStrike(userNumbers, computerNumbers, i)) {
                continue;
            }
            result.countBall(userNumbers, computerNumbers, i);
        }
        return result;
    }
}
