class Solution {
    public int solution(int[] array) {
        int answer = 0;
		int[] mode = mode(array);
		int[] max = getMaxIndex(mode);
		int count = 0;
		
		if(array.length == 1) {
			answer = array[0];
		} else if(array.length > 1) {
			for(int i = 0; i  < mode.length; i++) {
				if(max[0] == mode[i] && array[max[1]] != array[i])  { 
					count++;
				}
			} 
			if(count > 0)  answer = -1;
			else 		   answer = array[max[1]];
		}	

		return answer;
	}
		

	public static int[] mode(int[] array) {
		int[] mode = new int[array.length];
	
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			for(int j = 0; j < array.length; j++) {
				if(i == j) continue;
				count += (array[i] == array[j]) ? 1 : 0;
			}
			mode[i] = count;
		}
		return mode;
	}

    static int[] getMaxIndex(int[] arr) {
    	int index = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		int[] Max = {max, index};
		return Max;
    }
}