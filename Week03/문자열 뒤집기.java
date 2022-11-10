import java.lang.StringBuffer;

class Solution {
    public String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);
        String answer = str.reverse().toString();
        
        return answer;
    }
}