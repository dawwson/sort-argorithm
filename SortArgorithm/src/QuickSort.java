public class QuickSort {

	public static void main(String[] args) {
		int[] nums = new int[10];
		
		// 1. 10���� �Է°��� �޾Ƽ� �迭�� �����Ѵ�.
		SortUtil.convertInputToArray(nums);
		
		// 2. �� ����
		quickSort(nums, 0, nums.length - 1);

		// 3. ������ ������ ����� ����Ѵ�.
		SortUtil.showResult(nums);
	}

	/**
	 * ��� �Լ�
	 * @param arr - ���ĵ� �迭
	 * @param left - ���Ĺ����� ���� �ε���
	 * @param right - ���Ĺ����� ������ �ε���
	 */
	private static void quickSort(int[] arr, int left, int right) {
		// 1. ���� ���� => left�� right�� ��ġ�� ������ ����
		if (left >= right) {
			return;			
		}

		// 2. �迭�� �����ϰ� �ǹ��� ��ġ�� �����´�.
		int pivot = partition(arr, left, right);
		// 3-1. �ǹ� ���ʿ� ���� sort �޼��带 ��������� ȣ���Ѵ�.
		quickSort(arr, left, pivot - 1);
		// 3-2. �ǹ� �����ʿ� ���� sort �޼��带 ��������� ȣ���Ѵ�.
		quickSort(arr, pivot + 1, right);
	}
	
	/**
	 * ���� �Լ�
	 * - �ǹ����� ū ���� �ǹ� ����������
	 * - �ǹ����� ���� ���� �ǹ� �������� 
	 * @param arr - �����ϰ��� �ϴ� �迭
	 * @param left - ���� ���ʿ� �ִ� �� �ε���
	 * @param right - ���� �����ʿ� �ִ� �� �ε���
	 * @return �ǹ��� �ε���
	 */
	private static int partition(int[] arr, int left, int right) {
		// 1. �׻� ���� ������ ���Ҹ� �ǹ����� �Ѵ�.
		int pivot = right;  // pivot
		int first = left;  // �迭 ������ ����صα� ���� ����
		int last = right;

		// 2. �ǹ� �ٷ� ���ʿ��� ������ ������ ����
		right--;
	
		while (true) {
			// 2-1. ���ʿ��� �����ؼ� �ǹ����� ũ�ų� ���� �� ã��
			while (left <= last && arr[left] < arr[pivot])
				left++;
			// 2-2. �����ʿ��� �����ؼ� �ǹ����� �۰ų� ���� �� ã��
			while (right > first && arr[right] > arr[pivot]) 
				right--;
			// 2-3. left, right�� �����ϰų� ������ left�� pivot�� ��ȯ.
			if (left >= right) {
				SortUtil.swap(arr, left, pivot);
				break;
				// 2-4. left, right�� ���� �������� �ʾ����� ���� ��ȯ.
			} else {
				SortUtil.swap(arr, left, right);
				left++;
				right--;
			}
		}

		// 3-1. �Ű��� pivot�� ��ġ�� ��ȯ(=left).
		return left;
	}
}
