package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResultTest {

    Result result;

    @BeforeEach
    void beforeEach() {
        this.result = new Result();
    }

    @Test
    @DisplayName("스트라이크 체크 테스트")
    void isStrike1() {
        //when
        boolean strike1 = result.isStrike(List.of(1, 5, 9), List.of(7, 5, 1), 1);
        boolean strike2 = result.isStrike(List.of(1, 5, 9), List.of(7, 5, 1), 0);

        //then
        assertThat(strike1).isTrue();
        assertThat(strike2).isFalse();
    }

    @Test
    @DisplayName("스트라이크 카운트 테스트")
    void isStrike2() {
        //when
        result.isStrike(List.of(1, 5, 9), List.of(1, 7, 9), 0);
        result.isStrike(List.of(1, 5, 9), List.of(1, 7, 9), 2);

        //then
        assertThat(result.announceResult()).isEqualTo("2스트라이크");
    }

    @Test
    @DisplayName("볼 카운트 테스트")
    void countBall() {
        //when
        result.countBall(List.of(1, 5, 9), List.of(7, 9, 5), 1);
        result.countBall(List.of(1, 5, 9), List.of(7, 9, 5), 2);

        //then
        assertThat(result.announceResult()).isEqualTo("2볼");
    }
}