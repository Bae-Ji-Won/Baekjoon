import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();       // 문장으로 입력받기 위해 nextline() 사용

        StringTokenizer st = new StringTokenizer(str," ");     // 띄어쓰기를 기준으로 단어 구분
        
        System.out.println(st.countTokens());           // nextToken을 호출하는 횟수를 구하는것으로 몇개의 단어로 이루어 져 있는지 확인 가능
        
    }
}