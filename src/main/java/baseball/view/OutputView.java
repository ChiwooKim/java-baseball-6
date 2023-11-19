package baseball.view;

public class OutputView {

    public static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String INPUT_NUMBERS_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String RETRY_OR_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printStart() {
        System.out.println(START_MESSAGE);
    }

    public static void printInputNumbers() {
        System.out.println(INPUT_NUMBERS_MESSAGE);
    }

    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void printGameEnd() {
        System.out.println(GAME_END_MESSAGE);
    }

    public static void printRetryOrEnd() {
        System.out.println(RETRY_OR_END_MESSAGE);
    }
}
