package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoUserTest {
    @DisplayName("로또를 생성하는데 예외가 발생하지 않는지_테스트")
    @Test
    void 로또를_생성하는데_예외가_발생하지_않는지_테스트() {
        //given
        int purchaseLottoCount = 5;
        //when
        Throwable throwable = catchThrowable(() -> new LottoUser(purchaseLottoCount));
        //then
        assertThat(throwable).doesNotThrowAnyException();

    }
    @DisplayName("로또를 추가할때 정상적으로 추가되는지")
    @Test
    void 입력한_당첨번호와_보너스번호를_비교해서_당첨내용_추출() {
        //given
        int purchaseLottoCount = 5;
        //when
        Throwable throwable = catchThrowable(() -> new LottoUser(purchaseLottoCount));
        //then
        assertThat(throwable).doesNotThrowAnyException();

    }
}
