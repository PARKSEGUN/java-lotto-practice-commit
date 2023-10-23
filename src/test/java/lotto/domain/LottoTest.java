package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.catchThrowable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lotto.service.LottoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호가 1~45 범위를 벗어나면 예외가 발생한다.")
    @Test
    void createLottoByOverRangeNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 46)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("랜덤으로 지정한 번호에 예외는 없는지 확인한다.")
    @Test
    void 랜덤으로_지정한_번호에_예외는_없는지_확인한다() {
        Throwable result = catchThrowable(() -> {
            LottoService.makeLotto();
        });
        assertThat(result).doesNotThrowAnyException();
    }

    @DisplayName("보너스 번호가 기존의 당첨 번호와 중복된다면 예외가 발생한다")
    @Test
    void 보너스_번호가_기존의_당첨_번호와_중복된다면_예외가_발생한다() {
        //given
        Lotto lotto = new Lotto(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6)));
        int bonusNumber = 6;
        //when
        Throwable result = catchThrowable(() -> lotto.validateLottoNotContainsLottoNumber(bonusNumber));
        //then
        assertThat(result).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력한 당첨번호와 보너스번호를 비교해서 당첨내용 추출")
    @Test
    void 입력한_당첨번호와_보너스번호를_비교해서_당첨내용_추출() {
        //given
        Lotto lotto1 = new Lotto(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Lotto lotto2 = new Lotto(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 7)));
        Lotto winningLotto = new Lotto(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6)));
        int bonusNumber = 7;
        LottoUser lottoUser = new LottoUser(0);
        LottoWinning reusltLottoWinning1 = LottoWinning.FIRST;
        LottoWinning reusltLottoWinning2 = LottoWinning.SECOND;
        //when
        lottoUser.addLotto(lotto1);
        lottoUser.addLotto(lotto2);
        List<LottoWinning> lottoWinnings = lottoUser.confirmWinningLotto(winningLotto, bonusNumber);
        //then
        assertThat(reusltLottoWinning1).isEqualTo(lottoWinnings.get(0));
        assertThat(reusltLottoWinning2).isEqualTo(lottoWinnings.get(1));
    }
}
