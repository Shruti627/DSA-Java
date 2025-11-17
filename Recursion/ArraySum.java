public class ArraySum {

    public int sumArray(int arr[], int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        ArraySum as = new ArraySum();
        int sum = as.sumArray(myArray, 0);
        System.out.println(sum);
    }
}
