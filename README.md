# java-lotto

로또 미션 진행을 위한 저장소



### 기능 구현 목록

1. 입력
   1. 구입 금액을 입력받는다.
   2. 지난 주 당첨 번호를 입력받는다.
2. 로또 번호
   1. 로또 번호는 1부터 45 사이의 정수다.
3. 로또
   1. 로또는 총 6자리로 구성된다.
      1. 숫자의 중복은 허용하지않는다.
   2. 로또는 하나의 1000원이다. 구입 금액만큼 로또가 생성된다.
      1. 1000원단위로 로또의 갯수가 정해진다.
4. 결과 계산
   1. 당첨 번호와 로또 번호의 일치 개수에 따라 등수가 정해진다.
      - 1등 ( 일치 개수 6개, 당첨 금액 20억 )
      - 2등 ( 일치 개수 5개, 당첨 금액 150만)
      - 3등 ( 일치 개수 4개, 당첨 금액 5만)
      - 4등 ( 일치 개수 3개, 당첨 금액 5천)
   2. 로또 구입 금액과 당첨 금액에 대한 총 수익률을 계산한다.
5. 출력
   1. 당첨 통계를 출력한다.
      1. 계산된 결과값 (등수, 수익률)을 출력한다.



