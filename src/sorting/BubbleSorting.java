package sorting;

public class BubbleSorting {


        /*
         * Bubble Sort:
         * Bubble Sort is a simple sorting algorithm that repeatedly compares
         * two adjacent elements and swaps them if they are in the wrong order.
         *
         * After each complete pass, the largest unsorted element moves
         * (or "bubbles") to its correct position at the end of the array.
         *
         * Time Complexity:
         * Best Case    -> O(n)      (when the array is already sorted)
         * Average Case -> O(n^2)
         * Worst Case   -> O(n^2)

         * Space Complexity -> O(1)
         */

        public static void bubbleSort(int[] arr) {

            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {

                boolean swapped = false;

                for (int j = 0; j < n - 1 - i; j++) {

                    if (arr[j] > arr[j + 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }
            }
        }

        public static void main(String[] args) {

            int[] arr = {5, 2, 8, 1, 3};

            System.out.println("Before Sorting:");

            for (int num : arr) {
                System.out.print(num + " ");
            }

            // Calling Bubble Sort
            bubbleSort(arr);

            System.out.println("\nAfter Sorting:");

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

