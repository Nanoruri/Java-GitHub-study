import java.text.DecimalFormat;
import java.util.*;


public class ConsolCalculator {

    public static void main(String[] args) {
        //시작
        System.out.println("Welcome,This is Claculator" );
        while(true) {
            System.out.println("Please enter value and operator. exit:0");


            //숫자 입력
            Scanner sc = new Scanner(System.in);
            String input = sc.next();//입력을 한줄로 받아옴


            //연산자를 포함시 oper 해당 문자를 oper변수에 담음
            String oper = "0";
            if (input.contains("+"))
                oper = "+";
            else if (input.contains("-"))
                oper = "-";
            else if (input.contains("/"))
                oper = "/";
            else if (input.contains("*"))
                oper = "*";
            else if (out(input))//프로그램 종료 기능
            {
                System.out.println("exit Calculator");
                break;
            }
            else System.out.println("연산자를 다시 입력해주십시오");

            //연산자를 기준으로 각각의 변수를 담음
            StringTokenizer separation = new StringTokenizer(input, "+-/*");

            //연산자를 기준으로 잘라서 토큰화 ->first,second 변수에 담음
            int firstNum = Integer.parseInt(separation.nextToken());
            int secondNum = Integer.parseInt(separation.nextToken());

            long result;
            result = 0;

            switch (oper) {
                case "+":
                    result = (long)firstNum + secondNum;
                    break;
                case "-":
                    result = (long)firstNum - secondNum;
                    break;
                case "/":
                    result = (long)firstNum / secondNum;
                    break;
                case "*":
                    result = (long) firstNum * secondNum;
            }
            //자릿수 구분
            DecimalFormat exchange = new DecimalFormat("#,###");
            String formattedResult = (exchange.format((result)));
            //결과값
            System.out.println("결과:" + (formattedResult));

            //나가기
            if (out(input)){
                System.out.println("exit Calculator");
                break;
            }
        }


    }
    private static boolean out(String input) {
        return outcost.contains(input);
    }
    private static final String outcost = new String("x");


    private void String(String end){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();//입력을 한줄로 받아옴
    }
}

    //추가 하고싶은 기능 :GUI,






