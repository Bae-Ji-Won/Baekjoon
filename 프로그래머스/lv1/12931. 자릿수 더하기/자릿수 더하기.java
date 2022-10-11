import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int result = 0;

        for(int i=0; i<str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return result;
    }
    
    public static void main(String[] args){
        Solution s = new Solution();
        int num = 123;
        System.out.println(s.solution(num));
    }
}