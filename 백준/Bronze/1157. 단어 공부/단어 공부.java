import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[26];        // 영문자의 갯수
        String s = scan.next();

        for(int i =0; i<s.length(); i++){       // s의 길이만큼 반복

            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){   // 대문자일 경우 단어를 하나하나의 알파벳으로 비교함
                arr[s.charAt(i)-'A']++;                 // ex. A라는 단어일경우 A-A = 0하여 0번째 자리에 1씩 증가
            }

            else{
                arr[s.charAt(i) - 'a']++;       // 소문자일 경우
            }
        }

        int temp = -1;
        char result = '?';

        for(int i =0; i<arr.length; i++){
            if(arr[i] > temp){
                temp = arr[i];
                result = (char)(i+'A');     // 대문자로 출력해야 하기 때문에 A를 더해줌
            }
            else if(arr[i] == temp){      // 갯수가 같은 코드가 있을 경우
                result = '?';
            }
        }

        System.out.println(result);
    }
}
