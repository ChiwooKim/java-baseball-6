package baseball.view;

import baseball.util.Validator;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    public static final String DELIMITER = "";

    public static List<Integer> readNumbers() {
        String input = input();
        Validator.validateNumbersPattern(input);

        List<Integer> numbers = Stream.of(input.split(DELIMITER))
                .map(Integer::parseInt)
                .distinct()
                .collect(Collectors.toList());
        Validator.validateDuplication(numbers);
        return numbers;
    }

    public static int readNumber() {
        String input = input();
        Validator.validateNumberPattern(input);
        return Integer.parseInt(input);
    }

    private static String input() {
        return Console.readLine();
    }
}
