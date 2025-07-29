
public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high -1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[high] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void quicky(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicky(arr, low, pivot - 1);
            quicky(arr, pivot + 1, high);

        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quicky(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"");
        }
    }
}
