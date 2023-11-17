package baseball.util;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern REGEX_NUMBERS = Pattern.compile("^[1-9]{3}$");

    public static void validate(String input) {
        validateNumbersPattern(input);
    }

    private static void validateNumbersPattern(String input) {
        if (!REGEX_NUMBERS.matcher(input).matches()) {
            throw new IllegalArgumentException("1부터 9까지의 숫자 중 3가지 숫자를 입력해주세요.");
        }
    }
}
