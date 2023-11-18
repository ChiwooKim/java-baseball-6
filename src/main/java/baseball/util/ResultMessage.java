package baseball.util;

import java.util.Arrays;
import java.util.List;

public enum ResultMessage {
    NOTHING("낫싱", List.of(0), List.of(0)),
    BALL("%d볼", List.of(1, 2, 3), List.of(0)),
    STRIKE("%d스트라이크", List.of(0), List.of(1, 2, 3)),
    BALL_AND_STRIKE("%d볼 %d스트라이크", List.of(1, 2), List.of(1, 2));

    private final String message;
    private final List<Integer> ballNumbers;
    private final List<Integer> strikeNumbers;

    ResultMessage(String message, List<Integer> ballNumbers, List<Integer> strikeNumbers) {
        this.message = message;
        this.ballNumbers = ballNumbers;
        this.strikeNumbers = strikeNumbers;
    }

    public static String getResultMessage(int ball, int strike) {
        return Arrays.stream(ResultMessage.values())
                .filter(resultMessage -> resultMessage.ballNumbers.contains(ball))
                .filter(resultMessage -> resultMessage.strikeNumbers.contains(strike))
                .findFirst().get().getMessage();
    }

    public String getMessage() {
        return message;
    }

    public List<Integer> getBallNumbers() {
        return ballNumbers;
    }

    public List<Integer> getStrikeNumbers() {
        return strikeNumbers;
    }
}
