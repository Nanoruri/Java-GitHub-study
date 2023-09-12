package chap_02;

import java.net.InterfaceAddress;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산자
        System.out.println("일반 연산");
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2.5 정수만 계산되고 나머지는 버려지게 됨
        System.out.println(2 / 4); //0.5
        System.out.println(4 % 2); //0
        System.out.println(8 % 3); //2 여기서의 나머지는 계산하고 남은 몫

        System.out.println();

        //우선 순위 연산
        System.out.println("우선순위 연산");
        System.out.println(2 + 2 * 2); // 6

        System.out.println();

        //변수를 이용한 연산
        System.out.println("변수를 이용한 연산");
        int a = 20;
        int b = 10;
        int c = a + b;

        System.out.println(c); // 30
        c = a - b;
        System.out.println(c); // 10
        c = a * b;
        System.out.println(c); // 200
        c = a % b;
        System.out.println(c); // 0

        System.out.println();

        // 증감 연산 ++, --
        int val = 10;
        System.out.println(val);
     /* val++; // 나머지 연산이 먼저 수행되어지고 val에 +1이 되어지는 것
        ++val; // val에 +1이 되어지고 나머지연산 수행 */

        System.out.println("val++ 연산시");
        val = 11;
        System.out.println(val++); // 11
        System.out.println(val); // 12

        System.out.println();

        System.out.println("++val 연산시");
        val = 11;
        System.out.println(++val); // 12
        System.out.println(val); // 12


    }
}