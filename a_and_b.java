import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String source, target;

        Scanner sc = new Scanner(System.in);

        source = sc.nextLine();
        target = sc.nextLine();

        // 목표가 더 길거나 같으면 비교해보고 문자열 자르기 진행
        while( source.length() <= target.length() ) {

            if (source.equals(target)) {
                System.out.println("1");
                return;
            } 
            // A로 끝나면 A만 삭제
            else if ( target.endsWith("A") ) {
                target = subOne(target);
            }
            else if (target.endsWith("B")) {
                target = subOneAndReverse(target);
            }
            
        }
        
        // 빠져나왔으면 안되는거니까 0 출력 후 종료
        System.out.println("0");
        return ;

    }

    public static String subOne (String str) {
        String result="";
        result = str.substring(0, str.length()-1);
        return result;
    }

    public static String subOneAndReverse (String str) {
        String result="";
        StringBuffer sb;

        str = str.substring(0, str.length()-1);
        sb = new StringBuffer(str);
        result = sb.reverse().toString();     

        return result;
    }
}