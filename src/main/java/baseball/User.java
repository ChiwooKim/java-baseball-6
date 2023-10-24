package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class User {

    private static final int NUMBER_LENGTH = 3;
    private static final Pattern pattern = Pattern.compile("([1-9]{3,3})");
    private String userInputNumber;

    public User() {
    }

    public void setUserInputNumber() {
        System.out.print(GameMessage.USER_INPUT_NUMBER_MESSAGE.getMessage());
        String inputNumber = Console.readLine();
        validateInputNumber(inputNumber);
        this.userInputNumber = inputNumber;
    }

    public String getUserInputNumber() {
        return userInputNumber;
    }

    private static void validateInputNumber(String inputNumber) {
        validateLength(inputNumber);
        validatePattern(inputNumber);
    }

    private static void validatePattern(String inputNumber) {
        if (!pattern.matcher(inputNumber).matches()) {
            throw new IllegalArgumentException(GameMessage.INPUT_DIGIT_ERROR_MESSAGE.getMessage());
        }
    }

    private static void validateLength(String inputNumber) {
        if (inputNumber.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException(GameMessage.INPUT_LENGTH_ERROR_MESSAGE.getMessage());
        }
    }
}
