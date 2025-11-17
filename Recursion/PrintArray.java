public class PrintArray {

    public void printArray(int arr[], int index) {
        if (index == arr.length) return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        PrintArray pa = new PrintArray();
        pa.printArray(myArray, 0);
    }
}
