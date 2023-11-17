package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    private static final int NUMBERS_LENGTH = 3;
    private static final int START_RANGE_NUMBER = 1;
    private static final int END_RANGE_NUMBER = 9;

    public static List<Integer> generateRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < NUMBERS_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(START_RANGE_NUMBER, END_RANGE_NUMBER);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
