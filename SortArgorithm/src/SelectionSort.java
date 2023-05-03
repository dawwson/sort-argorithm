import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		int size = 10;
		int[] nums = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� ������ �Է��ϼ���\n => ");

		// 1. 10���� �Է°��� �޾Ƽ� �迭�� �ִ´�.
		for (int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		for (int i=0; i<size; i++) {
			// 2. 0�� �ε��� ���� ù��° �ּڰ����� ��´�.
			int minNumIdx = i;
			
			// 3. 1�� �ε������� ���ʴ�� ���Ͽ� �ּڰ��� ã�´�.
			for (int j=i+1; j<size; j++) {
				if (nums[j] < nums[minNumIdx]) {
					minNumIdx = j;
				}
			}
			
			// 4. �ּҰ��� 0�� �ε��� ���� ��ȯ�Ѵ�.
			swap(nums, i, minNumIdx);
		}
		
		// 5. ������ �Ϸ�Ǹ� ����� ����Ѵ�.
		showResult(nums);
	}
	
	public static void bubbleSort(int[] arr) {
		System.out.println();
	}
	
	// TODO : ��Ҹ� ��ȯ�ϴ� �Լ� �и�
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// TODO : ����� �����ִ� �Լ� �и�
	public static void showResult(int[] arr) {
		System.out.print("��� => ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
