import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int k;
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 5, 3, 1, 6, 4, 9};
        printArray(array);
        System.out.println();
        System.out.print("Nhập số cần tìm: ");
        k = scanner.nextInt();
        System.out.println("Số " + k + " được tìm thấy ở phần tử thứ " + linearSearch(array, k) + " của dãy.");
        System.out.println();
        System.out.println("Số " + k + " được tìm thấy ở phần tử thứ " + binarySearch(array, k) + " của dãy.");
        System.out.println();


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static int linearSearch(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return -1;
    }

    private static void sort(int[] array) {
        for (int u = array.length - 1; u > 0; u--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
        System.out.println();
        printArray(array);
    }

    private static int binarySearch(int[] array, int k) {
        sort(array);
        System.out.println();
        int low = 0;
        int hight = array.length - 1;
        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (k < array[mid]) {
                hight = mid - 1;
            } else if (k == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

