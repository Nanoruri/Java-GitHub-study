package chap_02;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
    }
}
