package lesson2;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] input = {0, 0, 0};
		CyclicRotation rotation = new CyclicRotation();
		rotation.print(input);
		
		rotation.print(rotation.solution(input, 1));
	}

	public int[] solution(int[] A, int K){
		if(A.length > 0){
			int shift = K % A.length;
			while(shift-- > 0){
				int[] shifted = new int[A.length];
				shifted[0] = A[A.length-1];
				for(int i=0; i<A.length-1; i++){
					shifted[i+1] = A[i];
				}
				A = shifted;
			}
		}
		return A;
	}
	
	public void print(int[] arr){
		System.out.print("[");
		for(int x=0; x <arr.length; x++){
			System.out.print(arr[x]);
			if(x < arr.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}
