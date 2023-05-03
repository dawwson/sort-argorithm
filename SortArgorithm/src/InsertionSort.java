import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// ���� ���
		// 1. 5���� �Է°��� �޴´�.
		// 2. �ε��� 1���� �����ؼ� ���� ��ҵ�� �ϳ��� ���Ѵ�.
		// 3. ���� �ε����� ���ϴ� �ε������� ������ ��ĭ�� �ڷ� �а� �����Ѵ�.
		
		int size = 5;
		int[] nums = new int[size];
		Scanner sc = new Scanner(System.in);
		
		// 1. �Է°� �޾Ƽ� �迭�� �ֱ�
		System.out.println("�� 5���� ������ �Է��ϼ���. => ");
				
		for (int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		// 2. ����
		for (int i=1; i<size; i++) {
			// 2-1. key => outer loop�� �� ó�� ���� key�� ����
			int key = nums[i];
			// 2-2. �̹� ���ĵ� �� �� ���� ū ���� �ε����� ù��° j�� ����
			int j = i - 1;
			
			// j=i-1 => 
			for (j=i-1; j>=0 && nums[j]>key; j--) {
				// 2-2. key���� �տ� �ִ� ��ҵ��� ���Ѵ�.
				// 2-3. key���� ū ���� ������ �� ĭ�� �ڷ� �δ�.
				nums[j+1] = nums[j];
			}
			// 2-4. inner loop�� ������ j+1 ��ġ�� key�� ����
			nums[j+1] = key;
		}
		
		// 3. ���
		for (int i=0; i<size; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
