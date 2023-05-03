import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// 구현 방법
		// 1. 5개의 입력값을 받는다.
		// 2. 인덱스 1부터 시작해서 앞의 요소들과 하나씩 비교한다.
		// 3. 기준 인덱스가 비교하는 인덱스보다 작으면 한칸씩 뒤로 밀고 삽입한다.
		
		int size = 5;
		int[] nums = new int[size];
		Scanner sc = new Scanner(System.in);
		
		// 1. 입력값 받아서 배열에 넣기
		System.out.println("※ 5개의 정수를 입력하세요. => ");
				
		for (int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		// 2. 정렬
		for (int i=1; i<size; i++) {
			// 2-1. key => outer loop의 맨 처음 값을 key로 설정
			int key = nums[i];
			// 2-2. 이미 정렬된 수 중 가장 큰 수의 인덱스를 첫번째 j로 설정
			int j = i - 1;
			
			// j=i-1 => 
			for (j=i-1; j>=0 && nums[j]>key; j--) {
				// 2-2. key보다 앞에 있는 요소들을 비교한다.
				// 2-3. key보다 큰 값을 만나면 한 칸씩 뒤로 민다.
				nums[j+1] = nums[j];
			}
			// 2-4. inner loop가 끝나면 j+1 위치에 key를 삽입
			nums[j+1] = key;
		}
		
		// 3. 출력
		for (int i=0; i<size; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
