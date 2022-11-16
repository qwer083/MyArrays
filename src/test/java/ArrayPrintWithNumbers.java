public class ArrayPrintWithNumbers {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 2, 7, 9, 1, 2, 3, 4, 5};
        for (int index = 0; index < 10; index++) {
            System.out.println(index + "-" + myArray[index]);
        }
    }
}