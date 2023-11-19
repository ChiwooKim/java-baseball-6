package baseball;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("중복값 입력")
    void 예외_테스트2() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("122"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("중복된 숫자가 존재합니다. 다시 입력해주세요.")
        );
    }

    @Test
    @DisplayName("숫자가 아닌 값 입력")
    void 예외_테스트3() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("one"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("1부터 9까지의 숫자 중 3가지 숫자를 입력해주세요.")
        );
    }

    @Test
    @DisplayName("재시작, 종료 선택시 1,2가 아닌 값 입력")
    void 예외_테스트4() {
        assertRandomNumberInRangeTest(
                () -> {
                    assertThatThrownBy(() -> runException("246", "135", "3"))
                            .isInstanceOf(IllegalArgumentException.class)
                            .hasMessageContaining("재시작을 원하면 1, 종료를 원하면 2를 입력해주세요.");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
