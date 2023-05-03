import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		/**
		 * 1. 10개의 입력을 받는다.
		 * 2. 0번 인덱스부터 연속된 두 수를 비교한다.
		 * 3. 뒤의 인덱스 값이 앞의 인덱스 값보다 크면 두 값의 위치를 바꾼다.
		 * 4. 정렬이 끝나면 결과를 출력한다.
		 */
		
		/**
		 * TODO: 리팩토링
		 * 1. 입력값에 대한 예외처리 => 양의 정수만 받을 수 있도록
		 * 2. 함수로 분리
		 */
		
		int[] nums = new int[10];
		
		System.out.println("10개의 양의 정수를 무작위로 입력하세요. \n=>");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		// 오름차순 정렬
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j < nums.length-i-1; j++) {
				showToSwap(nums, i, j);
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		showResult(nums);
	}
	
	public static void showResult(int[] inputs) {
		System.out.print("결과: ");
		for (int i=0; i<inputs.length; i++) {
			if (i == 0) {
				System.out.print("[ ");
			}
			
			System.out.print(inputs[i] + " ");
			
			if (i == inputs.length - 1) {
				System.out.print("]\n");
			}
		}
	}

	public static void showToSwap(int[] inputs, int i, int j) {
		System.out.print("i=" + i + " j=" + j + " ");
		for (int k=0; k<inputs.length; k++) {
			if (k == j) {
				System.out.print("< ");
			}
			System.out.print(inputs[k] + " ");
			if (k == j+1) {
				System.out.print("> ");
			}
			if (k == inputs.length-1) {
				System.out.println();
			}
		}
	}
}
