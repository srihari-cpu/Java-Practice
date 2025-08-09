package Array.search;

public class binary_search {
    public static void main(String args[]) {
        int arr[] = {
                90, 75, 18, 12, 6, 4, 3, 1
        };
        int k = 75;
        // int index = binarySearchAscendingOrder(arr, k);
        // System.out.println(index);
        // int index = binarySearchDescendingOrder(arr, k);
        // System.out.println(index);
        System.out.println(findingAscendingOrDescendingOrder(arr));
    }

    static String findingAscendingOrDescendingOrder(int[] arr) {
        int s = 0;
        int l = arr.length - 1;
        if (arr[s] < arr[l]) {
            return "ascendingorder";
        } else if (arr[s] > arr[l]) {
            return "descendingorder";
        } else {
            return "equal";
        }
    }

    static int binarySearchDescendingOrder(int[] arr, int k) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k < arr[mid]) {
                low = mid + 1;
            } else if (k > arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearchAscendingOrder(int[] arr, int k) {
        // if array is empty
        if (arr.length == 0) {
            return -1;
        }

        int low = 0, high = arr.length, mid;
        while (low <= high) {
            mid = (low + high) / 2;// finding the mid value
            if (arr[mid] == k) {
                return mid;
            }
            if (k < arr[mid]) {
                high = mid - 1;
            }
            if (k > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
