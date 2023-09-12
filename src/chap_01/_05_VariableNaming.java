package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {


        // 변수 이름 짓는 법
        // 1.저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc) ,숫자(123) 사용 가능
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 2개 이상 단어를 사용할 경우엔 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용불가 (public, static, void, int, double, float...)


        //ex)입국 신고서
        String nationality = "대한민국"; // 국적
        String firstName = "재현"; //이름
        String lastName = "임"; //성
        String dateOfBirth = "1996-12-31"; //생년월일
        String residentialAddress = "패리스힐튼 호텔"; //체류지
        String purposeOfVisit = "관광"; //입국목적
        String flightNo = "KK635"; //항공 편명
        String _flightNo = "KK635"; //밑줄 시작
        String _flight_no_2 = "KK635"; //밑줄과 숫자 포함


        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; //체류 기간


        String item1 = "시계";
        String item2 = "가방";
        // String item3 = "전자제품";



    }
}