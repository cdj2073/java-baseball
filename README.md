# java-baseball

## 깃허브

**[java-baseball](https://github.com/programmers-lecture/java-baseball)**

## 요구사항

1. 상대방(컴퓨터)의 3자리 수를 정합니다.
2. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.

- 예) 상대방(컴퓨터)의 수가 425일 때
  - 123을 제시한 경우 : 1스트라이크
  - 456을 제시한 경우 : 1볼 1스트라이크
  - 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
     이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다. 
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다. 
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다. 
- 아래의 프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다. 

## 프로그램 실행 결과
```jsx
숫자를 입력해주세요 : 123
1볼 1스트라이크
숫자를 입력해주세요 : 145
1볼 
숫자를 입력해주세요 : 671
2볼 
숫자를 입력해주세요 : 216
1스트라이크 
숫자를 입력해주세요 : 713
3스트라이크 
3개의 숫자를 모두 맞히셨습니다! 게임 종료
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
1
숫자를 입력해주세요 : 123
1볼
```

## 미션 가이드 (학생)

1. ReadMe에 각 객체에 대한 간단한 다이어그램(설명)을 작성한다.
2. ReadMe에 각 요구사항에 대한 체크 리스트를 작성한다.
3. 커밋은 최소한의 단위로 진행한다.
4. 객체지향 생활 체조를 지켜서 개발한다.

   [객체지향 생활 체조 총정리](https://developerfarm.wordpress.com/2012/02/03/object_calisthenics_summary/)


## 요구사항 checklist
- [x] 세 자리의 랜덤 수 생성 (중복된 숫자 x)
- [x] 세 자리 수 입력 받기
  - [x] 잘못된 값 입력 시 IllegalArgumentException 발생시킨 후 애플리케이션 종료
- [x] 스트라이크, 볼, 아웃 판별
- [x] 결과 출력
- [x] 세 자리 수를 모두 맞히면 게임 종료
  - [x] 다시 게임 시작 or 완전히 종료

## Class Diagram
- BaseballGame
  - Computer
  - Player
  - Judgement
  - 게임 진행
- Computer
  - Numbers
  - 3자리 수 생성하기
- Player
  - 숫자 입력하기
- Judgement
  - strike, ball, out 판별하기
- Numbers
  - 중복 없는 세 자리 수
- NumberGenerator
  - 숫자 생성
- RandomNumberGenerator
  - 0-9 랜덤 숫자 생성