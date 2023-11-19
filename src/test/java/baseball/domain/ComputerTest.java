package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    @DisplayName("컴퓨터가 생성 하는 수가 3개인지 확인")
    void generateRandomNumbers() {
        Computer computer = new Computer();

        List<Integer> numbers = computer.generateRandomNumbers();

        assertThat(numbers.size()).isEqualTo(3);
    }
}