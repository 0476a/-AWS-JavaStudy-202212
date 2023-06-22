# -AWS-JavaStudy-202212

### [📖기술블로그(JAVA)](https://donotthinkjustdo.tistory.com/category/JAVA/%EC%82%B0%EB%8C%80%ED%8A%B9%28%EC%9E%90%EB%B0%94%29)
### [📖기술블로그(DB)](https://donotthinkjustdo.tistory.com/category/DB/%EC%82%B0%EB%8C%80%ED%8A%B9%28DB%29)

### JAVA 진행기간 2022.12.28 ~ 2023.03.02
### DB 진행기간 2023.01.19 ~ 2023.02.02
___

#### 📅 2022.12.28

##### 1) 프로그램
  - 짜여진 순서대로 실행되는 것
  - 언어: 의사소통의 도구
  - 기계어: 0 또는 1 컴퓨터가 이해할 수 있는 언어
  - 고급언어: 사람이 이해하기 쉬운 언어
  - 저급언어: 컴퓨터가 이해하기 쉬운 언어
  - 컴파일러: 사람의 언어로 명령한 소스코드를 컴퓨터가 알아 듣도록 변역해주는 역할

##### 2) JAVA
  - 제임스 고슬링이 만듬.
  - 한번 작성하면 어디서든 실행됨.
  - JVM(자바가상기계)를 만들어 JVM만 깔려있으면 어떤 하드웨어여도 상관없이 컴파일 가능 -> 컴파일러 통일
  - JVM: 바이트코드 사용
  - 클래스로딩: 클래스 단위로 소스코드 생성 필요한 클래스만 로딩해서 사용가능
  - 안정적인 언어(가비지 컬렉터): 동적 메모리 관리에 따른 쓰레기 값 자동 수거

##### 3) JDK 설치 및 환경변수 설정
  - JDK: JAVA 소스파일을 컴파일하고 실행하기 위해 필요 -> JDK 11버전 사용
  - 환경변수: 프로세스가 컴퓨터에서 동작하는 방식에 영향을 미치는 동적인 값들의 모임

##### 4) Spring tool 다운 및 설정
  - Spring 개발업체인 SpringSource가 직접 만들어 제공하는 이클립스의 확장판

___

#### 📅 2023.01.02

##### 1) 변수
  - 변하는 수
  - 자료형 + 변수명
  - 데이터를 담을 수 있는 통
  - 자료형: 사이즈, 변수명: 통의 이름
  - 제약사항이 존재함
  - 카멜표기법 사용 (스네이크 표기법, 헝가리안 표기법 등도 존재함)

##### 2) 자료형
  - 정수형, 문자형, 실수형, 논리형

##### 3) 상수
  - 항상 변하지 않는 값
  - 상수는 선언하면 무조건 초기화 필수
  - final 사용
  - 대문자로 표기하고 스네이크 표기법 사용

##### 4) 리터럴
  - 이미 정해져있는 값을 의미함

##### 5) 형 변환
  - 업캐스팅: 값이 작은 범위에서 큰 범위로의 형 변환(묵시적 형 변환)
  - 다운캐스팅: 값이 큰 범위에서 작은 범위로의 형 변환(명시적 형 변환)

___

#### 📅 2023.01.03

##### 1) 연산자
  - 연산에 사용되어지는 기호

##### 2) 문자열
  - 여러 문자를 하나로 묶은 것
  - 기본 자료형 X

##### 3) 스케너
  - 표준 입력: 콘솔에 키보드 입력을 받는 클래

___

#### 📅 2023.01.04

##### 1) 조건문(if문)
  - if: 가정적 조건을 나타냄
  - else: 이미 언급된 것에 덧붙여 또 다른, 혼자 사용불가

##### 2) 조건문(switch case문)
  - 해당 조건에 맞는 case를 찾는 문법
  - break: 제어문을 탈출, 제어문 흐름 중 break 이후 명령을 실행하지 않고 빠져나옴

##### 3) 반복문(for문)
  - 동일한 계산 또는 명령을 순차적으로 반복해야하는 경우
  - 순서가 있는 경우 사

##### 4) 반복문(while문)
  - 순서보다 조건이 중요할 때 사용

___

#### 📅 2023.01.05

##### 1) 매서드
  - 함수: 특정 기능을 정의한 코드들의 집합
  - 메서드: 함수의 종류 중 클래스 내부에 정의되어 있는 함수

##### 2) 객체지향언어
  - 객체: 세상에 존재하는 모든 것
  - 프로그래밍 관점에서는 객체들의 관계성을 사용하여 순차적으로 수행되는 프로그램 내에서 객체들 간에 관계를 형성하여 프로그램을 동작하게 함.
  - 특징
    - 상속: 상위 클래스의 모든 것을 상속받아 사용하는 것
    - 캡슐화: 데이터와 기능을 외부로부터 접근을 차단하고 권한 또는 절차 없이 데이터를 변경 또는 기능 수행을 할 수 없게 캡슐처럼 보호함 (데이터 은닉성)
    - 추상화: 추상적인 요소들을 묶어서 분류하는 것
    - 다형성: 객체의 기능이 다양한 형태를 가질 수 있음 (형 변환, 오버로딩, 오버라이드)
  - 장점
    - 재사용성: 상속을 통해 코드의 재사용을 높임
    - 생산성 향상: 클래스 단위의 부품들을 조립
    - 유지보수의 우수성: 구조화 된 소스코드 클래스 단위로 소스코드를 관리할 수 있음.
  - 단점
    - 객체를 세분화하여 설계해야함
    - 실행 속도가 절차지향 언어 대비 느림
    - 상속으로 인하여 관계가 많이 형성되면 코딩의 난이도가 높아짐.
  - 객체지향언어도 절차지향언어에 속하지만 객체의 관계가 추가된 것임.

##### 3) 클래스
  - 객체에 대하여 정의해 놓은 설계도 혹은 틀
  - 참조 자료형임.
  - 객체: 클래스를 통해 구현할 수 있는 모든 대상
  - 인스턴스: 객체가 실제로 구현된 것

##### 4) 생성자
  - 생성시에 호출됨.
  - 오버로딩이 가능
  - 기본 생성자는 기본적으로 활성화되면서 생략되어 있지만 오버로딩 시 비활성화됨. -> 비활성화 되면 다시 생성해서 사용가능
  - 기본생성자, AllArgsConstructor, 사용자 정의 생성자, RequiredArgsConstructor가 존재함.

___

#### 📅 2023.01.06

##### 1) 접근지정자
  - default: 동일 패키지 내에서만 참조가능
  - private: 동일 클래스에서만 참조가능
  - public: 모든 곳에서 참조가능
  - 데이터의 은닉성을 위해서 모든 멤버 변수들은 private를 선언해준다.
  - prviate 변수에 접근을 위해 getter와 setter를 생성해준다.
    - getter: 값을 확인할 때 사용
    - setter: 값을 수정할 떄 사용
   
##### 2) github
  - git: 컴퓨터 파일의 변경사항을 추적하고 여러 명의 사용자들 간에 해당 파일 작업 조율하고 스냅샷 스트림 기반의 분산버전 관리 시스템
  - github 기본적인 사용
  - sourcetree 사용

___

#### 📅 2023.01.09

##### 1) 배열
  - 동일한 자료형의 데이터를 연속된 공간에 저장하기 위한 자료구조
  - 연관된 데이터를 그룹화하여 묶어줌.

##### 2) 리팩터링
  - 기존 소스코드를 정리하는 개념

___

#### 📅 2023.01.10

##### 1) 상속
  - 이미 구현된 클래스를 상속받아서 속성이나 기능을 확장하여 클래스 구현

##### 2) 추상클래스
  - 추상: 공통된 것을 묶어 두는 것
  - 추상 클래스: 추상적인 것들만 모아두는 클래스

##### 3) 인터페이스
  - 쉽게 생각하면 도구이다.
  - 인터페이스는 여러개 사용가능
  - 관계성을 잘보고 설계 해야함.

___

#### 📅 2023.01.11 ~ 2023.01.12

##### 1) Object 클래스
  - 가장 최상위 클래스
  - toString: 클래스의 정보를 출력함
  - hashCode: 데이터를 다루는 기법 중에 하나로 검색과 저장이 아주 빠르게 진행됨.
  - getClass: 생성된 객체의 주소값을 참조할 때 사용
  - equals: String을 비교할 때 사용
  - finalize: 소멸 시키고 싶지 않은 데이터가 있을 경우 소멸 후에 다시 그 객체를 생성해줌.

##### 2) static
  - 메모리 공간이 따로 존재해서 해당 메모리 공간은 모두가 공유하는 메모리 공간임.

##### 3) 싱글톤
  - 싱글톤을 사용할 때는 유일하게 하나만 존재하는 객체들

___

#### 📅 2023.01.13

##### 1) 제네릭
  - 데이터의 타입을 일반화 한다는 것을 의미함
  - 클래스나 메서드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법
  - 와일드카드: 어떠한 자료형이든 들어올 수 있음

##### 2) Lombok 사용
  - JAVA 라이브러리이며, 반복되는 getter, setter, toString 등의 메서드 작성 코드를 줄여주는 라이브러리
  - 어노테이션 기반으로 코드를 자동완성 해주는 라이브러리

___

#### 📅 2023.01.16

##### 1) 컬렉션
  - 프레임워크: 플레임(틀) + 워크(일) 틀안에서 일하는 것 -> 틀안에서 자유롭게 개발함(경력 유지 및 회사간의 현력에 용이함)
  - 컬렉션 프레임워크: 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집헙
  - List, Set, Map 3가지가 대표적임
  - 프레임워크는 인터페이스이다.
  - List: 순서가 있는 데이터의 집합, 데이터 중복 허용
  - Set: 순서가 없는 데이터의 집합, 데이터 중복 허용 X
  - Map: 키와 값을 한쌍으로 이루어지는 데이터의 집합, 순서 X, 키는 중복 허용 X , 값은 중복 허용

##### 2) JSON
  - 속성-값이 쌍으로 되어 있음.
  - 인간이 읽을 수 있는 텍스트를 사용하는 개방형 표준 포멧
  - 모든 언어가 JSON을 사용함.

##### 3) 빌더 패턴
  - 변수에 넣고 싶은 값만 선택해서 넣을 수 있음.

___

#### 📅 2023.01.17 ~ 2023.01.18

##### 1) 예외
  - 개발자의 코딩 실수로 인해서 발생하는 프로그램 오류
  - 예외처리: 프로그램이 강제 종료되는 것을 막기 위해 예외처리를 해줌.
  - try-catch문 사용
    - try: 예외가 발생할 수도 있는 오픈소스
    - catch: 예외 발생 시 어떤 예외인지 파악하고 예외를 잡아줌.
    - finally: try-catch문이 실행되면 무조건 실행됨. (예외 유무 X)
  - Exception 클래스 사용
  - throws를 사용하면 예외를 미룰 수 있음

##### 2) 익명 클래스
  - 클래스의 이름이 없어서 익명클래스라고 함
  - 일회성으로 한번만 사용할 때 사용
  - 추상클래스도 가능함!

##### 3) 어댑터 패턴
  - 인터페이스를 사용하기 위해서는 모두 구현해야하지만 어댑터는 구현하고 싶은 메서드만 골라서 구현 가능
  - 어댑터는 클래스 안에 이미 인터페이스들을 메서드 안에 아무것도 적지 않고 구현을 해둠.
  - 어댑터만 불러와서 쓰고 싶은 메서드만 재정의함

##### 4) github 브랜치, 머지
  - branch: 독립적으로 어떤 작업을 진행하기 위한 개념, 필요에 의해 만들어지는 각가의 브랜치는 다른 브랜치의 영향을 받지 않음으로 여러 작업을 동시에 진행 가능
  - merge: branch를 병합하는 것

##### 5) GUI
  - WindowsBuilder를 설치 후 JFrame 생성
  - Containers: 다른 객체(구성요소)들을 포함할 수 있는 객체
  - Components: 실제로 컨테이너 위에 올려져서 화면을 구성을 담당하는 구성요소
  - Layouts: 컨테이너 위에 컴포넌트들을 올릴 때 자리 배치 방법
  - MouseEvent: 마우스 이벤트 설정

##### 6) JBCrypt
  - 비밀번호를 암호화 할 때 사용해주는 라이브러

___

#### 📅 2023.01.19

##### 1) 데이터베이스
  - 데이터의 집합체
  - 중복된 데이터를 없애고, 자료를 구조화하여 효율적인 처리를 할 수 있도록 관리됨.
  - key-value, Relational, Graph, Document, Column-family, Search engine 등의 데이터베이스가 존재함

##### 2) SQL
  - DDL(구조): 테이블 등을 생성, 삭제하거나 구조를 변경 (CREATE, ALTER, DROP)
  - DML(데이터): 데이터를 처리하거나 조회, 검색하기 위한 명령어 (INSERT, UPDATE, DELETE, SELECT)
  - DCL(권한): 데이터를 관리하기 위해 데이터의 보안성 및 무결성 등을 제어하기 위한 명령어 (GRANT, REVOKE)

##### 3) 정규화
  - 제1정규화: 한 칸엔 하나의 데이터만 저장
  - 제2정규화: 현재 테이블의 주제와 관련없는 칼럼을 다른 테이블로 빼는 작업
  - 제3정규화: 일반 칼럼에만 종속된 칼럼은 다른 테이블로 빼기

##### 4) MYSQL 사용
  - 오픈소스의 관계형 데이터베이스 관리 시스

#### 📅 2023.01.20 ~ 2023.01.25

##### 1) DML
  - C: insert/into 데이터 추가
  - R: select/from 데이터 조회
  - U: update/set 데이터 수정
  - D: delete/from 데이터 삭제

##### 2) 공공데이터 활용
  - [🌐공공데이터 사이트](https://www.data.go.kr/)

##### 3) JOIN
  - INNER JOIN: 교집합을 조회하는 것
  - OUTER JOIN: 합집합을 조회하는 것
  - 대표적으로 LEFT OUTER JOIN을 많이 사용함

___

#### 📅 2023.01.26

##### 1) 자바와 DB 연결
  - MySQL Connector Java 라이브러리 설치
  - DBConnectionMgr 다운로드 및 설정

___

#### 📅 2023.01.31 ~ 2023.02.01

##### 1) 람다식
  - 선언없이 실행가능한 함수
  - 코드 한줄에 함수를 써서 그것을 호출하는 방식으로 표현하는 것
  - 자바 8부터 람다식 지원
  - 장점
    - 불필요한 코드를 제거하여 간결하게 만듬
    - 가독성 향상
    - 함수를 만드는 과정이 한번에 처리되어 코딩시간 단축
    - 다중 cqu를 활용해 병렬 처리에 유리
  - 단점
    - 람다를 사용하면서 만드는 함수는 재사용 불가
    - 디버깅 시 함수 콜 스택 추적이 다소 어려움.
    - 재귀로 만들어 완전탐색하는 경우 느림
    - 한 클래스내에 많은 람다식을 사용하면 오히려 가독성이 떨어짐

___

#### 📅 2023.02.01 ~ 2023.02.02

##### 1) 프로시저
  - 데이터베이스에 대한 일련의 작업을 정리한 절차를 관계형 데이터베이스 관리 시스템에 저장한 것으로 영구저장 모듈이라고 불림.
  - 자바에서 메서드와 같은 느낌임

##### 2) 뷰
  - 하나 이상의 기본 테이블이나 다른 뷰를 이용하여 생성되는 가상 테이블
  - 파티션: 테이블에 있는 특정 칼럼 값을 기준으로 데이터를 분할해 저장해 놓는 것

##### 3) 트리거
  - 특정 테이블에 DML 문이 수행되었을 때, 데이터베이스에 자동으로 동작하도록 작성된 프로그램

##### 4) If문
  - if(조건문, 바꿀값, 바꿀값이 있는 칼럼) 형태로 구성됨.

##### 5) case문 사용

##### 6) Index
  - 인덱스는 관계형데이터 베이스에서 검색 속도를 높이기 위한 기술

##### 7) 트랜젝션
  - 작업의 안정성을 보장해주는 것
  - 모두 완벽하게 처리하거나 또는 처리하지 못할 경우에는 원상태로 복구해서 작업의 일부만 적용되는 형상이 발생하지 않도록 만들어주는 기능
  - DML 같은 연산을 수행하여 데이터베이스의 상태를 변화시키는 작업의 단위
  - 특징
    - 원자성: 데이터베이스에 모두 반영되던지, 전혀 반영되지 않아야함.
    - 일관성: 처리결과에 일관성이 있어야함
    - 독립성: 다른 트랜잭션의 연산에 끼어들 수 없다.
    - 지속성: 트랜잭션이 성공적으로 완료되었을 때, 결과는 영구적으로 반영되어야함
  - Commit: 하나의 트랜잭션이 성공적으로 끝났고, 데이터베이스가 일관성 있는 상태일 때 하나의 트랜잭션이 끝났음을 알려주는 연산
  - Rollback: 모든 연산을 취고하는 연산, 커밋 이전에 사용

___

#### 📅 2023.02.07 ~ 2023.02.09

##### 1) 스레드
  - 프로세스: 단순히 실행 중인 프로그램
  - 스레드: 프로세스 내에서 실제로 작업을 수행하는 주체를 의미
  - 모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행해야함
  - 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 프로세스라고함

##### 2) 소켓통신
  - 소켓: TCP/IP 기반 네트워크 통신에서 데이터 송수신의 마지막 접점을 말함
  - 소켓통신: 소켓을 통해 서버와 클라이언트 간에 데이터를 주고받는 양방향 연결 지향성 통신
  - 서버: 데이터를 제공하는 곳
  - 클라이언트: 데이터를 요청하여 제공받음
  - 포트: IP 내에서 애플리케이션 상호구분을 위해 사용하는 번

___

#### 📅 2023.02.13 ~ 2023.03.02

##### 1) 멀티소켓 만들기
  - [📖 멀티소켓만들기 풀이 1 (Dto, 서버)](https://donotthinkjustdo.tistory.com/entry/Stage17-%EC%82%B0%EB%8C%80%ED%8A%B9-%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%97%94%EB%93%9C%EB%A9%80%ED%8B%B0-%EC%86%8C%EC%BC%93-%EB%A7%8C%EB%93%A4%EA%B8%B0-%ED%92%80%EC%9D%B41-Dto-%EC%84%9C%EB%B2%8420230213-0302)
  - [📖 멀티소켓만들기 풀이 2 (클라이언트)](https://donotthinkjustdo.tistory.com/entry/Stage18-%EC%82%B0%EB%8C%80%ED%8A%B9-%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%97%94%EB%93%9C%EB%A9%80%ED%8B%B0-%EC%86%8C%EC%BC%93-%EB%A7%8C%EB%93%A4%EA%B8%B0-%ED%92%80%EC%9D%B42-%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B820230213-0302)

##### 2) 소켓 만들기
  - [📖 소켓 통신 만들기](https://donotthinkjustdo.tistory.com/entry/Stage19-%EC%82%B0%EB%8C%80%ED%8A%B9-%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%97%94%EB%93%9C%EC%86%8C%EC%BC%93-%ED%86%B5%EC%8B%A0-%EB%A7%8C%EB%93%A4%EA%B8%B0-20230213-0302)
