package baseball.util;

import java.util.List;
import java.util.regex.Pattern;

public class Validator {

    private static final Pattern REGEX_NUMBERS = Pattern.compile("^[1-9]{3}$");
    private static final int NUMBERS_LENGTH = 3;

    public static void validateDuplication(List<Integer> input) {
        if (input.size() < NUMBERS_LENGTH) {
            throw new IllegalArgumentException("중복된 숫자가 존재합니다. 다시 입력해주세요.");
        }
    }

    private static void validateNumbersPattern(String input) {
        if (!REGEX_NUMBERS.matcher(input).matches()) {
            throw new IllegalArgumentException("1부터 9까지의 숫자 중 3가지 숫자를 입력해주세요.");
        }
    }
}
