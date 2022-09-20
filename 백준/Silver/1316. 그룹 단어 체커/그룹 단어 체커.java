import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean check[] = new boolean[26];              // 알파벳 26개의 자릿수 설정

        int num = scan.nextInt();                       // 입력 갯수 
        int temp = 0;                                   // 이전 값 저장소
        int count = 0;                                  // 그룹단어 카운트
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < num; i++) {                 // 입력 갯수만큼 문자열 입력 받음
            arrayList.add(scan.next());

            for(int j=0; j<arrayList.get(i).length(); j++){         // arraylist의 항목 수만큼 반복
                int alpa = arrayList.get(i).charAt(j);              // arraylist의 첫번째 항목의 첫번째 자리의 알파벳을 호출
                if(temp != alpa){                                   // 이전에 나온 값과 다르다면
                    if(check[alpa-'a'] == false) {                  // 처음 나오는 알파벳이라면
                        check[alpa - 'a'] = true;                   // 알파벳 자리에 true 넣는다
                        temp = alpa;                                // temp를 현재 알파벳으로 바꾼다
                    }
                    else{
                       arrayList.set(i,"false");                    // 만약 이전에 나온 값이라면 arraylist배열 안 문자열자리에 false로 바꾼다
                        break;                                      // 그리고 for문을 빠져나옴
                    }
                }
                else{                                               // 이전에 나온 값과 같다면
                    continue;
                }
            }
            Arrays.fill(check, false);                          // boolean배열 초기화(알파벳자릿수를 저장한 boolean배열을 통해 입력받은 문자열의 알파벳들의 사용 여부를 비교하고 있으므로
                                                                    // 첫번째 문자열이 끝나면 전부 초기값으로 초기화 한다.
            temp = 0;                                               // 이전알파벳을 저장하는 temp 역시 초기화 한다.
        }
            for(int i=0; i<num; i++){                               // arraylist배열 안 문자열자리에 false가 아닌 문자열을 카운트 한다(이것이 그룹단어이기 때문에)
            if(arrayList.get(i) != "false"){
                count++;
            }
        }
        System.out.println(count);
    }
}
