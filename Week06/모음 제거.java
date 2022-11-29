class Solution {
    public String solution(String my_string) {
        return my_string.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
        
        // 충격실화) 이렇게도 된대요,,,,
     	my_string.replaceAll("[aeiou]", "");
    }
}