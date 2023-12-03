public class Sorting {
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //Bubble Sort
    static void bubble_sort(int[] arr) {
        int temp;
        System.out.println("Sorted using bubble sort: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    //Selection Sort
    static void selection_sort(int[] arr) {
        System.out.println("Sorted using Selection sort: ");
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    //Insertion Sort
    static void insertion_sort(int[] arr) {
        System.out.println("Sorted using insertion sort: ");
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            // Placement
            arr[j + 1] = current;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        bubble_sort(arr);
        selection_sort(arr);
        insertion_sort(arr);
    }
}
