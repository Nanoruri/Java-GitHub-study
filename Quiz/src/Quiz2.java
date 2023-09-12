public class Quiz2 {
    public static void main(String[] args) {
        int hight = 121;
        String  result = (hight >= 120) ? (" 탑승 가능합니다") : (" 탑승 불가능합니다");
        System.out.println("키가 " + hight + "cm 이므로" + result);
    }
}
