# Algorithm
This is an auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).

# knowledge
### 2024-10-24
#### BigInteger
long형을 넘는 더 큰 범위의 정수를 다룰 때 사용하는 클래스로 java.math에 속한다.  

int, long과 같은 자료형처럼 사칙연산(+,-,*,/,%)을 기호로 할 수 없고, BigInteger에서 제공하는 메서드를 이용해야 한다.  
<br>

#### 생성
```
// 문자열로 생성  
BigInteger bigInteger = new BigInteger("123456");

//n진수 문자열로 생성  
BigInteger bigInteger = new BigInteger("FFFF", 16);

//valueOf 생성  
BigInteger bigInteger = BigInteger.valueOf(123456);
```
<br>

#### 연산
기호로 직접 연산할 수 없기 때문에 add(), substract(), multiply(), divide(), mod() 메서드를 사용한다.  
```
BigInteger bigNum = new BigInteger("3");
System.out.println("3+3="+bigNum.add(BigInteger.valueOf(3)));
System.out.println("3-3="+bigNum.subtract(BigInteger.valueOf(3)));
System.out.println("3*3="+bigNum.multiply(BigInteger.valueOf(3)));
System.out.println("3/3="+bigNum.divide(BigInteger.valueOf(3)));
System.out.println("3%3="+bigNum.mod(BigInteger.valueOf(3)));
```

<br>

#### 비교
compareTo()를 사용하여 비교할 수 있다. 같으면 0, 앞 숫자가 더 크면 1, 뒷 숫자가 더 크면 -1을 반환한다.
```
System.out.println(BigInteger.valueOf(3).compareTo(BigInteger.valueOf(3)));//0
System.out.println(BigInteger.valueOf(3).compareTo(BigInteger.ONE));//1
System.out.println(BigInteger.ONE.compareTo(BigInteger.valueOf(3)));//-1
참고로 0,1,2,10은 BigInteger.ZERO, BigInteger.ONE, BigInteger.TWO, BigInteger.TEN으로 클래스에서 제공한다.
```

<br>

#### 정렬
```
String []s= {"3","4","8","6","1","2"};

//Arrays.sort()를 이용 BigInteger의 compareTo를 이용한다
Arrays.sort(s, 0, 6, (s1, s2)->(new BigInteger(s2).compareTo(new BigInteger(s1))));//내림차순
for(int i=0;i<6;i++) {
	System.out.print(s[i]+" ");
}
System.out.println();
Arrays.sort(s, 0, 6, (s1, s2)->(new BigInteger(s1).compareTo(new BigInteger(s2))));//오름차순
for(int i=0;i<6;i++) {
	System.out.print(s[i]+" ");
}
```

<br>

#### 변환
```
BigInteger bigNumber = BigInteger.valueOf(12345); 
System.out.println(bigNumber.intValue());//BigIntger -> int
System.out.println(bigNumber.longValue());//BigIntger -> long
System.out.println(bigNumber.floatValue());//BigIntger -> float
System.out.println(bigNumber.doubleValue());//BigIntger -> double
System.out.println(bigNumber.toString());//BigIntger -> String
```
<br>

### 2024-10-27
시간 관련
```
// a는 시간, b는 분, c는 소요 예정 시간일 때
(a + (b + c) / 60) % 24 + " " + (b + c) % 60
```
