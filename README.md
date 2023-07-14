# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  - 로또 구입 금액을 입력할 수 있다. -> view
  - 금액에 맞는 로또를 발급한다. -> LottoService
  - 발급받은 로또를 관리하는 클래스 -> Lottos
- 로또 1장의 가격은 1000원이다.
  - ex) 14500원 -> 천 단위로 처리하고 버린다. -> LottoService
- 로또 (구매)
  - 6개의 숫자로 구성된다. -> Lotto 클래스
  - 1 ~ 45의 범위를 가진다. -> LottoNumber 클래스
  - 로또를 구매할 때 랜덤으로 숫자 6개를 뽑는다. (자동) -> RandomGenerator
  - 로또의 각 번호는 중복되면 안된다. -> Lotto 클래스
- 당첨 번호
  - 6개의 당첨 숫자 + 1개의 보너스 번호로 구성된다. -> WinningLotto 클래스
  - 각 번호가 중복되면 안된다. -> WinningLotto 클래스가 보너스 번호 검증 책임
  - 당첨 번호를 입력받는다. -> view
- 당첨 금액 -> LottoService
  - 번호가 3개 일치하면 5,000원을 받는다.
  - 번호가 4개 일치하면 50,000원을 받는다.
  - 번호가 5개 일치하면 1,500,000원을 받는다.
  - 번호가 5개, 보너스 번호가 일치하면 30,000,000원을 받는다.
  - 번호가 6개 일치하면 2,000,000,000원을 받는다.
- 총 수익률 -> LottoService
  - 총 수익금 / 구매한 금액을 출력한다.
  - 소수점 두자리까지만 출력한다.

## 프로그래밍 요구사항
- indent(인덴트, 들여쓰기) depth를 2단계에서 1단계로 줄여라.
  - depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- else를 사용하지 마라.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
  - method가 한 가지 일만 하도록 최대한 작게 만들어라.
- 배열 대신 ArrayList를 사용한다.
- java enum을 적용해 프로그래밍을 구현한다.
- 규칙 3: 모든 원시값과 문자열을 포장한다.
- 규칙 5: 줄여쓰지 않는다(축약 금지).
- 규칙 8: 일급 콜렉션을 쓴다.