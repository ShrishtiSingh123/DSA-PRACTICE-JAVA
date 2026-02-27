package BinarySearch;

public class DuplicateRotated {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3, 4, 2};

        int pivot = findPivot(nums);

        if (pivot == -1) {
            System.out.println("Array is not rotated");
        } else {
            System.out.println("Pivot index = " + pivot);
            System.out.println("Pivot element = " + nums[pivot]);
        }
    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Normal pivot checks
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates FIRST
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Left side sorted
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }

            // Right side sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}