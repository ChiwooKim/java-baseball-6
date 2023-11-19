package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RefereeTest {

    @Test
    @DisplayName("볼, 스트라이크 판단하는 테스트")
    void judge() {
        //given
        Referee referee = new Referee();
        List<Integer> userNumbers = List.of(1, 5, 9);
        List<Integer> computerNumbers = List.of(7, 5, 1);

        //when
        Result result = referee.judge(userNumbers, computerNumbers);

        //then
        assertThat(result.announceResult()).isEqualTo("1볼 1스트라이크");
    }
}