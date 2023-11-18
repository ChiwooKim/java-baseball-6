package baseball.domain;

import java.util.List;

public class Result {

    private static final int DEFAULT_NUMBER = 0;
    private static final int END_NUMBER = 3;

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

    public boolean isThreeStrikes() {
        return strike == END_NUMBER;
    }

    public String announceResult() {
        if (ball == 0 && strike == 0) {
            return Message.NOTHING.getMessage();
        }
        if (ball == 0) {
            return String.format(Message.STRIKE.getMessage(), strike);
        }
        if (strike == 0) {
            return String.format(Message.BALL.getMessage(), ball);
        }
        return String.format(Message.BALL_AND_STRIKE.getMessage(), ball, strike);
    }

    private enum Message {
        NOTHING("낫싱"),
        BALL("%d볼"),
        STRIKE("%d스트라이크"),
        BALL_AND_STRIKE("%d볼 %d스트라이크");

        private final String message;

        Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
