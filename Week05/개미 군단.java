class Solution {
	/*
	 * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
	 * 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return
	 * 
	 * */
    public int solution(int hp) {
        int answer = 0;
        while(hp != 0) {
			answer += hp / 5;
			hp %= 5;
			answer += hp / 3;
			hp %= 3;
			answer += hp / 1;
			hp %= 1;
		}
        return answer;
    }
}