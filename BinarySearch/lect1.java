package BinarySearch;

class lect1 {

	public boolean binarySearch(int target, int[] arr) {
		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
			int mid = (l + h) / 2;

			if (arr[mid] == target)
				return true;
			else if (arr[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}

		return false;
	}

	// recursive

	public boolean binarySearchRecursive(int target, int[] arr, int l, int h) {
		if (l > h)
			return false;

		int mid = (l + h) / 2;

		if (arr[mid] == target)
			return true;
		else if (arr[mid] < target) {
			return binarySearchRecursive(target, arr, mid + 1, h);
		} else {
			return binarySearchRecursive(target, arr, l, mid - 1);
		}
	}
}
