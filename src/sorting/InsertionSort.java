package sorting;

public class InsertionSort {

        /*
         * Insertion Sort:
         * Insertion Sort is a sorting algorithm that builds the sorted array
         * one element at a time by taking an element from the unsorted part
         * and inserting it into its correct position in the sorted part.
         *
         * Time Complexity:
         * Best Case    -> O(n)
         * Average Case -> O(n^2)
         * Worst Case   -> O(n^2)
         *
         * Space Complexity -> O(1)
         */

        public static void insertionSort(int[] arr) {

            int n = arr.length;

            for (int i = 1; i < n; i++) {
                int j = i ;

                while (j >0 && arr[j] < arr[j-1]) {
                   int temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   j--;
                }

            }
        }

        public static void main(String[] args) {

            int[] arr = {5, 2, 8, 1, 3};

            insertionSort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

