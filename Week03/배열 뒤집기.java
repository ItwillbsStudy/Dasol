import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = num_list.length-1; i >= 0 ; i--) {
			arr.add(num_list[i]);
		}
		
		answer = arr.stream().mapToInt(i -> i).toArray();
		
		
        return answer;
    }
}