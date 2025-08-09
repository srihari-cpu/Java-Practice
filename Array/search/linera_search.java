package Array.search;

public class linera_search {
    // by using normal
    public static void main(String[] args) {
        int[] arr = { 18, 12, 9, 14, 77, 50 };
        int k = 12;

        // calling the function
        // System.out.println(linearsearch1(arr, k));
        // System.out.println(linearsearch2(arr, k));
        // System.out.println(linearsearch3(arr, k));
        System.out.println(linearsearchrange(arr, k, 2, 5));

    }

    // linear search and return index
    static int linearsearch1(int[] arr, int k) {
        if (arr.length == 0) {
            // array is empyt then return -1
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // comparing the key and array element
            if (k == arr[i]) {
                // element is found return index of it
                return i;
            }
        }

        // element is not found return -1
        return -1;
    }

    // linear search and return value if found otherwie -1
    static int linearsearch2(int[] arr, int k) {
        if (arr.length == 0) {
            // array is empyt then return -1
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                // comparing the key and array element
                if (k == arr[i]) {
                    // element is found return index of it
                    return k;
                }
            }

            // element is not found return -1
            return -1;
        }
    }

    // linear search and return true or false
    static boolean linearsearch3(int[] arr, int k) {
        if (arr.length == 0) {
            // array is empyt then return -1
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            // comparing the key and array element
            if (k == arr[i]) {
                // element is found return index of it
                return true;
            }
        }

        // element is not found return -1
        return false;
    }

    // linear search with in the range and return index
    static int linearsearchrange(int[] arr, int k, int s, int e) {
        for (int i = s; i <= e; i++) {
            if (k == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
