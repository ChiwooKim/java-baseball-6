package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    public static final String DELIMITER = "";

    public static List<Integer> readNumbers() {
        String input = input();
        return Stream.of(input.split(DELIMITER))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static String input() {
        return Console.readLine();
    }
}
