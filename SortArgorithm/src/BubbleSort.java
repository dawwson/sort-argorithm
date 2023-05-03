import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		/**
		 * 1. 10���� �Է��� �޴´�.
		 * 2. 0�� �ε������� ���ӵ� �� ���� ���Ѵ�.
		 * 3. ���� �ε��� ���� ���� �ε��� ������ ũ�� �� ���� ��ġ�� �ٲ۴�.
		 * 4. ������ ������ ����� ����Ѵ�.
		 */
		
		/**
		 * TODO: �����丵
		 * 1. �Է°��� ���� ����ó�� => ���� ������ ���� �� �ֵ���
		 * 2. �Լ��� �и�
		 */
		
		int[] nums = new int[10];
		
		System.out.println("10���� ���� ������ �������� �Է��ϼ���. \n=>");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		// �������� ����
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
		System.out.print("���: ");
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
