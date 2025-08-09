package sorting;

public class bubblesort {
    public static void main(String args[]) {

        int arr[] = { 2, 4, 21, 5, 1, 64, 8, 17 };
        // sorting function call
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // sorting function
    static void sort(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap function call
                    swap(i, arr);
                }
            }
        }
    }

    static void swap(int i, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

}
