package lesson1;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(1041));
	}

	public static int solution(int n){
		int c = 0;
		int max = c;
		boolean hasOne = false;
		while(n > 0){
			int r = n % 2;
			if(r == 0){
				if(hasOne){
					c++;
				}
			}else{
				if(hasOne && c > max){
					max = c;
				}
				hasOne = true;
				c = 0;
			}
			n = n / 2;
		}
		return max;
	}
}
