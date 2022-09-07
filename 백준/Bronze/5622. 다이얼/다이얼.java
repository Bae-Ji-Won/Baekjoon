import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] word = str.toCharArray();        // 문자열 문자로 변환
        int count = 0;

        for(int i =0; i<word.length; i++){      // 입력받은 문자만큼 반복
            switch (word[i]){                   // 값들마다 걸리는 시간이 정해져 있기때문에 switch case문을 사용하여 구함
                case 'A': case 'B': case 'C':   // A,B,C 입력시 3 더함
                count += 3;
                break;

                case 'D': case 'E': case 'F':
                count += 4;
                break;

                case 'G': case 'H': case 'I':
                count += 5;
                break;

                case 'J': case 'K': case 'L':
                count += 6;
                break;

                case 'M': case 'N': case 'O':
                count += 7;
                break;

                case 'P': case 'Q': case 'R': case 'S':
                count += 8;
                break;

                case 'T': case 'U': case 'V':
                count += 9;
                break;

                case 'W': case 'X': case 'Y': case 'Z':
                count += 10;
                break;
            }
        }
        System.out.println(count);
    }
}
