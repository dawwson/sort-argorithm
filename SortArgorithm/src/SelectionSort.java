import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		int size = 10;
		int[] nums = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하세요\n => ");

		// 1. 10개의 입력값을 받아서 배열에 넣는다.
		for (int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		for (int i=0; i<size; i++) {
			// 2. 0번 인덱스 값을 첫번째 최솟값으로 잡는다.
			int minNumIdx = i;
			
			// 3. 1번 인덱스부터 차례대로 비교하여 최솟값을 찾는다.
			for (int j=i+1; j<size; j++) {
				if (nums[j] < nums[minNumIdx]) {
					minNumIdx = j;
				}
			}
			
			// 4. 최소값과 0번 인덱스 값과 교환한다.
			swap(nums, i, minNumIdx);
		}
		
		// 5. 정렬이 완료되면 결과를 출력한다.
		showResult(nums);
	}
	
	public static void bubbleSort(int[] arr) {
		System.out.println();
	}
	
	// TODO : 요소를 교환하는 함수 분리
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// TODO : 결과를 보여주는 함수 분리
	public static void showResult(int[] arr) {
		System.out.print("결과 => ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
