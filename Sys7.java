

public class Sys7{

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int largest = arr[0]; 
        for (int num : arr) {
            if (num > largest) {
                largest = num; 
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 23, 12, 23, 45,78};

        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
}
