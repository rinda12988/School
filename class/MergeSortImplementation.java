public class MergeSortImplementation {
    public static int[] merge(int[] arrayA, int[] arrayB) {
        int n = arrayA.length + arrayB.length;
        int[] mergedArray = new int[n];
        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < mergedArray.length; i++) {

            // Check if arrayA is out of bounds.
            if (x < arrayA.length) {
                a = arrayA[x];
            } else {
                b = arrayB[y];
                mergedArray[i] = b;
                y++;
                continue;
            }

            // Check if arrayB is out of bounds.
            if (y < arrayB.length) {
                b = arrayB[y];
            } else {
                a = arrayA[x];
                mergedArray[i] = a;
                x++;
                continue;
            }

            if (a == b) {
                mergedArray[i] = a;
                i++;
                x++;
                mergedArray[i] = b;
                y++;
            } else if (a < b) {
                mergedArray[i] = a;
                x++;
            } else if (b < a) {
                mergedArray[i] = b;
                y++;
            }
        }

        return mergedArray;
    }

    public static int[] mergeSort(int[] inputArr) {

        int n = inputArr.length;

        // Base Case: Array's length is less than 1 
        if (n <= 1) {
            return inputArr;
        }

        // Creating two arrays to store values
        int[] arrayA = new int[n / 2];
        int[] arrayB = new int[n - (n / 2)];

 // Creating resulting array
 int[] outputArr = new int[n];

 // Initializing arrayA
 for (int i = 0; i < arrayA.length; i++) {
     arrayA[i] = inputArr[i];
 }

 // Initializing arrayB
 for (int i = 0; i < arrayB.length; i++) {
     arrayB[i] = inputArr[i + (n / 2)];
 }

 // Divide array into 2 halves
 arrayA = mergeSort(arrayA);
 arrayB = mergeSort(arrayB);
 outputArr = merge(arrayA, arrayB);

 return outputArr;
}

public static void main(String[] args) {

 int[] intArr = {49, 23, 59, 23, 49, 32};

 int[] sortedArray = mergeSort(intArr);

 for (int e : sortedArray) {
     System.out.print(e + " ");
 }
}
}