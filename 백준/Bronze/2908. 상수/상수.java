import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();               // 띄어쓰기를 포함한 문자를 입력받기 위해 nextline() 사용
        String[] arr = num.split(" ");        // 띄어쓰기를 기준으로 나누어 배열에 저장
        int length = arr.length;
        int[] temp = new int[length];               // 문자열 -> 정수로 바꾼 값을 저장할 배열

        for(int i =0; i<length; i++) {
            temp[i] = Integer.parseInt(arr[i]);     // 문자열로 입력받은 숫자를 문자로 변환하여 배열에 저장
        }

        int[] result = new int[length];             // 정수를 뒤집은 값을 저장할 배열
            for(int i = 0; i<length; i++){
                while(temp[i] != 0){
                result[i] = result[i]*10 + temp[i] %10; // 숫자 앞뒤 변환 과정
                temp[i] /= 10;
                // ex. 153일경우 10의 나머지 3을 result 안에 저장하고 153을 10으로 나누어 15을 만든후
                // 다시 result = (3*10) + (15%10) => 35  이런식으로 마지막 자리까지 해서 351을 만들어 냄
                }
            }

        int max = 0;                            // 숫자 비교를 위해 임시 저장소
            for(int i =0; i<length; i++){       // 입력한 모든 숫자를 비교함
                if(result[i]>max){              // 배열 첫번째 자리의 값이 max보다 크면
                    max = result[i];            // max에 저장
                }
            }

        System.out.println(max);
    }
}
