public class ArrayAutoDescending {
    public static void main(String[] args) {
        int[] arrayThree = new int[100];

        for (int index = 99; index < arrayThree.length; index--) {

            arrayThree[index] = index;
            System.out.println("index: " + index + " = " + arrayThree[index]);
        }
    }
}