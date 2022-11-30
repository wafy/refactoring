목차 

[냄새1. 이해하기 힘든 이름](#냄새1.-이해하기-힘든-이름)
 - [1-1. 함수 선언 변경하기](#1-1.-함수-선언-변경하기)
 - [1-2. 변수 이름 바꾸기](#1-2.-변수-이름-바꾸기)
 - [1-3. 필드 이름 바꾸기](#1-3.-필드-이름-바꾸기)

[냄새2. 중복 코드](#냄새2.-중복-코드)
 - [2-1. 함수 추출하기](#2-1.-함수-추출하기)
 - [2-2. 코드 정리하기](#2-2.-코드-정리하기)
 - [2-3. 메소드 올리기](#2-3.-메소드-올리기)

[냄새3. 긴함수](#냄새3.긴함수)
- [3-1. 임시 변수를 질의 함수로 바꾸기(Replace Temp with Query)](#3-1.임시 변수를 질의 함수로 바꾸기(Replace Temp with Query))
- [3-2. 매개변수 객체 만들기(Introduce Parameter object)](#3-2.매개변수 객체 만들기(Introduce Parameter object))
- [3-3. 객체 통째로 넘기기(Preserve Whole Object)](#3-3.객체 통째로 넘기기(Preserve Whole Object))
- [3-4. 조건문 분해하기(Decompose Conditional)를 사용해 조건문을 분리할 수 있다.](#3-4.조건문 분해하기(Decompose Conditional)를 사용해 조건문을 분리할 수 있다.)
- [3-5. 같은 조건으로 여러개의 Switch문이 있다면 조건문을 다형성으로 바꾸기를 사용할 수 있다.](#3-5.같은 조건으로 여러개의 Switch문이 있다면 조건문을 다형성으로 바꾸기를 사용할 수 있다.)
- [3-6. 반복문안에서 여러 작업을 하고 있어서 하나의 메소드로 추출하기 어렵다면 반복문 쪼개기를 적용할 수 있다.](#3-6.반복문안에서 여러 작업을 하고 있어서 하나의 메소드로 추출하기 어렵다면 반복문 쪼개기를 적용할 수 있다.)
- [3-7 조건문을 다형성으로 바꾸기](#3-7.조건문을 다형성으로 바꾸기)

[냄새4. 긴 매배변수 목록](#냄새4.긴 매개변수 목록)
- [4-1. 매개변수를 질의 함수로 바꾸기](#4-1.매개변수를 질의 함수로 바꾸기)
- [4-2. 플래그 인수 제거하기](#4-2.플래그 인수 제거하기)
- [4-3. 여러 함수를 클래스로 묶기](#4-3.여러 함수를 클래스로 묶기)

[냄새5. 전역데이터]
- [5-1. 변수 캡슐화하기](#5-1.변수 캡슐화하기)

[냄새6. 가변 데이터]
- [6-1. 변수 쪼개기](#6-1.변수 쪼개기)
- [6-2. 질의 함수와 변경 함수 분리하기 ](#6-2.질의 함수와 변경 함수 분리하기)
- [6-3. 세터제거하기](#6-3.세터 제거하기)
- [6-4. 파생 변수를 질의 함수로 바꾸기](#6-4.파생 변수를 질의 함수로 바꾸기)
- [6-5. 여러 함수를 변환 함수로 묶기 ](#6-5.여러 함수를 변환 함수로 묶기)
- [6-6. 참조를 값으로 바꾸기](#6-6.참조를 값으로 바꾸기)

[냄새7. 뒤엉킨 변경]
- [7-1. 단계 쪼개기](#7-1.단계 쪼개기)
- [7-2. 함수 옮기기](#7-2.함수 옮기기)
- [7-3. 클래스 추출하기](#7-3.클래스 추출하기)

[냄새8. 산탄총 수술]
- [8-1. 필드 옮기기](#8-1.필드 옮기기)
- [8-2. 함수 인라인](#8-2.함수 인라인)
- [8-3. 클래스 인라인](#8-3.클래스 인라인)

# 냄새1. 이해하기 힘든 이름 
- 깔금한 코드에서 가장 중요한 것중 하나가 바로 `좋은 이름`이다 
- 함수, 변수, 클래스, 모듈의 이름 등 모둔 어떤 역활을 하는지 어떻게 쓰이는지 직관적이어야 한다.
- 사용할 수 있는 리팩토링 기술 
## 1-1. 함수 선언 변경하기
함수 이름 변경하기, 메소드 이름 변경하기, 매개변수 추가하기, 매개변수 제거하기, 시그니처 변경하기 
- 좋은 이름을 가진 함수는 함수가 어떻게 구현되었는지 코드를 보지 않아도 이름만 보고도 이해할 수 있다 
- 좋은 이름을 찾아내는 방법? ***함수에 주석을 작성한 다음, 주석을 함수 이름으로 만들어 본다.***
- 함수의 매개변수는 
  - 함수 내부의 문맥을 결정한다(예, 전화번호 포맷팅 함수)
  - 의존성을 결정한다(예 Payment 만기일 계산 함수)     
## 1-2. 변수 이름 바꾸기 
 - 더 많이 사용되는 변수일수록 그 이름이 더 중요하다.
   - 람다식에서 사용하는 변수 vs 함수의 매개변수 
 - 다이나믹 타입을 지원하는 언어에서는 타입을 이름에 넣기도 한다.
 - 여러 함수에 걸쳐 쓰이는 필드 이름에는 더 많이 고민하고 이름을 짓는다.
## 1-3. 필드 이름 바꾸기 
- Record 자료 구조의 필드 이름은 프로그램 전반에 걸쳐 참조될 수 있기 때문에 매우 중요하다.
  - Record 자료구조: 특정 데이터와 관련 있는 필드를 묵어 놓은 자료 구조 
  - 파이썬의 `Dictionay` 또는 줄여서 `dicts`
  - c#의 `Record`
  - 자바 14버전부터 지원 (record 키워드)
  - 자바에서는 `Getter`와 `Setter` 메소드 이름도 필드의 이름과 비슷하게 간주할 수 있다.
# 냄새2. 중복 코드 
- 중복코드의 단점 
  - 비슷한지, 완전히 동일한 코드인지 주의 깊게 봐야한다.
  - 코드를 변경할 때, 동일한 모든 곳의 코드를 변경해야 한다.
- 사용할 수 있는 리팩토링 기술 
  - 동일한 코드를 여러 메소드에서 사용하는 경우 함수 추출하기 
  - 코드가 비슷하게 생겼지만 완전히 같지는 않은 경우, 코드 분리하기 
  - 여러 하위 클래스에 동일한 코드가 있다면, 메소드 올리기 
## 2-1. 함수 추출하기 
- `의도`와 `구현` 분리하기
- 무슨 일을 하는 코드인지 알아내려고 노력해야 하는 코드라면 해당 코드를 함수로 분리하고 함수 이름으로 `무슨 일을 하는지` 표현할 수 있다
- 한줄 짜리 메소드도 괜찮은가?
- 거대한 함수 안에 들어 있는 주석은 추출한 함수를 찾는데 있어서 좋은 단서가 될 수 있다.
## 2-2. 코드정리하기 (슬라이드 스테이트먼트)
- 관련 있는 코드끼리 묶여 있어야 코드를 더 쉽게 이해할 수 있다.
- 함수에서 사용할 변수를 상단에 미리 정의하기 보다는 해당 변수를 사용하는 코드 바로 위에 선언하자 
- 관련 있는 코드끼리 묶은 다음 함수 추출하기를 사용해서 더 깔끔하게 분리할 수 있다.
## 2-3. 메소드 올리기
- 중복 코드는 당장은 잘 동작하더라도 미래에 버그를 만들어 낼 빌미를 제공한다.
  - 예) A에서 코드를 고치고, B에는 반영되지 않은 경우 
- 여러 하위 클래스에 동일한 코드가 있다면, 손쉽게 이 방법을 적용할 수 있다.
- 비슷하지만 일부 값만 다른 경우라면 `함수 매개변수화하기` 리팩토링을 적용한 이후에 이 방법을 사용할 수 있다.
- 하위 클래스에 있는 코드가 상위 클래스가 아닌 하위 클래스 기능에 의존하고 있다면 `필드 올리기`를 적용한 이후에 이 방법을 적용할 수 있다.
- 두 메소드가 비슷한 절차를 따르고 있다면 `템플릿 메소드 패턴` 적용을 고려할 수 있다.

#냄새3. 긴함수
## 짦은 함수 vs 긴 함수 
- 함수가 길 수록 더 이해하기 어렵다 vs 짦은 함수는 더 많은 문맥 전환을 필요로 한다. 
- `과거에는` 작은 함수를 사용하는 경우에 더 많은 서브루틴 호출로 인한 오버헤드가 있었다
- 작은 함수에 `좋은 이름`을 사용했다면 해당 함수의 코드를 보지 않고도 이해할 수 있다.
- 어떤 코드에 `주석`을 남기고 싶다면, 주석 대신 함수를 만들고 함수의 이름으로 `의도`를 표현해보자.
## 사용할 수 있는 리팩토링 기술 
99%는 `함수추출하기`로 해결할 수 있다.
함수로 분리하면서 해당 함수로 전달해야 할 매개변수가 많아진다면 다음과 같은 리팩토링을 고려해볼 수 있다.
## 3-1. 임시 변수를 질의 함수로 바꾸기(Replace Temp with Query)
- 변수를 사용하면 반복해서 동일한 식을 계산하는 것을 피할 수 있고, 이름을 사용해 의미를 표현할 수도 있다.
- 긴 함수를 리팩토링할 때, 그러한 임시 변수를 함수로 추출하여 분리한다면 빼낸 함수로 전달해야 할 매개변수를 줄일 수 있다.
## 3-2. 매개변수 객체 만들기(Introduce Parameter object)
- 같은 매개변수들이 여러 메소드에 걸쳐 나타난다면 그 매개변수들을 묶은 자료구조를 만들 수 있다.
- 그렇게 만든 자료구조는 
  - 해당 데이터간의 관계를 보다 명시적으로 나타낼 수 있다.
  - 함수에 전달할 매개변수 갯수를 줄일 수 있다.
  - 도메인을 이해하는데 중요한 역할을 하는 클래스로 발전할 수도 있다.
## 3-3. 객체 통째로 넘기기(Preserve Whole Object)
- 어떤 한 레코드에서 구할 수 있는 여러 값들을 함수에 전달하는 경우, 해당 매개변수를 레코드 하나로 교체할 수 있다.
- 매개변수 목록을 줄일 수 있다.(향후에 추가할지도 모를 매개변수까지도..)
- 이 기술을 적용하기 전에 의존성을 고려해야 한다.
- 어쩌면 해당 메소드의 위치가 적절하지 않을 수도 있다.
## 3-4. 조건문 분해하기(Decompose Conditional)를 사용해 조건문을 분리할 수 있다.
- 함수를 독립적인 객체인, `Command`로 만들어 사용할 수 있다.
- 커맨드 패턴을 적용하면 다음과 같은 장점을 취할 수 있다.
  - 부가적인 기능으로 undo 기능을 만들 수도 있다.
  - 더 복잡한 기능을 구현하는데 필요한 여러 메소드를 추가할 수 있다.
  - 상속이나 템플릿을 활용할 수도 있다.
  - 복잡한 메소드를 여러 메소드나 필드를 활용해 쪼갤 수도 있다.
- 대부분의 경우에 커맨드보다 함수를 사용하지만 커맨드 말고 다른 방법이 없는 경우에만 사용한다.
## 3-5. 같은 조건으로 여러개의 Switch문이 있다면 `조건문을 다형성으로 바꾸기`를 사용할 수 있다.
- 여러 조건에 따라 달라지는 코드를 작성하다보면 종종 긴 함수가 만들어지는 것을 목격할 수 있다.
- `조건`과 `액션` 모두 `의도`를 표현해야한다.
- 기술적으로는 `함수 추출하기`와 동일한 리팩토링이지만 의도만 다를 뿐이다.
## 3-6. 반복문안에서 여러 작업을 하고 있어서 하나의 메소드로 추출하기 어렵다면, `반복문 쪼개기`를 적용할 수 있다.
- 하나의 반복문에서 여러 다른 작업을 하는 코드를 쉽게 찾아볼 수 있다.
- 해당 반복문을 수정할 때 여러 작업을 모두 고려하며 코딩을 해야한다.
- 반복문을 여러개로 쪼개면 보다 쉽게 이해하고 수정할 수 있다.
- 성능 문제를 야기할 수 있지만, `리팩토링`은 `성능 최적화`와 별개의 작업이다. 리팩토링을 마친 이후에 성능 최적화 시도할 수 있다.
## 3-7. 조건문을 다형성으로 바꾸기 
- 여러 타입에 따라 각기 다른 로직으로 처리해야 하는 경우에 다형성을 적용해서 조건문을 보다 명확하게 분리할 수 있다.(예 책, 음악, 음식등..) 반복되는 Switch
조건문을 각기 다른 클래스를 만들어 제거할 수 있다.
- 공통으로 사용되는 로직은 상위클래스에 두고 달라지는 부분만 하위클래스에 둠으로써, 달라지는 부분만 강조할 수 있다.
- 모든 조건문을 다형성으로 바꿔야 하는 것은 아니다.
 
# 냄새4. 긴 매배변수 목록 
- 어떤 함수에 매개변수가 많을수록 함수의 역활을 이해하기 어려워진다.
  - 과연 그 함수는 한가지 일을 하고 있는게 맞는가?
  - 불필요한 매개변수는 없는가?
  - 하나의 레코드로 뭉칠 수 있는 매개변수 목록은 없는가?
- 어떤 매개변수를 다른 매개변수를 통해 가져와서 여러 매개변수로 넘기는 대신, `객체 통째로 넘기기`를 사용할 수 있다.
- 일부 매개변수들이 대부분 같이 넘겨진다면, `매개변수 객체 만들기`를 적용할 수 있다.
- 매개변수가 플래그로 사용된다면, `플래그 인수 제거하기`를 사용할 수 있다.
- 여러 함수가 매개변수를 공통적으로 사용한다면 `여러 함수를 클래스로 묶기`를 통해 매개변수를 해당 클래스의 필드로 만들고 메서드에 전달해야 할 매개변수 목록을 
줄일 수 있다.11
## 4-1. 매개변수를 질의 함수로 바꾸기 
- 함수의 매개변수 목록은 함수의 다양성을 대변하며, 짦을수록 이해하기 좋다.
- 어떠 한 매개변수를 다른 매개변수를 통해 알아낼 수 있다면 `중복 매개변수`라 생각할 수 있다.
- 매개변수에 값을 전달하는 것은 `함수를 호출하는 쪽`의 책임이다. 가능함녀 함수를 호출하는 쪽의 책임을 줄이고 함수 내부에서 책임지도록 노력한다.
- `임시 변수를 질의 함수로 바꾸기`와 `함수 선언 변경하기`를 통해 이 리팩토링을 적용한다.
## 4-2. 플래그 인수 제거하기
- 플래그는 보통 함수에 매개변수로 전달해서, 함수 내부의 로직을 분기하는데 사용한다.
- 플래그를 사용한 함수는 차이를 파악하기 어렵다
  - `bookConcenrt(customer, false), bookConcert(customer, true)`
  - `bookConcert(customer), permiumBookConcert(customer)`
- `조건문 분해하기`를 활용할 수 있다.
## 4-3 여러 함수를 클래스로 묶기 
- 비슷한 매개변수 목록을 여러 함수에서 사용하고 있다면 해당 메소드를 모아서 클래스를 만들 수 있다.
- 클래스 내부로 메소도를 옮기고 데이터를 필드로 만들면 메소드에 전달해야 하는 매개변수 목록도 줄일 수 있다.

# 5. 전역 데이터
- 전역 데이터(예, 자바의 public static 변수)
- 전역 데이터는 아무곳에서나 변경될 수 있다는 문제가 있다.
- 어떤 코드로 인해 값이 바뀐 것인지 파악하기 어렵다.
- 클래스 변수(필드)도 비슷한 문제를 겪을 수 있다.
- `변수 캡슐화 하기`를 적용해서 접근을 제어하거나 어디서 사용하는지 파악하기 쉽게 만들 수 있다.
- 파라켈수스의 격언 `약과 독의 차이를 결정하는 것은 사용량일 뿐이다.` 

## 5-1. 변수 캡슐화하기 
- 메소도는 점진적을 새로운 메소드로 변경할 수 있으나, 데어터는 한번에 모두 변경해야한다.
- 데이터 구조를 변경하는 작업을 그보다는 조금 더 수월한 메소드 구조 변경 작업으로 대체할 수 있다.
- 데이터가 사용되는 범위가 클수록 캡슐화를 하는 것이 더 중요해진다.
  - 함수를 사용해서 값을 변경하면 보다 쉽게 검증 로직을 추가하거나 변경에 따르는 후속 작업을 추가하는 것이 편리하다.
- 불변 데이터의 경우에는 이런 리팩토링을 적용할 필요가 없다.

# 6. 가변 데이터  
- 데이터를 변경하다보면 예상치 못했던 결과나 해결하기 어려운 버그가 발생하기도 한다.
- 함수형 프로그래밍 언어는 데이터를 변경하지 않고 복사본을 전달한다. 하지만 그밖의 프로그래밍 언어는 데이터 변경을 허용하고 있다.
따라서 변경되는 데이터 사용 시 발생할 수 있는 리스크를 관리할 수 있는 방법을 적용하는 것이 좋다.

## 6-1. 변수 쪼개기
- 어떤 변수가 여러번 재할당 되어도 적절한 경우 
  - 반복문에서 순회하는데 사용하는 변수 또는 인덱스 
  - 값을 축적하는데 사용하는 변수 
- 그밖에 경우에 재할당 되는 변수가 있다면 해당 변수는 여러 용도로 사용되는 것이며 변수를 분리해야 더 이해하기 좋은 코드를 만들 수 있다.
  - 변수 하나 당 하나의 책임을 지도록 만든다.
  - 상수를 활용하자 (자바스크립트의 const, 자바의 final)

## 6-2. 질의 함수와 변경 함수 분리하기 
- `눈에 뛸만한` 사이드 이팩트 없이 값을 조회할 수 있는 메소드는 테스트 하기도 쉽고, 메소드를 이동하기도 쉽다.
- 명령-조회 분리 규칙
  - 어떤 값을 리턴하는 함수는 사이드 이팩트가 없어야 한다.
- `눈에 뛸만한 사이드 이팩트`
  - 가령 캐시는 중요한 객체 상태 변화는 아니다. 따라서 어떤 메소드 호출로 인해 캐시 데이터를 변경하더라도 분리할 필요가 없다.
## 6-3. 세터 제거하기 
- 세터를 제공한다는 것은 해당 필드가 변경될 수 있다는 것을 뜻한다.
- 객체 생성시 처음 설정된 값이 변경될 필요가 없다면 해당 값을 설정할 수 있는 생성잘르 만들고 세터를 제거해서 변경될 수 있는 가능성을 제거해야 한다.
## 6-4. 파생 변수를 질의 함수로 바꾸기 
- 변경할 수 있는 데이터를 최대한 줄이도록 노력해야 한다.
  - 계산해서 알아낼 수 있는 변수는 제거할 수 있다.
  - 해당 변수가 어디선가 잘못된 값으로 수정될 수 있는 가능성을 제거할 수 있다.
- 계산에 필요한 데이터가 변하지 않는 값이라면, 계산의 결과에 해당하는 데이터 역시 불변 데이터기 때문에 해당 변수는 그대로 유지할 수 있다.
## 6-5. 여러 함수를 변환 함수로 묶기 
- 관련 있는 여러 파생 변수를 만들어내는 함수가 여러곳에서 만들어지고 사용된다면 그러한 파생 변수를 `변환 함수`를 통해 한 곳을 모아둘 수 있다.
- 소스 데이터가 변경될 수 있는 경우에는 `여러 함수를 클래스로 묶기`를 사용하는 것이 적절하다.
- 소스 데이터가 변경되지 않는 경우에는 두 가지 방법을 모두 사용할 수 있지만, 변환 함수를 사용해서 불변 데이터의 필드로 생성해 두고 재사용할 수도 있다.
## 6-6. 참조를 값으로 바꾸기
- 레퍼런스 객체 vs 값 객체 
- 값 객체는 객체가 가진 필드의 값으로 동일성을 확인한다.
- 값 객체는 변하지 않는다.
- 어떤 객체의 변경 내역을 다른 곳을 전파시키고 싶다면 레퍼런스, 아니면 값 객체를 사용한다.

# 7. 뒤엉킨 변경
- 소프트웨어는 변경에 유연하게 대처할 수 있어야 한다.
- 어떤 한 모듈이(함수느 또는 클래스가) 여러가지 이유로 다양하게 변경되어야 하는 상황.
  - 새로운 결제 방식을 도입하거나, DB를 변경할 때 동일한 클래스에 여러 메소드를 수정해야 하는 경우.
- 서로 다른 문제는 서로 다른 모듈에서 해결해야 한다.
  - 모듈의 책임이 분리되어 있을수록 해당 문맥을 더 잘 이해할 수 있으며 다른 문제는 신경쓰지 않아도 된다.
## 7-1. 단계 쪼개기
- 서로 다른 일을 하는 코드를 각기 다른 모듈로 분리한다.
  - 그래야 어떤 것을 변경해야 할 때, 그것과 관련 있는 것만 신경 쓸 수 있다.
- 여러 일을 하는 함수의 처리 과정을 각기 다른 단계로 구분할 수 있다.
  - 전처리 -> 주요 작업 -> 후처리 
  - 컴파일러: 텍스트 읽어오기 -> 실행 가능한 형태로 변경 
- 서로 다른 데이터를 사용한다면 단계를 나누는데 있어 중요한 단서가 될 수 있다.
- 중간 데이터를 만들어 단계를 구분하고 매개변수를 줄이는데 활용할 수 있다.
## 7-2. 함수 옮기기
- 모듈화가 잘 된 소프트웨어는 최소한의 지식만으로 프로그램을 변경할 수 있다.
- 관련있는 함수나 필드가 모여있어야 더 수비게 찾고 이해할 수 있다.
- 하지만 관련있는 함수나 필드가 항상 고정적인 것은 아니기 떄문에 떄에 따라서 옮겨야 할 필요가 있디ㅏ.
- 함수를 옮겨야 하는 경우
  - 해당 함수가 다른 문맥(클래스)에 있는 데이터(필드)를 더 많이 참조하는 경우.
  - 해당 함수를 다른 클라이언트(클래스)에서도 필요로 하는 경우.
- 함수를 옮겨갈 새로운 문맥(클래스)이 필요한 경우에는 `여러 함수를 클래스로 묶기` 또는 `클래스 추출하기`를 사용한다.
- 함수를 옮길 적당한 위치를 찾기가 어렵다면, 그대로 두어도 괞찮다. 언제든 나중에 옮길 수 있다.
## 7-3. 클래스 추출하기 
- 클래스가 다루는 책임이 많아질수록 클래스가 점차 커진다.
- 클래스를 쪼개는 기준 
  - 데이터나 메소드 중 일부가 매우 밀접한 관련이 있는 경우
  - 일부 데이터가 대부분 같이 바뀌는 경우
  - 데이터 또는 메소드 중 일부를 삭제한다면 어떻게 될 것인가?
- 하위 클래스를 만들어 책임을 분산 시킬 수 있다.
# 8. 산탄총 수술
- 어떠 한 변경 사항이 생겼을 때 여러 모듈을(여러 함수 또는 여러 클래스를) 수정해야 하는 상황.
  - `뒤엉킨 변경` 냄새와 유사하지만 반대의 상황이다.
  - 예) 새로운 결제 방식을 도입하려면 여러 클래스의 코드를 수정해야 한다.
- 변경 사항이 여러곳에 흩어진다면 찾아서 고치기도 어렵고 중요한 변경 사항을 놓칠 수 있는 가능성도 생긴다.
## 8-1. 필드 옮기기
- 좋은 데어터 구조를 가지고 있다면, 해당 데이터에 기반한 어떤 행위를 코드로(메소드나 함수) 옮기는 것도 간편하고 단순해진다.
- 처음에는 타당해 보였던 설계적인 의사 결정도 프로그램이 다르고 있는 도메인과 데이터 구조에 대해 더 많이 익혀나가면서, 틀린 의사 결정으로 바뀌는 경우도 있다.
- 필드를 옮기는 단서
  - 어떤 데이터를 항상 어떤 레코드와 함께 전달하는 경우.
  - 어떤 레코드를 변경할 떄 다른 레코드에 있는 필드를 변경해야 하는 경우.
  - 여러 레코드에 동일한 필드를 수정해야 하는 경우
## 8-2. 함수 인라인
- `함수 추출하기`의 반대에 해당하는 리팩토링
  - 함수로 추출하여 함수 이름으로 의도를 표현하는 방법
- 간혹, 함수 본문이 함수 이름 만큼 또는 그보다 더 잘 의도를 표현하는 경우도 있다.
- 함수 리팩토링이 잘못된 경우에 여러 함수를 인라인하여 커다란 함수를 만든 다음에 다시 함수 추출하기를 시도 할 수 있다.
- 단순히 메소드 호출을 감싸는 우회형 메소드라면 인라인으로 없앨 수 있다.
- 상속 구조에서 오버라이딩 하고 있는 메소드는 인라인 할 수 없다.
## 8-3. 클래스 인라인
- `클래스 추출하기`의 반대에 해당하는 리팩토링 
- 리팩토링을 하는 중에 클래스의 책임을 옮기다보면 클래스의 존재 이유가 빈약해 지는 경우가 발생할 수 있다.
- 두개의 클래스를 여러 클래스로 나누는 리팩토링을 하는 경우에 우선 `클래스 인라인`을 적용해서 두 클래스의 코드를 한 곳으로 모으고 그런 다음에 `클래스 추출하기`
를 적용해서 새롭게 분리하는 리팩토링을 적용할 수 있다.
