package chap_01;

import java.sql.SQLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score);
        System.out.println((double)score); // 93.0

        //float, double to int
        float score_f = 93.3F;
        double  score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98

        // 정수 + 실수 연산
        score = 93 + (int)score_d; // 93+98
        System.out.println(score); //191

        score_d = 98.8 + (double)93 ; // 93.0 + 98.8
        System.out.println(score_d); //191.8

        // 변수에 형변환된 데이터 집어넣기
        double  convertedScoreDouble = score;
        //int -> long -> float -> double (자동 형변환 됨)
        int convertedScoreInt = (int)score_d;
        System.out.println(convertedScoreInt);
        //int <- long <- float <- double (수동 형변환해줘야함)


        //숫자 -> 문자열
        String s1 =String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열 -> 숫자
        int i = Integer.parseInt("93");
        System.out.println(i); //93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        int error = Integer.parseInt("자바");
        System.out.println(error);


    }
}
