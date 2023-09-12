package chap_02;

public class Operator3 {
    public static void main(String[] args) {
        System.out.println(5 > 3);


        //비교연산자
        System.out.println(5 != 3); // 5는 3과 같지 않다(true)
        System.out.println(5 != 5); // 5는 5와 같지 않다(false)
        // !=(같지 않다) == 같다


        boolean 김치찌개 =  true;
        boolean 계란말이 =  true;
        boolean 제육볶음 =  true;


        System.out.println(김치찌개||계란말이||제육볶음); // ||는 or과 같음
        System.out.println(김치찌개&& 계란말이&& 제육볶음); //%%는 and와 같음


    }

}
