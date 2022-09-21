public class Main {
    public static void main(String[] args) {
        boolean[] temp = new boolean[10001];    // 셀프 넘버의 값을 구하기 위해서 true, false를 통해 자리 값 구함
        int a;


        for(int i =0; i<10001; i++){
            a = d(i);           // d함수에 i값을 넣어 출력값 구함

            if(a<10001){
                temp[a] = true;    // 10000번 아래의 값일 경우 그자리에 true값을 저장
            }
        }

        for(int i=0; i<10001; i++){
            if(temp[i] == false){        // 배열에 true값이 아닌 자리값을 출력
                System.out.println(i);
            }
        }
    }

    public static int d(int num){
        int total = num;    // 통합값의 기본값은 입력값 num으로 지정(ex.15일때 15+1+5 이므로 15를 기본값으로 지정)

        while(num != 0){
            total += num%10;        // total에 1의자리 값을 넣기 위해서(ex. 15일때 10의 나머지값 5)
            num = num/10;           // total에 다음번의 1의 자리값을 넣기 위해서(ex. 15일때 10으로 나눈 값 1)
                                    // 이 과정 반복하여 각 1의 자리값이 0이 될때까지 더해줌
        }
        return total;
    }
}