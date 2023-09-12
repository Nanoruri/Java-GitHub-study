package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "임재현"; //String은 문자열 변수를 사용 할 때 쓰는 함수
        int hour = 15; // int는 -21억 부터 +21억 사이의 숫자를 사용할 때 쓰는 함수


        System.out.println(name + "님, 배송이 시작되었습니다. 방문예정:" + hour + "시");
        System.out.println(name + "님, 배송이 완료되었습니다.");


        double score = 90.5; //double은 실수(소수점의 정확한 숫자)를 표현 할 때 쓰는 함수
        char grade= 'A'; // char는 하나의 문자를 표현 할 때 쓰는 함수
        name = "나도코딩";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다");

        boolean pass = false; //
        System.out.println("이번 시험에 합격했을까요?" + pass);


        double d = 3.14;
        float a = 3.14F; //float은 double만큼 표현이 안되는 함수
        System.out.println(d);
        System.out.println(a);

        long s = 1_000_000_000_000_000_000L; // long은 int보다 큰 수를 표현해야할 때 사용
        s = 1231233;
        System.out.println(s);

    }
}
